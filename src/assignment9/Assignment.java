package assignment9;

/**
 *
 * @author palmerchaplin
 */
import java.util.Map;

public class Assignment extends Formula
{

    public CellName cellName;
    public Formula right;

    public Assignment(CellName cellName, Formula right)
    {
        this.cellName = cellName;
        this.right = right;
    }

    @Override
    public double evaluate(Map<String, Double> environment)
    {
        double d = right.evaluate(environment);
        environment.put(cellName.name, d);
        return d;
    }

    @Override
    String printTree()
    {
        String output = cellName.printTree();
        return output + " = " + "(" + right.printTree() + ")";

    }

    @Override
    public String toString()
    {
        return cellName + ", " + right;
    }

}
