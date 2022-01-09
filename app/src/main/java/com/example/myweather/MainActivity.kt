package com.example.myweather

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myweather.Repository.weatherDataList


class MainActivity : AppCompatActivity() {
    //constructor()
    //private var btn1:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnHello: Button = findViewById(R.id.btn_hello) as Button
        var btnConsole: Button = findViewById(R.id.btn_console) as Button
        var btnDataClass: Button = findViewById(R.id.btn_data_class) as Button
        var tv: TextView = findViewById(R.id.textView) as TextView
        tv.setText("")


        val berlin: WeatherDataClass = WeatherDataClass("New York", 9,9,"Облачно")
        val paris = berlin.copy(city = "Paris", temperature = 12, feelsLike = 11)


        btnHello.setOnClickListener(View.OnClickListener {
            tv.setText("")
            test1("реализуем OnClickListener")
        })
        btnDataClass.setOnClickListener(View.OnClickListener {
            tv.setText("Работаем с data class, копируем данные и выводим: \n" + berlin.toString() + " и " + paris.toString())
            test1("Дата классы")
        })
        btnConsole.setOnClickListener(View.OnClickListener {
            getWeatherConsole(weatherDataList)
            tv.setText("Работаем с data class, копируем данные и выводим: \n" + berlin.toString() + " и " + paris.toString())
            test1("Дата классы")
        })

    }

    fun test1(string: String) {
        Toast.makeText(
                getApplicationContext(),
                string,
                Toast.LENGTH_SHORT
        ).show()
    }

    fun getWeatherConsole(weatherDataList: MutableList<WeatherDataClass>){
        for (w in weatherDataList){
            Log.d("Weather", w.city + ": "+ w.temperature + " type: " + w.weatherType)
        }
    }



}

