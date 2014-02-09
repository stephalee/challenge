package com.example.whynot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

public class DisplayExploreActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_explore);
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
		getMenuInflater().inflate(R.menu.display_explore, menu);
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
	
	
	 // Get ListView object from xml
//    listView = (ListView) findViewById(R.id.list);
//    
//    // Defined Array values to show in ListView
//    String[] values = new String[] { "Android List View", 
//                                     "Adapter implementation",
//                                     "Simple List View In Android",
//                                     "Create List View Android", 
//                                     "Android Example", 
//                                     "List View Source Code", 
//                                     "List View Array Adapter", 
//                                     "Android Example List View" 
//                                    };
//
//    // Define a new Adapter
//    // First parameter - Context
//    // Second parameter - Layout for the row
//    // Third parameter - ID of the TextView to which the data is written
//    // Forth - the Array of data
//
//    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//      android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//
//    // Assign adapter to ListView
//    listView.setAdapter(adapter); 
//    
//    // ListView Item Click Listener
//    listView.setOnItemClickListener(new OnItemClickListener() {
//
//          @Override
//          public void onItemClick(AdapterView<?> parent, View view,
//             int position, long id) {
//            
//           // ListView Clicked item index
//           int itemPosition     = position;
//           
//           // ListView Clicked item value
//           String  itemValue    = (String) listView.getItemAtPosition(position);
//              
//            // Show Alert 
//            Toast.makeText(getApplicationContext(),
//              "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//              .show();
//         
//          }
//
//     }); 
	//method that controls completed/submitted challenges
//	public void onToggleClicked(View view) {
//	    // Is the toggle on?
//	    boolean on = ((ToggleButton) view).isChecked();
//	    
//	    if (on) {
//	        // Enable vibrate
//	    } else {
//	        // Disable vibrate
//	    }
//	}

}
