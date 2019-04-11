public class Try {

	public static void main(String[] args) {
		try {
		Article a = new Article("Title", 11);
		a.print();
		Article b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		b = new Article("Title", 1);
		b.print();
		Article c = new Article("", 2);
		c.print();
		articleInInternet d = new articleInInternet("Article", 1, "");
		d.print();
		}catch(IllegalArgumentException e) {
			
		}
	}

}
