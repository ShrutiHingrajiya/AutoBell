package com.example.AutoBell.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.AutoBell.Utils.MenuDialog;
import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DashbordActivity extends AppCompatActivity {


    @BindView(R.id.img_dashboard_menu)
    ImageView imgDashboardMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.img_dashboard_menu)
    public void onViewClicked()
    {
        MenuDialog.OpenMenuDialog(DashbordActivity.this);
    }
}
