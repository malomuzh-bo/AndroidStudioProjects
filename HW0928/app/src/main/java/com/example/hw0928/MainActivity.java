package com.example.hw0928;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> products = new ArrayList<>();
    ListView productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        productList = findViewById(R.id.productList);

        ProductAdapter productAdapter = new ProductAdapter(this,R.layout.list_item, products);

        productList.setAdapter(productAdapter);

        AdapterView.OnItemClickListener itemListener = (parent, view, pos, l) -> {
            Product selected = (Product) parent.getItemAtPosition(pos);
            Intent intent = new Intent(view.getContext(), InfoActivity.class);
            intent.putExtra("title", selected.getTitle());
            intent.putExtra("info", selected.getInfo());
            intent.putExtra("image", selected.getSource());
            startActivity(intent);
        };

        productList.setOnItemClickListener(itemListener);
    }

    private void setInitialData(){
        products.add(new Product("product1", "info1", R.drawable.car));
        products.add(new Product("product2", "info2", R.drawable.car2));

    }
}