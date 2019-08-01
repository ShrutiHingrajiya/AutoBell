package com.example.AutoBell.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Adapter.Orders_Adapter;
import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class orders_autobellActivity extends AppCompatActivity {
    Orders_Adapter adpter;

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.img_chat)
    ImageView imgChat;
    @BindView(R.id.img_profile)
    ImageView imgProfile;
    @BindView(R.id.recycler_orders)
    RecyclerView recyclerOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_autobell);
        ButterKnife.bind(this);

        CallMyRecycellist();
        this.setClickListner();
    }

    private void setClickListner() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void CallMyRecycellist() {
        adpter = new Orders_Adapter(this);
        @SuppressLint("WrongConstant") LinearLayoutManager layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        recyclerOrders.setLayoutManager(layoutManager);
        recyclerOrders.setAdapter(adpter);
    }
}
