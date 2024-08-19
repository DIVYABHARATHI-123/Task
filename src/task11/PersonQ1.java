package task11;

//Q1)create a class called "person" with attributes "name",and "age"

public class PersonQ1   //1)create a class with "person" name
{

	String name;            //2)Defining attributed for the class "person"
	int age;
	            
	                        //3)create constructor with parameters
PersonQ1(String name,int age)   //constructor must have the same name as the class name within which it is defined
{
	this.name=name;        //4)this keyword is used to mention the class attribute name and age
	this.age=age;
		
}
	                       
//5)Now create getter methods for the attributes,to return string and int
	
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	PersonQ1 objP = new PersonQ1("Divyabharathi",27);
	 objP.getName();
	 objP.getAge();
	 System.out.println(objP.getName());
	 System.out.println(objP.getAge());
	}

}