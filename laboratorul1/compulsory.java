public class compulsory {
    static int Compute(int x) {
        int result = 0;
        while (x > 0 || result > 9) {
            if (x == 0) {
                x = result;
                result = 0;
            }
            result = result + (x % 10);
            x /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        int BinaryString = Integer.parseInt("10101", 2);
        int HexadecimalString = Integer.parseInt("FF", 16);
        n = ((n * 3) + BinaryString + HexadecimalString) * 6;
        int result = 0;
        System.out.println(n);
        System.out.println(Compute(n));
        while (n > 0 || result > 9) {
            if (n == 0) {
                n = result;
                result = 0;
            }
            result = result + (n % 10);
            n /= 10;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
