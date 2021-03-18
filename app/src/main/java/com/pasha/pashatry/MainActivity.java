package com.pasha.pashatry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fader(View view){
        ImageView bview=findViewById(R.id.ivBart);

        bview.animate().translationX(50).rotation(1800).alpha(1).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bvieww=findViewById(R.id.ivBart);
        bvieww.animate().translationX(500).rotation(1800).alpha(1).setDuration(2000);
    }
}