public class Article{
	
		String title;
		int num;
		
		public Article() {
			//for creating demonstrative null objects
		}
		
		public Article(String name, int numberOfPages) {
			if(name == null || name == "" || numberOfPages<=0) {
				throw new IllegalArgumentException();
				
			}
			else {
			title = name;
			num = numberOfPages;
			
			}
			
		}
		
		public String getTitle() {
			return title;
		}
		public void print() {
			System.out.println("Title: "+this.title);
			System.out.println("Number of pages: "+this.num);
			
		}
	
	}

