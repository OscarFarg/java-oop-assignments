package center.medical.stjava.model;

import java.time.LocalDate;

public abstract class Person {

    private String id;
    protected final String firstname;
    protected final String lastname;
    protected final LocalDate dateOfBirth;

    public Person(String firstname, String lastname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String introduce() {
        return "Hello, I'm " + firstname + " " + lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

}
