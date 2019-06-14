package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button clockin1;
    Button clockout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clockin1 = (Button) findViewById(R.id.clockin);
        clockout1 = (Button) findViewById(R.id.clockout);

        clockin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("lalala");
                Singleton01.getInstance().setVisibleSecondButton(true);
                Singleton01.getInstance().setVisibleFirstButton(false);

                visibleButtons();
            }
        });

        clockout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("blabla");
                Singleton01.getInstance().setVisibleFirstButton(true);
                Singleton01.getInstance().setVisibleSecondButton(false);
                visibleButtons();
            }
        });

    }

    private void visibleButtons() {
        if(Singleton01.getInstance().isVisibleSecondButton()) {
            clockin1.setEnabled(false);
            clockout1.setEnabled(true);
        }
        if(Singleton01.getInstance().isVisibleFirstButton() ) {
            clockin1.setEnabled(true);
            clockout1.setEnabled(false);
        }
    }
}

