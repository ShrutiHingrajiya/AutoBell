package com.example.AutoBell.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Adapter.Adapter_Notification;
import com.example.AutoBell.Adapter.Adapter_Package;
import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PackageActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.RecyclerPackage)
    RecyclerView RecyclerPackage;
    @BindView(R.id.ll_main)
    LinearLayout llMain;

    private Adapter_Notification Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);
        ButterKnife.bind(this);

        setListeners();


        Adapter_Package adapter=new Adapter_Package(this);
        @SuppressLint("WrongConstant") LinearLayoutManager layoutManager = new LinearLayoutManager(PackageActivity.this, LinearLayoutManager.VERTICAL, false);
        RecyclerPackage.setLayoutManager(layoutManager);
        RecyclerPackage.setAdapter(adapter);

    }


    private void setListeners() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }


}
