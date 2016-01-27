
import java.util.*;
// Løsningsforslag
// Bruk av MyDate klassen er ikke vesentlig
// Tips:
// I tillegg til at Eclipse kan lage getter og setter metoder, kan du også få laget mesteparten
// av en constructor:
// Bruk menyvalg Source / Generate Constructor "from superclass" eller "from fields"

public class Excercise11_02 {
  public static void main(String[] args) {
    // Opprett objekter av ulik type, og påkall toString() metoden
	  
	Person p = new Person("Person No 1", "Address 1", "Phonenumber 1","Email 1");
	System.out.println(p.toString());
	Student s = new Student("Student No 1", "Student Address 1", "Student Phonenumber 1","Student Email 1", Student.FRESHMAN);
	System.out.println(s); // behøver egentlig ikke kallet til toString()
	Employee e = new Employee("Employee No 1", "Employee Address 1", "Employee Phonenumber 1","Employee Email 1", "NUC", 100000, new MyDate() );
	System.out.println(e);
	Faculty f = new Faculty("Fac No 1", "Fac Address 1", "Fac Phonenumber 1","Fac Email 1", "NUC", 100000, new MyDate(), "8h", Faculty.ASSISTANT_PROFESSOR);
	System.out.println(f);
	// Lag også et Staff objekt...
	
	// Lager for moro skyld en ArrayList som jeg putter objektene inn i...
	ArrayList <Person> pList = new ArrayList<Person>();
	pList.add(p);
	pList.add(s);
	pList.add(e);
	pList.add(f);
	// bruker enhanced for loop
	for (Person pers : pList)
		System.out.println(pers.toString());
  }
}

class Person {
  private String name;
  private String address;
  private String phoneNumber;
  private String email;

  public Person(String name, String address, String phoneNumber, String email) {
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.email = email;
}

@Override
  public String toString() {
	return "Data members from Person class : \n" + name + ", " + address + ", " + phoneNumber + ", " + email + "\n";
  }
}

class Student extends Person {
  public static final int FRESHMAN = 1;
  public static final int SOPHOMORE = 2;
  public static final int JUNIOR = 3;
  public static final int SENIOR = 4;

  private int status;

  public Student(String name, String address, String phoneNumber, String email, int status) {
	super(name, address, phoneNumber, email);
	this.status = status;
}
  private String getStatusText() {
	  // ingen break pga return setninger
	  switch (status) {
	    case FRESHMAN : return "Freshman";
	    case SOPHOMORE : return "Sophomore";
	    case JUNIOR : return "Junior";
	    case SENIOR : return "Senior";
	    default: return "Not defined";
	  }
  }
@Override
  public String toString() {
    return super.toString() + "Data members from Student class : \n" + getStatusText() + "\n";
  }
}

class Employee extends Person {
  private String office;
  private int salary;
  private MyDate dateHired;

  public Employee(String name,
		          String address,
		          String phoneNumber,
		          String email,
		          String office,
		          int salary,
		          MyDate hired) {
	super(name, address, phoneNumber, email);
	this.office = office;
	this.salary = salary;
	dateHired = hired;
}

@Override
  public String toString() {
    return super.toString() + "Data members from Employee class : \n" + office + ", " + salary + ", "
           + dateHired.getDay() + ", " +
           + dateHired.getMonth() + ", " +
           + dateHired.getYear() + ", " + "\n";
  }
}

class Faculty extends Employee {
  public static final int LECTURER = 1;
  public static final int ASSISTANT_PROFESSOR = 2;
  public static final int ASSOCIATE_PROFESSOR = 3;
  public static final int PROFESSOR = 4;

  private String officeHours;
  private int rank;

  public Faculty(String name, String address, String phoneNumber, String email,
		String office, int salary, MyDate hired, String officeHours, int rank) {
	super(name, address, phoneNumber, email, office, salary, hired);
	this.officeHours = officeHours;
	this.rank = rank;
  }
  private String getRankText() {
	  // ingen break pga return setninger
	  switch (rank) {
	    case LECTURER : return "Lecturer";
	    case ASSISTANT_PROFESSOR : return "Assistant Professor";
	    case ASSOCIATE_PROFESSOR : return "Associate Professor";
	    case PROFESSOR : return "Professor";
	    default: return "Not defined";
	  }
  }

@Override
  public String toString() {
    return super.toString() + "Data members from Faculty class : \n" + officeHours + ", " + getRankText() + "\n";
  }
}

class Staff extends Employee {
  private String title;

  public Staff(String name, String address, String phoneNumber, String email,
		String office, int salary, MyDate hired, String title) {
	super(name, address, phoneNumber, email, office, salary, hired);
	this.title = title;
}

@Override
  public String toString() {
    return super.toString() + "Data members from Staff class : \n" + title + "\n";
  }
}
