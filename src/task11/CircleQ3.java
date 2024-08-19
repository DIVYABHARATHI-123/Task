package task11;

public class CircleQ3 {

	float radius;
	float result;   //declaring variables
	
	// default constructor
	
	public CircleQ3()
	{
		
	}
	//Parameterized constructor
	public CircleQ3(float radius)
	{
		this.radius=radius;
	}
	public void CercumferenceOfCircle()
	{
		result=(float) (2*4.12*(radius));
		System.out.println("Circumference of the circle is :" + result);
	}
	public static void main(String[] args) {
		
      CircleQ3 objC=new CircleQ3(10);
      objC.CercumferenceOfCircle();
      //System.out.println("Circumference of the circle is :" + objC.result);
      
	}

}