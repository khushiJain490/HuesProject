package com.example.huesapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.huesapp.CartFragment;
import com.example.huesapp.ModelClass.CartModelClass;
import com.example.huesapp.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewModelHolder> {
    CartFragment fragment;
    List<CartModelClass>cartList;


    public CartAdapter(CartFragment fragment, List<CartModelClass> cartList) {
        this.fragment = fragment;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartViewModelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cart_list_item, parent, false);
        return new CartViewModelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewModelHolder holder, int position) {
      holder.productQuantity.setText(""+cartList.get(position).getProductQuantity());
      holder.productName.setText(cartList.get(position).getProductName());
      holder.productCost.setText(""+cartList.get(position).getProductCost());
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewModelHolder extends RecyclerView.ViewHolder {
        TextView productName,productQuantity,productCost;
        ImageView cartImage;
        public CartViewModelHolder(@NonNull View itemView) {

            super(itemView);
            productName=itemView.findViewById(R.id.product_name);
            productCost=itemView.findViewById(R.id.product_cost);
            productQuantity=itemView.findViewById(R.id.product_quantity);
            cartImage=itemView.findViewById(R.id.cart_image);
        }
    }
}
