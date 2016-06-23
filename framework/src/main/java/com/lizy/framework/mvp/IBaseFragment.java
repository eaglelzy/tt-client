package com.lizy.framework.mvp;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

/**
 * Created by lizy on 16-5-20.
 */
public interface IBaseFragment {
    Context getContext();

    FragmentActivity getActivity();

    boolean isActivityFinish();
}
