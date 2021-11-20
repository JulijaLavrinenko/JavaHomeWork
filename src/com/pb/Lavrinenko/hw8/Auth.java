package com.pb.Lavrinenko.hw8;
/*signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры.
Если логин не соответствует требованиям нужно выбросить WrongLoginException.
Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания.
Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)

- signIn (вход на сайт) принимающий login и password.
Проверяет что login и password соответствуют значениям из полей класса.
Если нет - выбрасывает исключение WrongLoginException.*/

public class Auth {
    private String login;
    private String password;

    private static final String LOGIN = "^[a-zA-Z0-9\\.]{5,20}$";
    private static final String PASS = "^[a-zA-Z0-9-_\\.]{5,}$";

    public Auth() {

    }

    void signUp(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {

        if (!login.matches(LOGIN)) {
            throw new WrongLoginException("Логин должен содержать от 5 до 20 символов латинского алфавита или цифр!");
        }

        if (!password.matches(PASS)) {
            throw new WrongPasswordException("Пароль должен содержать более 5 символов латинского алфавита или цифр, допускается знак подчеркивания!");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и пароль подтверждения не совпадают.");
        }

        this.login = login;
        this.password = password;
        System.out.println("Благодарим за регистрацию");
    }
    void signIn(String login, String password) throws WrongLoginException {
      if(login.equals(this.login) && password.equals(this.password)){
          System.out.println("Добро пожаловать в наш магазин");
      } else {
          throw new WrongLoginException("Логин или пароль неверен, попробуйте еще раз.");}

    }

}
