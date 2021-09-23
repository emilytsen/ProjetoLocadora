//instanciando a classe Filme
public class Filme {
	//criando variável privada (atributo) codigo
	private int codigo;
	//criando variável privada (atributo) nome
	private String nome;
	//criando variável privada (atributo) valor
	private double valor;
	//criando variável privada (atributo) disponivel
	private boolean disponivel;

	//criando um método
	public int getCodigo() {
		//pegando variável código e mostrando de forma segura
		return codigo;
	}

	//criando um método
	public void setCodigo(int codigo) {
		//colando valor definido na variável
		this.codigo = codigo;
	}

	//criando um método
	public String getNome() {
		//pegando variável nome e mostrando de forma segura
		return nome;
	}

	//criando um método
	public void setNome(String nome) {
		//colando valor definido na variável
		this.nome = nome;
	}

	//criando um método
	public double getValor() {
		//pegando variável valor e mostrando de forma segura
		return valor;
	}

	//criando um método
	public void setValor(double valor) {
		//colando valor definido na variável
		this.valor = valor;
	}

	//criando um método
	public boolean isDisponivel() {
		//pegando variável disponivel e mostrando de forma segura
		return disponivel;
	}

	//criando um método
	public void setDisponivel(boolean disponivel) {
		//colando valor definido na variável
		this.disponivel = disponivel;
	}

	
	//criando método retirar
	public void retirar() {
		//condicionando a dispodinilidade do filme
		if(disponivel == true) {
			//se true vai alugar
			disponivel = false;
		}else{
			//se false vai alertar a indisponibilade
			throw new RuntimeException("Este filme n�o est� dispon�vel para loca��o!");
		}
				
	}

	//criando um método de devolução
	public void devolver() {
		//disponibilizando o livro após a devolução
		disponivel = true;
	}
	
	//mostrando informações do filme através do método
	public void mostra(){
		//comando pra aparecer no terminal
		System.out.println("C�digo do filme:" + this.codigo); //mostrar código
		System.out.println("Nome do filme:" + this.nome); //mostrar nome
		System.out.println("Valor: R$" + this.valor); //mostrar valor
		System.out.println("Dispon�vel:" + this.disponivel); //mostrar disponibilidade
	}
	

}
