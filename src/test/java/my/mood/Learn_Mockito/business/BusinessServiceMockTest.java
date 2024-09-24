package my.mood.Learn_Mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BusinessServiceMockTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	BusinessService businessService;
	
	@Test
	void getMax() {
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {12, 23, 34, 45, 15});
		int max = businessService.getMax();
		assertEquals(45, max);
	}
	
	@Test
	void getMax1() {
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {34});
		int max = businessService.getMax();
		assertEquals(34, max);
	}
	
	@Test
	void getMax2() {
		when(dataServiceMock.retrieveAll()).thenReturn(new int[] {});
		int max = businessService.getMax();
		assertEquals(Integer.MIN_VALUE, max);
	}
	
}