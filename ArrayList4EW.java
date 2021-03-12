//Evan White
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class ArrayList4EW {

	public static void main(String[] args) {
		
		ArrayList <Double> list = new ArrayList <Double>();		
		
		list.add(36.6);
		list.add(20.3);
		list.add(64.6);
		list.add(12.5);
		list.add(40.3);
		list.add(74.2);
		list.add(48.9);
		list.add(90.8);
		list.add(11.9);
		list.add(81.5);
		
		System.out.println("Size of list: " + list.size());
		
		MyUtilProgram1EW.bubbleSort(list);
		for(int w = 0; w < list.size(); w++)
			System.out.println(list.get(w));
		
	}

}
/*
Size of list: 10
11.9
12.5
20.3
36.6
40.3
48.9
64.6
74.2
81.5
90.8

*/