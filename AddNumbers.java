class AddNumbers{
void add (inta,intb){
int sum=a+b;
system.out.println("Sum of integers="+sum);
}
void add(float x, float y){
floatsum=x+y:
system.out.println("Sum of floats="+sum);
}
void add (){
int a=5,b=10;
int sum = a+b;
system.out.println("Default sum (integers)="+sum);
}
publicstatic void main (String[] args){
AddNumbers obj = new AddNumbers();
obj.add();
obj.add(8,12);
obj.add(2.5f,4.5f);
}
}