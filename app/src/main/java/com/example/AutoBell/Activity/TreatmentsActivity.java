package com.example.AutoBell.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Adapter.TreatMentAdapter;
import com.example.AutoBell.Bean.TreatmentsType;
import com.example.autobell.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TreatmentsActivity extends AppCompatActivity {

    public static LinearLayout linear_view_details;
    public static CardView card_view_Details;
    public static LinearLayout linear_click;
    public static LinearLayout linear_click_end;
    public static LinearLayout mFirstLinear;
    public static LinearLayout mSecondLinear;
    public static LinearLayout mLinearBack;
    @BindView(R.id.recycler_treatments)
    RecyclerView mRecyclerTreatments;
    @BindView(R.id.img_back_treatments)
    ImageView mImgBackTreatments;
    @BindView(R.id.img_chat_treatments)
    ImageView mImgChatTreatments;
    @BindView(R.id.img_person_treatments)
    ImageView mImgPersonTreatments;
    @BindView(R.id.edt_service)
    EditText mEdtService;
    @BindView(R.id.img_search)
    ImageView mImgSearch;
    ArrayList<TreatmentsType> arrayList;
    @BindView(R.id.linear_view_less)
    LinearLayout mLinearViewLess;
    TreatMentAdapter treatMentAdapter;
    @BindView(R.id.linear_click)
    LinearLayout mLinearClick;
    @BindView(R.id.btn_proceed)
    TextView mBtnProceed;
    @BindView(R.id.linear_selected)
    LinearLayout mLinearSelected;
    @BindView(R.id.linear_car_main)
    LinearLayout mLinearCarMain;
    @BindView(R.id.linear_work_address)
    LinearLayout mLinearWorkAddress;
    @BindView(R.id.txt_work_address)
    TextView mTxtWorkAddress;
    @BindView(R.id.lnAddAddress)
    LinearLayout mLnAddAddress;


    Boolean flag_1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatments);
        ButterKnife.bind(this);
        arrayList = new ArrayList<>();
        mFirstLinear = findViewById(R.id.first_linear);
        mSecondLinear = findViewById(R.id.second_linear);
        mLinearBack = findViewById(R.id.linear_back);

        mFirstLinear.setVisibility(View.VISIBLE);
        mSecondLinear.setVisibility(View.GONE);

        card_view_Details = findViewById(R.id.card_view_Details);
        linear_view_details = findViewById(R.id.linear_view_details);
        linear_click = findViewById(R.id.linear_click);
        linear_click_end = findViewById(R.id.linear_click_end);
        linear_click.setVisibility(View.VISIBLE);
        linear_click_end.setVisibility(View.VISIBLE);


        linear_view_details.setVisibility(View.GONE);
        card_view_Details.setVisibility(View.GONE);

        mLinearBack.setVisibility(View.GONE);

        TreatmentsType treatmentsType = new TreatmentsType(getString(R.string.paintprotection), getString(R.string.paintprotection), R.drawable.ic_paint_protection);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.paintdocumentation), getString(R.string.paintdocumentation), R.drawable.ic_paint_documentation);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.glasstreament), getString(R.string.glasstreament), R.drawable.ic_glass_treatment);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.externalplastictreatment), getString(R.string.externalplastictreatment), R.drawable.ic_plastic_treatment);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.paintworkcorrection), getString(R.string.paintworkcorrection), R.drawable.ic_paint_work_correction);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.wheeltreatment), getString(R.string.wheeltreatment), R.drawable.ic_wheel_treatment);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.interiortreatment), getString(R.string.interiortreatment), R.drawable.ic_interior_treatment);
        arrayList.add(treatmentsType);

        treatmentsType = new TreatmentsType(getString(R.string.washingtreatments), getString(R.string.washingtreatments), R.drawable.ic_wasing_treatment);
        arrayList.add(treatmentsType);


        treatMentAdapter = new TreatMentAdapter(this, arrayList);
        @SuppressLint("WrongConstant") RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerTreatments.setLayoutManager(mLayoutManager);
        mRecyclerTreatments.setAdapter(treatMentAdapter);


        this.setClickListner();

    }

    private void setClickListner() {

        mLinearWorkAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag_1) {
                    flag_1 = false;
                    mLnAddAddress.setVisibility(View.GONE);
                    mLinearWorkAddress.setBackground(getResources().getDrawable(R.drawable.rounded_circle_rect));
                    mTxtWorkAddress.setTextColor(getResources().getColor(R.color.main_font_color));
                } else {
                    flag_1 = true;
                    mLnAddAddress.setVisibility(View.VISIBLE);
                    mLinearWorkAddress.setBackground(getResources().getDrawable(R.drawable.rounded_rect_without_border_coloracent));
                    mTxtWorkAddress.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        mLinearCarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinearCarMain.setBackground(getResources().getDrawable(R.drawable.rounded_circle_rect_red));
                mLinearSelected.setVisibility(View.VISIBLE);
            }
        });
        mLinearViewLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_click.setVisibility(View.VISIBLE);
                linear_click_end.setVisibility(View.VISIBLE);
                //treatMentAdapter.remove_color();
                //linear_view_details.setVisibility(View.VISIBLE);
                slidout(linear_view_details);
            }
        });


        mImgBackTreatments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mLinearBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSecondLinear.setVisibility(View.GONE);
                mFirstLinear.setVisibility(View.VISIBLE);
                mLinearBack.setVisibility(View.GONE);
            }
        });

        mBtnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirstLinear.setVisibility(View.GONE);
                mSecondLinear.setVisibility(View.VISIBLE);
                mLinearBack.setVisibility(View.VISIBLE);
            }
        });
    }


    public void slidout(View view) {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                linear_view_details.setVisibility(View.GONE);
                card_view_Details.setVisibility(View.GONE);
            }
        }, 500);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                view.getHeight(),                 // toXDelta
                0,                 // fromYDelta
                0); // toYDelta
        animate.setDuration(500);
        //animate.setFillAfter(true);
        view.startAnimation(animate);


    }
}
