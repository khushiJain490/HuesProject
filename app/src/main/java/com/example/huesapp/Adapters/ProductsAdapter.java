package com.example.huesapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.ModelClass.AdsItem;
import com.example.huesapp.ProductActivity;
import com.example.huesapp.R;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {
    private List<AdsItem> itemList;
    private Context context;

    public ProductsAdapter(List<AdsItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {
        public ImageView productIcon;
        public ProductsViewHolder(final View parent) {
            super(parent);
            productIcon = (ImageView) parent.findViewById(R.id.item_img);

            productIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(parent.getContext(), ProductActivity.class);
                    parent.getContext().startActivity(intent);
                }
            });


        }

    }
    public ProductsAdapter(List<AdsItem>itemList){
        this.itemList=itemList;
    }
    @Override
    public ProductsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_sell_list_item,parent,false);
        return new ProductsViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(ProductsViewHolder holder, int position) {
        AdsItem row=itemList.get(position);
        holder.productIcon.setImageResource(row.getImageId());

    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

