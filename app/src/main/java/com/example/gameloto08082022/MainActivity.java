package com.example.gameloto08082022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class MainActivity extends AppCompatActivity{

    TextView tvRandom, tvHistory;
    AppCompatButton btnReset, btnRandom;
    List<Integer> listNumbers;
    String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRandom = findViewById(R.id.text_view_random);
        tvHistory = findViewById(R.id.text_view_history);
        btnReset = findViewById(R.id.appcompat_button_reset);
        btnRandom = findViewById(R.id.appcompat_button_random);

        initData();
        event();
    }

    private void initData() {
        listNumbers = new ArrayList<>();

        addNumberToArray(listNumbers);
    }

    private void addNumberToArray(List<Integer> listNumbers) {
        for (int i = 1; i <= 100 ; i++) {
            listNumbers.add(i);
        }
    }

    private void event() {
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listNumbers.size() > 0) {
                    Random random = new Random();
                    int indexRandom = random.nextInt(listNumbers.size());
                    int valueRandom = listNumbers.get(indexRandom);
                    tvRandom.setText(String.valueOf(valueRandom));
                    if (listNumbers.size() == 1) {
                        result = valueRandom  + result;
                    } else {
                        result =  " - " + valueRandom  + result;
                    }
                    tvHistory.setText(result);
                    listNumbers.remove(indexRandom);
                } else {
                    Toast.makeText(MainActivity.this, "Hết số random", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                tvRandom.setText(result);
                tvHistory.setText(result);

                if (listNumbers.size() > 0) {
                    listNumbers.clear();
                } else {
                    addNumberToArray(listNumbers);
                }
            }
        });
    }
}