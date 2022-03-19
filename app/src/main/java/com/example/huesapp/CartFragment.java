package com.example.huesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.Adapters.CartAdapter;
import com.example.huesapp.ModelClass.CartModelClass;
import com.example.huesapp.databinding.ActivityCartBinding;
import com.example.huesapp.ui.home.FragmentHome;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {
    RecyclerView recyclerView;
    CartAdapter cartAdapter;
    ActivityCartBinding binding;
    List<CartModelClass>cartList;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ActivityCartBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.backbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


        Toolbar toolbar = binding.cartTop;
        toolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getActivity().onBackPressed();

                FragmentHome thirdFragment = new FragmentHome();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container_landing, thirdFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        cartList=new ArrayList<>();
        cartList.add(new CartModelClass("Prototype 1",1500,3));
        cartList.add(new CartModelClass("Prototype 2",2000,3));
        cartList.add(new CartModelClass("Prototype 3",1499,3));
        cartList.add(new CartModelClass("Prototype 4",1700,3));



        recyclerView=binding.cartRecycler;
        final LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        cartAdapter=new CartAdapter(this,cartList);
        cartAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(cartAdapter);



    }
}
