package com.hoangluong.recycleviewwithlinearlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter  = new UserAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);

    }

    private ArrayList<User> getListUser() {
        ArrayList<User> arr = new ArrayList<>();
        arr.add(new User(R.drawable.a1,"Lưu Lan"));
        arr.add(new User(R.drawable.a2,"Lưu Lan"));
        arr.add(new User(R.drawable.a3,"Lưu Lan"));
        arr.add(new User(R.drawable.a4,"Lưu Lan"));

        arr.add(new User(R.drawable.a1,"Lưu Lan"));
        arr.add(new User(R.drawable.a2,"Lưu Lan"));
        arr.add(new User(R.drawable.a3,"Lưu Lan"));
        arr.add(new User(R.drawable.a4,"Lưu Lan"));

        arr.add(new User(R.drawable.a1,"Lưu Lan"));
        arr.add(new User(R.drawable.a2,"Lưu Lan"));
        arr.add(new User(R.drawable.a3,"Lưu Lan"));
        arr.add(new User(R.drawable.a4,"Lưu Lan"));

        arr.add(new User(R.drawable.a1,"Lưu Lan"));
        arr.add(new User(R.drawable.a2,"Lưu Lan"));
        arr.add(new User(R.drawable.a3,"Lưu Lan"));
        arr.add(new User(R.drawable.a4,"Lưu Lan"));

        return arr;
    }
}