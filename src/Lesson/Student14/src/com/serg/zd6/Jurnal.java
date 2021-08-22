package Lesson.Student14.src.com.serg.zd6;

public class Jurnal implements Cloneable{
    private String name;
    private Izdatalstvo isdatel;

    public void setName(String m) {
        name = m;
    }

    public String getName(){
        return name;
    }

    public void setIsdatel(String n){
        isdatel.setName(n);
    }

    public String getIsdatel(){
        return isdatel.getName();
    }

    Jurnal(String name, String isdatel) {
        this.name = name;
        this.isdatel = new Izdatalstvo(isdatel);
    }

    public String toString(){
        return "Журнал " + name + "' (издательство " + isdatel + ")";
    }

    public Jurnal clone() throws CloneNotSupportedException{
        Jurnal newJurnal = (Jurnal) super.clone();
        newJurnal.isdatel = isdatel.clone();
        return newJurnal;
    }
}
