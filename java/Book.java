package activities;

abstract class Book {
	String title;
	 abstract void setTitle(String s);
	
	protected String getTitle() {
		return title;
	}
}
