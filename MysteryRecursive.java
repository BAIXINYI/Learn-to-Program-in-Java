public class MysteryRecursive {
    public static void main(String[] args) {
       
       mystery1(100);
    }
        public static void mystery1(int n) {
    if (n <= 1) {
        System.out.print(n);
    } else {
        mystery1(n / 2);
        System.out.print(", " + n);
    }
}
}

    


