public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        random();
        //block scope
        {
            //int a = 78; //cannot be done because it is already initialized but the value can be changed
            a = 100; //the value of a can be reassigned
            int c =99;
        }
       // System.out.println(c); //if a value is initialized in block, it can only be used in the block


    }
    static void random(){
        int num = 67;
        System.out.println(num);
        //if you declare a variable in a function it is accessible in only the function
    }
}
//anything initialized outside the box can be used can be used and updated inside the box and
//anything that is initialized inside the box cannot be used outside the box

