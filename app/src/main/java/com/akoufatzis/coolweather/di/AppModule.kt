package com.akoufatzis.coolweather.di

import android.app.Application
import android.content.Context
import com.akoufatzis.coolweather.domain.weather.WeatherRepository
import com.akoufatzis.coolweather.openweathermap.WeatherDataStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object AppModule {
    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(application: Application): Context = application.applicationContext
}
