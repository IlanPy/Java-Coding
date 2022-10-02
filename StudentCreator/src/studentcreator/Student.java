/* This program will use setters and getters to compile a user-defined class
 * Ilan Sela 2/25/2022
 * JDK 17
 */

package studentcreator;

public class Student {
    //define instance variables
    private String name = null;
    private int age = 0;
    private String type = null;
    
    //Student Constructor
    public Student(String newName, int newAge){
        setAge(newAge);
        setName(newName);
    }
    
    //Setter method to set the student name
    public void setName(String n){
        name = n;
    }
    
    //Getter method to get the student name
    public String getName() {
        return name;
    }
    
    //Setter method to check validity of data and set the student age
    public void setAge(int a){
        if (a > 0){
        age = a;
        setType();
        }
    }
    
    //Getter method to get the student age
    public int getAge() {
        return age;
    }
    
    //Setter method to set the student's type based on age
    public void setType() {
        if (age >= 0 && age <= 4) {
            type = "Preschool";
        } else if (age == 5) {
            type = "Kindergarten";
        } else if (age >= 6 && age <= 10) {
            type = "Elementary School";
        } else if (age >= 11 && age <= 13) {
            type = "Middle School";
        } else if (age >= 14 && age <= 17) {
            type = "High School";
        } else
            type = "College";
    }
    
    //Getter method to get the student type
    public String getType() {
        return type;
    }
} 


