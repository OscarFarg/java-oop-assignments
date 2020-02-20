package center.medical.stjava.model;

import java.time.LocalDate;

public class Patient extends Person {

    private int weight;
    private Gender gender;
    private int temperature;

    public Patient(String firstname, String lastname, LocalDate dateOfBirth) {
        super(firstname, lastname, dateOfBirth);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
