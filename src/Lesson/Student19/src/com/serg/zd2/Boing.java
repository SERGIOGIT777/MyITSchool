package Lesson.Student19.src.com.serg.zd2;

public class Boing {
    private int age;
    private static int coll = 200;

    public Boing(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /*public static class Draw {
        public static int getPassengers(){
            return coll;
        }
    }*/

    public static class Draw{
        private int id;
        public Draw(int id){
            this.id = id;
        }

        public static int getColl(){
             return coll;
        }

        @Override
        public String toString(){
            return "Drawing{ " +
                    "id = " + id +
                    '}';
        }
    }
}
