
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("1114");
		nico.setSalario(3000);
		nico.setSenha(2222);
		
		boolean aut = nico.autentica(2222);
		
		System.out.println(nico.getDados());
		System.out.println(nico.getBonificacao());
	}

}
