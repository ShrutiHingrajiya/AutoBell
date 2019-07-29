package com.example.AutoBell.Activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.autobell.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.tvProfileAddAddress)
    TextView tvProfileAddAddress;
    @BindView(R.id.imgProfileAddAddress)
    ImageView imgProfileAddAddress;

    LinearLayout lnProfileAddAddress;
    CardView cardProfileSaveAddress;
    LinearLayout lnShowAddress;
    CardView cardProfileAddAddress;
    LinearLayout lnAddAddress;
    @BindView(R.id.tvProfileAddVehicle)
    TextView tvProfileAddVehicle;
    @BindView(R.id.imgProfileAddVehicle)
    ImageView imgProfileAddVehicle;
    @BindView(R.id.imgProfileChangePassword)
    ImageView imgProfileChangePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        this.setMemoryAllocation();
        this.setListeners();
    }

    private void setListeners() {

        imgProfileChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogForChangePassword();
            }
        });

        tvProfileAddAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogForShowAddress();
            }
        });

        imgProfileAddAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogForShowAddress();
            }
        });

        tvProfileAddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogForShowVehicle();
            }
        });

        imgProfileAddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogForShowVehicle();
            }
        });
    }

    private void OpenDialogForChangePassword() {

        View view1 = (View) LayoutInflater.from(ProfileActivity.this).inflate(R.layout.dialog_profile_change_password, null);
        BottomSheetDialog dialog = new BottomSheetDialog(ProfileActivity.this, R.style.SheetDialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view1);

        CardView cardProfileSavePassword = (CardView) dialog.findViewById(R.id.cardProfileSavePassword);

        cardProfileSavePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    private void OpenDialogForShowVehicle() {

        View view1 = (View) LayoutInflater.from(ProfileActivity.this).inflate(R.layout.dialog_profile_vehicle, null);
        BottomSheetDialog dialog = new BottomSheetDialog(ProfileActivity.this, R.style.SheetDialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view1);

        LinearLayout lnShowVehicles;
        LinearLayout lnProfileAddVehicle;
        LinearLayout lnAddCar;
        CardView cardProfileSaveVehicle, cardProfileAddVehicle;

        lnShowVehicles = (LinearLayout) dialog.findViewById(R.id.lnShowVehicles);
        lnProfileAddVehicle = (LinearLayout) dialog.findViewById(R.id.lnProfileAddVehicle);
        lnAddCar = (LinearLayout) dialog.findViewById(R.id.lnAddCar);
        cardProfileSaveVehicle = (CardView) dialog.findViewById(R.id.cardProfileSaveVehicle);
        cardProfileAddVehicle = (CardView) dialog.findViewById(R.id.cardProfileAddVehicle);

        lnShowVehicles.setVisibility(View.GONE);
        lnAddCar.setVisibility(View.GONE);
        lnShowVehicles.setVisibility(View.VISIBLE);

        cardProfileSaveVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        lnProfileAddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnShowVehicles.setVisibility(View.GONE);
                lnAddCar.setVisibility(View.VISIBLE);
            }
        });

        cardProfileAddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnShowVehicles.setVisibility(View.VISIBLE);
                lnAddCar.setVisibility(View.GONE);
            }
        });

        dialog.show();

    }

    private void OpenDialogForShowAddress() {

        View view1 = (View) LayoutInflater.from(ProfileActivity.this).inflate(R.layout.dialog_profile_address, null);
        BottomSheetDialog dialog = new BottomSheetDialog(ProfileActivity.this, R.style.SheetDialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view1);

        lnShowAddress = (LinearLayout) dialog.findViewById(R.id.lnShowAddress);
        lnProfileAddAddress = (LinearLayout) dialog.findViewById(R.id.lnProfileAddAddress);
        cardProfileSaveAddress = (CardView) dialog.findViewById(R.id.cardProfileSaveAddress);
        lnAddAddress = (LinearLayout) dialog.findViewById(R.id.lnAddAddress);
        cardProfileAddAddress = (CardView) dialog.findViewById(R.id.cardProfileAddAddress);

        lnShowAddress.setVisibility(View.GONE);
        lnAddAddress.setVisibility(View.GONE);
        lnShowAddress.setVisibility(View.VISIBLE);

        cardProfileSaveAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        lnProfileAddAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnAddAddress.setVisibility(View.VISIBLE);
                lnShowAddress.setVisibility(View.GONE);
            }
        });

        cardProfileAddAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnAddAddress.setVisibility(View.GONE);
                lnShowAddress.setVisibility(View.VISIBLE);
            }
        });

        dialog.show();

    }

    private void setMemoryAllocation() {
    }
}
