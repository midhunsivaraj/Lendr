package com.rocsera.lendr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by midhunsivaraj on 2/16/17.
 */

public class BrowseLendSelection extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_l_selection);

        Button browse = (Button) findViewById(R.id.btn_lend);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(BrowseLendSelection.this, MainActivity.class);
                BrowseLendSelection.this.startActivity(mainIntent);
            }
        });

    }
}