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
public class RNFragment extends Fragment implements View.OnClickListener{

    private Button btnReverse;
    private EditText etNumber;
    private TextView tvReverse;


    public RNFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rn, container, false);


        etNumber = view.findViewById(R.id.etReverseNum);
        btnReverse = view.findViewById(R.id.btnRN);
        tvReverse = view.findViewById(R.id.tvReverseOutput);

        btnReverse.setOnClickListener(this);
        return view;


    }
    @Override
    public void onClick(View v)
    {
        if (TextUtils.isEmpty(etNumber.getText()))
        {
            etNumber.setError("Enter number");
            return;
        }
        else
        {
            int revNum, result;
            revNum = Integer.parseInt(etNumber.getText().toString());
            result = MathematicActions.reversenumber(revNum);

            tvReverse.setText(Integer.toString(result) + " is a reverse output");

            Toast.makeText(getActivity(),"Reverse Number is:" + result,Toast.LENGTH_LONG).show();

    }


    }




}
