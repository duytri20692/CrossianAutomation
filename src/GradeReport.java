import java.util.*;

public class GradeReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số học sinh
        System.out.print("Nhập số lượng học sinh: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        // Nhập danh sách môn học
        System.out.print("Nhập tên các môn thi (phân cách bằng dấu phẩy): ");
        String[] subjectArray = scanner.nextLine().split(",");
        List<String> subjects = new ArrayList<>();
        for (String subject : subjectArray) {
            subjects.add(subject.trim());
        }

        // Nhập điểm học sinh
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nNhập thông tin cho học sinh thứ " + (i + 1));
            System.out.print("Tên học sinh: ");
            String name = scanner.nextLine();
            Student student = new Student(name);
            for (String subject : subjects) {
                System.out.print("  Nhập điểm môn " + subject + ": ");
                double score = Double.parseDouble(scanner.nextLine());
                student.scores.put(subject, score);
            }
            student.calculateAverage();
            students.add(student);
        }

        // In bảng điểm
        System.out.println("\n=== BẢNG ĐIỂM CUỐI KỲ ===");
        System.out.printf("%-5s%-20s", "STT", "Tên");
        for (String subject : subjects) {
            System.out.printf("%-10s", subject);
        }
        System.out.printf("%-15s\n", "Trung Bình");
        System.out.println("--------------------------------------------------------------------------");

        int stt = 1;
        for (Student student : students) {
            System.out.printf("%-5d%-20s", stt++, student.name);
            for (String subject : subjects) {
                System.out.printf("%-10.2f", student.scores.get(subject));
            }
            System.out.printf("%-15.2f\n", student.average);
        }

        // Tìm điểm trung bình cao nhất
        double maxAverage = students.stream()
                .mapToDouble(s -> s.average)
                .max()
                .orElse(0);

        System.out.printf("\n Học sinh có điểm trung bình cao nhất (%.2f):\n", maxAverage);
        for (Student s : students) {
            if (Double.compare(s.average, maxAverage) == 0) {
                System.out.printf(" - %s\n", s.name);
            }
        }

        // Tìm học sinh có điểm cao nhất từng môn
        System.out.println("\n Học sinh có điểm cao nhất từng môn:");
        for (String subject : subjects) {
            double maxScore = students.stream()
                    .mapToDouble(s -> s.scores.get(subject))
                    .max()
                    .orElse(0);

            System.out.printf(" - %s (%.2f):\n", subject, maxScore);
            for (Student s : students) {
                if (Double.compare(s.scores.get(subject), maxScore) == 0) {
                    System.out.printf("    + %s\n", s.name);
                }
            }
        }

        scanner.close();
    }
}