package my.mood.Learn_Mockito.business;

public class BusinessService {

	private DataService dataService;
	
	public BusinessService(DataService dataService) {
		this.dataService = dataService;
	}
	

	public int getMax() {
		
		int[] maxArr = dataService.retrieveAll();
		int max = Integer.MIN_VALUE;
		
		for(int e : maxArr) {
			if(e > max) {
				max = e;
			}
		}
		
		return max;
	}
}

interface DataService{
	int[] retrieveAll();
}