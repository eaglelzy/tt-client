package com.lizy.tt.app.contact;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizy.framework.mvp.BaseUIFragment;
import com.lizy.tt.R;

/**
 * 联系人
 */
public class ContactFragment extends BaseUIFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

}
