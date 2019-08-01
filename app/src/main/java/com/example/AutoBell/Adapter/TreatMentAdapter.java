package com.example.AutoBell.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Bean.TreatmentsType;
import com.example.autobell.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.AutoBell.Activity.TreatmentsActivity.card_view_Details;
import static com.example.AutoBell.Activity.TreatmentsActivity.linear_click;
import static com.example.AutoBell.Activity.TreatmentsActivity.linear_click_end;
import static com.example.AutoBell.Activity.TreatmentsActivity.linear_view_details;
import static com.example.AutoBell.Activity.TreatmentsActivity.mFirstLinear;
import static com.example.AutoBell.Activity.TreatmentsActivity.mLinearBack;
import static com.example.AutoBell.Activity.TreatmentsActivity.mSecondLinear;

public class TreatMentAdapter extends RecyclerView.Adapter<TreatMentAdapter.MyViewHolder> {

    Context context;
    ArrayList<TreatmentsType> arrayList;
    MyViewHolder pastholder;
    private int selectedpossition;
    private boolean check_visible = false;


    public TreatMentAdapter(Context context, ArrayList<TreatmentsType> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public TreatMentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.raw_treatments, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        TreatmentsType treatmentsType = arrayList.get(position);
        holder.mTxtMainContent.setText(treatmentsType.getName());
        holder.mTxtSmallContent.setText(treatmentsType.getSubname());
        holder.mImgTratment.setImageResource(treatmentsType.getImage());


//        hjhjj


        holder.mLinearMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_click.setVisibility(View.GONE);
                linear_click_end.setVisibility(View.GONE);
                if (check_visible) {
                    pastholder.mLinearMain.setBackgroundColor(context.getResources().getColor(R.color.app_background_color));
                    // holder.mImgTratment.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));

                    pastholder.mImgTratment.setColorFilter(context.getResources().getColor(R.color.main_font_color));
                    pastholder.mImgTreatmentArrow.setColorFilter(context.getResources().getColor(R.color.main_font_color));
                    pastholder.mTxtSmallContent.setTextColor(context.getResources().getColor(R.color.main_font_color));
                    pastholder.mTxtMainContent.setTextColor(context.getResources().getColor(R.color.main_font_color));

                    pastholder = holder;
                } else {
                    pastholder = holder;
                    check_visible = true;
                }


                //holder.mLinearMain.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                // holder.mImgTratment.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                //holder.mImgTratment.setColorFilter(context.getResources().getColor(R.color.white));
                card_view_Details.setVisibility(View.VISIBLE);
                //linear_view_details.setVisibility(View.VISIBLE);

                slidin(linear_view_details);

            }
        });


    }

    public void slidin(View view) {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mFirstLinear.setVisibility(View.VISIBLE);
                mSecondLinear.setVisibility(View.GONE);
                mLinearBack.setVisibility(View.GONE);
                linear_view_details.setVisibility(View.VISIBLE);
                // pastholder.mLinearMain.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
            }
        }, 50);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // linear_view_details.setVisibility(View.VISIBLE);
                pastholder.mLinearMain.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                pastholder.mImgTratment.setColorFilter(context.getResources().getColor(R.color.white));
                pastholder.mImgTreatmentArrow.setColorFilter(context.getResources().getColor(R.color.white));
                pastholder.mTxtSmallContent.setTextColor(context.getResources().getColor(R.color.white));
                pastholder.mTxtMainContent.setTextColor(context.getResources().getColor(R.color.white));
            }
        }, 450);


        TranslateAnimation animate = new TranslateAnimation(
                view.getHeight(),                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                0); // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);


    }

    private Animation inFromLeftAnimation(View view) {

        Animation inFromRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, -1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f);
        view.setBackgroundColor(Color.BLUE);
        inFromRight.setDuration(10000);
        inFromRight.setInterpolator(new AccelerateInterpolator());
        return inFromRight;
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public void remove_color() {
        pastholder.mImgTratment.setColorFilter(context.getResources().getColor(R.color.colorPrimary));
        pastholder.mLinearMain.setBackgroundColor(context.getResources().getColor(R.color.app_background_color));
        //check_visible=false;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_tratment)
        ImageView mImgTratment;
        @BindView(R.id.txt_main_content)
        TextView mTxtMainContent;
        @BindView(R.id.txt_small_content)
        TextView mTxtSmallContent;
        @BindView(R.id.img_treatment_arrow)
        ImageView mImgTreatmentArrow;
        @BindView(R.id.linear_main)
        LinearLayout mLinearMain;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
