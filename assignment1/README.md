# Assignment 1
## The scaffolding for the St. Java Medical Center

### Introduction
As you can see we have an empty maven project generated with the maven-quickstart-archetype. The contents of the project is now like this:

    .
    ├── README.md
    ├── pom.xml
    └── src
        ├── main
        │   └── java
        │       └── center
        │           └── medical
        │               └── stjava
        │                   └── App.java
        └── test
            └── java
                └── center
                    └── medical
                        └── stjava
                            └── AppTest.java

    11 directories, 4 files

We will be building our application in the `center.medical.stjava`-package.

### The Assignment
We will be creating the basics needed for our hospital and let the different entities have some interaction with each other.

What does every hospital need?
- Doctors
- Nurses
- Patients
- Medicines
- Medical Equipment
- Buildings
- Rooms
- Beds
- Departments

For each of these items you'll have to code a class which has it's own properties and operations. We'll start with the top 3 of the
 list. Doctors, Nurses and Patients. As you probably noticed these three have something in common. They're all humans. So we can probably
  re-use some of the properties that these three have. Lets start by creating a class calles Person. Eventually we'll make something like
   this:
   
    Person
    ├── Doctor
    ├── Nurse
    └── Patient

We know that all of these must at least have a first name, lastname and date of birth. We will also give each of them an unique id so we
 can look them up in our system eventually. 
 
So lets code our Person with a firstname, lastname and DoB. After that you can start coding the Doctor, Nurse and Patient by
 extending the Person. For the Patient our hospital need to know at least a Gender, Weight and Temperature. We will use these properties
  later when our patient goes into treatment. You have to make sure that no person can exist in the system without firstname, lastname
   and DoB so use final and constructors!

You should use at lease 1 abstract class, 1 enum, 4 constructors, 3 classes and getters/setters for all properties. You probably noticed
 that we haven't really added much to the Doctor and Nurse yet. Dont worry about that, we will be doing so shortly.

---

We want each Person to be able to introduce them self with the line "Hello, i'm [firstname] [lastname]" except for Doctors. They will
 introduce them self with 'Hi, my name is Dr. [lastname]'. We will code a method called 'introduce' for that. It should return a String.
 
Now let's do a test run. In the main method instantiate at least one Patient, Nurse and Doctor and let all of them introduce them self
. You can use Sytem.out.println to print the results to the console.

The output should be something like this:

    Hello and welcome to the St. Java Medical Center
    We're now open for business
    -----
    Hi, my name is Dr. Johnson
    Hello, I'm Lucy Lincoln
    Hello, I'm Thomas Hawk

