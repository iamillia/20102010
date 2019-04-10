
public class Article {
	long id;
	String title;
	int num;
	public Article(String name, int numberOfPages) {
		if(name == null || name == "" || numberOfPages<=0) {
			throw new IllegalArgumentException();
			
		}
		else {
		title = name;
		num = numberOfPages;
		int randnum = 1 + (int)(Math.random()*643);
		id = System.currentTimeMillis()/1000000000+randnum;
		
		}
		
	}

	public void change(int numberOfPages) {
		this.num = numberOfPages;
		System.out.println("Edited an article");
	}
	public void print() {
		System.out.println("Title: "+this.title);
		System.out.println("Number of pages: "+this.num);
		System.out.println("Id: "+this.id);
		
	}
	public void testMethod() {
		System.out.println("Before overriding");
	}
	
}
