package Example2;

public class Test {
    public static void main(String[] args)  {
//        ISum s = new SumFactory().createSum(null, new Integer(2));
//        System.out.println("Returns (null+2): "+s.sum());

        ISum s = new SumFactory().createSum(new Integer(3), new Integer(2));
        System.out.println("Returns (3+2): "+s.sum());
    }
}
