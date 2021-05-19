package com.jxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.jxc.entity.CustomerReturnList;

/**
 * 客户退货单Repository接口
 * @author Administrator
 *
 */
public interface CustomerReturnListRepository extends JpaRepository<CustomerReturnList, Integer>,JpaSpecificationExecutor<CustomerReturnList>{

	/**
	 * 获取当天最大客户退货单号
	 * @return
	 */
	@Query(value="SELECT MAX(customer_return_number) FROM t_customer_return_list WHERE TO_DAYS(customer_return_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxCustomerReturnNumber();
}
