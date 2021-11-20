package com.pb.Lavrinenko.hw8;
import java.util.Scanner;
/*В main создать один объект класса Auth.
Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
Обработать исключения методов signUp signIn с помощью блоков try-catch.*/

public class OnlineShop {
    private static Scanner scanner;
    private static boolean isReg;

    public static void main(String[] args) {
        System.out.print("Зарегистрироваться.\nВведите логин: ");
        isReg = true;
        Auth auth = new Auth();
        try {
            Scanner sc = new Scanner(System.in);
            String login = sc.nextLine();
            System.out.print("Введите пароль: ");
            String password = sc.nextLine();
            System.out.print("Подтвердите пароль: ");
            String confirmPassword = sc.nextLine();
            auth.signUp(login, password, confirmPassword);
            scanner = sc;
        } catch (WrongLoginException e) {
            e.printStackTrace();
            isReg = false;
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            isReg = false;
        }

        if (isReg) {

            System.out.print("\nВедите Ваш логин: ");
            try (Scanner sc = scanner) {
                String prlogin = sc.nextLine();
                System.out.print("Введите Ваш пароль: ");
                String prPass = sc.nextLine();
                auth.signIn(prlogin, prPass);
            } catch (WrongLoginException e) {
                e.printStackTrace();
            }
        }

    }
}
