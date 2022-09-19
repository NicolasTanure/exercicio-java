
/**
 * Uma escola está interessada no uso do WhatsApp pelos alunos para fins educacionais. Para isso, ela entrevistou vários alunos e coletou os seguintes dados: idade, quantidade de grupos de estudo no WhatsApp que o aluno participa e tempo diário (estimado) em minutos que aluno usa (interage nos grupos) o WhatsApp para estudar. Faça um programa que leia os dados necessários e informe (escreva na tela) o que a escola deseja saber: 

(a) Percentual de alunos que usam o WhatsApp por mais de uma hora ao dia para estudar. 

(b) Idade média dos alunos que usam o WhatsApp para estudar. 

(c) Maior tempo (em hora e minuto) gasto no WhatsApp por um aluno para estudar. 

(d) Idade do aluno que participa de mais grupos.

Defina uma condição de parada para que sejam informados dados de tantos alunos quantos o usuário do programa desejar.
 * 
 * @author Nicolas Tanure Miszczuk
 * @version (Yagami)
 */
import java.util.Scanner;
public class Trabalho{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int alunosavaliados,idade,gruposzap,tempoMin,a=0,maior=0,soma=0,hora,minutos,maiorzap=0,respostaD=0;
        double respostaA,alunos=0,respostaB;
        System.out.println("informe a quantidade de alunos que serão avaliados:");
        alunosavaliados=teclado.nextInt();
        while(alunos<alunosavaliados){
        System.out.println("informe a idade:");
        idade=teclado.nextInt();
        System.out.println("informe a quantidade de grupos de estudo no WhatsApp que o aluno participa:");
        gruposzap=teclado.nextInt();
        System.out.println("informe o tempo diário em minutos que o aluno usa o WhatsApp para estudar:");
        tempoMin=teclado.nextInt();
        alunos=alunos+1;
        soma=idade+soma;
        if(tempoMin>60)a=a+1;
        if(tempoMin>maior) maior = tempoMin;
        if(gruposzap>maiorzap) maiorzap=gruposzap;
        if(maiorzap==gruposzap)respostaD=idade;
         }
        
        
               respostaA=(a/alunos)*100.00;
           System.out.printf("Percentual de alunos que usam o WhatsApp por mais de uma hora ao dia para estudar:%.2f",respostaA);
           System.out.println("%");
           respostaB=(soma/alunos);
           System.out.println("Idade média dos alunos que usam o WhatsApp para estudar: "+respostaB+" anos");
           hora=(maior/60);
           minutos=(maior%60);
           System.out.print("Maior tempo (em hora e minuto) gasto no WhatsApp por um aluno para estudar:");
           System.out.println(hora+" hora(s) e "+ minutos+" minuto(s)");
           System.out.println("Idade do aluno que participa de mais grupos: "+respostaD+" anos");
}
}