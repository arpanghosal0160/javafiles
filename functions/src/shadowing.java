public class shadowing {
    static int x = 90; //this is a global variable

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//value of x=90 is shadowed by the new updated variable but the scope is only limited to the curly braces
        //scope will begin when the variable will be initialized
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);

    }
}
