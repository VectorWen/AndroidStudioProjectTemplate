package com.vector.dialog.ui;

import android.app.Fragment;
import android.os.Bundle;

import com.vector.dialog.R;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2015/10/12
 * Description:<p>{TODO: 用一句话描述}
 */
public class ShowFragmentActivity extends BaseActivity{

    public static final String FRAGMENT_NAME = "name";
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Class<?> cls = Class.forName(getIntent().getStringExtra(FRAGMENT_NAME));
            mFragment = (Fragment) cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(mFragment!=null){
            getFragmentManager().beginTransaction().replace(android.R.id.content,mFragment,"nice").commit();
        }else{
            setContentView(R.layout.item_not_found);
        }
    }
}
