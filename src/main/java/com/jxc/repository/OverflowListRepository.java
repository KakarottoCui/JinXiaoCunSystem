package com.jxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.jxc.entity.OverflowList;

/**
 * 报溢单Repository接口
 * @author Administrator
 *
 */
public interface OverflowListRepository extends JpaRepository<OverflowList, Integer>,JpaSpecificationExecutor<OverflowList>{

	/**
	 * 获取当天最大报溢单号
	 * @return
	 */
	@Query(value="SELECT MAX(overflow_number) FROM t_overflow_list WHERE TO_DAYS(overflow_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxOverflowNumber();
}
