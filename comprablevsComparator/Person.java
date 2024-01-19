package comprablevsComparator;

public class Person {
	private float height;
	private double weight;
	private long ssn;
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public long getSsn() {
		return ssn;
	}
	
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public Person(float height, double weight, long ssn) {
		super();
		this.height = height;
		this.weight = weight;
		this.ssn = ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person){
            Person per = (Person) obj;
            return this.ssn == per.ssn;
        }


        return false;
	}
	
	
	public static void main(String[] args) {
		
		Person obj1=new Person(5.0f,79,1234);
		Person obj2=new Person(5.3f,72,3456);
		
		System.out.println(obj1.equals(obj2));
		
		Person obj3=new Person(5.0f,79,1234);
		Person obj4=new Person(5.0f,79,1234);
		
		System.out.println(obj3.equals(obj4));
		
		System.out.println(obj3==obj4);
		
	}

}
