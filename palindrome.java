class palindrome 
{
public static void main(String[]ar)
{
int num = 151;
int reversed = 0, remainder, temp = num;
while(num > 0)
{
remainder = num % 10;
reversed = reversed * 10 + remainder;
num = num / 10;
}
if(temp == reversed){
System.out.println(temp + " is a palindrome number.");
}
else {
System.out.println(temp + " is not a palindrome number.");
}
}
}
