import java.io.*;
import java.util.Scanner;
class studetails
{
int rollno;
String name;
String mailid;
String phonenum;
int tammark;
int engmark;
int matmark;
int scimark;
int socmark;
int totalmark;
int avgpercentage;
char grade;
void getdata()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter your roll no: ");
rollno=sc.nextInt();

System.out.println("Enter your name: ");
name=sc.next();
sc.nextLine();

System.out.println("Enter your mailid: ");
mailid=sc.next();

System.out.println("Enter your phone num: ");
phonenum=sc.next();
System.out.println("");
System.out.println("Out of 100---->enter your marks \n");
System.out.println("Enter your tamil mark: ");
tammark=sc.nextInt();

System.out.println("Enter your english mark: ");
engmark=sc.nextInt();

System.out.println("Enter your maths mark: ");
matmark=sc.nextInt();

System.out.println("Enter your science mark: ");
scimark=sc.nextInt();

System.out.println("Enter your social mark: ");
socmark=sc.nextInt();
System.out.println("");
}

void display()
{
System.out.println("STUDENT BASIC DETAILS ");
System.out.println("");
System.out.println("Roll no: "+rollno);
System.out.println("Name: "+name);
System.out.println("Mail id: "+mailid);
System.out.println("phone number: "+phonenum );
System.out.println("");
System.out.println(name+" MARK DETAILS \n");
System.out.println("Tamil mark: "+tammark);
System.out.println("English mark: "+engmark);
System.out.println("Maths mark: "+matmark);
System.out.println("Science mark: "+scimark);
System.out.println("Social mark: "+socmark);
}
} 

class studentgradecalculator extends studetails
{
void calculations()
{System.out.println("");
totalmark=tammark+engmark+matmark+scimark+socmark;
System.out.println("Totalmark= "+totalmark);
avgpercentage=totalmark/5;
System.out.println("Percentage= "+avgpercentage+"%" );
if (avgpercentage >= 91 && avgpercentage <= 100)
{            
System.out.println("CGPA= 10 \n");            
System.out.println("O Grade ");
System.out.println("Outstanding \n ");
} 
else if (avgpercentage >= 81 && avgpercentage <= 90)
{            
System.out.println("CGPA= 9 \n");            
System.out.println("A+ Grade ");
System.out.println("Excellent \n ");        
} 
else if (avgpercentage >= 71 && avgpercentage <= 80) 
{            
System.out.println("CGPA= 8 \n");            
System.out.println("A Grade ");
System.out.println("Very good \n ");        
} 
else if (avgpercentage >= 61 && avgpercentage <= 70) 
{            
System.out.println("CGPA= 7 \n");            
System.out.println("B+ Grade ");
System.out.println("Good \n ");}
else if (avgpercentage >= 51 && avgpercentage <= 60)
{            
System.out.println("CGPA= 6 \n");            
System.out.println("B Grade ");
System.out.println("Average\n ");
}
else 
{            
System.out.println("Fail \n");        
}
System.out.println("Best wishes for your next success!");    
}
public static void main(String[] args)
{
studentgradecalculator obj=new studentgradecalculator();
obj.getdata();
obj.display();
obj.calculations();
}
}

