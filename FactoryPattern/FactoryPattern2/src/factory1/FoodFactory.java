/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory1;

/**
 *
 * @author Lenovo
 */
public class FoodFactory {
    // Use getFood method to get object of type Food
    public Food getFood(String foodType) {
        if (foodType == null) {
            return null;
        }
        if (foodType.equalsIgnoreCase("RICE")) {
            return new Rice();
        } else if (foodType.equalsIgnoreCase("CURRY")) {
            return new Curry();
        }
        return null;
    }
}