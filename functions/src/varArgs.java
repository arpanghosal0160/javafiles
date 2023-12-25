import java.util.Arrays;

//variable length arguments
public class varArgs {
    public static void main(String[] args) {
        fun();

    }
    static void fun(int ...v){     //... creates an array of the data type mentioned
        System.out.println(Arrays.toString(v));
    }
}
