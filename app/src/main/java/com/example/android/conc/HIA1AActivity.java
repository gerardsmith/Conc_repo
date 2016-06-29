package com.example.android.conc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HIA1AActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hia1_a);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new HIA1AFragment())
                    .commit();
        }
    }


}

