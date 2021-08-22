package Lesson.Student19.src.com.serg.zd2;

public class Main {

    public static void main(String[] args) {
	/*for(int i=1; i< 6; i++){
        Boing.Draw draw = new Boing.Draw(i);
        System.out.println(draw);
    }
*/
        /*GeneralIndicatorMonitiring genralModul = new GeneralIndicatorMonitiring();
        ErrorMonitoring errorModul = new ErrorMonitoring();
        SecurityMonitoring securityModul = new SecurityMonitoring();

         */

 /*       genralModul.startMonitoring();
        errorModul.startMonitoring();
        securityModul.startMonitoring();

  */
        MonitoringSystem generalModule = () -> System.out.println("Мониторинг общих показателей начал работу");
        MonitoringSystem errorModule = () -> System.out.println("Мониторинг ошибок начал работу");
        MonitoringSystem securityModule = () -> System.out.println("Мониторинг безопасности начал работу");

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

    }
}
