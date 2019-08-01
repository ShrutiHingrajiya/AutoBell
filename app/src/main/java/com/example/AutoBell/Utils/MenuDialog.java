package com.example.AutoBell.Utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.AutoBell.Activity.NotificationActivity;
import com.example.AutoBell.Activity.PackageActivity;
import com.example.AutoBell.Activity.ProfileActivity;
import com.example.AutoBell.Activity.QChatActivity;
import com.example.AutoBell.Activity.TreatmentsActivity;
import com.example.AutoBell.Activity.Welcome_AutobellActivity;
import com.example.AutoBell.Activity.orders_autobellActivity;
import com.example.autobell.R;


public class MenuDialog {

    public static String strActivityName;
    public static boolean flagOpenDialog;

    public static void OpenMenuDialog(Activity activity) {
        Dialog dialog = new Dialog(activity, R.style.mytheme);
        dialog.getWindow()
                .getAttributes().windowAnimations = R.style.DialogAnimationOutUpInUp;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dialog.setContentView(R.layout.dialog_navigation);

        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);

        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);


        dialog.getWindow().setGravity(Gravity.TOP);

        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);

        ImageView imgNavigationClose;
        LinearLayout ll_dashboard;
        LinearLayout ll_profile;
        LinearLayout ll_service;
        LinearLayout ll_orderhistory;
        LinearLayout ll_notification;
        LinearLayout ll_package;
        LinearLayout ll_qchat;
        LinearLayout ll_helpsupport;
        LinearLayout ll_logout;


        imgNavigationClose = (ImageView) dialog.findViewById(R.id.imgNavigationClose);
        ll_profile = (LinearLayout) dialog.findViewById(R.id.ll_profile);
        ll_dashboard = (LinearLayout) dialog.findViewById(R.id.ll_dashboard);
        ll_service = (LinearLayout) dialog.findViewById(R.id.ll_service);
        ll_orderhistory = (LinearLayout) dialog.findViewById(R.id.ll_orderhistory);
        ll_notification = (LinearLayout) dialog.findViewById(R.id.ll_notification);
        ll_package = (LinearLayout) dialog.findViewById(R.id.ll_package);
        ll_qchat = (LinearLayout) dialog.findViewById(R.id.ll_qchat);
        ll_helpsupport = (LinearLayout) dialog.findViewById(R.id.ll_helpsupport);
        ll_logout = (LinearLayout) dialog.findViewById(R.id.ll_logout);


     /* Service = "1";
        Profile = "2";
        Chat = "3";
        Notification Center = "4";
        Support = "5";
        Dashboard = "6";
        History = "7";*/


        imgNavigationClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ll_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(activity, ProfileActivity.class);
                activity.startActivity(i);
            }
        });


        ll_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(activity, TreatmentsActivity.class);
                activity.startActivity(i);
            }
        });

        ll_qchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Intent i = new Intent(activity, QChatActivity.class);
                activity.startActivity(i);
            }
        });

        ll_orderhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Intent i = new Intent(activity, orders_autobellActivity.class);
                activity.startActivity(i);
            }
        });


        ll_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(activity, NotificationActivity.class);
                activity.startActivity(i);
            }
        });


        ll_package.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(activity, PackageActivity.class);
                activity.startActivity(i);
            }
        });


        ll_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                activity.finishAffinity();
                Intent i = new Intent(activity, Welcome_AutobellActivity.class);
                activity.startActivity(i);
            }
        });

        flagOpenDialog = true;
        dialog.show();
    }
}
