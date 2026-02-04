package Lesson03.Hjemmeopgave;

public class TemperatureConverterOOP {

    double tempInFahrenheit;
    double tempInCelsius;
    double temperatureRise;
    double newTemp;

    public TemperatureConverterOOP(double tempInFahrenheit, double tempRise) {
        this.tempInFahrenheit = tempInFahrenheit;
        this.tempInCelsius = (this.tempInFahrenheit - 32) * 5 / 9;
        this.temperatureRise = tempRise;
        this.newTemp = tempInCelsius + tempRise;
    }

    public void displayTemp() {
        System.out.println("The temperature is " + Double.toString(tempInCelsius) + " °C (" + Double.toString(tempInFahrenheit) + " °F)");
    }

    public void tempRiseCheck() {
        if (temperatureRise <= 2) {
            System.out.println("Temperature has risen to " + Double.toString(newTemp) + " °C");
        } else if (temperatureRise > 2) {
            System.out.println("WARNING! Temperature is rising quickly. Temperature has risen to " + Double.toString(newTemp) + " °C");
        } else {
            System.out.println("An error has occurred");
        }
    }

}
