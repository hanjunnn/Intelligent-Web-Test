public class ArrayExample {
    public static void main(String[] args) {
        // 정수형 배열 선언과 초기화
        int[] intArray = new int[5]; // 크기가 5인 배열 선언
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // 배열 출력
        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // 문자열 배열 선언과 초기화
        String[] stringArray = {"Java", "Python", "C++", "JavaScript", "Ruby"};

        // 배열 출력
        System.out.println("\nString Array:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i + ": " + stringArray[i]);
        }

        // 배열 선언과 동시에 초기화
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // 배열 출력
        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Element at index " + i + ": " + doubleArray[i]);
        }

        // 빈 배열 선언 후 초기화
        boolean[] boolArray = new boolean[3];
        boolArray[0] = true;
        boolArray[1] = false;
        boolArray[2] = true;

        // 배열 출력
        System.out.println("\nBoolean Array:");
        for (int i = 0; i < boolArray.length; i++) {
            System.out.println("Element at index " + i + ": " + boolArray[i]);
        }
    }
}
