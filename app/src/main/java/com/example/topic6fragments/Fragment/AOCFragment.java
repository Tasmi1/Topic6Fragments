package com.example.topic6fragments.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.topic6fragments.MathematicActions;
import com.example.topic6fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AOCFragment extends Fragment implements View.OnClickListener {

    private Button btnArea;
    private EditText etradius;
    private TextView tvArea;


    public AOCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aoc, container, false);

        etradius = view.findViewById(R.id.etradius);
        btnArea = view.findViewById(R.id.btnaoc);
        tvArea = view.findViewById(R.id.tvArea);

        btnArea.setOnClickListener( this);
        return view;

    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etradius.getText()))
        {
            etradius.setError("Enter radius of circle");
            return;
        }
        else
        {
            float radius = Float.parseFloat(etradius.getText().toString());
            float AOC;

            AOC = MathematicActions.areaofcircle(radius);

            tvArea.setText("Area of Circle :" + AOC + "cm");

            Toast.makeText(getActivity(),"Area of Circle: " + AOC, Toast.LENGTH_LONG).show();

        }

    }





}
