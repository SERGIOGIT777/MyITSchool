package Lesson.Student19.src.com.serg.zd2;

public class Phone {
    private static String phoneNumberPrivate = "[0 - 9]";
    public void validatePhoneNumber(String number){
        String belarusianCountryCod = "+375";
        //Локальный класс
        class PhoneNumber{
            private String phoneNumber;

            public PhoneNumber(){
                this.phoneNumber = number;
            }

            public void printBelarusianCountryCod(){
                System.out.println(belarusianCountryCod);
            }

            public String getPhoneNumberPrivate(){
                return phoneNumberPrivate;
            }
        }
    }


}
