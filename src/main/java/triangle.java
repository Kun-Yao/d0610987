package t3;
import java.util.Arrays;

public class triangle {
	
	public String check(double a, double b, double c) throws Exception {
		
		//��X�̪���
	    double[] l = {a, b, c};
	    Arrays.sort(l);
	    
		if (l[0] + l[1] <= l[2]) {
			throw new Exception("���O�T����");
		}
		
		String result  = new String();
		
		if (l[0] == l[1] && l[1] == l[2]) {
			result = "���T����";
		}else if(l[0] == l[1] || l[1] == l[2]) { 
			result = "���y�T����";
		}else if (Math.abs(l[0]*l[0] + l[1]*l[1] - l[2]*l[2]) < 0.001) {
			result = "�����T����";
		}else {
			result = "�T����";
		}
		System.out.println(result);
		return result;
	}
}