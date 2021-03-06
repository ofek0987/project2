package com.yaniv.student.project2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Terms_of_Use extends AppCompatActivity {
    private Intent mainIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_terms_of__use); //making sure that the screen will not spin
        mainIntent = new Intent(this , MainActivity.class);
    }

    public void back(View view) {
        startActivity(mainIntent); //if user pressed the 'back' button this function returns the user to the main activity
        finish();
    }
}
