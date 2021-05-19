package com.jxc.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.jxc.entity.Goods;

/**
 * 商品Service接口
 *
 *
 */
public interface GoodsService {

	
	/**
	 * 根据id查询商品实体
	 * @param id
	 * @return
	 */
	public Goods findById(Integer id);
	
	/**
	 * 修改或者修改商品信息
	 * @param goods
	 */
	public void save(Goods goods);
	
	/**
	 * 根据条件分页查询商品信息
	 * @param goods
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<Goods> list(Goods goods,Integer page,Integer pageSize,Direction direction,String... properties);
	
	/**
	 * 根据商品编码或者名称分页查询没有库存的商品信息
	 * @param codeOrName
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<Goods> listNoInventoryQuantityByCodeOrName(String codeOrName,Integer page,Integer pageSize,Direction direction,String... properties);
	
	/**
	 * 分页查询有库存的商品信息
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<Goods> listHasInventoryQuantity(Integer page,Integer pageSize,Direction direction,String... properties);
	
	/**
	 * 获取总记录数
	 * @param goods
	 * @return
	 */
	public Long getCount(Goods goods);
	
	/**
	 * 根据商品编码或者名称查询没有库存的商品信息信息总记录数
	 * @param codeOrName
	 * @return
	 */
	public Long getCountNoInventoryQuantityByCodeOrName(String codeOrName);
	
	/**
	 * 查询有库存的商品信息信息总记录数
	 * @param codeOrName
	 * @return
	 */
	public Long getCountHasInventoryQuantity();
	
	/**
	 * 根据id删除商品
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 获取最大的商品编号
	 * @return
	 */
	public String getMaxGoodsCode();
	
	/**
	 * 查询库存报警商品 库存小于库存下限的商品
	 * @return
	 */
	public List<Goods> listAlarm();
	

}
