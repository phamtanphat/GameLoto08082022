package com.example.gameloto08082022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Random random = new Random();
//        Math.random();
//        1: Lam tron 0.5
        int number1 = Math.round(0.5f);
//        2: Lam tron xuong
        double number2 = Math.floor(1.9999);
//        3: Lam tron len
        double number3 = Math.ceil(1.00001);
//        4: So sanh so lon hon
        int max = Math.max(10, 15);
//        5: Random
        double number4 = Math.random();
//        Log du lieu

//        for (int i = 0; i < 50; i++) {
//            double number5 = Math.round((Math.random() * 5))  + 5;
//            Log.d("BBB", String.valueOf(number5));
//        }
        Random random = new Random();
        // 5 - 13
        int number6 = random.nextInt(13 - 5 + 1) + 5;
//        for (int i = 0; i < 1000; i++) {
//            int number6 = random.nextInt(10);
//            Log.d("BBB", number6 + "");
//        }
//        Thong bao
//        Toast.makeText(this, String.valueOf(number1), Toast.LENGTH_LONG)
//             .show();
    }

}