package com.example.android.tvchefsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
     * This method is called when the order button is clicked.
     * Count the number of correct answers.
     */

    public void submitAnswer(View view) {

        EditText name = (EditText) findViewById(R.id.name_field);
        String playerName = name.getText().toString();

        int sum = 0;

        CheckBox Q1B = (CheckBox) findViewById(R.id.quiz1B);
        boolean checkedQ1B = Q1B.isChecked();
        CheckBox Q1D = (CheckBox) findViewById(R.id.quiz1D);
        boolean checkedQ1D = Q1D.isChecked();

        CheckBox Q2A = (CheckBox) findViewById(R.id.quiz2A);
        boolean checkedQ2A = Q2A.isChecked();
        CheckBox Q2B = (CheckBox) findViewById(R.id.quiz2B);
        boolean checkedQ2B = Q2B.isChecked();


        RadioButton answerQuiz3 = (RadioButton) findViewById(R.id.answer_q3);
        RadioButton answerQuiz4 = (RadioButton) findViewById(R.id.answer_q4);
        RadioButton answerQuiz5 = (RadioButton) findViewById(R.id.answer_q5);
        RadioButton answerQuiz6 = (RadioButton) findViewById(R.id.answer_q6);

        if (checkedQ1B) {
            sum++;
        }
        if (checkedQ1D) {
            sum++;
        }

        if (checkedQ2A) {
            sum++;
        }
        if (checkedQ2B) {
            sum++;
        }

        if (answerQuiz3.isChecked()) {
            sum++;
        }
        if (answerQuiz4.isChecked()) {
            sum++;
        }
        if (answerQuiz5.isChecked()) {
            sum++;
        }

        if (answerQuiz6.isChecked()) {
            sum++;
        }

        /**
         * Gives different message based on the score, with the player name.
         */

        if (sum <= 3) {
            Toast.makeText(this, "[" + sum + " point] Dear " + playerName + ", You have never seen any TV Cooking show", Toast.LENGTH_LONG).show();
            sum = 0;
        }

        if (sum >= 3 && sum <= 6) {
            Toast.makeText(this, "[" + sum + " point] Dear " + playerName + ", maybe you accidentally watched some show, but you need some more... ", Toast.LENGTH_LONG).show();
            sum = 0;
        }

        if (sum >= 7) {
            Toast.makeText(this, "[" + sum + " point] Dear " + playerName + ", You are a real foodie! You know a lot about Cooking series and you also have a good taste of it!", Toast.LENGTH_LONG).show();
            sum = 0;
        }
    }
}
