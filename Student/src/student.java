
public class student {
	
	
	private String name;
	
	public student()
	{
		this.name = "yash";
	}
	
	public student(String name)
	{
		this.name=name;
	}
	
	 public String getName()
	 {
		 return name;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student stu1=new student();
		student stu2=new student("khushi ");
		
		System.out.println("stu1 name:"+stu1.getName());
		System.out.println("stu2 name:"+stu2.getName());
	}

}
