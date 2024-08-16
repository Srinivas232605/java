class ArmStrong
{
public static void main(String[] ar)
{
int num = 1543;
int temp = num;
int sum=0,rem= 0;

while(num != 0)
{
 rem = num % 10;
 sum = sum + (rem * rem * rem* rem);
 num = num/10;
}
if(temp == sum){
System.out.println("Armstrong Number.");
}
else{
System.out.println("Not a Armstrong Number.");
}
}
}