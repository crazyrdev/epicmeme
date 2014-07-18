package volley.basic;

import org.json.JSONObject;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		callofvolley(savedInstanceState);
	}

	public void callofvolley(Bundle savedInstanceState) {

		LifestyleVolley.init(this);

		ImageLoader imageLoader = LifestyleVolley.getImageLoader();
		NetworkImageView networkImageView1 = (NetworkImageView) this
				.findViewById(R.id.imageView1);

		String urlx = "http://www.playdota.com/img/art/1309402/fanart/f1299129376.jpg";
		networkImageView1.setImageUrl(urlx, imageLoader);
		//
		int paging = 0;
		String url_getData2 = "";

		url_getData2 = "http://pastebin.com/raw.php?i=xVHYzZ4m";
		JsonObjectRequest JsonObjectRequest1 = new JsonObjectRequest(
				Method.GET, url_getData2, null, getReqSuccess(),
				reqErrorListener());
		LifestyleVolley.getRequestQueue().add(JsonObjectRequest1);

	}

	private Listener<JSONObject> getReqSuccess() {
		return new Response.Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject response) {
				Log.v("vivid", "s " + response);
			}

		};

	}

	private com.android.volley.Response.ErrorListener reqErrorListener() {
		return new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				Log.v("vivid", "e " + error);
			}

		};

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
	}

}
