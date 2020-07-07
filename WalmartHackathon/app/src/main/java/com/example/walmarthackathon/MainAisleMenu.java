package com.example.walmarthackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainAisleMenu extends AppCompatActivity {


    Button go;
    TextView alert,number,alert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_aisle_menu);

        go= findViewById(R.id.s);
        alert=findViewById((R.id.txt));
        alert2=findViewById((R.id.timerText));

        number=findViewById((R.id.num));

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Description.class));
            }
        });



        Timer t2 = new Timer(false);
        t2.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {

                        alert.setVisibility(View.INVISIBLE);
                        alert2.setVisibility(View.VISIBLE);
                        number.setText("4");
                        alert.setTextColor(010);
                    }
                });
            }
        }, 10000);


    }
}




