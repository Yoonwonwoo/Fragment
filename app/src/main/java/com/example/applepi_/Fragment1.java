package com.example.applepi_;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView listView;
    View v;

    public Fragment1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = LayoutInflater.from(getContext()).inflate(R.layout.fragment1,null);
        listView = v.findViewById(R.id.listview);

        mAdapter = new ListAdapter(items);
        listView.setAdapter(mAdapter);

        items.add(new Data("a1", "b1"));
        items.add(new Data("a2", "b2"));
        items.add(new Data("a3", "b3"));
        items.add(new Data("a4", "b4"));
        items.add(new Data("a5", "b5"));
        items.add(new Data("a6", "b6"));
        items.add(new Data("a7", "b7"));
        items.add(new Data("a8", "b8"));
        items.add(new Data("a9", "b9"));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(v.getContext(),Detail_Activity.class);

                intent.putExtra("title",items.get(position).getTitle());
                intent.putExtra("content",items.get(position).getContent());

                startActivity(intent);
            }
        });

        mAdapter.notifyDataSetChanged();

        return v;
    }

}
