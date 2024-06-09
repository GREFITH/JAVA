class S
{
public static int secret (int one)
{
int i;
int prod = 1;
for (i = 1; i <= 3; i++)
prod = prod * one;
return prod;
}
public static void main(String[] args) {
   {
    System.out.println(secret(5));
    System.out.println(2*secret(6));

    
   } 
}
}