package com.example.hw0926;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        TextView title = findViewById(R.id.title_article);
        TextView info = findViewById(R.id.info_article);

        Bundle bundle = getIntent().getExtras();

        String aTitle="";
        String aInfo="";
        if(bundle != null){
            aTitle = bundle.get("title").toString();
            aInfo = bundle.get("info").toString();
        }

        title.setText(aTitle);
        info.setText(aInfo);
    }
}
