package br.com.projetofinal.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static Session sessao;
	
	public static void inicializaSessionFactory(){
		
		if (sessionFactory == null) {

			Configuration configuration = new Configuration();

			sessionFactory = configuration.configure().buildSessionFactory();
		}
		
	}

	public static void abrirSessao(){
		
		if (sessao == null || !sessao.isOpen()) {

			sessao = sessionFactory.openSession();
		}
		
	}
	
	public static void salvarOuAtualizar(Object objeto){
		
		inicializaSessionFactory();
		
		abrirSessao();
		sessao.beginTransaction();
		
		sessao.save(objeto);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	
	public static void deletar(Object objeto){
		
		inicializaSessionFactory();
		
		abrirSessao();
		sessao.beginTransaction();
		
		sessao.delete(objeto);
		sessao.getTransaction().commit();
	}
	
	public static List listar(Object objeto) {

		abrirSessao();

		Criteria criteria = sessao.createCriteria(objeto.getClass());

		return criteria.list();
	}
}
