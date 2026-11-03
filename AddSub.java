class AddSub{
int a,b;
void add(intx,inty){
a=x;
b=y;
System.out.println("Addition="+(a+b));
}
void sub (intx,inty){
a=x;
b=y;
System.out.println("Substraction="+(a-b));
}
}
class MulDiv extends AddSub{
void mul(int x, int y){
a=x;
b=y;
System.out.println("Multiplication="+(a*b));
}
}
void div(intx,inty){
a=x;
b=y;
System.out.println("Division="+(a/b));
}
}
class MathOperations{
Public static void main (String[] args){
MulDiv obj=new MulDiv ();
obj.add(20,10);
obj.Sub(20,10);
obj.Mul(20,10);
obj.Div(20,10);
}
}





