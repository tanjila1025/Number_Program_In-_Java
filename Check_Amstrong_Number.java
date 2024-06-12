class Check_Amstrong_Number{
  
  public static void main(String[] args){
  
   int result=0;
   int num=157;
   int num1=num;
   int num2=num;
   //count number of digit in number
   int count=0;
   while(num>0){
    count++;
    num=num/10;
   }
   //fetch each digit of given number
   while(num1<0){
    int rem=num1%10;
     //for each digit power
     int power=1;
     for(int i=1; i<=count;i++)
      {
         power=power*rem;
       }
       result=result+power;
       num1=num1/10;
       }
   //checking both values is same or not
    if(result==num2){
     System.out.println("its Amstrong number");
    }
   else{
    System.out.println(" Not a Amstrong number");
    }
  } 
}
/*OUTPUT:
  Not a Amstrong number
*/
   
   
