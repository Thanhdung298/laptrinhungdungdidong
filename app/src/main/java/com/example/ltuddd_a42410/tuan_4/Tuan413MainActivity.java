package com.example.ltuddd_a42410.tuan_4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltuddd_a42410.R;

public class Tuan413MainActivity extends AppCompatActivity {

    Button btnGetData;
    TextView tvKQ;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan413_main);
        Tuan41VolleyFn volleyFn = new Tuan41VolleyFn();
        tvKQ = findViewById(R.id.tuan413TvKQ);
        btnGetData = findViewById(R.id.tuan413Btn);

        btnGetData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        volleyFn.getJsonArrayOfObject(context, tvKQ);
                    }
                }
        );
    }
}