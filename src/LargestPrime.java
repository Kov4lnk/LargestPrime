public class LargestPrime {

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        int divider = 2;
        int maxdivider = 0;

        while (number > 1){
            while (number % divider == 0){
                maxdivider = divider;
                number /= divider;
            }
            divider++;
        }
        return maxdivider;
    }
}
