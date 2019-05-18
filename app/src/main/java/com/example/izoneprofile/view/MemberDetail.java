package com.example.izoneprofile.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.izoneprofile.R;
import com.example.izoneprofile.data.IZONEData;

import org.w3c.dom.Text;

public class MemberDetail extends AppCompatActivity {

    ImageView memberPhoto;
    TextView memberFullName, memberNickName, memberRank, memberBirthDay, memberBloodType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_detail);

        memberPhoto = findViewById(R.id.memberPhoto);
        memberFullName = findViewById(R.id.tvFullName);
        memberNickName = findViewById(R.id.tvNickName);
        memberRank = findViewById(R.id.tvRank);
        memberBirthDay = findViewById(R.id.tvDateOfBirth);
        memberBloodType = findViewById(R.id.tvBloodType);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        setResource(position);

    }

    private void setResource(int position){
        memberNickName.setText(IZONEData.data[position][0]);
        memberFullName.setText(IZONEData.data[position][1]);
        memberRank.setText(IZONEData.data[position][2]);
        memberBirthDay.setText(IZONEData.data[position][3]);
        memberBloodType.setText(IZONEData.data[position][4]);
        memberPhoto.setImageResource(Integer.parseInt(IZONEData.data[position][5]));
    }
}
