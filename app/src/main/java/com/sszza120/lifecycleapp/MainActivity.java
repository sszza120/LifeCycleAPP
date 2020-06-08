package com.sszza120.lifecycleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDial,btnSecond,btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);
        btnSecond = findViewById(R.id.btnSecond);
        btnFinish = findViewById(R.id.btnFinish);

        btnDial.setOnClickListener(myListener);
        btnSecond.setOnClickListener(myListener);
        btnFinish.setOnClickListener(myListener);

        Toast.makeText(this, "Create(1)", Toast.LENGTH_LONG).show();
    }

    private  Button.OnClickListener myListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnDial:
                    Uri uri = Uri.parse("tel:0988123456");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                    break;
                case R.id.btnSecond:
                    Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent1);
                    break;
                case  R.id.btnFinish:
                    finish();
                    break;
            }
        }
    };
}
