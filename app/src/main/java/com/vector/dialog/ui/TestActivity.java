package com.vector.dialog.ui;

import android.os.Bundle;
import android.view.View;

import com.vector.dialog.R;
import com.vector.dialog.ui.BaseActivity;
import com.vector.dialog.ui.fragment.TestFragment;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2015/10/12
 * Description:<p>{TODO: 用一句话描述}
 */
public class TestActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_fragment_btn:
                showFragment(TestFragment.class.getName());
                break;
        }
    }


}
