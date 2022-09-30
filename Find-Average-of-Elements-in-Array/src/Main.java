public class Main {
    public static void main(String[] args) {
        //Calculate harmonic series average
        int[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++){
            sum += (1 / list[i]);
        }
        System.out.println(list.length / sum);
    }
}
