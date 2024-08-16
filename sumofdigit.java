class sumofdigit
{
public static void main(String[] args)
{
int number = 487;
int sum = 0, remainder;
while(number > 0)
{
remainder = number % 10;
sum = sum + remainder;
number = number / 10;
}
System.out.println("Sum of digits:" + sum);
}
}