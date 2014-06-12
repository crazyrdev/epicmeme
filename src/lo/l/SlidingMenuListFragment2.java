package lo.l;

import java.util.ArrayList;
import java.util.List;

import s.p.SlidingMenuListAdapter2;
import no.non.SlidingMenuBuilderBase2;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.baruckis.SlidingMenuImplementation.R;
import com.baruckis.SlidingMenuImplementation.SlidingMenuListItem;

/**
 * @author Andrius Baruckis http://www.baruckis.com
 * 
 *         List fragment, which will be used as a content for sliding out menu.
 * 
 */
public class SlidingMenuListFragment2 extends ListFragment {
	protected List<SlidingMenuListItem> slidingMenuList;
	private SlidingMenuBuilderBase2 slidingMenuBuilderBase;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// We set here a custom layout which uses holo light theme colors.
		return inflater.inflate(R.layout.sliding_menu_holo_light_list, null);
	}

	
	List<SlidingMenuListItem> getSlidingMenu(
Activity activity) {

		List<SlidingMenuListItem> list = new ArrayList<SlidingMenuListItem>();

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_angry_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_angry_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_angry_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_basic_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_basic_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_basic_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_cool_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_cool_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_cool_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_cry_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_cry_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_cry_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_err_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_err_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_err_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_evil_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_evil_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_evil_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_kiss_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_kiss_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_kiss_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_laugh_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_laugh_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_laugh_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_shame_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_shame_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_shame_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_tongue_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_tongue_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_tongue_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_wink_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_wink_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_wink_icon)));

		list.add(new SlidingMenuListItem(R.slidingmenu.list_item_wonder_id,
				activity.getResources().getString(
						R.slidingmenu.list_item_wonder_label), activity
						.getResources().getString(
								R.slidingmenu.list_item_wonder_icon)));

		return list;
	}
	
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		// We get a list from our specially created list data class.
		slidingMenuList = getSlidingMenu(getActivity());
		if (slidingMenuList == null)
			return;

		// We pass our taken list to the adapter.
		SlidingMenuListAdapter2 adapter = new SlidingMenuListAdapter2(
				getActivity(), R.layout.sliding_menu_holo_light_list_row2, slidingMenuList);
		setListAdapter(adapter);
	}

	// We could define item click actions here, but instead we want our builder
	// to be responsible for that.
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		l.setSelection(position);
		Toast.makeText(getActivity(), "position "+position , Toast.LENGTH_LONG).show();
//		SlidingMenuListItem item = slidingMenuList.get(position);
//		slidingMenuBuilderBase.onListItemClick(item);
	}

	// We can not provide a builder as an argument inside a fragment
	// constructor, so that is why we have separate method for that.
	public void setMenuBuilder(SlidingMenuBuilderBase2 slidingMenuBuilderBase) {
		this.slidingMenuBuilderBase = slidingMenuBuilderBase;
	}
}
