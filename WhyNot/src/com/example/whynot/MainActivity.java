package com.example.whynot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

//import com.firebase.client.ChildEventListener;
//import com.firebase.client.DataSnapshot;
//import com.firebase.client.Firebase;
//import com.firebase.client.FirebaseError;

//import com.firebase.client.DataSnapshot;
//import com.firebase.client.Firebase;
//import com.firebase.client.FirebaseError;
//import com.firebase.client.ValueEventListener;


/* This class functions as the home screen of the application
 * From here, the user can choose from a number of options:
 * 		* GET a new challenge
 * 		* GIVE (or CREATE) a new challenge
 * 		* EXPLORE
 * 			* the user's submissions for other users' challenges -- similar to a diary or journal
 * 			* other submissions for challenges the user has completed
 * 			* submissions from other users for challenges he has created
 */
 
public class MainActivity extends Activity {

	// Creates the screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Creates the action bar and populates it with options 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when user clicks the GET button */
    public void go_Get(View view) {
    	Intent intent = new Intent(this, DisplayGetActivity.class);
    	startActivity(intent);
    }
    
    /** Called when user clicks the GIVE button */
    public void go_Give(View view) {
    	Intent intent = new Intent(this, DisplayGiveActivity.class);
    	startActivity(intent);
    }
    
    /** Called when user clicks the EXPLORE button */
    public void go_Explore(View view) {
    	Intent intent = new Intent(this, DisplayExploreActivity.class);
    	startActivity(intent);
    }
    
}
