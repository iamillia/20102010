
public class Lab1_2 {


	    public interface Function {
	     public void calculate(double a,double b,double c,double d);
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        Function fun = (double a,double b,double c,double d) -> {
	           System.out.printf("f(%.2f,%.2f,%.2f,%.2f) = %.6f \n", a,b,c,d,
	                   Math.pow(Math.tan(a),1/c)/(1+(Math.sinh(b)/Math.log(Math.abs(d+c)))));
	          };
	          
	        fun.calculate(3.56, 1.02,3.0,2.43);
	        
	    }
	    
	    
	}

