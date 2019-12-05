package work.tomosse.garage_house.model.db;

import java.util.Date;

public class ColumnManage {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.product_id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.column_type
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private String columnType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.created_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Long createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.updated_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Long updatedBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column column_manage.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.id
	 * @return  the value of column_manage.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.id
	 * @param id  the value for column_manage.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.product_id
	 * @return  the value of column_manage.product_id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.product_id
	 * @param productId  the value for column_manage.product_id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.column_type
	 * @return  the value of column_manage.column_type
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public String getColumnType() {
		return columnType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.column_type
	 * @param columnType  the value for column_manage.column_type
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setColumnType(String columnType) {
		this.columnType = columnType == null ? null : columnType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.created_by
	 * @return  the value of column_manage.created_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.created_by
	 * @param createdBy  the value for column_manage.created_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.updated_by
	 * @return  the value of column_manage.updated_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Long getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.updated_by
	 * @param updatedBy  the value for column_manage.updated_by
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.created_at
	 * @return  the value of column_manage.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.created_at
	 * @param createdAt  the value for column_manage.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column column_manage.updated_at
	 * @return  the value of column_manage.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column column_manage.updated_at
	 * @param updatedAt  the value for column_manage.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}