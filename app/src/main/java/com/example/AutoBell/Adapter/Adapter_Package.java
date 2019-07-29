package com.example.AutoBell.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.autobell.R;

import java.util.ArrayList;

public class Adapter_Package extends RecyclerView.Adapter<Adapter_Package.Myholder> {

    //To work with this company
    ArrayList<String> arrayList;
    private Context c;

    public Adapter_Package(Context c) {
        this.c = c;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_packages, parent, false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position)
    {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    class Myholder extends RecyclerView.ViewHolder {

        public Myholder(@NonNull View itemView)
        {
            super(itemView);

        }
    }
}
