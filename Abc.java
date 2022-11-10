public class Abc{
public static void main(String [] arg)
{
int m,n,o,sum;
try{
m=Integer.parseInt(arg[0]);
n=Integer.parseInt(arg[1]);
o=Integer.parseInt(arg[2]);
}
catch(Exception e){
System.out.println(e);
m=1;
n=3;
o=5;
}
sum=m+n+o;
System.out.printf("%d + %d + %d =%d",m,n,o,sum);
}
}