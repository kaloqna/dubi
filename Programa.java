
public class Programa {
	private  String name;
	private  String sex;
	private  int age;
	private  String role;
	public  int damage;
	public  String enemies;
	public  String inventar;
	
	
    public Programa() {
    	name=" ";
    	sex=" ";
    	age=0;
    	role=" ";
    	
    }

    public Programa (String newName, String newSex, int newAge, String newRole) {
    name=newName;
    sex=newSex;
    age=newAge;
    role=newRole;
}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	 public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex= sex;
		} 
		
	public int getAge() {
		return age;
	}
	public void setAge(int Age) {
		this.age= Age;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role= role;
     }
  
    public void koiIgrae() {
         System.out.println("С кой герой искаш да играеш? Избери един.");
         System.out.println("Акали или Зоуи?");
}
    public void gotov() {
    	System.out.println("Готов ли си да започнеш?");
    }
    }
 