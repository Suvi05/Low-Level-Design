package Lectures.DesingPatterns.StructuralDP.Decorator;

public class OrangeCone implements IceCreamCone{
    @Override
    public int getCost() {
        return 10;//For Blue Cone  price is 5 Rupees
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }//Base Entity and both of them are IceCreamCone
}
