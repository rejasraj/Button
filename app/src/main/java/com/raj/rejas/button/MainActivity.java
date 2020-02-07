package com.raj.rejas.button;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.onClick(button);
            }
        });
    }

    public void onClick(View view) {
        Log.d("MainActivity", "Hello World!");
        i++;
        textView.setText("" + i);
        view.setBackgroundColor(Color.rgb((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
    }
}
