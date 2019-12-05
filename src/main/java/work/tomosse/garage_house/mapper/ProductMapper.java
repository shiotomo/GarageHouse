package work.tomosse.garage_house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.model.db.ProductExample;

@Mapper
public interface ProductMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	long countByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int deleteByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int insert(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int insertSelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	List<Product> selectByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	Product selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int updateByPrimaryKeySelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	int updateByPrimaryKey(Product record);
}