package runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class empDataBase {
	
	public static void main(String[] args) {
		
		Map<Integer, employee> emp=new HashMap<Integer, employee>();
		
		employee karthi=new employee();
		karthi.setId(1606926);
		karthi.setName("karthi");
		karthi.setSal(120000);


		employee yuvraj=new employee();
		yuvraj.setId(1606938);
		yuvraj.setName("yuvraj");
		yuvraj.setSal(140000);


		employee aravind=new employee();
		aravind.setId(1606938);
		aravind.setName("aravind");
		aravind.setSal(140000);
		
		emp.put(1, karthi);
		emp.put(2, yuvraj);
		emp.put(3, aravind);
		
		Set<Entry<Integer, employee>> entrySet = emp.entrySet();
		for (Entry<Integer, employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getSal());
			
			
		}
		
		
		
	}

}
