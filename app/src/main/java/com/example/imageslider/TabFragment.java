package com.example.imageslider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TabFragment newInstance(String param1, String param2) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        //RecyclerView RecyclerView = view.findViewById(R.id.recyclerview1);
        ArrayList<recyclerviewitem> recyclerviewList = new ArrayList<>();
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 1", "Sub Text 1"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 2", "Sub Text 2"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 3", "Sub Text 3"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 1", "Sub Text 1"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 2", "Sub Text 2"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 3", "Sub Text 3"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 1", "Sub Text 1"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 2", "Sub Text 2"));
        recyclerviewList.add(new recyclerviewitem(R.drawable.ic_baseline_adb_24, "Text 3", "Sub Text 3"));


        mRecyclerView = view.findViewById(R.id.recyclerview1);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new RecyclerViewAdapter(recyclerviewList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }
}