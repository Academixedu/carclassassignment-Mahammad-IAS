package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();
        

       

        Bank myBank = new Bank("State Bank Of India","Shareefshagari Mahammad" , "1234567890", 555555.55);

        myBank.displayAccountDetails();
        
        myBank.setAccountNumber("0987654321");
        myBank.setBalance(23000.00);
        
        System.out.println("\nUpdated Accoount Details:");
        myBank.displayAccountDetails();

        


        Bike myBike  = new Bike("Royal Enfield", "GT 650", 2030, "Rockerd Red", 345000.00);
        
        myBike.displayBikeDetails();

        myBike.setPrice(400000.00);
        myBike.setColor("Mr Clean");


        System.out.println("\nUpdated Bike Details:");
        myBike.displayBikeDetails();

      


        Student meStudent=new Student("Mahammad", 21, "47", "yes");

        meStudent.displayStudentDetails();

        meStudent.setAge(18);
        meStudent.setMajor("No");

        System.out.println("\nUpdated Student Details:");
        meStudent.displayStudentDetails();
        

    }
    
}
