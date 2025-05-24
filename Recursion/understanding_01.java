public class understanding_01{
    public static void main(String[] args) {
        //Now we will simply talk about some basic stuff to understand the function calling,
        //We want to print 'Hello world' 5 times so there are many ways to achieve this,
        //We can create a function will 5 'hello world' and then call that function, another way is to call that function 5 times

        //But if we only want to call one time and also we can't write more than one 'hello world' inside the function so in this case how we can do it
        name();

    }
    
    static void name(){
        System.out.println("hello world");
        name2();
    }

    static void name2() {
        System.out.println("hello world");
        name3();
    }
    static void name3() {
        System.out.println("hello world");
        name4();
    }
    static void name4() {
        System.out.println("hello world");
        name5();
    }
    static void name5() {
        System.out.println("hello world");
    }

}