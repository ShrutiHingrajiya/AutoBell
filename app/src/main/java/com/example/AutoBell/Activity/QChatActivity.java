package com.example.AutoBell.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.AutoBell.Adapter.Adapter_Chat_Message;
import com.example.autobell.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QChatActivity extends AppCompatActivity {

    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.recycler_chat)
    RecyclerView recyclerChat;
    @BindView(R.id.edt_chat_textsend)
    EditText edtChatTextsend;

    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qchat);
        ButterKnife.bind(this);


        Adapter_Chat_Message adapter_broadcast = new Adapter_Chat_Message(this);
        @SuppressLint("WrongConstant") RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerChat.setLayoutManager(mLayoutManager);
        recyclerChat.setAdapter(adapter_broadcast);


    }
}
