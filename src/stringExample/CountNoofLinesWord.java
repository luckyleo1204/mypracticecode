package stringExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountNoofLinesWord {

	public static void main(String[] args) throws IOException {
		String filename="C:\\Personal\\API\\MyPractice\\source\\SampleTextFile.txt";
		int maxcount=0;
		File f=new File(filename);
		BufferedReader bf=new BufferedReader(new FileReader(f.getAbsoluteFile()));
		String s="";
		ArrayList<String> al=new ArrayList<String>();
		while((s=bf.readLine()) != null)
		{
			int count=s.split("\\s+").length;
			if(count>maxcount)
			{
				al.clear();
				al.add(s);
				maxcount=count;
			}
		}
		System.out.println("Max Count of Word in a given line is"+maxcount);
		System.out.println(al);
		

	}

}
