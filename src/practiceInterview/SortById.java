package practiceInterview;

import java.util.Comparator;

public class SortById implements Comparator <Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBook_id()-o2.getBook_id();
	}

}
