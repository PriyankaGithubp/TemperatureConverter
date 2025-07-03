package saiket_Projects;


import java.util.Scanner;

	public class TemperatureConverter {

	    // Method to convert Celsius to Fahrenheit
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    // Method to convert Fahrenheit to Celsius
	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        double inputTemp, convertedTemp;

	        System.out.println("===== Temperature Converter =====");

	        do {
	            System.out.println("\nChoose conversion type:");
	            System.out.println("1. Celsius to Fahrenheit");
	            System.out.println("2. Fahrenheit to Celsius");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice (1-3): ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter temperature in Celsius: ");
	                    inputTemp = scanner.nextDouble();
	                    convertedTemp = celsiusToFahrenheit(inputTemp);
	                    System.out.println("Converted Temperature: " + convertedTemp + " °F");
	                    break;
	                case 2:
	                    System.out.print("Enter temperature in Fahrenheit: ");
	                    inputTemp = scanner.nextDouble();
	                    convertedTemp = fahrenheitToCelsius(inputTemp);
	                    System.out.println("Converted Temperature: " + convertedTemp + " °C");
	                    break;
	                case 3:
	                    System.out.println("Exit the converter. Stay warm or cool!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 3);

	        scanner.close();
	    }
	}


