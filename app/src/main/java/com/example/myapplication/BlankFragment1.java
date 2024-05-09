package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment1 extends Fragment {
    Button mButton;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_blank1, container, false);
        mButton = (Button) inflatedView.findViewById(R.id.button);
        textView = (TextView) inflatedView.findViewById(R.id.textView);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello!");
                Toast.makeText(getActivity(),"You have pressed the button!",Toast.LENGTH_SHORT).show();
            }
        });
        return inflatedView;
    }
}
