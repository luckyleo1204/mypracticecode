package javaPra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorEx {

	public static void main(String[] args) {
		List<student> al=new ArrayList<student>();
		al.add(new student(100,"Murali",999));
		al.add(new student(300,"Zeebra",399));
		al.add(new student(200,"Amar",799));
		al.add(new student(400,"Jolly",499));
		
		Collections.sort(al,student.sortid);
		
		System.out.println("Afte Sort by Student ID");
		for(student i:al)
			System.out.println(i.toString());
		
		System.out.println("===========================");
		
		System.out.println("Afte Sort by Student Name");
		Collections.sort(al,student.sortname);
		for(student i:al)
			System.out.println(i.toString());
		System.out.println("===========================");
		

	}

}
class student implements Comparator{
	private int id,marks;
	private String name;
	
	public student(int id,String name,int marks)
	{
		this.id=id;this.name=name;this.marks=marks;
	}

	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", marks=" + marks + ", name=" + name
				+ "]";
	}
	
	public static Comparator<student> sortid=new Comparator<student>(){

		
		public int compare(student s1, student s2) {
			// TODO Auto-generated method stub
			return s1.getId()-s2.getId();
		}
		
	};
	
public static Comparator<student> sortname=new Comparator<student>(){

		
		public int compare(student s1, student s2) {
			// TODO Auto-generated method stub
			return s1.getName().compareTo(s2.getName());
		}
		
	};

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
