package com.example.template.fragments;

import androidx.fragment.app.Fragment;

import com.example.template.MainActivity;

public class BaseFragment extends Fragment {

    private MainActivity mainActivity;

    public MainActivity getMainActivity() {
        if (mainActivity == null)
            mainActivity = (MainActivity) getActivity();
        return mainActivity;
    }

    public BaseFragment(){
        super();
    }
}
