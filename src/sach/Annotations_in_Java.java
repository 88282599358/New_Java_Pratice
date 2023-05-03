package sach;

import java.util.ArrayList;
public class Annotations_in_Java {

	//Source cwh video and https://www.javatpoint.com/java-annotation
	static class Phone
	{
		public void showTime()
		{
			System.out.println("The Time is 23 pm");
		}
		
		public void on()
		{
			System.out.println("Turning Phone On");
		}
	}
	
	
	static class NewPhone extends Phone
	{
		@Override
		public void showTime()
		{
			System.out.println("Turning Phone On");
		}
		@Deprecated
	    public void sendMessage(){
	        System.out.println("Text message sent!");
	    }
		
	}
	
	@FunctionalInterface
	interface myFunctionalInterface{
		public void method1();
//	    public void methodd2();   //Only one method is need not 2 
	}
	
	
	
	static class AndroidPhone extends Phone{
	    @Override
	   public void on(){
	        System.out.println("Message sent via WhatsApp!");
	    }
	    
	    
	    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	ArrayList list=new ArrayList();  
	    	list.add("sonoo");  
	    	list.add("vimal");  
	    	list.add("ratan");  
	    	  
	    	for(Object obj:list)  
	    	System.out.println(obj);  
	    	  
	    	
	    	
		NewPhone np = new NewPhone();
		np.showTime();
		np.sendMessage();
		
		
		@SuppressWarnings("deprecation")
		AndroidPhone Samsung = new AndroidPhone();
        Samsung.on();
		
		
        


	}
	

	}
}
