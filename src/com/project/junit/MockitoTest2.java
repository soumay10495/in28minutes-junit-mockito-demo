package com.project.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)  //In JUnit 5, @ExtendWith is used
public class MockitoTest2 {

    @Mock
    SomeInterface object;

    @InjectMocks
    SomeClass someClass;

    @Test
    public void getGreatestValue() {
        when(object.getData()).thenReturn(new int[]{12, 54, 11});
        int result = someClass.getGreatestValue(object.getData());
        assertEquals(54, result);
    }

    @Test
    public void getGreatestValue2() {
        when(object.getData()).thenReturn(new int[]{12});
        int result = someClass.getGreatestValue(object.getData());
        assertEquals(12, result);
    }
}
