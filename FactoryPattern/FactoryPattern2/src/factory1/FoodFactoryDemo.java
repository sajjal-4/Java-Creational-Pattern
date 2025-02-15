/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory1;

/**
 *
 * @author Lenovo
 */
public class FoodFactoryDemo {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        // Get an object of Rice and call its serve method.
        Food food1 = foodFactory.getFood("RICE");
        food1.serve();

        // Get an object of Curry and call its serve method.
        Food food2 = foodFactory.getFood("CURRY");
        food2.serve();
    }
}