
public class Programa {

	//inicializando o Programa
	public static void main(String[] args) {
		//criando espaço para o objeto
		Filme f = new Filme(); 
		//atribuindo valores para o objeto 
		f.setCodigo(123);
		f.setNome("A Era do Gelo");
		f.setValor(2.50);

		//chamando função de devolver filme
		f.devolver();
		
		//chamando função  que mostra informações do filme
		f.mostra();
		
		//chamando função que retira o filme
		f.retirar();
		
		//chamando função que mostra informações do filme
		f.mostra();
		
		//n faço idéa
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
