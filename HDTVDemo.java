package tvpackage;

import java.io.*;
import java.util.*;

public class HDTVDemo {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();

		al.add(new HDTV("Samsung",18));
		al.add(new HDTV("Sansui",12));
		al.add(new HDTV("Onida",16));

		System.out.println("Sorting by size");

		Collections.sort(al,new SizeComparator());
		Iterator i = al.listIterator();
		while(i.hasNext()){
			HDTV hdtv = (HDTV)i.next();
			System.out.println(hdtv.brandName+" "+hdtv.size);
		}
	}
}