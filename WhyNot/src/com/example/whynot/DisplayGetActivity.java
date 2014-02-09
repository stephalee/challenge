package com.example.whynot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DisplayGetActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		  StrictMode.ThreadPolicy policy = new StrictMode.
				  ThreadPolicy.Builder().permitAll().build();
				    StrictMode.setThreadPolicy(policy); 
				    
		setContentView(R.layout.activity_display_get);
		
	    try {
	        JSONArray jsonArray = new JSONArray(readChallenges());
	        Log.i(DisplayGetActivity.class.getName(),
	            "Number of entries " + jsonArray.length());
	        Random r = new Random();
	        int i = jsonArray.length();
	          String jsonObject = jsonArray.getJSONObject(r.nextInt(i)).getString("description");
//	          Log.i(DisplayGetActivity.class.getName(), jsonObject.names());
	  	    TextView textview = (TextView) findViewById(R.id.chal);
			textview.setText(jsonObject);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_get, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public String readChallenges() {
	StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet httpGet = new HttpGet("http://hbpchallenge.herokuapp.com/challenge");
    try {
      HttpResponse response = client.execute(httpGet);
      StatusLine statusLine = response.getStatusLine();
      int statusCode = statusLine.getStatusCode();
      if (statusCode == 200) {
        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(content));
        String line;
        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
      } else {
        Log.e(DisplayExploreActivity.class.toString(), "Failed to download file");
      }
    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return builder.toString();
  }
	
    /** Called when user clicks the YES button */
    public void go_Yes(View view) {
    	Intent intent = new Intent(this, DisplaySubmitActivity.class);
    	startActivity(intent);
    }
    
    /** Called when user clicks the NO button */
    public void go_No(View view) {
    	Intent intent = new Intent(this, DisplayGetActivity.class);
    	startActivity(intent);
    }

}
