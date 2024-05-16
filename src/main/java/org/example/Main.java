package org.example;

public class Main {

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution();

        int[] caseOne = new int[]{9, 3, 9, 3, 9, 7, 9};

        System.out.println("Test Case # 1 : " + solution.solution(caseOne));

        int[] caseTwo = new int[]{1, 2, 9, 2, 1};

        System.out.println("Test Case # 2 : " + solution.solution(caseTwo));

        int[] caseThree = new int[]{1, 2, 9, 2, 1, 9, 3, 9, 3, 9, 7, 8, 5, 3, 3, 3, 7, 9, 3};

        System.out.println("Test Case # 3 : " + solution.solution(caseThree));
    }
}