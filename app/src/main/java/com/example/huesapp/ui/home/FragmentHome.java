package com.example.huesapp.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.Adapters.AdsAdapter;
import com.example.huesapp.Adapters.CategoryAdapter;
import com.example.huesapp.Adapters.ProductsAdapter;
import com.example.huesapp.ModelClass.AdsItem;
import com.example.huesapp.ProductActivity;
import com.example.huesapp.R;
import com.example.huesapp.databinding.DrawerLayoutBinding;
import com.example.huesapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    private FragmentHomeBinding binding;
    private List<AdsItem> itemList = new ArrayList<>();
    private List<AdsItem> itemList1 = new ArrayList<>();
    private List<AdsItem> itemList2 = new ArrayList<>();
    private RecyclerView Adsrecyclerview, categoryRecyclerView, bestSellRecyclerView;
    private AdsAdapter adsAdapter;
    private CategoryAdapter categoryAdapter;
    private ProductsAdapter productsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);


        Adsrecyclerview=binding.rvAds;
        adsAdapter = new AdsAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        Adsrecyclerview.setLayoutManager(mLayoutManger);
        Adsrecyclerview.setItemAnimator(new DefaultItemAnimator());
        Adsrecyclerview.setAdapter(adsAdapter);
        displayAddItem();

        categoryRecyclerView=binding.rvCategory;
        categoryAdapter = new CategoryAdapter(itemList1);
        RecyclerView.LayoutManager mLayoutManger2 = new LinearLayoutManager(requireActivity(),LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(mLayoutManger2);
        categoryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        categoryRecyclerView.setAdapter(categoryAdapter);
        displayCategoryItem();

        bestSellRecyclerView=binding.rvBestSell;
        productsAdapter = new ProductsAdapter(itemList2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireActivity(),2);
        bestSellRecyclerView.setLayoutManager(gridLayoutManager);
        bestSellRecyclerView.setItemAnimator(new DefaultItemAnimator());
        bestSellRecyclerView.setAdapter(productsAdapter);
        displayProductItem();
        return binding.getRoot();


    }

    private void displayProductItem() {
        AdsItem item = new AdsItem(R.drawable.prototype);
        itemList2.add(item);
        item = new AdsItem(R.drawable.prototype);
        itemList2.add(item);
        item = new AdsItem(R.drawable.prototype);
        itemList2.add(item);
        item = new AdsItem(R.drawable.prototype);
        itemList2.add(item);
        productsAdapter.notifyDataSetChanged();
        bestSellRecyclerView.setAdapter(productsAdapter);
    }

    private void displayCategoryItem() {

        AdsItem item1 = new AdsItem(R.drawable.ellipse_22);
        itemList1.add(item1);
        item1 = new AdsItem(R.drawable.ellipse_22);
        itemList1.add(item1);
        item1 = new AdsItem(R.drawable.ellipse_22);
        itemList1.add(item1);
        item1 = new AdsItem(R.drawable.ellipse_22);
        itemList1.add(item1);
        categoryAdapter.notifyDataSetChanged();
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void displayAddItem() {
        AdsItem item2 = new AdsItem(R.drawable.sale);
        itemList.add(item2);
        item2 = new AdsItem(R.drawable.sale);
        itemList.add(item2);
        item2 = new AdsItem(R.drawable.sale);
        itemList.add(item2);
        item2 = new AdsItem(R.drawable.sale);
        itemList.add(item2);
        adsAdapter.notifyDataSetChanged();
        Adsrecyclerview.setAdapter(adsAdapter);
    }
}
