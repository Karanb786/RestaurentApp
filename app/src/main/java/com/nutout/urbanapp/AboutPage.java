package com.nutout.urbanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutPage extends AppCompatActivity implements View.OnClickListener{
    Button m_BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        m_BackButton = (Button) findViewById(R.id.aboutGoBackButton);
        m_BackButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
