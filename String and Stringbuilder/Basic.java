public class Basic {
    public static void main(String[] args) {
        String name = "Sarthak Krishak";
        System.out.println(name);

        String a = "Recon";
        System.out.println(a);

        String b = "Delta";
        System.out.println(b);

        //🔴 Comparison for pool

        String c = "Sarthak";
        String d = "Sarthak";

        System.out.println(c == d);
        // As '==' checks if the reference variable is pointing towards the same object
        // or not.



          //🔴 How to create diff object of same value
          String naam = new String("Garv");


          //To check only the values use '.equals' method
          
          String x = new String("Hello");
          String y = new String("Hello");
          System.out.println(x == y);
          System.out.println(x.equals(y));
    }
}