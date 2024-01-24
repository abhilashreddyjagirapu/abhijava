package Collection;
import java.util.ArrayList;

public class Studentarray {
	String firstName;
	String lastName;
	double gpa;
	@Override
	public String toString() {
		return "student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Studentarray(String firstName, String lastName, double d) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = d;
	}
	public static void main(String[] args) 
	{
		ArrayList<Studentarray> al = new ArrayList<Studentarray>();
		
		al.add(new Studentarray("ram","raju",4.4));
		al.add(new Studentarray("seetha","seetha",5.5));
		al.add(new Studentarray("geetha","roy",9));
		al.add(new Studentarray("hero","Zero",9.1));
		al.add(new Studentarray("andy","smith",9.2));
		double totalgpa=0;
		
		for(Studentarray s:al)
		{
			totalgpa=totalgpa+s.getGpa();
		}
		double avgcgpa=totalgpa/al.size();
		for(Studentarray s1:al)
		{
			if(avgcgpa<s1.getGpa())
			{
				System.out.println(s1.getLastName()+" "+s1.getFirstName()+" "+s1.getGpa() );
			}
		}
		
		
	}

}
