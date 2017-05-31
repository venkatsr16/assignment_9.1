package tvpackage;
import java.util.*;

class SizeComparator implements Comparator {
	public int compare(Object o1,Object o2) {

		HDTV h1 = (HDTV)o1;
		HDTV h2 = (HDTV)o2;

		if(h1.size==h2.size)
			return 0;
		else if(h1.size>h2.size)
			return 1;
		else
			return -1;
	}
}