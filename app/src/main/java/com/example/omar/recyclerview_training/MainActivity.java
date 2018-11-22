package com.example.omar.recyclerview_training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView = findViewById(R.id.omar);

        ArrayList<Model> list =new ArrayList<>();

        Model model = new Model("Omar");
        list.add(model);
        Model mode2 = new Model("Omar");
        list.add(mode2);

        Model mode3 = new Model("Omar");
        list.add(mode3);

        Model mode4 = new Model("Omar");
        list.add(mode4);

        Model mode5 = new Model("Omar");
        list.add(mode5);

        Main2Activity main2Activity = new Main2Activity(this,list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(main2Activity);
        main2Activity.notifyDataSetChanged();
    }
}
