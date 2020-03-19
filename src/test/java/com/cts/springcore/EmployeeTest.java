package com.cts.springcore;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.springcore.domain.Employee;

class EmployeeTest {
	@Mock
	Employee emp;
	
	@BeforeEach
    public void setupMock() {
       MockitoAnnotations.initMocks(this);
    }

	@Test
	void testViewEmpDetails() {
		when(emp.viewEmpDetails()).thenReturn("HelloWorld");
		System.out.println(emp.viewEmpDetails());
		System.out.println( new Employee().viewEmpDetails());
	}

	@Test
	void testSayHi() {
		System.out.println( new Employee().sayHi());
	}

}
