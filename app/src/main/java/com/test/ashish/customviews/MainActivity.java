package com.test.ashish.customviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.ashish.customviews.View.CustomViews;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomViews customViews = new CustomViews(this,null);
    }
}
