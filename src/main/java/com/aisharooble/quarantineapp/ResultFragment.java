package com.aisharooble.quarantineapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {

    private boolean result;
    private TextView textView;
    private EditText editText;

    /*public static ResultFragment newInstance(Boolean input) {
        ResultFragment resultFragment = new ResultFragment();
        result = input;
        return resultFragment;
    }*/

    public ResultFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.resultlayout, container, false);

        textView = view.findViewById(R.id.textView);
        editText = view.findViewById(R.id.editText);

        if (result) {
            textView.setText("Get tested.");
            editText.setText("NB: Don't go to the doctor's office, pharmacy, hospital or similar. Wait at home for your results.");
        } else {
            textView.setText("No need to get tested.");
        }

        return view;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

}
