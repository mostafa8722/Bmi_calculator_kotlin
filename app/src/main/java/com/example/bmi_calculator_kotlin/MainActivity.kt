package com.example.bmi_calculator_kotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn_calculate:TextView;
    private lateinit var bmi_result:TextView;
    private lateinit var bmi_txt_result:TextView;
    private lateinit var height:EditText;
    private lateinit var weight:EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bmi_txt_result = findViewById(R.id.bmi_txt_result);
        bmi_result = findViewById(R.id.bmi_result);
        btn_calculate = findViewById(R.id.btn_calculate);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        btn_calculate.setOnClickListener(View.OnClickListener {

            val _h = height.text.toString().toDouble()
            val _w = weight.text.toString().toDouble()

            val res = _w / (_h * _h)

            bmi_result.text = String.format("%.2f", res)


            var _txtResult = ""
            _txtResult =
                if (res > 25) "You\'re over weight" else if (res >= 18.5 && res <= 25) "You\'re over weight" else "You\'re under weight"

            bmi_txt_result.text = _txtResult
        })
    }
}