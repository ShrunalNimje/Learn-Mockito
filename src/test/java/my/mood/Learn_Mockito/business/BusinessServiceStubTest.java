package my.mood.Learn_Mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BusinessServiceStubTest {

	@Test
	void getMax() {
		DataService dataServiceStub = new DataServiceStub();
		BusinessService businessService = new BusinessService(dataServiceStub);
		int max = businessService.getMax();
		assertEquals(45, max);
	}
	
	@Test
	void getMax1() {
		DataService dataServiceStub1 = new DataServiceStub1();
		BusinessService businessService = new BusinessService(dataServiceStub1);
		int max = businessService.getMax();
		assertEquals(213, max);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAll() {
		return new int[] {12, 23, 34, 45, 15};
	}
	
}

class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAll() {
		return new int[] {122, 213, 134, 145, 115};
	}
	
}