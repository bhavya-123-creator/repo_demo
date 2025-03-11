class student
{
int rollno;
String name;
int marks;
void getdata(int rno,String n,int m)
{
rollno=rno;
name=n;
marks=m;
}
void putdata()
{
System.out.println("Roll Number:"+rollno);
System.out.println("Student Name:"+name);
System.out.println("Marks:"+marks);
}
}
class studentdemo
{
public static void main(String args[])
{
student s=new student();
s.getdata(1111,"Rama",780);
s.putdata();
student s1=new student();
s1.getdata(2222,"Sita",750);
s1.putdata();
}
}
