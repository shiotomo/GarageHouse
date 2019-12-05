package work.tomosse.garage_house.model.db;

import java.util.Date;

public class AccountProduct {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.permission
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Integer permission;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.account_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Long accountId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.product_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.created_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Long createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.updated_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Long updatedBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.created_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account_product.updated_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.id
	 * @return  the value of account_product.id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.id
	 * @param id  the value for account_product.id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.permission
	 * @return  the value of account_product.permission
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Integer getPermission() {
		return permission;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.permission
	 * @param permission  the value for account_product.permission
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.account_id
	 * @return  the value of account_product.account_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.account_id
	 * @param accountId  the value for account_product.account_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.product_id
	 * @return  the value of account_product.product_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.product_id
	 * @param productId  the value for account_product.product_id
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.created_by
	 * @return  the value of account_product.created_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.created_by
	 * @param createdBy  the value for account_product.created_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.updated_by
	 * @return  the value of account_product.updated_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Long getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.updated_by
	 * @param updatedBy  the value for account_product.updated_by
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.created_at
	 * @return  the value of account_product.created_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.created_at
	 * @param createdAt  the value for account_product.created_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account_product.updated_at
	 * @return  the value of account_product.updated_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account_product.updated_at
	 * @param updatedAt  the value for account_product.updated_at
	 * @mbg.generated  Thu Dec 05 15:40:54 JST 2019
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}