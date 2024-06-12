public class Palindrome_Number1 {
    public static void main(String[] args){
        int num=121;
        int rev_Num=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            rev_Num=(rev_Num*10)+rem;
            num=num/10;
        }
        if(temp==rev_Num){
            System.out.println("its palindrome number ");
        }
        else{
            System.out.println("its not a palindrome number");
        }
    }
}
