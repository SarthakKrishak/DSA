public class PrettyPrinting {
    public static void main(String[] args) {
        
        //Here % is placeholder

        float a = 3.145668989f;

        //This will print decimal value upto two digits, it also rounds off
        System.out.printf("Formatted number is %.2f", a);
        
        //Now for string the placeholder,
        System.out.printf("Hello my name is %s and i am from %s", "Sarthak", "Vellore");
        

    }
}