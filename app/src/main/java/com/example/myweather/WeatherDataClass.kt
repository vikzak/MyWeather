package com.example.myweather

data class WeatherDataClass(var city: String, var temperature: Int, var feelsLike: Int, var weatherType: String) {
    override fun toString(): String {
        return "City: $city, Temp: $temperature, Ощущается: $feelsLike, Погода: $weatherType"
    }
}