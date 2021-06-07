package com.example.lecture13recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.style.LeadingMarginSpan;
import android.view.ViewGroup;

import com.example.recyclerviewproject.R;
import com.example.recyclerviewproject.RecyclerViewAdapter;
import com.example.recyclerviewproject.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<User> list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        User asim = new User(1,"Asim","20", "Isl");
        User ali = new User(2,"Ali", "23", "Lahore");
        User umair = new User(3,"Umair", "40", "Gujrawala");
        User nasir = new User(4,"Nasir","21","Peshawar");

        list.addAll(Arrays.asList(new User[]{asim,ali,umair,nasir}));

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(list,MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}