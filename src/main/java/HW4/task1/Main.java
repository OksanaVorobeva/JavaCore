package HW4.task1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println(passwordCheck("jjjjjjj","126","123"));

    }

    public  static  boolean passwordCheck( String login, String passwords, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length()>=20){
            throw new WrongLoginException("Логин должен быть меньше 20 символов");
        }
        if(passwords.length()>=20){
            throw new WrongPasswordException("Пароль должен быть менее 20 символов");
        }
        if (passwords!=confirmPassword){
            throw  new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }


}
