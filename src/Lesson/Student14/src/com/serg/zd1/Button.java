package Lesson.Student14.src.com.serg.zd1;

public class Button {
    ClickButton click;
    Button(ClickButton action){
        this.click = action;
    }

    public void click(){
        click.execute();
    }

}
