package com.example.izoneprofile.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.izoneprofile.R;
import com.example.izoneprofile.adapter.IZONEAdapter;
import com.example.izoneprofile.data.IZONEData;
import com.example.izoneprofile.data.IZONEMember;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMember;
    private ArrayList<IZONEMember> memberList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMember = findViewById(R.id.rV_member);
        rvMember.setHasFixedSize(true);

        memberList.addAll(IZONEData.getMemberData());
        showList();
    }


    public void showList(){
        rvMember.setLayoutManager(new LinearLayoutManager(this));
        IZONEAdapter izoneAdapter = new IZONEAdapter(this);
        izoneAdapter.setMemberList(memberList);
        rvMember.setAdapter(izoneAdapter);

        ItemClickSupport.addTo(rvMember).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMember(memberList.get(position), position);
            }
        });

    }

    private void showSelectedMember(IZONEMember member, int position){
        Toast.makeText(this, "You picked "+member.getNickName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MemberDetail.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
