package roteiro5.parte1;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Loja loja01 = new Loja("MM Construções", "MM Construções LTDA", "4509884000149");
        Loja loja02 = new Loja("Luís Castro Financeira", "", "3929885000257");
        
        System.out.println("Informações da loja:");
        System.out.println("Nome fantasia: " + loja01.getNomeFantasia());
        System.out.println("Razão Social: " +  loja01.getRazaoSocial());
        System.out.println("CNPJ: " + loja01.getCnpj());
        
        System.out.println("Informações da loja:");
        System.out.println("Nome fantasia: " + loja02.getNomeFantasia());
        System.out.println("Razão Social: " +  loja02.getRazaoSocial());
        System.out.println("CNPJ: " + loja02.getCnpj());
        
    }
}
