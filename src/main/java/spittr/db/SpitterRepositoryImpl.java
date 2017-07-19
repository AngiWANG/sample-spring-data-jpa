package spittr.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//混合自定义
public class SpitterRepositoryImpl implements SpitterRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	public int eliteSweep() {
		String update = "UPDATE Spitter spitter " + "SET spitter.status = 'Elite' " + "WHERE spitter.status = 'Newbie' "
				+ "AND spitter.id IN (" + "SELECT s FROM Spitter s WHERE ("
				+ "  SELECT COUNT(spittles) FROM s.spittles spittles) > 10000" + ")";
		return em.createQuery(update).executeUpdate();
	}

}
