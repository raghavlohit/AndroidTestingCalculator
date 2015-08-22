package com.xurxo.androidtestingcalculator.presentation.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.xurxo.androidtestingcalculator.R;
import com.xurxo.androidtestingcalculator.domain.AddOperation;
import com.xurxo.androidtestingcalculator.domain.CalculatorEngine;
import com.xurxo.androidtestingcalculator.domain.model.Digit;

public class CalculatorFragment extends Fragment {

    TextView result;
    TextView operationsHistory;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button dot;
    Button positiveNegative;
    Button ClearAll;
    Button ClearToEmpty;
    Button Add;
    Button subtract;
    Button multiply;
    Button Divide;
    Button percentage;
    Button equal;

    CalculatorEngine calEngine = new CalculatorEngine();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView;

        rootView = inflater.inflate(R.layout.fragment_calculator, container, false);

        result = (TextView) rootView.findViewById(R.id.result_TextView);
        operationsHistory =(TextView) rootView.findViewById(R.id.operations_history_textView);

        zero= (Button) rootView.findViewById(R.id.zero_button);
        one= (Button) rootView.findViewById(R.id.one_button);
        two= (Button) rootView.findViewById(R.id.two_button);
        three= (Button) rootView.findViewById(R.id.three_button);
        four= (Button) rootView.findViewById(R.id.four_button);
        five= (Button) rootView.findViewById(R.id.five_button);
        six= (Button) rootView.findViewById(R.id.six_button);
        seven= (Button) rootView.findViewById(R.id.seven_button);
        eight= (Button) rootView.findViewById(R.id.eight_button);
        nine= (Button) rootView.findViewById(R.id.nine_button);
        dot= (Button) rootView.findViewById(R.id.dot_button);
        positiveNegative= (Button) rootView.findViewById(R.id.positive_negative_button);
        ClearAll= (Button) rootView.findViewById(R.id.clear_all_button);
        ClearToEmpty= (Button) rootView.findViewById(R.id.clear_all_button);
        Add= (Button) rootView.findViewById(R.id.add_button);
        subtract= (Button) rootView.findViewById(R.id.subtract_button);
        multiply= (Button) rootView.findViewById(R.id.multiply_button);
        Divide= (Button) rootView.findViewById(R.id.divide_button);
        percentage= (Button) rootView.findViewById(R.id.percenage_button);
        equal= (Button) rootView.findViewById(R.id.equal_button);
        
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("0"));
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("1"));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("2"));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("3"));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("4"));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("5"));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("6"));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("7"));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("8"));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterDigit(new Digit("9"));
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        positiveNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ClearToEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.enterOperation(new AddOperation());
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calEngine.calculate();
                result.setText(String.valueOf(calEngine.getResult()));
            }
        });



        result.setText("");
        operationsHistory.setText("");
        return rootView;
    }

}
