package klik.sms;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	String sms_number = "083820781953";
	String sms_message = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		setButton(savedInstanceState);
		// if (savedInstanceState == null) {
		// getSupportFragmentManager().beginTransaction()
		// .add(R.id.container, new PlaceholderFragment()).commit();
		// }
	}

	public void setButton(Bundle savedInstanceState) {
		Button button_intent = (Button) this.findViewById(R.id.button1);
		button_intent.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button_intent();
			}
		});
		Button button_sms = (Button) this.findViewById(R.id.button2);

		button_sms.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				button_sms();
				// TODO Auto-generated method stub

			}
		});

	}

	void button_intent() {
		Uri uri = Uri.parse("smsto:" + sms_number);
		Intent it = new Intent(Intent.ACTION_SENDTO, uri);
		sms_message = "button_intent";
		it.putExtra("sms_body", sms_message);
		startActivity(it);
	}

	void button_sms() {
		sms_message = "button_sms";
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(sms_number, null, sms_message, null, null);

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
