package pl.zzpj2021.solid.dip.weathertracker.solution;

public class Phone implements Device {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
