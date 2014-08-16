package br.com.projetofinal.controle;


import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.projetofinal.hibernate.HibernateUtil;
import br.com.projetofinal.modelo.Produto;

@Resource
public class ProdutoController {
	
		private Result result;
		private Validator validator;
		
		
		public ProdutoController(Result result, Validator validator){
			this.result = result;
			this.validator = validator;
		}
		
	public void acessarProduto(){
		
	}
	
		
	public void salvar(Produto produto){
		
		validarProduto(produto);
		
		HibernateUtil.salvarOuAtualizar(produto);
		
	}

	
	private void validarProduto(Produto produto) {
		if(produto.getNome() == null){
			
			validator.add(new ValidationMessage("Ops...o campo item precisa ser preenchido", "Erro"));
			validator.onErrorRedirectTo(this).acessarProduto();
			
		}
		
		if(produto.getBreveDescricao() == null){
			validator.add(new ValidationMessage("Ops...o campo breve descricao precisa ser preenchido", "Erro"));
			validator.onErrorRedirectTo(this).acessarProduto();
		}
		
		if(produto.getValorInicialLeilão() == null){
			validator.add(new ValidationMessage("Ops...o campo valor inicial para Leilão precisa ser preenchido", "Erro"));
			validator.onErrorRedirectTo(this).acessarProduto();
		}
		result.redirectTo(this).acessarProduto();
	}
}
