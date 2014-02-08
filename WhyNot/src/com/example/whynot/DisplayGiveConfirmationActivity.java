package com.example.whynot;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class DisplayGiveConfirmationActivity extends Activity{
	
	/* A BUNCH OF METHODS NEED TO BE ADDED HERE
	 * 		* onCreate
	 * 		* setupActionBar
	 * 		* onCreateOptionsMenu
	 * 		* onOptionsItemSelected
	 */
	
	// submit users challenge to Firebase
	// THIS NEEDS TO BE CHANGED
	public void go_SubmitAnother(View view) {
		Intent intent = new Intent(this, DisplayGiveActivity.class);
    	startActivity(intent);
	}

}
