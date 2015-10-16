package com.vector.dialog.ui;

import android.os.Bundle;
import android.view.View;

import com.vector.dialog.R;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.test_activity_btn:
                startActivity(TestActivity.class);
                break;
        }
    }
}
