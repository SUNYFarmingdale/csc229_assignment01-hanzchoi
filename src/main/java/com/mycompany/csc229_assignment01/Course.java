/*
* ToDo 01:
 Complete the followings:


 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author Hanbi Hanz Choi
 */
public class Course {
    
    /**
     * The Course class should have:
    - ID, Name, Code
     */
    private int ID;
    private String name;
    private String code;
    
    /**
     *  You must have a default constructor and an overloaded one that 
     *  accepts 3 parameters to update the member variables.
     */
    
    public Course(){
        
    }
    
    public Course(int ID, String name, String code){
        this.ID = ID;
        this.name = name;
        this.code = code;
    }
    
    /**
     * You need to have setters and getters for all data members
     * @return 
     */
    
    public int getID(){
        return this.ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    
    /**
     * Using a driver class (with main), instantiate the Course class and call 
     * its methods to change the id, name, and code.
     * @param args 
     */
    public static void main(String[] args) {
        Course course = new Course();
        course.setID(9);
        course.setCode("CSC229");
        course.setName("Testing");
    }
}
    
    
    
    


