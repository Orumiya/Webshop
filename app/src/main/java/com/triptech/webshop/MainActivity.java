package com.triptech.webshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sign_in_button = findViewById(R.id.main_sign_in_button);
        Button sign_up_button = findViewById(R.id.main_sign_up_button);
        final Intent sign_in_intent = new Intent(this, LogInActivity.class);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sign_in_intent);
            }
        });

        final Intent sign_up_intent = new Intent(this, SignUpActivity.class);
        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sign_up_intent);
            }
        });

    }
}
