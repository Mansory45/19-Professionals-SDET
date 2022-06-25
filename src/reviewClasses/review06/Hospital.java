package reviewClasses.review06;

public class Hospital {
    public static void main(String[] args) {
        Docter doc = new Docter("jane","Smit");
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        doc.printInfo();
        Docter.hospital="UCSF";
        doc.work();

        System.out.println("____________________________________________");
        //creating another doctor
        Docter docter = new Docter("joe","Doe","cardiologyst",10);
        docter.printInfo();
        docter.work();
        // Changing value of static variable
        Docter.hospital="George Washington";
        doc.work();
        docter.work();
        doc.lastName="Obama";
        doc.printInfo();
        docter.printInfo();
        doc.hospital="Nayo Clinic";
        doc.work();
        docter.work();
        docter.treat(" Samantha");
        // accessing static method
        Docter.study("GTU");

    }

}
