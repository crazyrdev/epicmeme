package com.baruckis.SlidingMenuImplementation;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import no.non.SlidingMenuBuilderBase2;



import android.app.ActionBar;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * @author Andrius Baruckis http://www.baruckis.com
 * 
 */
public class MainSlidingMenuActivity extends Activity {
	Class<?> builder;
	private SlidingMenuBuilderBase2 slidingMenuBuilderBase;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sliding_menu_from_class_activity2);
			try {
				slidingMenuBuilderBase = new SlidingMenuBuilderBase2();
				slidingMenuBuilderBase.createSlidingMenu(this);
			} catch (Exception e) {
				e.printStackTrace();
			} 
	}
}
