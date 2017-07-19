package spittr.db;

import java.util.List;

import spittr.domain.Spittle;

//混合自定义
public interface SpittleRepositoryCustom {

	List<Spittle> findRecent();

	List<Spittle> findRecent(int count);

}