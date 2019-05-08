package lab10;

public class Lab2 {
    
    public static void main(String[] args) {
        Function fun = (double a,double b,double c,double d) -> {
            System.out.printf("f(%.2f,%.2f,%.2f,%.2f) = %.6f \n", a,b,c,d,
                Math.pow(Math.tan(a),1/c)/(1+(Math.sinh(b)/Math.log(Math.abs(d+c)))));
            };
            
        funct(4.13, 1.54, 7.0, 2.67, fun);
          
    }
      
    public interface Function {
        public void calculate(double a,double b,double c,double d);
    }
      
    public static void funct(double a, double b, double c,double d, Function fun ){
        fun.calculate(a,b,c,d);
    }     
      
}	    	    
	