package com.example.myweather

object Repository {
    public val weatherList: MutableList<Weather> = TODO()
    public val weatherDataList: MutableList<WeatherDataClass> = TODO()

    init {
        weatherList.add(Weather("Москва", 15,12,"Облачно"))
        weatherList.add(Weather("Санкт Перербург", 12,11,"Ясно"))
        weatherList.add(Weather("Казань", 17,15,"Дождь"))



        weatherDataList.add(WeatherDataClass("New York",9,9,"Облачно"))
        weatherDataList.add(WeatherDataClass("Berlin", 11,12,"Дождь"))
    }



}