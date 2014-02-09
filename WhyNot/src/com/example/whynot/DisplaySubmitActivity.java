package com.example.whynot;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DisplaySubmitActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_submit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_submit, menu);
		return true;
	}

}
