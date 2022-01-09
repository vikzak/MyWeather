package com.example.myweather

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv: TextView = findViewById(R.id.textView) as TextView
        var btnHello: Button = findViewById(R.id.btn_hello) as Button
        var btnConsole: Button = findViewById(R.id.btn_console) as Button
        var btnDataClass: Button = findViewById(R.id.btn_data_class) as Button

        tv.setText("")


        val berlin: WeatherDataClass = WeatherDataClass("New York", 9, 9, "Облачно")
        val paris = berlin.copy(city = "Paris", temperature = 12, feelsLike = 11)


        btnHello.setOnClickListener(View.OnClickListener {
            tv.setText("")
            test1("реализуем OnClickListener")
        })
        btnDataClass.setOnClickListener(View.OnClickListener {
            tv.setText("Работаем с data class, копируем данные и выводим: \n" + berlin.toString() + "\n" + paris.toString())
            test1("Дата классы")
        })
        btnConsole.setOnClickListener(View.OnClickListener {
            getСycle()
            test1("Циклы")
        })

    }

    fun test1(string: String) {
        Toast.makeText(
                getApplicationContext(),
                string,
                Toast.LENGTH_SHORT
        ).show()
    }

    fun getСycle() {
        var tv: TextView = findViewById(R.id.textView) as TextView
        var temp: String
        temp = ""
        for (i in 1..5) {
            (temp + "i: " + i + "\n").also { temp = it }
            tv.setText(temp)
        }
        for (j in 18 downTo 1 step 3) {
            (temp + "j: " + j + "\n").also { temp = it }
            tv.setText(temp)
        }
    }


}

