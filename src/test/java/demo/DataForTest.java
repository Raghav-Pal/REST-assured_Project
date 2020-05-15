package demo;

import org.testng.annotations.DataProvider;

public class DataForTest{

	@DataProvider(name = "dataForDelete")
	public Object[] dataForDelete1() {

		return new Object [] {
				8
		};
	}


	@DataProvider(name = "DataForPost")
	public Object[][] createData() {

		//		Object[][] data = new Object[2][3];
		//		
		//		data[0][0] = "FName1";
		//		data[0][1] = "LName1";
		//		data[0][2] = 1;
		//		
		//		data[1][0] = "FName2";
		//		data[1][1] = "LName2";
		//		data[1][2] = 2;
		//		
		//		return data;


		return new Object[][] {
			{"Albert", "Einstein", 1},
			{"Thomas", "Edison", 2},
			{"Henry", "Ford", 2}	
		};

	}

}
