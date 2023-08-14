
package br.edu.ifsul.bcc.too.topico3;

// import java.lang.*;

/**
 *
 * @author telmo Junior
 * @data 31/03/22021
 */
public class ProjetoBaseTOO {
    
    //Atributos da instância
    
    //protected : acesso somente dentro do pacote
    //privado : acesso somente dentro da classe
    
    //métodos (funções): acessibilidade, retorno, nome, parâmetros.
    //nome e parâmetros compõem a assinatura do método.
    
    private Integer atributoPrimeiro;
    
    float calculaMedia(float p1, float p2) {
        return (p1 + p2) / 2f;
    }
    
    private float calculaMedia(String pla, String p2b) {
        return (pla + p2b) / 2f;
    }
    
    public static void main(String[] args) {
    
        /*Variáveis: 
            As variáveis são posições na memória do computador que podem armazenar dados. 
            As variáveis são formadas por quatro elementos: nome, tipo, tamanho e valor. 
            Dependendo da programação, o básico de uma declaração de variável pode ter somente um tipo, um nome e um valor.    
        */

        int a;
        int b = 0;
        float c = 1;
        String d = "";
        int[] vetor;
        vetor = new int[10];
        int[] array = {1,2,3};
        char e;
        e = 'A';
        boolean t;

        System.out.println(c);
        
        Float m = calculaMedia(1,2);
        
        imprimeDados(m.toString());
        
    }
    
    private static void imprimeDados(String dados){
        
        System.out.println(dados);
    }
    
    private static Float calculaMedia(Integer p1, Integer p2){
        
        return (p1 + p2) / 2f;
        
    }
}

   