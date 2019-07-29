package com.example.AutoBell.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Welcome_AutobellActivity extends AppCompatActivity {

    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_BecomeAClient)
    Button btnBecomeAClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__autobell);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {

        Intent i = new Intent(Welcome_AutobellActivity.this, Login_autobellActivity.class);
        startActivity(i);
        //finish();
    }

    @OnClick(R.id.btn_BecomeAClient)
    public void onViewClicked1() {

        Intent i = new Intent(Welcome_AutobellActivity.this, Become_A_ClientActivity.class);
        startActivity(i);
    }
}
