package com.project.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MockitoTest {

    @Test
    public void testFindGreatestValue() {
        SomeInterface mockObject = mock(SomeInterface.class);
        when(mockObject.getData()).thenReturn(new int[]{11, 42, 12});

        SomeClass someClass = new SomeClass(mockObject);
        int greatest = someClass.getGreatestValue(mockObject.getData());
        assertEquals(42, greatest);
    }
}
