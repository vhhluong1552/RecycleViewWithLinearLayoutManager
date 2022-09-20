package com.hoangluong.recycleviewwithlinearlayoutmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context mContext;
    private ArrayList<User> mArrUser;

    public UserAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(ArrayList<User> arr){
        this.mArrUser = arr;
        notifyDataSetChanged(); // load dữ liệu vào adapter bắt buộc phải có
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent, false);
        return new UserViewHolder(view);
    }



    @Override
    //set data cho adapter
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
          User user = mArrUser.get(position);
          if(user == null){
              return;
          }
          holder.imgUser.setImageResource(user.getResourceId());
          holder.tvName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if(mArrUser != null){
            return mArrUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgUser;
        private TextView tvName;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.img_user);
            tvName = itemView.findViewById(R.id.tv_name);
        }


    }
}
