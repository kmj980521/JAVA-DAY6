package ex1.io;
import java.util.Scanner;
class Day
{
	private int year;
	private int month;
	private int date;
	
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
		day1.set(2020,3,15);
		System.out.println(day1.getYear());
		System.out.println(day1.getMonth());
		System.out.println(day1.getDate());
	}

}


