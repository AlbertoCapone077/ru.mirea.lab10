package ZaDAnie_1;

public class TestComplex {

    public static void main(String[] args) {
        Complex a = new Complex(46, 8);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(527, 365);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex g = d.createComplex(0, 1);
        System.out.println(g);
    }
}