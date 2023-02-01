/*
* ToDo 01:
 Complete the followings:



 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

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
    private int code;
    
    /**
     *  You must have a default constructor and an overloaded one that 
     *  accepts 3 parameters to update the member variables.
     */
    
    
    
    /**
     * You need to have setters and getters for all data members
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
    
    public int getCode(){
        return this.code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
}
    
    
    
    


