package com.example.izoneprofile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.izoneprofile.R;
import com.example.izoneprofile.data.IZONEMember;

import java.util.ArrayList;

public class IZONEAdapter extends RecyclerView.Adapter<IZONEAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<IZONEMember> memberList;

    public void setMemberList(ArrayList<IZONEMember> memberList) {
        this.memberList = memberList;
    }

    public IZONEAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<IZONEMember> getMemberList(){
        return memberList;
    }

    @Override
    public int getItemCount() {
        return getMemberList().size();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.izone_member_row, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        categoryViewHolder.viewName.setText(getMemberList().get(i).getNickName());
        categoryViewHolder.viewRank.setText("Rank "+getMemberList().get(i).getRank());
        int photo = Integer.parseInt(getMemberList().get(i).getPhoto());
        Glide.with(context)
                .load(photo)
                .apply(new RequestOptions().override(150, 150))
                .into(categoryViewHolder.viewPhoto);
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView viewName, viewRank;
        ImageView viewPhoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            viewName = itemView.findViewById(R.id.member_nickname);
            viewRank = itemView.findViewById(R.id.member_rank);
            viewPhoto = itemView.findViewById(R.id.member_image);
        }
    }
}
