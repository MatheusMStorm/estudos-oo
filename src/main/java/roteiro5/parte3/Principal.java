package roteiro5.parte3;

public class Principal {
    
    public static void main(String[] args) {
        
        Loja loja01 = new Loja("LL Financeira", "Lucas Lopes Financeira LTDA", "4509884000149");
        Loja loja02 = new Loja("TS Advocacia", "3929885000140");
        Loja loja03 = new Loja("LL Financeira", "Lucas Lopes Financeira LTDA",  "4509884000149");
        
        loja01.setValorFat(31256.85);
        loja02.setValorFat(35993.80);
        loja03.setValorFat(31256.85);
        
        /*
        System.out.println("Método estático");
        Loja.compararFatLojas_static(loja01, loja02);
        
        System.out.println("Método não estático");
        loja02.compararFatLojas_naoStatic(loja01);
        
        System.out.println("Método não estático");
        loja01.compararFatLojas_naoStatic(loja02);
        */
        
        // Exercício
        // Como a questão pede para retornar A LOJA, o objeto todo deve ser inserido.
        System.out.println("Teste 1");
        System.out.println(Loja.compararFatLojas_static2(loja01, loja02).getNomeFantasia());
        System.out.println(Loja.compararFatLojas_static2(loja01, loja02).getRazaoSocial());
        System.out.println(Loja.compararFatLojas_static2(loja01, loja02).getCnpj());
        
        System.out.println();
        
        System.out.println("Teste 2");
        System.out.println(loja02.compararFatLojas_naoStatic2(loja01).getNomeFantasia());
        System.out.println(loja02.compararFatLojas_naoStatic2(loja01).getRazaoSocial());
        System.out.println(loja02.compararFatLojas_naoStatic2(loja01).getCnpj());
        
        System.out.println();
        
        System.out.println("Teste 3");
        System.out.println(loja01.compararFatLojas_naoStatic2(loja02).getNomeFantasia());
        System.out.println(loja01.compararFatLojas_naoStatic2(loja02).getRazaoSocial());
        System.out.println(loja01.compararFatLojas_naoStatic2(loja02).getCnpj());
    }
}
