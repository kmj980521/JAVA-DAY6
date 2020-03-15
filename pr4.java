package ex1.io;
import java.util.Scanner;
class Day
{
	private int year;
	private int month;
	private int date;
	Day()
	{
		
	}
	Day(int year,int month,int date)//생성자
	{
		this.year=year; this.month=month; this.date=date;
	}
	int getYear() {return year;}
	int getMonth() {return month;}
	int getDate() {return date;}
	void set(int year,int month, int date)//재설정하기 
	{
		this.year=year; this.month=month; this.date=date;
	}
}
public class Program {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Day day1=new Day(1998,5,21);
		System.out.println(day1.getYear());
		System.out.println(day1.getMonth());
		System.out.println(day1.getDate());
		Day day2=new Day();
		day2.set(1998,5,21);
		System.out.println(day2.getYear());
		System.out.println(day2.getMonth());
		System.out.println(day2.getDate());
		if(day1==day2)
			System.out.println("day1과 day2는같습니다");
		else
			System.out.println("day1과 day2는 다릅니다");
		if(day1.getYear()==day2.getYear()&&day1.getMonth()==day2.getMonth()
				&&day1.getDate()==day2.getDate())
		{
			System.out.println("day1과 day2는 같습니다.");
		}
		else
			System.out.println("day1과 day2는 다릅니다");
	}

}


