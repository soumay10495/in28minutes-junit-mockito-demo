package com.project.junit;

public class SomeClass {
    SomeInterface object;

    public SomeClass(SomeInterface object) {
        this.object = object;
    }

    int getGreatestValue(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
