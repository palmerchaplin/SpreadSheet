package assignment9;

import java.util.Map;

/**
 *
 * @author palmerchaplin
 */
public abstract class Formula
{
    //		every formula node must have an evaluate method 
    //		taking an environment (giving cell values), and returning
    //		a double

    abstract double evaluate(Map<String, Double> environment);

    abstract String printTree();
}
