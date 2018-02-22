/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves Bodê
 */
public class Funcionario extends Pessoa{
    
    public Funcionario(String nome, int sexo) {
        super(nome, sexo);
    }
    
    private int matricula;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FICHA DO FUNCIONARIO \nNome: "   + this.getNome()
                                                 + "\nMatricula: " + this.getMatricula()
                                                 + "\nSexo: "      + this.getSexo()
                                                 + "\nSalario: "   + this.getSalario();
    }
    
    
    
}
