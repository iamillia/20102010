
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


	public void print() {
		String result="";
		result+="Title: "+this.title;
		result+=", Number of pages: "+this.num;
		result+=", Id: "+this.id;
		System.out.println(result);
		
	}
	
	
	@Override
	public String toString() {
		String result="";
		result+="Title: "+this.title;
		result+=", Number of pages: "+this.num;
		result+=", Id: "+this.id;
		return result;
		
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public static int compareByTitle(Article obj1, Article obj2) {
        return obj1.title.compareTo(obj2.title);
    }
	
}
