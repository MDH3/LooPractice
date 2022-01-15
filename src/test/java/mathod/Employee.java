package method;

public class Employee {
	int sid;//global veribal
	String sname;
	char grade ='A';
	
	
	
	
public void show(){
	System.out.println(sid+" "+sname+" "+grade);
}	
 public void Employee(int id, String name, char g){

	sid=id;
	sname=name;
	grade=g	;
}
}

