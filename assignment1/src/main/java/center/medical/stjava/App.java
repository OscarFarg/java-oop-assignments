package center.medical.stjava;

import center.medical.stjava.model.Doctor;
import center.medical.stjava.model.Nurse;
import center.medical.stjava.model.Patient;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the St. Java Medical Center");
        System.out.println("We're now open for business");
        System.out.println("-----");

        Doctor doctorJohn = new Doctor("Jack", "Johnson", LocalDate.of(1978, 4, 19));
        Nurse nurseLucy = new Nurse("Lucy", "Lincoln", LocalDate.of(1995, 9, 12));
        Patient patientThomas = new Patient("Thomas", "Hawk", LocalDate.of(1963, 5, 9));

        System.out.println(doctorJohn.introduce());
        System.out.println(nurseLucy.introduce());
        System.out.println(patientThomas.introduce());
    }
}
