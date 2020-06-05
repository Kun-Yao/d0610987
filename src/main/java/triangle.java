package t3;
import java.util.Arrays;

public class triangle {
	
	public String check(double a, double b, double c) throws Exception {
		
	    double[] l = {a, b, c};
	    Arrays.sort(l);
	    
		if (l[0] + l[1] <= l[2]) {
			throw new Exception("不是三角形");
		}
		
		String result  = new String();
		
		if (l[0] == l[1] && l[1] == l[2]) {
			result = "正三角形";
		}else if(l[0] == l[1] || l[1] == l[2]) { 
			result = "等腰三角形";
		}else if (Math.abs(l[0]*l[0] + l[1]*l[1] - l[2]*l[2]) < 0.001) {
			result = "直角三角形";
		}else {
			result = "三角形";
		}
		System.out.println(result);
		return result;
	}
}