public class numbers_02 {
    public static void main(String[] args) {
        //Now here we are doing the same example with numbers as we are printing numbers from 1 to 5 and throught this you can understand the working of function calls in the stack,
                
        //As when the function call is ongoing so its present inside the stack and after the completion of the call of the function the function is removed from the stack one by one and it return to the line where that function is called.args

        //In stack the function which is called latter is stored on the top as the first function gets stored at the bottom.
        
        number(1);
    }

    static void number(int n){
        System.out.println(n);
        number2(2);
    }
    static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    static void number4(int n){
        System.out.println(n);
        number5(5);
    }
    static void number5(int n){
        System.out.println(n);
    }
}
