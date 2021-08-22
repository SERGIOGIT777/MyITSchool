package HomeWork.HomeWork9.src.com.serg;

public class Main3 {
    public static void main(String[] args) {
        Student magic = new Aspirant();
        magic.firstName = "Сидоров";
        magic.lastName = "СИдорович";
        magic.group = "JAVA29";
        magic.averageMark = 5;
        System.out.print(magic.firstName + " " + magic.lastName + "\n");
        System.out.print("Группа " + magic.group);
        System.out.print("\nСредняя оценка " + magic.averageMark);
        System.out.println("\n" + magic.getScholarship());

    }

    public static class Student {
        String firstName;
        String lastName;
        String group;
        double averageMark;

        int getScholarship(){
            if (this.averageMark == 5) return 100;
            else return 80;
        }
    }

    public static class Aspirant extends Student {
        @Override
        int getScholarship() {
            if (this.averageMark == 5) return 200;
            else return 180;
        }
    }

}
