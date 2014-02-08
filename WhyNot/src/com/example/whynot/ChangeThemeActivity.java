package com.example.whynot;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

public class ChangeThemeActivity extends Activity implements OnClickListener

{

    /** Called when the activity is first created. */

    @Override

    public void onCreate(Bundle savedInstanceState) 

    {

        super.onCreate(savedInstanceState);

/*        Utils.onActivityCreateSetTheme(this);*/

        setContentView(R.layout.activity_main);

           

          findViewById(R.id.button_get).setOnClickListener(this);

          findViewById(R.id.button_give).setOnClickListener(this);

          findViewById(R.id.button_explore).setOnClickListener(this);

    }

     @Override

     public void onClick(View v) 

     {

          // TODO Auto-generated method stub

          switch (v.getId())

          {

          case R.id.button_get:

          Utils.changeToTheme(this, Utils.THEME_DEFAULT);

          break;

          case R.id.button_give:

          Utils.changeToTheme(this, Utils.THEME_WHITE);

          break;

          case R.id.button_explore:

          Utils.changeToTheme(this, Utils.THEME_BLUE);

          break;

          }

     }

}