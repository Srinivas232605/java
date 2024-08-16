class perfect {
public static void main(String[] ar)
{
 int num = 6;
 int sum = 0;
 for(int i = 1; i < num; i++){
  if(num % 10 == 0){
  sum = sum + i;
  }
 }
 if(sum == num){
  System.out.println("Perfect Number")
}
else{
System.out.println("Not a Perfect Number")
}
}