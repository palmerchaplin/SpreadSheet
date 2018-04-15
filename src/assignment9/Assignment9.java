package assignment9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author palmerchaplin
 */
public class Assignment9
{

    public static void main(String[] args)
    {
        //list of formulas(assignments in this case)
        List<Formula> L = new ArrayList<>();
        
        //A1
        Literal lit = new Literal(17);
        CellName A1 = new CellName("A1");
        Assignment a1 = new Assignment(A1, lit);
        L.add(a1);
        
        //A2
        Literal lit2 = new Literal(12);
        CellName A2 = new CellName("A2");
        Assignment a2 = new Assignment(A2, lit2);
        L.add(a2);
        
        //B1
        CellName B1 = new CellName("B1");
        Operator one = new Operator('+', A1, A2);
        Assignment b1 = new Assignment(B1, new Operator('*', one, one));
        L.add(b1);
        
        //B2
        CellName B2 = new CellName("B2");
        Assignment b2 = new Assignment(B2, new Operator('*', A1, A2));
        L.add(b2);
        
        //A3
        Literal lit3 = new Literal(1);
        CellName A3 = new CellName("A3");
        Assignment a3 = new Assignment(A3, lit3);
        L.add(a3);
        
        //A4
        Literal lit4 = new Literal(100);
        CellName A4 = new CellName("A4");
        Assignment a4 = new Assignment(A4, lit4);
        L.add(a4);
        
        //B3
        CellName B3 = new CellName("B3");
        Operator two = new Operator('*', A2, A1);
        Operator three = new Operator('+', A3, two);
        Assignment b3 = new Assignment(B3, new Operator('+', three, A4));
        L.add(b3); 
        
        Map<String, Double> myMap= evaluate(L);
        System.out.println(myMap);
        for(Formula f: L)
        {
            System.out.println(f.printTree());
        }
        
        
        
        
    }
    
    public static Map<String, Double> evaluate(List<Formula> L)
        {
           HashMap<String, Double> E = new HashMap<String, Double>();
           
           for(Formula f: L)
           {
               f.evaluate(E);
           }
           
           return E;
        }
    
    
    
}
