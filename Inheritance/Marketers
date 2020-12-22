class Employee {
	public int getHours() {
		return baseHours;                // 40 hours/week
	}

	public int getSalary() {
		return baseSalary;               // 50,000
	}

	public int getVacationDays() {
		return baseVacationDays;         // 10 days
	}

	public String getVacationForm() {
		return baseVacationForm;         // yellow
	}

	private int baseHours = 40;
	private int baseSalary = 50000;
	private int baseVacationDays = 10;
	private String baseVacationForm = "yellow";
	
	public final void setBaseHours(int hours) {
		baseHours = hours;
	}
	public final void setBaseSalary(int salary) {
		baseSalary = salary;
	}
	public final void setBaseVacationDays(int days) {
		baseVacationDays = days;
	}
	public final void setBaseVacationForm(String form) {
		baseVacationForm = form;
	}
}
class Marketers extends Employee
{
Marketers()
{
setBaseSalary(5000);
}
void message()
{
System.out.println("CodeQuotient - Get better at coding");
}
}
class Main{
  public static void main(String[] args)
  {
    Marketers m1=new Marketers();
    System.out.println(m1.getSalary());
    m1.message();
  }
}
