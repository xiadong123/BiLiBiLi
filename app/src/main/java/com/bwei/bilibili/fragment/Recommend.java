package com.bwei.bilibili.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwei.bilibili.R;
import com.bwei.bilibili.Utils.TabLayoutTitle;

import java.util.ArrayList;

/**
 * 类的用途:
 *
 * @author 李辉
 * @date 2017/3/9 18:44.
 */

public class Recommend extends Fragment implements View.OnClickListener{

    private View view;
    private TextView synthesize;
    private TextView dynamic_condition;
    private ViewPager recommend_vp;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.recommend, null);

        //初始化控件
        initView();

        //实现联动
        initAdapter();

        return view;
    }

    private void initView() {
        recommend_vp = (ViewPager) view.findViewById(R.id.recommend_vp);
        synthesize = (TextView) view.findViewById(R.id.synthesize);
        dynamic_condition = (TextView) view.findViewById(R.id.dynamic_condition);
        synthesize.setOnClickListener(this);
        dynamic_condition.setOnClickListener(this);

    }
    private void initAdapter() {
        recommend_vp.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.synthesize:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.recommend_layout,new SynthesizeFragment()).commit();
                synthesize.setTextColor(Color.RED);
                dynamic_condition.setTextColor(Color.BLACK);
                break;
            case R.id.dynamic_condition:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.recommend_layout,new DynamicConditionFragment()).commit();
                dynamic_condition.setTextColor(Color.RED);
                synthesize.setTextColor(Color.BLACK);
                break;

        }

    }
}
