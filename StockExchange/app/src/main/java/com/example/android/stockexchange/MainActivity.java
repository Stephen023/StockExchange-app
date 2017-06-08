package com.example.android.stockexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when reset button is clicked.
     */
    public void resetButton(View view) {
        int result = 0;
        result = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the Submit Answers button is clicked
     */
    public void submitButton(View view) {
        //Getting the answer to question 1 checkbox 1
        CheckBox checkBox1q1 = (CheckBox) findViewById(R.id.checkbox1q1);
        boolean isCheckBox1q1 = checkBox1q1.isChecked();

        //Getting the answer to question 1 checkbox 2
        CheckBox checkBox2q1 = (CheckBox) findViewById(R.id.checkbox2q1);
        boolean isCheckBox2q1 = checkBox2q1.isChecked();

        //Getting the answer to question 1 checkbox 3
        CheckBox checkBox3q1 = (CheckBox) findViewById(R.id.checkbox3q1);
        boolean isCheckBox3q1 = checkBox3q1.isChecked();

        //Getting the answer to question 2 radio button 2
        RadioButton radiobutton2q2 = (RadioButton) findViewById(R.id.radiobutton2q2);
        boolean isRadioButton2q2 = radiobutton2q2.isChecked();


        //Getting the answer to question 3 checkbox 1
        CheckBox checkBox1q3 = (CheckBox) findViewById(R.id.checkbox1q3);
        boolean isCheckBox1q3 = checkBox1q3.isChecked();

        //Getting the answer to question 3 checkbox 2
        CheckBox checkbox2q3 = (CheckBox) findViewById(R.id.checkbox2q3);
        boolean isCheckBox2q3 = checkbox2q3.isChecked();

        //Getting the answer to question 3 checkbox 3
        CheckBox checkbox3q3 = (CheckBox) findViewById(R.id.checkbox3q3);
        boolean isCheckBox3q3 = checkbox3q3.isChecked();


        //Getting the answer to question 4 radio button 1
        RadioButton radiobutton1q4 = (RadioButton) findViewById(R.id.radiobutton1q4);
        boolean isRadioButton1q4 = radiobutton1q4.isChecked();


        //Getting the answer to question 5 checkbox 1
        CheckBox checkBox1q5 = (CheckBox) findViewById(R.id.checkbox1q5);
        boolean isCheckBox1q5 = checkBox1q5.isChecked();

        //Getting the answer to question 5 checkbox 2
        CheckBox checkbox2q5 = (CheckBox) findViewById(R.id.checkbox2q5);
        boolean isCheckBox2q5 = checkbox2q5.isChecked();

        //Getting the answer to question 5 checkbox 3
        CheckBox checkbox3q5 = (CheckBox) findViewById(R.id.checkbox3q5);
        boolean isCheckBox3q5 = checkbox3q5.isChecked();


        //Getting the answer to question 6 radio button 1
        RadioButton radiobutton1q6 = (RadioButton) findViewById(R.id.radiobutton1q6);
        boolean isRadioButton1q6 = radiobutton1q6.isChecked();


        //Getting the answer to question 7 checkbox 1
        CheckBox checkBox1q7 = (CheckBox) findViewById(R.id.checkbox1q7);
        boolean isCheckBox1q7 = checkBox1q7.isChecked();

        //Getting the answer to question 7 checkbox 2
        CheckBox checkbox2q7 = (CheckBox) findViewById(R.id.checkbox2q7);
        boolean isCheckBox2q7 = checkbox2q7.isChecked();

        //Getting the answer to question 7 checkbox 3
        CheckBox checkbox3q7 = (CheckBox) findViewById(R.id.checkbox3q7);
        boolean isCheckBox3q7 = checkbox3q7.isChecked();


        //Getting the answer to question 8 radio button 3
        RadioButton radiobutton3q8 = (RadioButton) findViewById(R.id.radiobutton3q8);
        boolean isRadiobutton3q8 = radiobutton3q8.isChecked();


        //Getting the answer to question 9
        EditText answerq9 = (EditText) findViewById(R.id.edit_textq9);
        String answer = answerq9.getText().toString();


        //Calculate Question 1 result
        int resultq1 = calculateResultq1(isCheckBox1q1, isCheckBox2q1, isCheckBox3q1);

        //Calculate Question 2 result
        int resultq2 = calculateResultq2(isRadioButton2q2);

        //Calculate Question 3 result
        int resultq3 = calculateResultq3(isCheckBox1q3, isCheckBox2q3, isCheckBox3q3);

        //Calculate Question 4 result
        int resultq4 = calculateResultq4(isRadioButton1q4);

        //Calculate Question 5 result
        int resultq5 = calculateResultq5(isCheckBox1q5, isCheckBox2q5, isCheckBox3q5);

        //Calculate Question 6 result
        int resultq6 = calculateResultq6(isRadioButton1q6);

        //Calculate Question 7 result
        int resultq7 = calculateResultq7(isCheckBox1q7, isCheckBox2q7, isCheckBox3q7);

        //Calculate Question 8 result
        int resultq8 = calculateResultq8(isRadiobutton3q8);

        //Calculate Question 9 result
        int resultq9 = calculateResultq9(answer);

        //Calculate the quiz result
        int result = resultq1 + resultq2 + resultq3 + resultq4 + resultq5 + resultq6 + resultq7 + resultq8 + resultq9;

        //Display the quiz result in the Toast message
        Toast.makeText(this, "Congratulatons! The score is " + result + ". Thank you!", Toast.LENGTH_LONG).show();
    }

    /**
     * Check which checkbox was selected in the question 1
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 1
     */
    private int calculateResultq1(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox1) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which radio button was selected in the question 2
     *
     * @param radioButton2 is whether or not the user checked the radio button 1
     * @return the score the user got for question 2
     */
    private int calculateResultq2(boolean radioButton2) {
        int result = 0;
        if (radioButton2) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which checkbox was selected in the question 3
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 3
     */
    private int calculateResultq3(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox2) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which radio button was selected in the question 4
     *
     * @param radioButton1 is whether or not the user checked the radio button 1
     * @return the score the user got for question 4
     */
    private int calculateResultq4(boolean radioButton1) {
        int result = 0;
        if (radioButton1) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which checkbox was selected in the question 5
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 5
     */
    private int calculateResultq5(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox3) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which radio button was selected in the question 6
     *
     * @param radioButton1 is whether or not the user checked the radio button 1
     * @return the score the user got for question 6
     */
    private int calculateResultq6(boolean radioButton1) {
        int result = 0;
        if (radioButton1) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which checkbox was selected in the question 7
     *
     * @param checkBox1 is whether or not the user checked the checkbox1
     * @param checkBox2 is whether or not the user checked the checkbox2
     * @param checkBox3 is whether or not the user checked the checkbox3
     * @return the score the user got for question 7
     */
    private int calculateResultq7(boolean checkBox1, boolean checkBox2, boolean checkBox3) {
        int result = 0;
        if (checkBox3) {
            result = 1;
        }
        return result;
    }

    /**
     * Check which radio button was selected in the question 8
     *
     * @param radioButton3 is whether or not the user checked the radio button 1
     * @return the score the user got for question 8
     */
    private int calculateResultq8(boolean radioButton3) {
        int result = 0;
        if (radioButton3) {
            result = 1;
        }
        return result;
    }

    /**
     * Check the answer to the open question 1
     *
     * @param userAnswer is the user's answer to the question 1
     * @return the score the user got for question 1
     */
    private int calculateResultq9(String userAnswer) {
        int result = 0;
        String answer = "London";
        if (userAnswer.equals(answer)) {
            result = 1;
        }
        return result;
    }
}


