package com.example.whynot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // Create a reference to a Firebase location
        Firebase ref = new Firebase("https://myapp.firebaseIO-demo.com/");

        // Write data to Firebase
        ref.setValue("Do you have data? You'll love Firebase.");

        // Read data and react to changes
        ref.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot snap) {
                System.out.println(snap.getName() + " -> " + snap.getValue());
            }

            @Override public void onCancelled(FirebaseError f) { }
        });
        
    }


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
