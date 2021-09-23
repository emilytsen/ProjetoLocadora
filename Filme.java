//instanciando a classe Filme
public class Filme {
	//criando variáveis privadas (atributos)
	private int codigo;
	private String nome;
	private double valor;
	private boolean disponivel;

	//pegando variável código e mostrando de forma segura
	public int getCodigo() {
		return codigo;
	}

	//colando valor definido na variável
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//pegando variável nome e mostrando de forma segura
	public String getNome() {
		return nome;
	}

	//colando valor definido na variável
	public void setNome(String nome) {
		this.nome = nome;
	}

	//pegando variável valor e mostrando de forma segura
	public double getValor() {
		return valor;
	}

	//colando valor definido na variável
	public void setValor(double valor) {
		this.valor = valor;
	}

	//pegando variável disponivel e mostrando de forma segura
	public boolean isDisponivel() {
		return disponivel;
	}

	//colando valor definido na variável
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	//criando função retirar
	public void retirar() {
		//condicionando a dispodinilidade do filme
		if(disponivel == true) {
			disponivel = false;
		}else{
			throw new RuntimeException("Este filme n�o est� dispon�vel para loca��o!");
		}
				
	}

	//disponibilizando o livro após a devolução
	public void devolver() {
		disponivel = true;
	}
	
	//mostrando informações do filme
	public void mostra(){
		//comando pra aparecer no terminal
		System.out.println("C�digo do filme:" + this.codigo);
		System.out.println("Nome do filme:" + this.nome);
		System.out.println("Valor: R$" + this.valor);		
		System.out.println("Dispon�vel:" + this.disponivel);
	}
	

}
