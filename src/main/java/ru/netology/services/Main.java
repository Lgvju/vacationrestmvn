package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VacationRestService service = new VacationRestService();
        int expected = 3;
        int actual = service.calculate(10000,3000,20000);
     //   System.out.println(expected,actual);
    }
}
