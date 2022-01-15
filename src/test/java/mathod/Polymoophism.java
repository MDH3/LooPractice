package method;

public class Polymoophism {
	
	public void m1(){
		System.out.println("overridding");
	}
	 public void m2(int a){
		System.out.println(a);
	}

}
        class A extends Polymoophism 
     {
     public  void m2 (int a ,int b){ 
    	 System.out.println(a+b);
     }
     public void display(){
    	 System.out.println(10+20);
 
     }
    	 
     
        public static void main(String []arg){
        	
        	A b= new A();
        	b.display();
        	
        	
        	
        	
        }
        }