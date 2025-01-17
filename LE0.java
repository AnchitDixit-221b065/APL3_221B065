public class Main{
    String name;
    int age;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

	public static void main(String[] args) 
	{
	    Main obj = new Main();
	    obj.setName("Mayank Singh");
	    obj.setAge(20);
	    System.out.println(obj.getName()+" "+obj.getAge());
	}
}
