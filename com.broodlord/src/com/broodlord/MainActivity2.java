package com.broodlord;

import com.facebook.*;
import com.facebook.android.Facebook;
import com.facebook.model.*;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		

		// session.open(accessToken null);
		// // start Facebook Login
		 Session.openActiveSession(this, true, new Session.StatusCallback() {

			@Override
			public void call(Session session, SessionState state,
					Exception exception) {
				// TODO Auto-generated method stub
				Log.v("vivid", " session isOpened b " + session.isOpened());
				Log.v("vivid", " session isClosed b " + session.isClosed());
			}
		//
		// // callback when session changes state
		// @Override
		// public void call(Session session, SessionState state,
		// Exception exception) {
		// if (session.isOpened()) {
		//
		// // make request to the /me API
		// Request.newMeRequest(session,
		// new Request.GraphUserCallback() {
		//
		// // callback after Graph API response with user
		// // object
		// @Override
		// public void onCompleted(GraphUser user,
		// Response response) {
		// if (user != null) {
		//
		// Log.v("vivid", " user.getName() "
		// + user.getName());
		//
		// }
		// }
		// }).executeAsync();
		// }
		// }
		 });

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	// updating Status
	public void updateStatus(String accessToken) {
		try {
			Bundle bundle = new Bundle();
			bundle.putString("message", "test update");
			bundle.putString(Facebook.TOKEN, accessToken);
			String app_id = "";
			app_id = this.getString(R.string.app_id);
			Facebook facebook = new Facebook(app_id);
			String response = facebook.request("me/feed", bundle, "POST");
			Log.d("UPDATE RESPONSE", "" + response);

		} catch (Exception e) {

		}
	}
	Session session ;
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
//		Session session = Session.getActiveSession();
//		if (session == null) {
//			if (savedInstanceState != null) {
//				session = Session.restoreSession(this, null,
//						new Session.StatusCallback() {
//
//							@Override
//							public void call(Session session,
//									SessionState state, Exception exception) {
//								// TODO Auto-generated method stub
//								Log.v("vivid", " session call  " + session);
//								Log.v("vivid", " session isOpened call "
//										+ session.isOpened());
//							}
//						}, savedInstanceState);
//			}
//			if (session == null) {
//				session = new Session(this);
//			}
//
//			Log.v("vivid", " session " + session);
//
//			Session.setActiveSession(session);
//			Log.v("vivid",
//					" session getAccessToken " + session.getAccessToken());
//
//		}
		
		
		Session.getActiveSession().onActivityResult(this, requestCode, resultCode, data);
	        session =   Session.getActiveSession();

		Log.v("vivid", " session isOpened " + session.isOpened());
		Log.v("vivid", " session isClosed " + session.isClosed());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);

		}

	}

}
