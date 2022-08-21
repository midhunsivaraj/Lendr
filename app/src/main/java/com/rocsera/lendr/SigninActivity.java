package com.rocsera.lendr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by midhunsivaraj on 2/16/17.
 */

public class SigninActivity extends Activity {

    Button signup;
    Button browse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signup  = (Button) findViewById(R.id.signup);
        browse = (Button) findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SigninActivity.this, SignupActivity.class);
                SigninActivity.this.startActivity(mainIntent);
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SigninActivity.this, BrowseLendSelection.class);
                SigninActivity.this.startActivity(mainIntent);
            }
        });
    }
}
