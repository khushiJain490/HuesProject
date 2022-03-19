package com.example.huesapp;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.Adapters.CartAdapter;
import com.example.huesapp.ModelClass.CartModelClass;
import com.example.huesapp.databinding.ActivityCartBinding;
import com.example.huesapp.databinding.ActivityLandingBinding;
import com.example.huesapp.databinding.ActivityWishlistBinding;
import com.example.huesapp.ui.home.FragmentHome;

import java.util.ArrayList;
import java.util.List;

public class ActivityWishlist extends AppCompatActivity {
    RecyclerView recyclerView;
    CartAdapter cartAdapter;
    ActivityWishlistBinding binding;
    List<CartModelClass> cartList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWishlistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//
//        Toolbar toolbar = binding.toolbarWishlist;
//        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                getActivity().onBackPressed();
//
//                FragmentHome thirdFragment = new FragmentHome();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment_container_landing, thirdFragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
//            }
//        });


        cartList=new ArrayList<>();
        cartList.add(new CartModelClass("Prototype 1",1500,3));
        cartList.add(new CartModelClass("Prototype 2",2000,3));
        cartList.add(new CartModelClass("Prototype 3",1499,3));
        cartList.add(new CartModelClass("Prototype 4",1700,3));



        recyclerView=binding.cartRecycler;
        final LinearLayoutManager layoutManager = new LinearLayoutManager(ActivityWishlist.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        cartAdapter=new CartAdapter(this,cartList);
        cartAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(cartAdapter);



    }
}
