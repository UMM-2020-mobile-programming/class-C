package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paymentsuccess extends AppCompatActivity {
    Button button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentsuccess);

        button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(paymentsuccess.this, home.class);
                startActivity(a);
            }
        });
    }
}
