/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. 
 * Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
 * deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem
 * e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.

 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário
 * possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação
 * de aumento por porcentagem dada.
 */

package entities;

/**
 *
 * @author Andressa Silva
 */
public class Employee {
    
    private Integer id;
    private String name;
    private Double salary;
    
    public Employee(){
    }
    
    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Double getSalary(){
        return salary;
    }
    
    public void IncreaseSalary(double percentage){
        // this.salary = salary * percentage + salary;
        salary += salary * percentage / 100.0;
    }
    
    public String toString(){
        return "Id: " + id + ", name: " + name + ", salary: $ "+ salary;
    }
}