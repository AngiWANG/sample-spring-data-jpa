package spittr.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spittr.domain.Spittle;

/**
 * Repository interface with operations for {@link Spittle} persistence.
 * 
 * @author habuma
 */
public interface SpittleRepository extends JpaRepository<Spittle, Long>, SpittleRepositoryCustom {
	// begin 自定义查询方法
	List<Spittle> findBySpitterId(long spitterId);
	// end 自定义查询方法
}
