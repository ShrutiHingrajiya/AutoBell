package com.example.AutoBell.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.autobell.R;

import java.util.ArrayList;

public class Adapter_Notification extends RecyclerView.Adapter<Adapter_Notification.Myholder> {

    ArrayList<String> arrayList;
    private Context c;

    public Adapter_Notification(Context c) {
        this.c = c;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_notifications, parent, false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position)
    {
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class Myholder extends RecyclerView.ViewHolder {

        public Myholder(@NonNull View itemView)
        {
            super(itemView);

        }
    }
}
