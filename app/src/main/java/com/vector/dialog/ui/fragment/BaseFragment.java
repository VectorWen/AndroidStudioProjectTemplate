package com.vector.dialog.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2015/10/16
 * Description:<p>{TODO: 用一句话描述}
 */
public class BaseFragment extends Fragment {

    protected View mParent;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return  mParent;
    }
}
