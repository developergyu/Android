package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView maintext;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maintext = (TextView) findViewById(R.id.maintext);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                int dicenum = 0;
                Random random = new Random();

                dicenum = random.nextInt(6) + 1;
                maintext.setText(String.valueOf(dicenum));
            }
        });
    }
}