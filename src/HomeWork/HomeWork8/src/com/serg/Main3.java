package HomeWork.HomeWork8.src.com.serg;

public class Main3 {
    public static void main(String[] args) {
    System.out.println("Таблица умножения");
    tablica();
    }

    static void tablica() {
        int [][] mass = new int[15][3];
        for(int i =0;i<mass.length;i++){
            for(int j=0;j<mass[i].length;j++){
                mass[i][j]=(int)(Math.random()*8)+2;
                if(j==mass[i].length-1){
                    mass[i][j]=mass[i][j-2]*mass[i][j-1];
                    for(int h=0;h<i;h++){
                        if(mass[i][j] == mass[h][j]){
                            if(mass[i][j-1]==mass[h][j-1]||mass[i][j-2]==mass[h][j-2])
                                --i;
                        }
                    }
                }
            }
        }
        for(int i=0;i<mass.length;i++){
            System.out.print("Задание №"+(i+1+" Сколько будет "));
            for(int j=0;j<mass[i].length;j++){
                if(j==0)
                    System.out.print(mass[i][j]+" * ");
                if(j==1)
                    System.out.println(mass[i][j]);
            }
        }
    }
}
