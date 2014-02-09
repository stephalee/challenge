package com.example.whynot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

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
    
 // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }
     
    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
         
        switch (item.getItemId())
        {
        case R.id.menu_home:
            // Single menu item is selected do something
            // Ex: launching new activity/screen or show alert message
            Toast.makeText(MainActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_get:
            Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_give:
            Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        case R.id.menu_explore:
            Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
            return true;
 
        default:
            return super.onOptionsItemSelected(item);
        }
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
