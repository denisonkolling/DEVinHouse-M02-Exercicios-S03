package org.example.ex02ConstrutoresSobrecarga;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João");
        System.out.println("Nome: " + funcionario1.getNome() + ", Salário: " + funcionario1.getSalario());

        Funcionario funcionario2 = new Funcionario("Maria", 2000.0f);
        System.out.println("Nome: " + funcionario2.getNome() + ", Salário: " + funcionario2.getSalario());

        funcionario1.aumentar(500.0f);
        System.out.println("Novo salário de " + funcionario1.getNome() + ": " + funcionario1.getSalario());

        funcionario2.aumentar(10.0f, 50.0f);
        System.out.println("Novo salário de " + funcionario2.getNome() + ": " + funcionario2.getSalario());
    }
}

