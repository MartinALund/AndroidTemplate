package com.example.template.handlers;

import android.support.v4.app.FragmentManager;

import com.example.template.MainActivity;
import com.example.template.R;
import com.example.template.fragments.BaseFragment;

public class FragmentHandler {

    private FragmentManager fm;

    public FragmentHandler(MainActivity activity){
        fm = activity.getSupportFragmentManager();
    }
    public FragmentManager getFragmentManager(){
        return fm;
    }

    public void startTransactionNoBackStack(BaseFragment fragment) {
        fm.beginTransaction().replace(R.id.mainView, fragment).commitAllowingStateLoss();
    }
    public void startTransactionWithBackStack(BaseFragment fragment){
        fm.beginTransaction().replace(R.id.mainView, fragment).addToBackStack(null).commit();
    }

}
