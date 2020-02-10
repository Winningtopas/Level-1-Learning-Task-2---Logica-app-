package com.example.level1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnConfirm.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer() {
        var random: Int = 1
        random = (1..2).random()
        if(random == 1){
            R.string.A0 == R.string.T
        }
        else{
            R.string.A0 == R.string.F
        }

        //if(R.string.A0 == R.string.T && R.string.B0 == R.string.T){

        //}

        var correctAmount = 0
        val answer = answer0.text.toString()
        val answerA = answer1.text.toString()
        val answerB = answer2.text.toString()
        val answerC = answer3.text.toString()

        // When the answer equals "giraffe" then display a correct message using a toast message.
        // Otherwise display an incorrect message.


        if (answer == getString(R.string.T)) {
            correctAmount += 1
        }
        if (answerA == getString(R.string.F)) {
            correctAmount += 1
        }
        if (answerB == getString(R.string.F)) {
            correctAmount += 1
        }
        if (answerC == getString(R.string.F)) {
            correctAmount += 1
        }

        Toast.makeText(this, getString(R.string.correct) + " " + correctAmount, Toast.LENGTH_LONG).show()

    }

}
