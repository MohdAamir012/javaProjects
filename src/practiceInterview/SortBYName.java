package practiceInterview;

import java.util.Comparator;

class SortBYName implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBook_name().compareTo(o2.getBook_name());
	}	

}
