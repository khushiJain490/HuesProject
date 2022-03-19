package com.example.huesapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.ModelClass.AdsItem;
import com.example.huesapp.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<AdsItem> itemList;
    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        public ImageView categoryIcon;
        public CategoryViewHolder(final View parent) {
            super(parent);
            categoryIcon = (ImageView) parent.findViewById(R.id.img_category);


        }
    }
    public CategoryAdapter(List<AdsItem>itemList){
        this.itemList=itemList;
    }
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_list_item,parent,false);
        return new CategoryViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        AdsItem row=itemList.get(position);
        holder.categoryIcon.setImageResource(row.getImageId());
    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

