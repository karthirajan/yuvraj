package runner;

import java.util.List;
import java.util.ArrayList;

public class empDB  {

	public static void main(String[] args) {

		List<employee> li=new ArrayList<employee>();
		
	

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

		li.add(aravind);
		li.add(yuvraj);
		li.add(karthi);

		for (employee x : li) {

			System.out.println(x.getId()+"           "+x.getName()+"          "+x.getSal());

		}
	}

}
