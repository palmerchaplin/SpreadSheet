package assignment9;

/**
 *
 * @author palmerchaplin
 */
import java.util.Map;

public class Operator extends Formula
{

    public char operator;
    public Formula left;
    public Formula right;

    public Operator(char operator, Formula left, Formula right)
    {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    double evaluate(Map<String, Double> environment)
    {
        double d1 = left.evaluate(environment);
        double d2 = right.evaluate(environment);
        switch (operator)
        {
            case '+':
                return d1 + d2;
            case '*':
                return d1 * d2;
            default:
                throw new Error("HUH?!");
        }
    }

    @Override
    String printTree()
    {
        String output = "(" + left.printTree() + operator + right.printTree() + ")";
        return output;
    }
}
