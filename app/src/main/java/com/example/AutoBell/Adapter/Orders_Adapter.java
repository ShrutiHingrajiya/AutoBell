package com.example.AutoBell.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.autobell.R;
import java.util.List;
import butterknife.ButterKnife;

public class Orders_Adapter extends RecyclerView.Adapter<Orders_Adapter.UserViewHolder> {


    private List<String> MyOrderList;
    private Context context;

    public static class UserViewHolder extends RecyclerView.ViewHolder {


        public UserViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

    public Orders_Adapter(List<String> MyOrderList, Context context) {
        this.MyOrderList = MyOrderList;
        this.context = context;

    }

    public Orders_Adapter(Context context) {
        this.MyOrderList = MyOrderList;
        this.context = context;

    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_orders, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    //here error will come in get so just clear it and then write getLeave_List_Month.this will directly give the suggestion
    public void onBindViewHolder(final UserViewHolder holder, final int position) {


    }

    @Override
    public int getItemCount() {
        return 4;

    }
}
