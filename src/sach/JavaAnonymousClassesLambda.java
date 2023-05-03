package sach;


interface DemoAno
{
//	public void meth();  //Anonymous Classes 
	public void meth(int a);  //Lambda Method
}
public class JavaAnonymousClassesLambda {

	//Source:-  https://www.javatpoint.com/java-9-anonymous-classes + cwh
	public static void main(String[] args) {
		// Java Anonymous Classes 
		/*DemoAno obj = new DemoAno() {

			@Override
			public void meth() {
				System.out.println("I am the DEVIL of My Life");
			}
			
		};
	
		obj.meth();  */
		
		
		//Lambda Method
		DemoAno lam =(a) ->{
			System.out.println("I am the Method from Lambda Method " + a);
		};
		
		lam.meth(9);
	}

}
