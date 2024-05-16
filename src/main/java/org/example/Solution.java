package org.example;

import java.util.Arrays;

public class Solution {

    public int solution(int[] inputSet) throws Exception {

        if (inputSet.length % 2 == 0) {

            throw new RuntimeException("The size of the array should be an odd number!");
        }

        int loner = 0;

        Arrays.sort(inputSet);

        for (int i = 0 ; i < inputSet.length ;) {

            int current = inputSet[i];

            if (i == inputSet.length - 1) {

                loner = current;

            } else {

                int resultIdx = Arrays.binarySearch(inputSet, (i + 1), (inputSet.length - 1), current);

                if (resultIdx < 0) {

                    loner = current;
                    break;
                }
            }

            if ((i + 2) > inputSet.length - 1) {

                i++;

            } else {

                i = i + 2;
            }
        }

        return loner;
    }
}
