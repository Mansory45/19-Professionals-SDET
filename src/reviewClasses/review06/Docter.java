package reviewClasses.review06;

public class Docter {
    // these are instance variable out side ot method

    String firstName, lastName,speciality;
    int experience;
    double salary;

    static String hospital;

     Docter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    Docter(String firstName, String lastName,String speciality, int experience) {
      this(firstName,lastName);
      this.speciality = speciality;
      this.experience=experience;
    }
    void printInfo(){
        System.out.println("Doctor name is " + firstName+" "+ lastName+ " and speciality is "+ speciality);
    }
    // instance accessing both static and instance
    void work(){
        System.out.println("Doctor "+ lastName+ " works at "+hospital);
    }
    void treat(String patientName){
         this.printInfo();
        System.out.println(" treats patient"+patientName);
    }
    //Static methods can work only with static variables and methods
    static void study(String University){
        // printInfo();
        System.out.println("Docter studied at" + University+ "and now works at "+ hospital);
    }
}
