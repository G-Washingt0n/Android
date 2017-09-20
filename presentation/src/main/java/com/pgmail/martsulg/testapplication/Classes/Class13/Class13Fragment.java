package com.pgmail.martsulg.testapplication.Classes.Class13;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pgmail.martsulg.testapplication.R;

/**
 * Created by lenovo on 21.08.2017.
 */

public class Class13Fragment extends Fragment {

    public static final String TEXT_KEY = "TEXT_KEY";
    private String text;


    public static Class13Fragment newInstance(FragmentManager fragmentManager, String text) {

        Fragment fragment = fragmentManager
                .findFragmentByTag(Class13Fragment.class.getName());
        Class13Fragment class13Fragment;

        if (fragment != null && fragment instanceof Class13Fragment) {
            class13Fragment = (Class13Fragment) fragment;
        } else {
            class13Fragment = new Class13Fragment();
        Bundle bundle = new Bundle();
        bundle.putString(TEXT_KEY, text);
            class13Fragment.setArguments(bundle);
    }
        return class13Fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){
            text = bundle.getString(TEXT_KEY);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class13, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    /**
     * *Вызывается когда активити в которой леит фрагмент создана.
     * Посл этого метода можно исполтьзовать метод getActivity().
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
