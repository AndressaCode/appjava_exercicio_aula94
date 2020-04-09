/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
 * deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem
 * e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.

 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário
 * possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação
 * de aumento por porcentagem dada.
 */

package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program_aula94 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        
        List<Employee> list = new ArrayList<>(n);
        Employee emp = new Employee();
        
        for(int i=0; i<n; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.printf("%n%n");
            
            list.add(new Employee(id, name, salary));
        }
        System.out.println("List of employees: " + list);
        
        System.out.println();
        System.out.print("Enter the employee id to receive a salary increase: ");
        int id = sc.nextInt();
        // verificar se esse id existe
        emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.print("This employee id does not exist! ");
        } else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.IncreaseSalary(percentage);
        }
        System.out.println();
        for(Employee obj : list){
            System.out.println("List of employees: " + list);
        }
        sc.close();
    }
}