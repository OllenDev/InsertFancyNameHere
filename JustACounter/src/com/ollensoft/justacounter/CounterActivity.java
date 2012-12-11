package com.ollensoft.justacounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * This is a basic counter app. Right now it just has one activity and all that
 * it does is count.
 * 
 * @author Chris Ollenburg
 * 
 */
public class CounterActivity extends Activity implements OnClickListener {
	TextView mTextView;
	int mCount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);

		// Init and Setup views
		Button button = (Button) findViewById(R.id.count_btn);
		button.setOnClickListener(this);
		mTextView = (TextView) findViewById(R.id.count_tv);

		// Init variables
		mCount = 0;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_counter, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
		case R.id.reset_count_settings:
			mCount = 0;
			mTextView.setText(Integer.toString(mCount));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.count_btn:
			mCount++;
			mTextView.setText(Integer.toString(mCount));
		}
	}
}
