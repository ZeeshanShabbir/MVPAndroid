package io.droidninja.mvpandroid.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Zeeshan on 4/10/17.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected T presenter;

    @NonNull
    public abstract T createPresenter(@NonNull Context context);
}
