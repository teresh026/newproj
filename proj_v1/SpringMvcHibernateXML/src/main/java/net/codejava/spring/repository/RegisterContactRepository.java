package net.codejava.spring.repository;

import net.codejava.spring.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RegisterContactRepository {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getUsername() {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM userdb b")
				.list();
	}
	
	public void registerContact(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
}
