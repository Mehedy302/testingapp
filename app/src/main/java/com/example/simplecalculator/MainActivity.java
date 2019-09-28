package com.example.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Functionalities ob1 = new Functionalities();

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText editTsxt;

    Double mValueOne, mValueTwo;

    boolean addition, mSubtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        editTsxt = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener   (new View.OnClickListener() {
            @Override
            public void onClick(View v)    {
                editTsxt.setText(editTsxt.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTsxt == null) {
                    editTsxt.setText("");
                } else {
                    mValueOne = Double.parseDouble(editTsxt.getText() + "");
                    addition = true;
                    editTsxt.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(editTsxt.getText() + "");
                mSubtract = true;
                editTsxt.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(editTsxt.getText() + "");
                multiplication = true;
                editTsxt.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(editTsxt.getText() + "");
                division = true;
                editTsxt.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Double.parseDouble(editTsxt.getText() + "");

                if (addition == true) {
                    editTsxt.setText(mValueOne +" + "+mValueTwo+" = "+ob1.add(mValueOne , mValueTwo) + "");
                    addition = false;

                }

                if (mSubtract == true) {
                    editTsxt.setText(mValueOne +" - "+mValueTwo+" = "+ob1.subtract(mValueOne , mValueTwo) + "");
                    mSubtract = false;
                }

                if (multiplication == true) {
                    editTsxt.setText(mValueOne +" * "+mValueTwo+" = "+ob1.multiply(mValueOne , mValueTwo) + "");
                    multiplication = false;
                }

                if (division == true) {
                    editTsxt.setText(mValueOne +" / "+mValueTwo+" = "+ob1.divide(mValueOne , mValueTwo) + "");
                    division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTsxt.setText(editTsxt.getText() + ".");
            }
        });
    }
    public int adder(int a,int b)
    {
        return a+b;
    }
}