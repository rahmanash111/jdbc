package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Student;

public class StudentDao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public void save(Student s) {
		et.begin();
		em.persist(s);
		et.commit();
	}

	public Student findById(int id) {
		Student s = em.find(Student.class, id);
		if (s != null)
			return s;
		else
			return null;
	}

	public void delete(Student s) {
		et.begin();
		em.remove(s);
		et.commit();
	}
}
