package roteiro5.parte2;

public class Principal {
    
    public static void main(String[] args) {
        
        Loja loja01 = new Loja("LL Financeira", "Lucas Lopes Financeira LTDA", "4509884000149");
        Loja loja02 = new Loja("TS Advocacia", "3929885000140");
        Loja loja03 = new Loja("LL Financeira", "Lucas Lopes Financeira LTDA",  "4509884000149");
        
        loja01.setValorFat(31256.85);
        loja02.setValorFat(35993.80);
        loja03.setValorFat(31256.85);
        
        /*
        System.out.println("Informações da loja:");
        System.out.println("Nome fantasia: " + loja01.getNomeFantasia());
        System.out.println("Razão Social: " +  loja01.getRazaoSocial());
        System.out.println("CNPJ: " + loja01.getCnpj());
        
        System.out.println("Informações da loja:");
        System.out.println("Nome fantasia: " + loja02.getNomeFantasia());
        System.out.println("Razão Social: " +  loja02.getRazaoSocial());
        System.out.println("CNPJ: " + loja02.getCnpj());
        */
        
        System.out.println("|||||||||| TESTE 1 ||||||||||");
        if (loja01.getNomeFantasia() == loja03.getNomeFantasia()) {
            System.out.println("Lojas iguais \n");
        } else {
            System.out.println("Lojas diferentes \n");
        }
        
        System.out.println("|||||||||| TESTE 2 ||||||||||");
        if (loja01.getNomeFantasia().equals(loja03.getNomeFantasia())) {
            System.out.println("Lojas iguais \n");
        } else {
            System.out.println("Lojas diferentes \n");
        }
        
        System.out.println("|||||||||| TESTE 3 ||||||||||");
        if (loja01 == loja03) {
            System.out.println("Lojas iguais \n");
        } else {
            System.out.println("Lojas diferentes \n");
        }
        
        System.out.println("|||||||||| TESTE 4 ||||||||||");
        if (loja01.equals(loja03)) {
            System.out.println("Lojas iguais \n");
        } else {
            System.out.println("Lojas diferentes \n");
        }
        
        System.out.println("|||||||||| TESTE 5 ||||||||||");
        if (loja01.getValorFat() == loja03.getValorFat()) {
            System.out.println("Faturamentos iguais \n");
        } else {
            System.out.println("Faturamentos diferentes \n");
        }
        
        /*
        System.out.println("|||||||||| TESTE 6 ||||||||||");
        if (loja01.getValorFat().equals(loja03.getValorFat())) {
            System.out.println("Faturamentos iguais \n");
        } else {
            System.out.println("Faturamentos diferentes \n");
        }
        */
        
        // O EQUALS NÃO DIFERENCIA VALORES NUMÉRICOS!
    }
}
