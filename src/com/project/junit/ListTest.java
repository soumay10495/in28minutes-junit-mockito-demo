package com.project.junit;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void testSize() {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(20);
        assertEquals(20, mockList.size());
        assertEquals(20, mockList.size());
    }

    @Test
    public void testSizeMultiple() {
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(20).thenReturn(22);
        assertEquals(20, mockList.size());
        assertEquals(22, mockList.size());
        assertEquals(22, mockList.size());
    }

    @Test
    public void testGet() {
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn(11);
        assertEquals(11, mockList.get(0));
        assertEquals(null, mockList.get(1));
    }

    @Test
    public void testGetGeneric() {
        List mockList = mock(List.class);
        when(mockList.get(Mockito.anyInt())).thenReturn(25);
        assertEquals(25, mockList.get(4));
        assertEquals(25, mockList.get(2));
        assertEquals(25, mockList.get(10));
    }
}
