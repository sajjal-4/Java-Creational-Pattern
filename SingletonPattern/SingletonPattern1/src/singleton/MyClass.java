/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Lenovo
 */
public class MyClass 
{
    // Step 1: Create a private static instance of the class
    private static MyClass singletonOfMyClass = new MyClass();

    // Step 2: Make the constructor private so that this class cannot be instantiated
    private MyClass() { /* ….constructor code …. */ };

    // Step 3: Provide a public static method to get the instance of the class
    public static MyClass getSingletonOfMyClass()
    {
        return singletonOfMyClass;
    }
}
