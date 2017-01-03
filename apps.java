import java.awt.*;
import java.applet.*;

public class apps extends Applet
{
Label l1;
Button b1,b2,b3;
TextField t1,t2;
TextArea t3;
Checkbox c1,c2,c3;
List l2;
public void init()
{
l1=new Label();
b1=new Button("first");
b2=new Button("sec");
b3=new Button("third");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextArea(20,10);
c1=new Checkbox("sports");
c2=new Checkbox("education");
c3=new Checkbox("none");
l2=new List();
}
public void start()
{
l2.add("cricket");
l2.add("badminton");
l2.add("hockey");
l2.add("soccer");
add(l2);
add(l1);
add(b1);
add(b2);
add(b3);
add(t1);
add(t2);
add(t3);
add(c1);
add(c2);
add(c3);

}
}