package pl.zzpj2021.solid.dip.weathertracker.solution;


import pl.zzpj2021.solid.dip.weathertracker.violation.Emailer;
import pl.zzpj2021.solid.dip.weathertracker.violation.Phone;

public class WeatherTracker {
    String currentConditions;
    Device phone;
    Device emailer;

    public WeatherTracker(Device phone, Device emailer) {
        this.phone = phone;
        this.emailer = emailer;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription.equals("rainy")) {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription.equals("sunny")) {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
