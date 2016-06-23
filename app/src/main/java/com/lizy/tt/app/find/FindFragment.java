package com.lizy.tt.app.find;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizy.framework.mvp.BaseUIFragment;
import com.lizy.tt.R;

/**
 * 发现
 */
public class FindFragment extends BaseUIFragment {


    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

}
