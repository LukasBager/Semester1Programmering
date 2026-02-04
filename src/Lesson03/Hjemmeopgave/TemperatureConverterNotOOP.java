package Lesson03.Hjemmeopgave;

public class TemperatureConverterNotOOP {

    public static void main(String[] args) {

        double tempInFahrenheit = 73.1;
        double tempInCelsius = (tempInFahrenheit - 32) * 5 / 9;
        double temperatureRise = 3;
        double newTemp = tempInCelsius + temperatureRise;

        System.out.println(Double.toString(tempInFahrenheit) + " degrees fahrenheit is equal to " + Double.toString(tempInCelsius) + " degrees celsius");

        if (temperatureRise <= 2) {
            System.out.println("Current temperature in celsius is: " + Double.toString(newTemp));
        } else {
            System.out.println("WARNING! The temperature is rising quickly - current temperature in celsius: " + Double.toString(newTemp));
        }

    }

}
