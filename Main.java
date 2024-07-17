public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int age = 25; // 정수형 변수
        double height = 180.5; // 실수형 변수
        char initial = 'A'; // 문자형 변수
        boolean isStudent = true; // 불리언형 변수
        String name = "John Doe"; // 문자열 변수
        
        // 변수 출력
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Initial: " + initial);
        System.out.println("Is Student: " + isStudent);

        // 변수 값 변경
        age = 26;
        height = 182.2;
        initial = 'B';
        isStudent = false;
        name = "Jane Smith";

        // 변경된 변수 출력
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Initial: " + initial);
        System.out.println("Is Student: " + isStudent);

        // 다양한 데이터 타입 사용 예제
        byte b = 127; // 1바이트 정수
        short s = 32000; // 2바이트 정수
        long l = 10000000000L; // 8바이트 정수
        float f = 3.14f; // 4바이트 실수

        // 데이터 타입 출력
        System.out.println("\nDifferent Data Types:");
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
    }
}
