package com.example.raryson.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.MultiTapKeyListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSoma.setOnClickListener()
        {
            val firstValue = firstNumber.text.toString()
            val secondValue = secondNumber.text.toString()

            if(!ValidateValueIfNotNullOrEmpty(firstValue))
            {}
            else if(!ValidateValueIfNotNullOrEmpty(secondValue))
            {}
            else
            {
                ChangeResultValue(Sum(firstValue.toInt(), secondValue.toInt()).toString())
            }

        }

        buttonDivision.setOnClickListener()
        {
            val firstValue = firstNumber.text.toString()
            val secondValue = secondNumber.text.toString()

            if(!ValidateValueIfNotNullOrEmpty(firstValue))
            {}
            else if(!ValidateValueIfNotNullOrEmpty(secondValue))
            {}
            else
            {
                ChangeResultValue(Division(firstValue.toInt(), secondValue.toInt()).toString())
            }

        }

        buttonMultiplicate.setOnClickListener()
        {
            val firstValue = firstNumber.text.toString()
            val secondValue = secondNumber.text.toString()

            if(!ValidateValueIfNotNullOrEmpty(firstValue))
            {}
            else if(!ValidateValueIfNotNullOrEmpty(secondValue))
            {}
            else
            {
                ChangeResultValue(Multiplicate(firstValue.toInt(), secondValue.toInt()).toString())
            }

        }

        buttonSubtract.setOnClickListener()
        {
            val firstValue = firstNumber.text.toString()
            val secondValue = secondNumber.text.toString()

            if(!ValidateValueIfNotNullOrEmpty(firstValue))
            {}
            else if(!ValidateValueIfNotNullOrEmpty(secondValue))
            {}
            else
            {
                ChangeResultValue(Subtract(firstValue.toInt(), secondValue.toInt()).toString())
            }

        }
    }

    private fun Subtract(firstValue:Int, secondValue:Int):Int
    {
        return firstValue - secondValue
    }

    private fun Multiplicate(firstValue:Int, secondValue:Int):Int
    {
        return firstValue * secondValue
    }

    private fun Division(firstValue:Int, secondValue:Int):Int
    {
        return firstValue / secondValue
    }

    private fun Sum(firstValue:Int, secondValue:Int):Int
    {
        return firstValue + secondValue
    }

    private fun ValidateValueIfNotNullOrEmpty(valueInfo:String):Boolean
    {
        if(valueInfo.isNullOrEmpty())
        {
            ChangeResultValue("Input a value a text area")
            return false;
        }
        return true;

    }

    private fun ChangeResultValue(text:String) {

        MathResult.text = text
    }

}
