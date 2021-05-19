package com.jxc.service;

import java.util.List;

import com.jxc.entity.CustomerReturnListGoods;

/**
 * 客户退货单商品Service接口
 *
 *
 */
public interface CustomerReturnListGoodsService {

	/**
	 * 根据客户退货单id查询所有客户退货单商品
	 * @param customerReturnListId
	 * @return
	 */
	public List<CustomerReturnListGoods> listByCustomerReturnListId(Integer customerReturnListId);

	/**
	 * 统计某个商品的客户退货总量
	 * @param goodsId
	 * @return
	 */
	public Integer getTotalByGoodsId(Integer goodsId);
	
	/**
	 * 根据条件查询客户退货单商品
	 * @param customerReturnListGoods
	 * @return
	 */
	public List<CustomerReturnListGoods> list(CustomerReturnListGoods customerReturnListGoods);
	
	
}
