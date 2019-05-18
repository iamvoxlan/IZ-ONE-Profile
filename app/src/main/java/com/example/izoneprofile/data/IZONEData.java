package com.example.izoneprofile.data;

import com.example.izoneprofile.R;

import java.util.ArrayList;

public class IZONEData {
    public static String[][] data = new String[][]{
            {"Wonyoung", "Jang Wonyoung (장원영)", "1", "August 31st 2004", "O", String.valueOf(R.drawable.jangwonyoung)},
            {"Sakura", "Miyawaki Sakura (宮脇 咲良)", "2", "March 19th 1998", "A", String.valueOf(R.drawable.miyawakisakura)},
            {"Yuri", "Jo Yuri (조유리)", "3", "October 22nd 2001", "AB", String.valueOf(R.drawable.joyuri)},
            {"Yena", "Choi Yena (최예나)", "4", "September 29th 1999", "A", String.valueOf(R.drawable.choiyena)},
            {"Yujin", "An Yujin (안유진)", "5", "September 1st 2003",  "A", String.valueOf(R.drawable.anyujin)},
            {"Nako", "Yabuki Nako (矢吹奈子)", "6", "June 18th 2001", "Unknown", String.valueOf(R.drawable.yabukinako)},
            {"Eunbi", "Kwon Eunbi (권은비)", "7", "September 27th 1995", "A", String.valueOf(R.drawable.kwoneunbi)},
            {"Hyewon", "Kang Hyewon (강혜원)", "8", "July 5th 1999", "B", String.valueOf(R.drawable.kanghyewon)},
            {"Hitomi", "Honda Hitomi (本田仁美)", "9", "October 6th 2001", "A", String.valueOf(R.drawable.hondahitomi)},
            {"Chaewon", "Kim Chaewon (김채원)", "10", "August 1st 2000", "B", String.valueOf(R.drawable.kimchaewon)},
            {"Minju", "Kim Minju (김민주)", "11", "February 5th 2001", "AB", String.valueOf(R.drawable.kimminju)},
            {"Chaeyeon", "Lee Chaeyeon (이채연)", "12", "January 11th 2000", "A", String.valueOf(R.drawable.leechaeyeon)}
    };

    public static ArrayList<IZONEMember> getMemberData(){
        IZONEMember member;
        ArrayList<IZONEMember> list = new ArrayList<>();
        for (String[] memberData : data){
            member = new IZONEMember();
            member.setNickName(memberData[0]);
            member.setFullName(memberData[1]);
            member.setRank(memberData[2]);
            member.setBirthday(memberData[3]);
            member.setBloodType(memberData[4]);
            member.setPhoto(memberData[5]);

            list.add(member);
        }

        return list;
    }
}
