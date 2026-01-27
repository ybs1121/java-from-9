package lec09;

public class Main {
    public static void main(String[] args) {

    }

    private String calcTestGrade(int socre) {
        String grade = "";

        switch (socre) {
            case 5:
                grade = "A";
                break;
            case 4:
            case 3:
                grade = "B";
                break;
            default:
                grade = "F";
        }

        return grade;
    }


    private String calcTestGrade2(int score) {
        return switch (score) {
            case 5 -> "A";
            case 4, 3 -> "B";
            default -> "F";
        };
    }

    private String calcTestGrade3(int score) {
        return switch (score) {
            case 5 -> {
                System.out.println("Perfect");
                int bonus = 10;
                yield "A";  // 마지막에 값 반환
            }
            default -> "F";
        };

    }


}
