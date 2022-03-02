package com.candybar.sample.activities;

import androidx.annotation.NonNull;

import candybar.lib.activities.CandyBarMainActivity;

import com.candybar.sample.licenses.License;

public class MainActivity extends CandyBarMainActivity {

    @NonNull
    @Override
    public ActivityConfiguration onInit() {
        return new ActivityConfiguration();
    }
}
