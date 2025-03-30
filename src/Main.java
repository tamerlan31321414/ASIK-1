// time complexity O(n) and space complexity O(n)
public class MinFinder {
    public static int findMin(int[] arr, int index) {
        if (index == 0)
            return arr[0];
        int min = findMin(arr, index - 1);
        return Math.min(min, arr[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findMin(arr, n - 1));
    }
}
// time complexity O(n) and space complexity O(n)
public class AverageFinder {
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findAverage(arr, n));
        scanner.close();
    }
}
// time complexity O(n^(1/2)) and space complexity O(n^(1/2))
public class PrimeChecker {
    public static boolean isPrime(int n, int i) {
        if (n <= 1)
            return false;
        if (i * i > n)
            return true;
        if (n % i == 0)
            return false;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 7;
        if (isPrime(n, 2)) System.out.println("Prime");
        else System.out.println("Composite");
    }
}

// time complexity O(n) and space complexity O(n)
public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

// time complexity O(n^2) and space complexity O(n)
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // 5
        System.out.println(fibonacci(17)); // 1597
    }
}
// time complexity O(n) and space complexity O(n)
public class PowerCalculator {
    public static int power(int a, int n) {
        if (n == 0)
            return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
// time complexity O(n!) and space complexity O(n)
public class Permutations {
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permute("IOX", "");
    }
}
// time complexity O(n!) and space complexity O(n)
public class DigitChecker {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length())
            return true;
        if (!Character.isDigit(s.charAt(index)))
            return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isAllDigits("123456", 0));
    }
}
// time complexity O(2^n) and space complexity O(n)
public class BinomialCoefficient {
    public static int binomial(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static void main(String[] args) {
        System.out.println(binomial(7, 3));
    }
}
// time complexity O(log(n)) and space complexity O(log(n))
public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(32, 48)); // 16
        System.out.println(gcd(10, 7)); // 1
    }
}