class G extends A
{
int x;
}
class A extends Box
{
int a;
void show()
{
System.out.println("child class");
}
}
class Box {
  public static void main(String args[]){
    System.out.println("this is java program");
    A ab=new A;
    A.show();
    System.out.println("value of class A variable is"+a);
  }
}
