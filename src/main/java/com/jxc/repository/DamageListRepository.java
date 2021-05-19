package com.jxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.jxc.entity.DamageList;

/**
 * 报损单Repository接口
 * @author Administrator
 *
 */
public interface DamageListRepository extends JpaRepository<DamageList, Integer>,JpaSpecificationExecutor<DamageList>{

	/**
	 * 获取当天最大报损单号
	 * @return
	 */
	@Query(value="SELECT MAX(damage_number) FROM t_damage_list WHERE TO_DAYS(damage_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxDamageNumber();
}
