package assignment9;

/**
 *
 * @author palmerchaplin
 */
import java.util.Map;

public class CellName extends Formula
{

    String name;

    public CellName(String name)
    {
        this.name = name;
    }

    @Override
    double evaluate(Map<String, Double> environment)
    {
        return environment.get(name);
    }

    @Override
    String printTree()
    {
        String output = name;
        return output;
    }
}
