package com.example.AutoBell.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Become_A_ClientActivity extends AppCompatActivity {

    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become__a__client);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {

        Intent i = new Intent(Become_A_ClientActivity.this, Login_autobellActivity.class);
        startActivity(i);
        //finish();
    }

    @OnClick(R.id.btn_signup)
    public void onViewClicked1() {

        Intent i = new Intent(Become_A_ClientActivity.this, DashbordActivity.class);

        startActivity(i);
        //finish();
    }
}
