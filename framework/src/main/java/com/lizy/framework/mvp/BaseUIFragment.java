package com.lizy.framework.mvp;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by lizy on 15-8-18.
 */
public class BaseUIFragment extends Fragment implements IBaseFragment{

    protected ActivityCallback mActivityCallback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ActivityCallback) {
            mActivityCallback = (ActivityCallback) context;
        }
    }

    @Override
    public void onDetach() {
        mActivityCallback = null;
        super.onDetach();
    }

    @Override
    public boolean isActivityFinish() {
        return getActivity() == null || getActivity().isFinishing();
    }

    /**
     * 用来各个fragment之间通信,activity需要实现该接口
     *
     */
    public interface ActivityCallback {
        void handleMessage(int what, Object... args);
    }
}
