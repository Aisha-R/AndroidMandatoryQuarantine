package com.aisharooble.quarantineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    ResultFragment resultFragment;
    boolean checkBox1 = false;
    boolean checkBox2 = false;
    boolean checkBox3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    checkBox1 = true;

                } else {
                    checkBox1 = false;
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    checkBox2 = true;
                } else {
                    checkBox2 = false;
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    checkBox3 = true;
                } else {
                    checkBox3 = false;
                }
                break;
        }

        resultFragment = new ResultFragment();

        if ( !checkBox1 && !checkBox2 && !checkBox3 ) {
            resultFragment.setResult(false);
        } else {
            resultFragment.setResult(true);
        }

        presentFragment(R.id.frameLayout, resultFragment);
    }

    public void presentFragment(int resourceID, Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(resourceID, fragment)
                .commit();

    }

}
