package com.jxc.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.jxc.entity.ReturnList;
import com.jxc.entity.ReturnListGoods;

/**
 * 退货单Service接口
 *
 *
 */
public interface ReturnListService {

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public ReturnList findById(Integer id);
	
	/**
	 * 获取当天最大退货单号
	 * @return
	 */
	public String getTodayMaxReturnNumber();
	
	/**
	 * 添加退货单 以及所有退货单商品
	 * @param returnList 退货单
	 * @param ReturnListGoodsList 退货单商品
	 */
	public void save(ReturnList returnList,List<ReturnListGoods> returnListGoodsList);
	
	/**
	 * 根据条件查询退货单信息
	 * @param returnList
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<ReturnList> list(ReturnList returnList,Direction direction,String... properties);
	
	/**
	 * 根据id删除退货单信息 包括退货单里的商品
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 更新退货单
	 * @param returnList
	 */
	public void update(ReturnList returnList);
}
