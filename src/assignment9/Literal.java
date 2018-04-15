package assignment9;

/**
 *
 * @author palmerchaplin
 */
import java.util.Map;

public class Literal extends Formula
{

    public double value;

    public Literal(double value)
    {
        this.value = value;
    }

    @Override
    double evaluate(Map<String, Double> environment)
    {
        return value;
    }

    @Override
    String printTree()
    {
        String output = value + "";
        return output;
    }
}
