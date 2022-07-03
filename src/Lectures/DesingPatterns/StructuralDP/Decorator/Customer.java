package Lectures.DesingPatterns.StructuralDP.Decorator;

public class Customer {
    public static void main(String[] args) {
        //Chocobar    : Blue Cone + 2 Chocolate
        //Kesar Pista : Orange Cone + 1 Vanilla

       // IceCreamCone emptyVanilla = new VanillaScoop(null); //For Checking Null pointer exception

        IceCreamCone chocobar = new ChocolateScoop(new ChocolateScoop(new OrangeCone()));
        IceCreamCone kesarPista = new VanillaScoop(new OrangeCone());
        IceCreamCone chocobarWithVanilla = new VanillaScoop(chocobar);
        //Here it is not creating a new object but using the same Chocobar Object and then decorating it.

        IceCreamCone iceCreamCone = new ChocolateScoop(new ChocolateScoop(new VanillaScoop(new OrangeCone())));
        System.out.println("Constituents of Ice cream : " + chocobarWithVanilla.getConstituents());
        System.out.println("Cost of Ice cream : " + chocobarWithVanilla.getCost());
    }
}
//If we want to add one more cone to a cone then we have to implement 2 constructors in Cone's code,
//one with IceCreamCone iceCreamCone and another one as empty