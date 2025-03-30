// Time complexity O(n) and space complexity O(n)
public class Main {
    public static int getMinimum(int[] arr, int index) {
        if (index == 0) return arr[0];
        int min = getMinimum(arr, index - 1);
        return Math.min(min, arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMinimum(arr, n - 1));
    }
}

// Time complexity O(n) and space complexity O(n)
public class AverageCalculator {
    public static double calculateAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return (arr[n - 1] + (n - 1) * calculateAverage(arr, n - 1)) / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(calculateAverage(arr, n));
        sc.close();
    }
}

// Time complexity O(sqrt(n)) and space complexity O(sqrt(n))
public class PrimeValidator {
    public static boolean checkPrime(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return checkPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 7;
        if (checkPrime(n, 2)) System.out.println("Prime");
        else System.out.println("Composite");
    }
}

// Time complexity O(n) and space complexity O(n)
public class IterativeFactorial {
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}

// Time complexity O(n) and space complexity O(n)
public class FibonacciIterative {
    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(5));
        System.out.println(fibonacciIterative(17));
    }
}

// Time complexity O(log(n)) and space complexity O(log(n))
public class OptimizedPowerCalculator {
    public static int optimizedPower(int a, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int half = optimizedPower(a, n / 2);
            return half * half;
        } else {
            return a * optimizedPower(a, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}

// Time complexity O(n!) and space complexity O(n)
public class StringPermutations {
    public static void generatePermutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            generatePermutations(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        generatePermutations("IOX", "");
    }
}

// Time complexity O(n!) and space complexity O(n)
public class DigitsOnlyChecker {
    public static boolean isOnlyDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isOnlyDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isOnlyDigits("123456", 0));
    }
}

// Time complexity O(n) and space complexity O(n)
public class BinomialCoefficientDP {
    public static int binomial(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        System.out.println(binomial(7, 3));
    }
}

// Time complexity O(log(n)) and space complexity O(log(n))
public class IterativeGCD {
    public static int iterativeGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(iterativeGcd(32, 48));
        System.out.println(iterativeGcd(10, 7));
    }
}
