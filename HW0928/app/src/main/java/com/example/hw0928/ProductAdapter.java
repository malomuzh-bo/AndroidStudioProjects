package com.example.hw0928;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {

    private final List<Product> products;
    private final int layout;
    private final LayoutInflater inflater;

    public ProductAdapter(@NonNull Context context, int resource, @NonNull List<Product> products) {
        super(context, resource, products);
        this.products = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int pos, View cView, ViewGroup group){
        View view = inflater.inflate(this.layout, group, false);

        ImageView img = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);

        Product product = products.get(pos);
        img.setImageResource(product.getSource());

        return view;
    }
}
