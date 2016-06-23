package com.lizy.tt;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.lizy.framework.utils.ProcessUtils;

/**
 * Created by lizy on 16-5-13.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (ProcessUtils.isMainProcess(this)) {
            initInMainProcess();
        }
    }

    private void initInMainProcess() {
        Fresco.initialize(this);
    }
}
