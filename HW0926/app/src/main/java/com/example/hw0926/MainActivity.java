package com.example.hw0926;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView articlesList = findViewById(R.id.listView);
        articlesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                String info ="Info about " + selectedItem;


                Intent intent = new Intent(view.getContext(), ArticleActivity.class);
                intent.putExtra("title", selectedItem);
                intent.putExtra("info", info);
                startActivity(intent);

            }
        });
    }
}