package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

// work in progress

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var AnswerDisplay = findViewById<TextView>(R.id.AnswerView)
        var FirstValue = findViewById<EditText>(R.id.FirstValue)
        var SecondValue = findViewById<EditText>(R.id.SecondValue)

        var PlusButton = findViewById<Button>(R.id.PlusButton)
        var MinusButton = findViewById<Button>(R.id.MinusButton)
        var TimesButton = findViewById<Button>(R.id.TimesButton)
        var DivideButton = findViewById<Button>(R.id.DivideButton)
        var SQRTButton = findViewById<Button>(R.id.SQRTButton)
        var PowerButton = findViewById<Button>(R.id.PowerButton)


        PlusButton.setOnClickListener {
           var DifferenceStorage = FirstValue.text.toString().toInt() + SecondValue.text.toString().toInt()
            AnswerDisplay.text = DifferenceStorage.toString()
        }
        MinusButton.setOnClickListener {
            var DifferenceStorage = FirstValue.text.toString().toInt() - SecondValue.text.toString().toInt()
            AnswerDisplay.text = DifferenceStorage.toString()
        }
        TimesButton.setOnClickListener {
            var DifferenceStorage = FirstValue.text.toString().toInt() * SecondValue.text.toString().toInt()
            AnswerDisplay.text = DifferenceStorage.toString()
        }
DivideButton.setOnClickListener {
            if(SecondValue.text.toString().toInt() != 0) {
                var DifferenceStorage = FirstValue.text.toString().toInt() / SecondValue.text.toString().toInt()
                AnswerDisplay.text = DifferenceStorage.toString()
            } else {
                AnswerDisplay.text = "Cant divide by zero"
            }

        }
        SQRTButton.setOnClickListener {
            var DifferenceStorage = Math.sqrt(FirstValue.text.toString().toInt().toDouble())
            AnswerDisplay.text = DifferenceStorage.toString()
        }
        PowerButton.setOnClickListener {

            fun power(base: Int,power:Int): Int {
                var result = 1
                for (i in 1 until SecondValue.text.toString().toInt()) {
                    result *= FirstValue.text.toString().toInt()
                }
                var DifferenceStorage = result
                return result
            }

        }


    }
}
