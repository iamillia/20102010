import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//task1
		double a = -1.49;
		double b = 23.4;
		double c = 1.23;
		double d = 2.542;
		Calculator function = ((i,j,k,l)->Math.sqrt(Math.abs(Math.sin(i)-((4 * Math.log(j))/Math.pow(k, l)))));
		calculate(function, a,b,c,d);
		
		
		
		
		//task2
		Article article1 = new Article("Ukraine", 12);
		Article article2 = new Article("Nature", 1);
		Article article3 = new Article("War", 55);
		Article article4 = new Article("Elections", 10000);
		Article article5 = new Article("Exam", 5);
		
		ArrayList<Article> list = new ArrayList<>();
		list.add(article1);
		list.add(article2);
		list.add(article3);
		list.add(article4);
		list.add(article5);
		
		list.forEach((art) -> System.out.println(art.toString()));
		
	}
	public static void calculate(Calculator calculator, double a, double b, double c, double d) {
		System.out.println("A: "+a+", B: "+b+", C: "+c+", D: "+d+" | Result: "+calculator.calc(a,b,c,d));
	}

	
}
@FunctionalInterface
interface Calculator{
	public double calc(double a, double b, double c, double d);
}







