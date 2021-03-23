package com.on.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";
    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();

        list.add(new Card("drawable://" + R.drawable.a, "a 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.b, "b 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.c, "c 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.d, "d 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.e, "e 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.f, "f 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.g, "g 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.h, "h 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.i, "i 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.j, "j 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.k, "k 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.l, "l 이미지 입니다 "));
        list.add(new Card("drawable://" + R.drawable.m, "m 이미지 입니다 "));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_layout_main, list);
        mListView.setAdapter(adapter);


        return view;
    }
}
