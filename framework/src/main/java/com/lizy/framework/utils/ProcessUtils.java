package com.lizy.framework.utils;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * Created by lizy on 15-6-15.
 */
public class ProcessUtils {

    /**
     * 判断当前进程是否为主进程
     *
     * @param context
     * @return
     */
    public static boolean isMainProcess(Context context) {
        return getProcessName(context, android.os.Process.myPid()).equals(context.getPackageName());
    }


    /**
     * 根据 pid 获取进程名称
     *
     * @param context
     * @param pid
     * @return
     */
    public static String getProcessName(Context context, int pid) {
        final ActivityManager activityManager = (ActivityManager)
                context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> runningAppProcesses =
                activityManager.getRunningAppProcesses();
        try {
            for (ActivityManager.RunningAppProcessInfo info : runningAppProcesses) {
                if (info.pid == pid) {
                    return info.processName;
                }
            }
        } catch (Exception e) {
        }
        return "";
    }
}
