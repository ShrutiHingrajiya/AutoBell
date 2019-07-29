package com.example.AutoBell.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Bean.My_ChatBean;
import com.example.autobell.R;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter_Chat_Message extends RecyclerView.Adapter<Adapter_Chat_Message.MessageViewHolder> {

    Context context;
    ArrayList<My_ChatBean> followup_list;


    public Adapter_Chat_Message(Context context, ArrayList<My_ChatBean> followup_list) {
        this.context = context;
        this.followup_list = followup_list;
    }

    public Adapter_Chat_Message(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.raw_chat_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position)
    {

        holder.mLinearRecivedMessage.setVisibility(View.GONE);
        holder.mLinearSentMessage.setVisibility(View.GONE);


        if (position % 2 == 0)
        {
            holder.mLinearRecivedMessage.setVisibility(View.VISIBLE);

            if (position == 0) {
                holder.mTxtRecivedMessage.setText("Hiii");
            } else if (position == 2) {
                holder.mTxtRecivedMessage.setText("How Are You \n How Are You");
            } else if (position == 4) {
                holder.mTxtRecivedMessage.setText("I'M Fine \n How Are You");
            }

        }
        else {

            if (position == 1) {
                holder.mTxtSentMessage.setText("Hiii");
            } else if (position == 3) {
                holder.mTxtSentMessage.setText("I'm Fine..\n How Are You");
            } else if (position == 5) {
                holder.mTxtSentMessage.setText("Great \n How Are You");
            }
            holder.mLinearSentMessage.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_recived_message)
        TextView mTxtRecivedMessage;
        @BindView(R.id.linear_recived_message)
        LinearLayout mLinearRecivedMessage;
        @BindView(R.id.txt_sent_message)
        TextView mTxtSentMessage;
        @BindView(R.id.linear_sent_message)
        LinearLayout mLinearSentMessage;



        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

        }
    }
}
