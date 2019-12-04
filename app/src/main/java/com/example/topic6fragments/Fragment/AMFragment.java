package com.example.topic6fragments.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.topic6fragments.MathematicActions;
import com.example.topic6fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AMFragment extends Fragment {

private Button btnAutuomorphic;
private EditText etAutomorphicNum;
private TextView tvOutput;

    public AMFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_am, container, false);


        etAutomorphicNum = view.findViewById(R.id.etAutomorphicNum);
        tvOutput = view.findViewById(R.id.tvOutput);
        final Button btnautomorphic = (Button) view.findViewById(R.id.btncheck);

        btnautomorphic.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                int automorphicNum = Integer.parseInt(String.valueOf(etAutomorphicNum.getText()));
                boolean isAutomorphic = MathematicActions.isAutomorphic(automorphicNum);

                if (isAutomorphic)
                {
                    tvOutput.setText(etAutomorphicNum.getText()+ " is automorphic number");

                }
                else
                {
                    tvOutput.setText(etAutomorphicNum.getText()+ "is not Automorphic number");
                }

            }
        });
        return view;
    }

}
