package work.tomosse.model.db;

import java.util.Date;

public class Content {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.column_manage_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Long column_manage_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.content_data_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Long content_data_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.created_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Long created_by;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.updated_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Long updated_by;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.created_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Date created_at;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.updated_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private Date updated_at;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column content.body
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	private String body;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.id
	 * @return  the value of content.id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.id
	 * @param id  the value for content.id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.column_manage_id
	 * @return  the value of content.column_manage_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Long getColumn_manage_id() {
		return column_manage_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.column_manage_id
	 * @param column_manage_id  the value for content.column_manage_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setColumn_manage_id(Long column_manage_id) {
		this.column_manage_id = column_manage_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.content_data_id
	 * @return  the value of content.content_data_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Long getContent_data_id() {
		return content_data_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.content_data_id
	 * @param content_data_id  the value for content.content_data_id
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setContent_data_id(Long content_data_id) {
		this.content_data_id = content_data_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.created_by
	 * @return  the value of content.created_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Long getCreated_by() {
		return created_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.created_by
	 * @param created_by  the value for content.created_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.updated_by
	 * @return  the value of content.updated_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Long getUpdated_by() {
		return updated_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.updated_by
	 * @param updated_by  the value for content.updated_by
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.created_at
	 * @return  the value of content.created_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.created_at
	 * @param created_at  the value for content.created_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.updated_at
	 * @return  the value of content.updated_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.updated_at
	 * @param updated_at  the value for content.updated_at
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column content.body
	 * @return  the value of content.body
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public String getBody() {
		return body;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column content.body
	 * @param body  the value for content.body
	 * @mbg.generated  Tue Nov 19 20:22:34 JST 2019
	 */
	public void setBody(String body) {
		this.body = body == null ? null : body.trim();
	}
}