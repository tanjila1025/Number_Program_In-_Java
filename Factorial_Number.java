public class Factorial_Number {
    public static void main(String[] args) {
        int num=6;
        int fact=1;
        int i=1;
        while(num<=1){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
