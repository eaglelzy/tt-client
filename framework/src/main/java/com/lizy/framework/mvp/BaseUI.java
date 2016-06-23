package com.lizy.framework.mvp;

import android.support.annotation.NonNull;

/**
 * Created by lizy on 16-5-17.
 */
public interface BaseUI<T> extends IBaseFragment {

    void setPresenter(@NonNull T presenter);

}
