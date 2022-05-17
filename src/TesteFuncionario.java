
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente nico = new Gerente();
		Funcionario ge = new Funcionario();
		Editor ed = new Editor();
		
		ed.setNome("Ed");
		ed.setSalario(2000);
		
		ge.setNome("Geraldo");
		ge.setSalario(1000);
		
		nico.setNome("Nico");
		nico.setSalario(1500);
		
		ControleBonificacao ctrl = new ControleBonificacao();
		ctrl.registra(nico);
		ctrl.registra(ge);
		ctrl.registra(ed);
		
		System.out.println(ctrl.getSoma());
	}

}
