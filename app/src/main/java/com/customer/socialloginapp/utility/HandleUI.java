package com.customer.socialloginapp.utility;

import android.content.Context;
import android.view.View;

import com.customer.socialloginapp.R;
import com.customer.socialloginapp.databinding.ActivityWelcomeBinding;

/**
 * Class to handle ui changes based on sign and sign out functionality
 */
public class HandleUI {

    private static HandleUI mInstance = new HandleUI();

    public static HandleUI getInstance() {
        return mInstance;
    }

    private HandleUI() {
    }

    /**
     * update ui after sign in or log out
     * @param mBinding binding object of the calling activity or fragment
     * @param aUsername Logged in user details
     * @param mContext context
     */
    public void updateUI(ActivityWelcomeBinding mBinding, String aUsername, Context mContext){
        if (aUsername!=null) {
            mBinding.textView.setText("Welcome " + aUsername + ", Click to signout.");
            mBinding.imgGoogle.setVisibility(View.GONE);
            mBinding.imgFacebook.setVisibility(View.GONE);
        }else{
            mBinding.textView.setText(mContext.getResources().getString(R.string.please_select_account_to_login));
            mBinding.imgGoogle.setVisibility(View.VISIBLE);
            mBinding.imgFacebook.setVisibility(View.VISIBLE);
        }
    }

}
