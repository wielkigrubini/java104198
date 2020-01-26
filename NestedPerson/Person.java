import java.util.Calendar;

public class Person {

    private String firstName, lastName;
    private int yearOfBirth;
    private double weight, height, bmi;

    public Person(String firstName, String lastName, int yearOfBirth, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.height = height;
        bmi = bmiCounter();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private double bmiCounter() {
        return weight / (height*height);
    }

    public void displayHealthSondaInfos() {
        HealthSonda healthSonda = new HealthSonda();
    }

    private class HealthSonda {

        private HealthSonda() {
            getHealthInfos();
        }

        private void getHealthInfos() {
            System.out.println("Age: " + (Calendar.getInstance().get(Calendar.YEAR) - getYearOfBirth()));
            System.out.println("Height: " + getHeight());
            System.out.println("Weight: " + getWeight());
            System.out.println("BMI: " + getBmi());
        }

        private int getYearOfBirth() {
            return yearOfBirth;
        }

        private double getHeight() {
            return height;
        }

        private double getWeight() {
            return weight;
        }

        private double getBmi() {
            return bmi;
        }
    }
}
