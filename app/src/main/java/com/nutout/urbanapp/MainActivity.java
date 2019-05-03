package com.nutout.urbanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.signpage);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in  = new Intent(MainActivity.this, com.nutout.urbanapp.signup.class);
                startActivity(in);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
    }
}
