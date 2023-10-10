package com.example.hw0928;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView img = findViewById(R.id.productImg);
        TextView title = findViewById(R.id.productTitle);
        TextView info = findViewById(R.id.productInfo);

        Bundle bundle = getIntent().getExtras();

        String prodTitle = "";
        String prodInfo = "";
        int prodImg = 0;
        if(bundle != null){
            prodImg = (int)bundle.get("img");
            prodTitle = bundle.get("title").toString();
            prodInfo = bundle.get("info").toString();
        }

        title.setText(prodTitle);
        info.setText(prodInfo);
        img.setImageResource(prodImg);
    }
}