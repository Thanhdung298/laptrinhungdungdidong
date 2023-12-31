package com.example.ltuddd_a42410.tuan_3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltuddd_a42410.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {

    ListView lv;

    T32Adapter adapter;

    ArrayList<T32Contact> ls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv = findViewById(R.id.tuan32Lv);

        ls.add(new T32Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van B", "23", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van C", "19", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van D", "30", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van E", "58", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van F", "27", R.drawable.ic_launcher_background));

        adapter = new T32Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}