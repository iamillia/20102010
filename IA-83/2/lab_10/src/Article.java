
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

	@Override
	public String toString() {
		String result="";
		result+="Title: "+this.title;
		result+=", Number of pages: "+this.num;
		result+=", Id: "+this.id;
		return result;
		
	}
	
}
