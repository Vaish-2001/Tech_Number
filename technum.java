 class technum
 {
  /*A Tech number is a number that has an even number of digits 
   and if the number is split into two equal halves(From the middle), 
   then the square of the sum of these halves is equal to the number itself.
  */
  public static void main(String[]args)
   {
    int num=2025;
    int num1=num;
    int c=0;
    int sum=0;
    int sqr=0;
    while(num>0)
    {
      c++;
      num=num/10;
     }
     if(c%2==0)
      {
      int div=1;
      for(int i=1;i<c/2;i++)
       {
        div=div*10;
       }
     
     int fh =num1%div;
     int sh =num1/div;
     sum = sh+fh;
     sqr =sum*sum;

     if(sqr==num)
       {
        System.out.println("it is a tech num");
       }
     else 
       {
        System.out.println("it is not tech num");
       }
    }
    else
    {
     System.out.println("it is not even digit num");
    }
  }
 }
    