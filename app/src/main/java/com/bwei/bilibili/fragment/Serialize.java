package com.bwei.bilibili.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.bilibili.R;

/**
 * 类的用途:
 *
 * @author 李辉
 * @date 2017/3/9 18:44.
 */

public class Serialize extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.serialize, null);
        return view;
    }
}
