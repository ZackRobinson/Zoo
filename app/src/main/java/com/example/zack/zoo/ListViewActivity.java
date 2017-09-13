package com.example.zack.zoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    ListView lvCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvCategory = (ListView)findViewById(R.id.lvCategory);

        final List<String> animalCategories = new ArrayList<>();
        animalCategories.add("Lions");
        animalCategories.add("Tigers");
        animalCategories.add("Bears");
        animalCategories.add("Platypi");
        animalCategories.add("Axolotl");

        ArrayAdapter arrayAdapterSimple = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,animalCategories);
        lvCategory.setAdapter(arrayAdapterSimple);
        lvCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Category = animalCategories.get(position);
                Intent intent = new Intent(ListViewActivity.this,MainActivity.class);
                intent.putExtra("KEY",Category);
                startActivity(intent);
            }
        });



    }
}
