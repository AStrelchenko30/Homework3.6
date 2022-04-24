package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int age =19 ;
        int salary =58_000 ;
        if(age>=23) {
            salary*=3;
        }else if (age<23){
            salary *= 2;
        }
        if (salary>=50_000){
            salary*=1.2;
        }else if(salary>=80_000) {
            salary *= 1.5;
        }
        int kreditLimit=salary;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+kreditLimit+" рублей");
    }
}
