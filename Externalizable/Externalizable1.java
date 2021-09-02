import java.io.*;
class ExternalDemo implements Externalizable
{
String s ;
int i ;
int j ;

public ExternalDemo() {
System.out.println("public no-arg constructor");
}
public ExternalDemo(String s , int i, int j) {
this.s=s ;
this.i=i ;
this.j=j ;
}
public void writeExternal(ObjectOutput out) throws IOException {
out.writeObject(s);
out.writeInt(i);
}
public void readExternal(ObjectInput in) throws IOException ,ClassNotFoundException {
s=(String)in.readObject();
i= in.readInt();
}
}
public class Externalizable1 {
public static void main(String[] args)throws Exception {
ExternalDemo t1=new ExternalDemo("ashok", 10, 20);
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(t1);
FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
ExternalDemo t2=(ExternalDemo)ois.readObject();
System.out.println(t2.s+"-------"+t2.i+"--------"+t2.j);
}
}
