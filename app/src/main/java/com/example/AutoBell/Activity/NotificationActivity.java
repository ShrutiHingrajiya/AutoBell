package com.example.AutoBell.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Adapter.Adapter_Notification;
import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotificationActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.RecyclerNotification)
    RecyclerView RecyclerNotification;
    @BindView(R.id.ll_main)
    LinearLayout llMain;

    private Adapter_Notification Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ButterKnife.bind(this);

        Log.e("Hello","SaveData");


        Adapter_Notification adapter = new Adapter_Notification(NotificationActivity.this);
        @SuppressLint("WrongConstant") LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(NotificationActivity.this, LinearLayoutManager.VERTICAL, false);
        RecyclerNotification.setLayoutManager(linearLayoutManager2);
        RecyclerNotification.setAdapter(adapter);

        setListeners();

    }

    private void setListeners() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }


}
