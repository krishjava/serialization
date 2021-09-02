import java.io.*;
abstract class Animal
{
int i=10;

}
class Dog extends Animal implements Serializable
{
int j=20;

}
class serializeDemo4
{
public static void main(String[] args)throws Exception{
Dog d1=new Dog();
d1.i=888;
d1.j=999;
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d1);
System.out.println("Deserialization started");
FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dog d2=(Dog)ois.readObject();
System.out.println(d2.i+"........."+d2.j);
}
}
