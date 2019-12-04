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
public class PalindromeFragment extends Fragment {

private Button btnCheckPalindrome;
private EditText etpalinnum;
private TextView tvoutput;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etpalinnum = view.findViewById(R.id.etPalindromenum);
        tvoutput = view.findViewById(R.id.tvOutput);

        final Button btncheck = (Button) view.findViewById(R.id.btncheck);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int palindromeNum = Integer.parseInt(String.valueOf(etpalinnum.getText()));
                boolean isPalindrome = MathematicActions.isPalindrome(palindromeNum);

                if (isPalindrome)
                {
                    tvoutput.setText(etpalinnum.getText() + " is palindrome number");

                }
                else
                {
                    tvoutput.setText(etpalinnum.getText() + "is not palindrome number");
                }

            }

        });
        return view;

    }

}
