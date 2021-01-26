package com.switchbt.view;

import android.os.Bundle;
import android.util.Log;

import com.wyu.switchbtn.SwitchButton;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.switch_button)
    SwitchButton switchButton;
    @BindView(R.id.switch_button_1)
    SwitchButton switchButton1;
    @BindView(R.id.switch_button_2)
    SwitchButton switchButton2;
    @BindView(R.id.switch_button_3)
    SwitchButton switchButton3;
    @BindView(R.id.switch_button_4)
    SwitchButton switchButton4;
    @BindView(R.id.switch_button_5)
    SwitchButton switchButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                setSwitchButton(isChecked);
//            }
//        });
//
//        switchButton1.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                setSwitchButton(isChecked);
//            }
//        });
//
//        switchButton2.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                setSwitchButton(isChecked);
//            }
//        });
//
//        switchButton3.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                setSwitchButton(isChecked);
//            }
//        });
//
//        switchButton4.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
//                setSwitchButton(isChecked);
//            }
//        });

        switchButton5.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                setSwitchButton(isChecked);
            }
        });
    }


    public void setSwitchButton(boolean select) {
        Log.i("MainActivity", "===  setSwitchButton(" + select + ")  ===");
        switchButton.setChecked(select);
        switchButton1.setChecked(select);
        switchButton2.setChecked(select);
        switchButton3.setChecked(select);
        switchButton4.setChecked(select);
        switchButton5.setChecked(select);
    }
}
