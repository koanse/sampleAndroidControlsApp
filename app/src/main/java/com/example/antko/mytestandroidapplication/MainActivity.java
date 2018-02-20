package com.example.antko.mytestandroidapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View button2 = findViewById(R.id.button2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        // Добавление обработчика нажатия на кнопку
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                textView3.setText(currentDateTimeString);
            }
        });
    }
}