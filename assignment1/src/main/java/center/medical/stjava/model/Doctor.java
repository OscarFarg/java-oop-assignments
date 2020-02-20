package center.medical.stjava.model;

import java.time.LocalDate;

public class Doctor extends Person {

    public Doctor(String firstname, String lastname, LocalDate dateOfBirth) {
        super(firstname, lastname, dateOfBirth);
    }

    @Override
    public String introduce() {
        return "Hi, my name is Dr. " + lastname;
    }
}
