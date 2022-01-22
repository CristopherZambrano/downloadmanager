package com.example.downloadmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements= new ArrayList<>();
        elements.add(new ListElement("Fichero 1","20/01/2020","#775447"));
        elements.add(new ListElement("Fichero 2","20/01/2020","#607d8b"));
        elements.add(new ListElement("Fichero 3","20/01/2020","#03a9f4"));
        elements.add(new ListElement("Fichero 4","20/01/2020","#f44336"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.lstrecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}