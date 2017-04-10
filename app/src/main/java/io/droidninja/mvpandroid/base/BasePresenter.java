package io.droidninja.mvpandroid.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

/**
 * Created by Zeeshan on 4/10/17.
 */

public abstract class BasePresenter {
    protected BasePresenter() {

    }

    @CallSuper
    protected void onCreate(Bundle savedInstanceState) {

    }

    @CallSuper
    protected void onResume() {

    }

    @CallSuper
    protected void onPause() {

    }

    @CallSuper
    protected void onSaveInstanceState(Bundle savedInstanceState) {

    }

    @CallSuper
    protected void onDestroy() {

    }

    @CallSuper
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @CallSuper
    protected void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions,
                                              @NonNull final int[] grantResults) {

    }
}
