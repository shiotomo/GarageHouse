package work.tomosse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import work.tomosse.model.db.Account;
import work.tomosse.model.db.AccountExample;

@Mapper
public interface AccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	long countByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int deleteByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int insert(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int insertSelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	List<Account> selectByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	Account selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int updateByPrimaryKeySelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table account
	 * @mbg.generated  Sun Dec 01 00:33:34 JST 2019
	 */
	int updateByPrimaryKey(Account record);
}
