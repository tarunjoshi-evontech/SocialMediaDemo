package com.customer.socialloginapp.interfaces;

import android.support.v7.app.AppCompatActivity;

import com.customer.socialloginapp.databinding.ActivityWelcomeBinding;
import com.facebook.CallbackManager;

/**
 * Login interface, classes that want to Facebook and Google login must implement this interface
 */

public interface Login {
    /**
     * @param mBinding
     * @param mContext
     * @param mCallbackManager
     */
    void doLogin(ActivityWelcomeBinding mBinding, AppCompatActivity mContext, CallbackManager mCallbackManager);
}
