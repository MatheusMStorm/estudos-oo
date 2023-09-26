package roteiro8.parte3;

public class Principal {
    
    public static void main(String[] args) {
        VeiculoCarga v01 = new VeiculoCarga("PKR0155", 2020, 5000);
        Cliente c01 = new Cliente("86238601523", "Matheus", "Rua do Tororó", "mouracostacosta03@outlook.com", "983003190", v01);

        System.out.println("Nome: " + c01.getNome());
        System.out.println("CPF ou CNPJ: " + c01.getCpf_cnpj());
        System.out.println("Endereço: " + c01.getEndereco());
        System.out.println("E-mail: " + c01.getEmail());
        System.out.println("Telefone: " + c01.getTelefone());
        System.out.println("Valor de pedágio a pagar: " + c01.getVeiculoPessoal().calcPedagio());


    }
}
