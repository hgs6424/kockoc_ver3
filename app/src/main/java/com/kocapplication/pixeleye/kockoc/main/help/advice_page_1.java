package com.kocapplication.pixeleye.kockoc.main.help;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kocapplication.pixeleye.kockoc.R;

/**
 * Created by Nam on 2016-06-27.
 */
public class advice_page_1 extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View relativeLayout = inflater.inflate(R.layout.activity_adapter_advice1,container,false);

        return relativeLayout;
    }

}
