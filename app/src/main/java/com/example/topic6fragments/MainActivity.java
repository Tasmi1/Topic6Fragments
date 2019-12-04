package com.example.topic6fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.topic6fragments.Fragment.AMFragment;
import com.example.topic6fragments.Fragment.AOCFragment;
import com.example.topic6fragments.Fragment.PalindromeFragment;
import com.example.topic6fragments.Fragment.RNFragment;
import com.example.topic6fragments.Fragment.RSFragment;
import com.example.topic6fragments.Fragment.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea;
    private Button btnSum;
    private Button btnReverseNum;
    private Button btnPalindrome;
    private Button btnAutomorphic;
    private Button btnReverseString;


    private Boolean status = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnsum);
        btnArea = findViewById(R.id.btnAOC);
        btnReverseNum = findViewById(R.id.btnRN);
        btnPalindrome = findViewById(R.id.btnP);
        btnAutomorphic = findViewById(R.id.btnAuto);
        btnReverseString = findViewById(R.id.btnRS);


        btnSum.setOnClickListener(this);
        btnArea.setOnClickListener(this);
        btnReverseNum.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
        btnReverseString.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId())
        {
            case R.id.btnsum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnAOC:
                AOCFragment aocFragment = new AOCFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,aocFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnRN:
                RNFragment rnFragment = new RNFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,rnFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnP:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnAuto:
                AMFragment automorphicFragment = new AMFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnRS:
                RSFragment reverseStringFragment = new RSFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


        }
    }
}
