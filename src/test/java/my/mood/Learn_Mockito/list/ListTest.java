package my.mood.Learn_Mockito.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ListTest {

	@Test
	public void getSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void getSize2() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3).thenReturn(2).thenReturn(1);
		assertEquals(3, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(1, listMock.size());
	}
	
	@Test
	public void getSpecificParams() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("String");
		assertEquals("String", listMock.get(0));
	}
	
	@Test
	public void getSpecificParams2() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("String");
		assertEquals("String", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void getAnyParams() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("String");
		assertEquals("String", listMock.get(anyInt()));
		assertEquals("String", listMock.get(1));
		assertEquals("String", listMock.get(11));
		assertEquals("String", listMock.get(103));
	}
}
