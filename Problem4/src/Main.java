public class Main {

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int[] result;

        result = SolutionClass.solution(A, 99);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }

    static class SolutionClass {

        public static int[] solution(int[] A, int K) {
            int length = A.length;
            int[] rotated = new int[length];

            for (int i=0; i<length; i++) {
                rotated[(i+K)%length] = A[i];
            }

            return rotated;
        }
    }
}
