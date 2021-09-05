package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.User;
import utils.JpaUtils;

public class UserDao {
	public void insert(User u) {
		EntityManager em = JpaUtils.getEntityManager();

		// sau khi lấy được entity thì từ đó tạo ra Transaction
		// Transaction dùng trong TH thêm sửa xóa, còn lại thì kh cần dùng
		EntityTransaction tran = em.getTransaction();

		try {
			tran.begin();

			em.persist(u);

			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tran.rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	public void update(User u) {
		EntityManager em = JpaUtils.getEntityManager();

		// sau khi lấy được entity thì từ đó tạo ra Transaction
		// Transaction dùng trong TH thêm sửa xóa, còn lại thì kh cần dùng
		EntityTransaction tran = em.getTransaction();

		try {
			tran.begin();

			em.merge(u);

			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tran.rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	public void delete(String uid) throws Exception {
		EntityManager em = JpaUtils.getEntityManager();

		// sau khi lấy được entity thì từ đó tạo ra Transaction
		// Transaction dùng trong TH thêm sửa xóa, còn lại thì kh cần dùng
		EntityTransaction tran = em.getTransaction();

		try {
			tran.begin();

			User u = em.find(User.class, uid);

			if (u != null) {
				em.remove(u);
			} else {
				throw new Exception("Không tìm thấy");
			}

			tran.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tran.rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	public User findById(String uid) throws Exception {
		EntityManager em = JpaUtils.getEntityManager();

		User u = em.find(User.class, uid);

		if (u != null) {
			return u;
		} else {
			throw new Exception("Không tìm thấy");
		}
	}
	
	public List<User> getAllUsers(){
		EntityManager em = JpaUtils.getEntityManager();
		
		TypedQuery<User> query = em.createNamedQuery("User.findAll", User.class);
		
		return query.getResultList(); // trả về kết quả
	}

	
}
