package com.baruckis.SlidingMenuImplementation;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.nydusworm;
import com.actionbarsherlock.app.SherlockActivity;
import com.jfeinstein.jazzyviewpager.JazzyViewPager;
import com.jfeinstein.jazzyviewpager.OutlineContainer;
import com.jfeinstein.jazzyviewpager.JazzyViewPager.TransitionEffect;

import no.non.SlidingMenuBuilderBase2;
import android.app.ActionBar;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Andrius Baruckis http://www.baruckis.com
 * 
 */
public class MainSlidingMenuActivity extends SherlockActivity {
	Class<?> builder;
	private SlidingMenuBuilderBase2 slidingMenuBuilderBase;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sliding_menu_from_class_activity2);
		setupJazziness(TransitionEffect.Tablet);
		try {
			slidingMenuBuilderBase = new SlidingMenuBuilderBase2();
			slidingMenuBuilderBase.createSlidingMenu(this);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JazzyViewPager mJazzy;
	private void setupJazziness(TransitionEffect effect) {

		mJazzy = (JazzyViewPager) findViewById(R.id.jazzy_pager);
		mJazzy.setTransitionEffect(effect);
		mJazzy.setAdapter(new MainAdapter());
		mJazzy.setPageMargin(30);
	}
	  @Override
	    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {

		  com.actionbarsherlock.view.SubMenu subMenu1 = menu.addSubMenu("Action Item");
	        subMenu1.add("Sample");
	        subMenu1.add("Menu");
	        subMenu1.add("Items");

	        com.actionbarsherlock.view.MenuItem subMenu1Item = subMenu1.getItem();
	        subMenu1Item.setIcon(R.drawable.ic_action_emo_angry_holo_dark);
	        subMenu1Item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);

	        com.actionbarsherlock.view.SubMenu subMenu2 = menu.addSubMenu("Overflow Item");
	        subMenu2.add("These");
	        subMenu2.add("Are");
	        subMenu2.add("Sample");
	        subMenu2.add("Items");

	        com.actionbarsherlock.view.MenuItem subMenu2Item = subMenu2.getItem();
	        subMenu2Item.setIcon(R.drawable.ic_action_emo_angry_holo_light);

	        return super.onCreateOptionsMenu(menu);
	    }
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//
//		menu.add("Toggle Fade");
//		String[] effects = this.getResources().getStringArray(R.array.jazzy_effects);
//		for (String effect : effects)
//			menu.add(effect);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//	
//		if (item.getTitle().toString().equals("Toggle Fade")) {
//			mJazzy.setFadeEnabled(!mJazzy.getFadeEnabled());
//		} else {
//			TransitionEffect effect = TransitionEffect.valueOf(item.getTitle().toString());
//			setupJazziness(effect);
//		}
//		return true;
//	}
	
	class MainAdapter extends PagerAdapter {
		@Override
		public Object instantiateItem(ViewGroup container, final int position) {
		
			TextView text = new TextView(MainSlidingMenuActivity.this);
			text.setGravity(Gravity.CENTER);
			text.setTextSize(30);
			text.setTextColor(Color.WHITE);
			text.setText("Page " + position);
			text.setPadding(30, 30, 30, 30);
			int bg = Color.rgb((int) Math.floor(Math.random() * 128) + 64,
					(int) Math.floor(Math.random() * 128) + 64,
					(int) Math.floor(Math.random() * 128) + 64);
			text.setBackgroundColor(bg);
			container.addView(text, LayoutParams.MATCH_PARENT,
					LayoutParams.MATCH_PARENT);
			mJazzy.setObjectForPosition(text, position);
			return text;
		}

		@Override
		public int getCount() {
			return 10;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object obj) {
			container.removeView(mJazzy.findViewFromObject(position));
		}

		@Override
		public boolean isViewFromObject(View view, Object obj) {
			if (view instanceof OutlineContainer) {
				return ((OutlineContainer) view).getChildAt(0) == obj;
			} else {
				return view == obj;
			}
		}

	}
}
