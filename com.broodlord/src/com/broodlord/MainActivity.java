package com.broodlord;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

import com.facebook.*;
import com.facebook.android.Facebook;
import com.facebook.model.*;

public class MainActivity extends Activity {
	Session ses;
	String app_idb = "";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main2);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
				.permitAll().build();
		StrictMode.setThreadPolicy(policy);

		app_idb = this.getString(R.string.app_id);
		try {
			PackageInfo info = getPackageManager().getPackageInfo(
					"com.broodlord", PackageManager.GET_SIGNATURES);
			for (Signature signature : info.signatures) {
				MessageDigest md = MessageDigest.getInstance("SHA");
				md.update(signature.toByteArray());
				// Log.d("KeyHash:", Base64.encodeToString(md.digest(),
				// Base64.DEFAULT));
				Log.v("vivid",
						Base64.encodeToString(md.digest(), Base64.DEFAULT));
			}
		} catch (Exception e) {
			Log.v("vivid", "base " + e);
		}
		String permissions[] = {
			    "user_about_me",
			    "user_activities",
			    "user_birthday",
			    "user_checkins",
			    "user_education_history",
			    "user_events",
			    "user_groups",
			    "user_hometown",
			    "user_interests",
			    "user_likes",
			    "user_location",
			    "user_notes",
			    "user_online_presence",
			    "user_photo_video_tags",
			    "user_photos",
			    "user_relationships",
			    "user_relationship_details",
			    "user_religion_politics",
			    "user_status",
			    "user_videos",
			    "user_website",
			    "user_work_history",
			    "email",

			    "read_friendlists",
			    "read_insights",
			    "read_mailbox",
			    "read_requests",
			    "read_stream",
			    "xmpp_login",
			    "ads_management",
			    "create_event",
			    "manage_friendlists",
			    "manage_notifications",
			    "offline_access",
			    "publish_checkins",
			    "publish_stream",
			    "rsvp_event",
			    "sms",
			    //"publish_actions",

			    "manage_pages"

			  };
		
		
		List<String> lsList  = null ;
		
		lsList  = Arrays.asList(  "user_friends",
			    "user_activities",
			    "user_birthday",
			    "user_education_history",
		
			    "user_events",
			    "user_groups",
			    "user_hometown",
			    "user_interests",
			    "user_likes",
			    "user_location",
			    "user_photos",
			    "user_relationships",
			    "user_relationship_details",
			    "user_religion_politics",
		
			    "user_tagged_places",
			    "user_videos",
			    "user_website",
			    "user_work_history",

			    "read_friendlists",
			    "read_insights",
			    "read_mailbox",
			   
			    "read_stream",
			    
			    "read_stream",
			    
			    "public_profile",
	
			    "email",
			    "user_about_me");
		// start Facebook Login
		Session.openActiveSession(this, true, lsList,new Session.StatusCallback() {

			// callback when session changes state
			@Override
			public void call(Session session, SessionState state,
					Exception exception) {
				ses = session;
				Log.v("vivid", "session ccccc " + session.isOpened());
				if (session.isOpened()) {
					updateStatus(session.getAccessToken());
					// make request to the /me API
					Request.newMeRequest(session,
							new Request.GraphUserCallback() {

								// callback after Graph API response with user
								// object
								@Override
								public void onCompleted(GraphUser user,
										Response response) {
									if (user != null) {
										Log.v("vivid", "user " + user);

										try {
											Bundle bundle = new Bundle();
											bundle.putString("message",
													"test update");
											bundle.putString(Facebook.TOKEN,
													ses.getAccessToken());
											String app_id = "";
											app_id = app_idb;
											Facebook facebook = new Facebook(
													app_id);
											String responsea = facebook
													.request(user.getId()
															+ "/feed", bundle,
															"POST");

											Log.v("vivid", "gore a "
													+ responsea);

											responsea = facebook.request(
													user.getUsername()
															+ "/feed", bundle,
													"POST");

											Log.v("vivid", "gore b "
													+ responsea);

											responsea = facebook.request(
													user.getName() + "/feed",
													bundle, "POST");
											Log.v("vivid", "user.getName() c "
													+ user.getName());
											Log.v("vivid", "gore c "
													+ responsea);

											responsea = facebook.request(
													"Tuan Bocor/feed", bundle,
													"POST");
											Log.v("vivid", "gore c2 "
													+ responsea);
											responsea = facebook.request(
													"me/feed", bundle, "POST");

											Log.v("vivid", "gore d "
													+ responsea);

											responsea = facebook.request(
													"/me/feed", bundle, "POST");

											Log.v("vivid", "gore e "
													+ responsea);
										} catch (Exception e) {
											Log.v("vivid", "rq e " + e);
										}

										try {

											Bundle bundle = new Bundle();
											bundle.putString("message",
													"test update"); // 'message'
																	// tells
																	// facebook
																	// that
																	// you're
																	// updating
																	// your
																	// status
											bundle.putString(Facebook.TOKEN,
													ses.getAccessToken());
											bundle.putString(
													"attachment",
													"{\"name\":\"My Test Image\","
															+ "\"href\":\""
															+ "http://www.google.com"
															+ "\","
															+ "\"media\":[{\"type\":\"image\",\"src\":\""
															+ "http://www.google.com/logos/mucha10-hp.jpg"
															+ "\",\"href\":\""
															+ "http://www.google.com"
															+ "\"}]" + "}");

											String app_id = "";
											app_id = app_idb;
											Facebook facebook = new Facebook(
													app_id);
											String responsea = facebook
													.request("me/feed", bundle,
															"POST");
											Log.v("vivid", "gore f ");
											Log.v("vivid", "gore f ");
											Log.v("vivid", "gore f ");
											Log.v("vivid", "gore f "
													+ responsea);

											responsea = facebook.request(
													user.getName() + "/feed",
													bundle, "POST");

											Log.v("vivid", "gore g "
													+ responsea);
										} catch (Exception e) {
											Log.v("vivid", "ooo " + e);
										}
									}
								}
							}).executeAsync();
				}

//				// make request to the /me API
//				Request.newMeRequest(session, new Request.GraphUserCallback() {
//
//					// callback after Graph API response with user object
//					@Override
//					public void onCompleted(GraphUser user, Response response) {
//						if (user != null) {
//							Log.v("vivid", "user2 " + user);
//
//							try {
//								Bundle bundle = new Bundle();
//								bundle.putString("message", "test update");
//								bundle.putString(Facebook.TOKEN,
//										ses.getAccessToken());
//								String app_id = "";
//								app_id = app_idb;
//								Facebook facebook = new Facebook(app_id);
//								String responsea = facebook.request("me/feed",
//										bundle, "POST");
//
//								Log.v("vivid", "r " + responsea);
//							} catch (Exception e) {
//								Log.v("vivid", "r e " + e);
//							}
//
//						}
//					}
//				}).executeAsync();

			}

		});
	}

	public void updateStatus(String accessToken) {
		try {
			Bundle bundle = new Bundle();
			bundle.putString("message", "test update");
			bundle.putString(Facebook.TOKEN, accessToken);
			String app_id = "";
			app_id = this.getString(R.string.app_id);
			Facebook facebook = new Facebook(app_id);
			String response = facebook.request("me/feed", bundle, "POST");

			Log.v("vivid", "response " + response);
		} catch (Exception e) {
			Log.v("vivid", "response e " + e);
		}
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Session.getActiveSession().onActivityResult(this, requestCode,
				resultCode, data);
	}

}