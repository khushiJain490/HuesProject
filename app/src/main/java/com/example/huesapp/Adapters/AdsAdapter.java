package com.example.huesapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.ModelClass.AdsItem;
import com.example.huesapp.R;

import java.util.List;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.AdsViewHolder>{

    private List<AdsItem> itemList;
    public class AdsViewHolder extends RecyclerView.ViewHolder {
        public ImageView Adsicon;
        public AdsViewHolder(final View parent) {
            super(parent);
            Adsicon = (ImageView) parent.findViewById(R.id.img_ads);


        }
    }
    public AdsAdapter(List<AdsItem>itemList){
        this.itemList=itemList;
    }
    @Override
    public AdsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adds_list_item,parent,false);
        return new AdsViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(AdsViewHolder holder, int position) {
        AdsItem row=itemList.get(position);
        holder.Adsicon.setImageResource(row.getImageId());
    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
