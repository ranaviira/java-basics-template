package com.epam.izh.rd.online.service;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        if (value1 == value2) {
            return 0;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    @Override
    public int maxFrom(int[] values) {
        int maxValue = 0;
        for (int value : values) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    @Override
    public int sum(int[] values) {
        int sumNumbersArray = 0;
        for (int value : values) {
            sumNumbersArray += value;
        }
        return sumNumbersArray;
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int value : values) {
            if (value % 2 == 0) {
                evenNumbers.add(value);
            }
        }
        int[] evenNumbersOutput = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenNumbersOutput[i] = evenNumbers.get(i);
        }
        return evenNumbersOutput;
    }

    @Override
    public long calcFactorial(int initialVal) {
        int result = 1;
        for (int i = 1; i <= initialVal; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public long calcFibonacci(int number) {
        int value1 = 0;
        int value2 = 1;
        if (number == 0) {
            return value1;
        } else {
            for (int i = 2; i <= number; ++i) {
                int nextValue = value1 + value2;
                value1 = value2;
                value2 = nextValue;
            }
            return value2;
        }
    }

    @Override
    public int[] sort(int[] values) {
        Arrays.sort(values);
        return values;
    }

    @Override
    public boolean isPrimary(int number) {
        if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public int[] reverseArray(int[] values) {
        int[] reverseValues = new int[values.length];
        for (int i = values.length - 1, j = 0; i >= 0; i--, j++) {
            reverseValues[j] = values[i];
        }
        return reverseValues;
    }
}
