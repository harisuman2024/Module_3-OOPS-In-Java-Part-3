class Hello{
void show(int... arr,String str){
System.out.println("show(int... arr,String str)");
}
}
class Lab376{
public static void main(String args[]){
Hello h= new Hello();
h.show("JLC");
}
}