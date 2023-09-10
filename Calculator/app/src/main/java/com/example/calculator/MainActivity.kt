package com.example.multiplicationtable

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


//Reference's
//https://stackoverflow.com/questions/7400475/how-to-remove-listview-all-items
// https://www.geeksforgeeks.org/how-to-dynamically-add-elements-to-a-listview-in-android/
// https://www.youtube.com/watch?v=7yZngVxaZDM
//https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView

class MainActivity : AppCompatActivity() {


    lateinit var lngList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MultiplicationList = findViewById<ListView>(R.id.MultiplicationList)
        var DObtn = findViewById<Button>(R.id.DObtn)
        var NumberInput = findViewById<EditText>(R.id.NumberInput)
        var sum = 0;
        lngList = ArrayList()

        val adapter: ArrayAdapter<String?> = ArrayAdapter<String?>(
            this@MainActivity,
            android.R.layout.simple_list_item_1,
            lngList as List<String?>
        )



        // on below line we are adding click listener for our button.
        DObtn.setOnClickListener {
            val item = NumberInput.text.toString()
            if (item.isNotEmpty()) {
                var MultiplicationNumber = 1
                adapter.clear()
                MultiplicationList.adapter = adapter
                for(i in 1..12) {
                    sum = NumberInput.text.toString().toInt() * MultiplicationNumber
                    lngList.add(NumberInput.text.toString()+" X "+MultiplicationNumber.toString() + " = " + sum)
                    MultiplicationNumber++
                }


                adapter.notifyDataSetChanged()
            }
        }

    }
}
