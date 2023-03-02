class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int countOfDigits = getCountOfDigits(x);
        int zerosForDivisionsOfLestSide = countOfDigits - 1;
        int countOfSteps = getCountOfSteps(countOfDigits);

        for (int i = 0; i < countOfSteps; i++) {
            int divLeft = (int) Math.pow(10, zerosForDivisionsOfLestSide);

            int leftDigit = x / divLeft;
            x = x % divLeft;

            int rightDigit = x % 10;
            x = x / 10;

            zerosForDivisionsOfLestSide = zerosForDivisionsOfLestSide - 2;
            if (leftDigit != rightDigit) return false;

        }
        return true;
    }

    private int getCountOfDigits(int x) {
        int countOfDigits = 0;
        while (x != 0) {
            x = x / 10;
            countOfDigits++;
        }
        return countOfDigits;
    }

    private int getCountOfSteps(int countOfDigits) {
        if (countOfDigits % 2 != 0) return (countOfDigits - 1) / 2;
        return countOfDigits / 2;
    }
}