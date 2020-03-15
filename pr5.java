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
		Day[]list=new Day[]{
						new Day(1998,5,21),
						new Day(1999,6,22),
						new Day(2000,7,23)
				};
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].getYear());
			System.out.println(list[i].getMonth());
			System.out.println(list[i].getDate());
		}
	}

}


