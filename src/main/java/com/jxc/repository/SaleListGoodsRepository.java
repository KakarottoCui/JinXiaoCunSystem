package com.jxc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jxc.entity.SaleListGoods;

/**
 * 销售单商品Repository接口
 * @author Administrator
 *
 */
public interface SaleListGoodsRepository extends JpaRepository<SaleListGoods, Integer>,JpaSpecificationExecutor<SaleListGoods>{

	/**
	 * 根据销售单id查询所有销售单商品
	 * @param saleListId
	 * @return
	 */
	@Query(value="select * from t_sale_list_goods where sale_list_id=?1",nativeQuery=true)
	public List<SaleListGoods> listBySaleListId(Integer saleListId);
	
	/**
	 * 删除指定销售单的所有商品
	 * @param saleListId
	 */
	@Query(value="delete from t_sale_list_goods where sale_list_id=?1",nativeQuery=true)
	@Modifying
	public void deleteBySaleListId(Integer saleListId);
	
	/**
	 * 统计某个商品的销售总量
	 * @param goodsId
	 * @return
	 */
	@Query(value="SELECT SUM(num) AS total FROM t_sale_list_goods WHERE goods_id=?1",nativeQuery=true)
	public Integer getTotalByGoodsId(Integer goodsId);
	
}
