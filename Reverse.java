class Reverse
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int rev=0;
    while(num!=0)
    {
       rev=rev*10;
       rev=rev+num%10;
       num=num/10;
    }
    System.out.println(rev);
}
      
