package ex1.io;
import java.util.Scanner;
class Day
{
	private int year;
	private int month;
	private int date;
	Day()
	{
		this.year=1;this.month=1;this.date=1;
	}
	Day(int year)
	{
		set(year,1,1);
	}
	Day(int year, int month)
	{
		set(year,month,1);
	}
	Day(int year,int month,int date)//생성자
	{
		this.year=year; this.month=month; this.date=date;
	}
	Day(Day d)
	{
		set(d.year,d.month,d.date);
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
		Day day1=new Day();
		System.out.println(day1.getYear());
		System.out.println(day1.getMonth());
		System.out.println(day1.getDate());
		
		Day day2=new Day(1998);
		System.out.println(day2.getYear());
		System.out.println(day2.getMonth());
		System.out.println(day2.getDate());
		Day day3=new Day(1998,5);
		System.out.println(day3.getYear());
		System.out.println(day3.getMonth());
		System.out.println(day3.getDate());
		Day day4=new Day(1998,5,21);
		System.out.println(day4.getYear());
		System.out.println(day4.getMonth());
		System.out.println(day4.getDate());
		Day day5=new Day(day4);
		System.out.println(day5.getYear());
		System.out.println(day5.getMonth());
		System.out.println(day5.getDate());
				
	}

}
