package com.jxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.jxc.entity.PurchaseList;

/**
 * 进货单Repository接口
 * @author Administrator
 *
 */
public interface PurchaseListRepository extends JpaRepository<PurchaseList, Integer>,JpaSpecificationExecutor<PurchaseList>{

	/**
	 * 获取当天最大进货单号
	 * @return
	 */
	@Query(value="SELECT MAX(purchase_number) FROM t_purchase_list WHERE TO_DAYS(purchase_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxPurchaseNumber();
}
