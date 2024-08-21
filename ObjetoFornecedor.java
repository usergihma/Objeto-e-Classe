package aula21_08;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setId(124);
		fornecedor1.setRazaoSocial("Serviço Socialo da Industria");
		fornecedor1.setNomeFantasia("SESI");
		fornecedor1.setCnpj("12345678901");
		fornecedor1.setEndereço("Padre Antonia Brunetti");
		fornecedor1.setFone("888-888-888-8");
		fornecedor1.setEmail("sesisenai@gmail.com");
		fornecedor1.setInscricaoEstadual("1234567");
		System.out.println("-------------------------");
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getRazaoSocial());
		System.out.println(fornecedor1.getNomeFantasia());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereço());
		System.out.println(fornecedor1.getFone());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getInscricaoEstadual());
	}
}
