package com.example.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_otherScenario() {
		DataService dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(45, result);
	}

}

//stubs class

class DataServiceStub1 implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] {45};
	}
}

class DataServiceStub2 implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
}
