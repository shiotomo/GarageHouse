package work.tomosse.garage_house.model.db;

import java.util.Date;

public class Account {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.name
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.password
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.api_token
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private String apiToken;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.role
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private String role;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column account.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.id
	 * @return  the value of account.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.id
	 * @param id  the value for account.id
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.name
	 * @return  the value of account.name
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.name
	 * @param name  the value for account.name
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.password
	 * @return  the value of account.password
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.password
	 * @param password  the value for account.password
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.api_token
	 * @return  the value of account.api_token
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public String getApiToken() {
		return apiToken;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.api_token
	 * @param apiToken  the value for account.api_token
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken == null ? null : apiToken.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.role
	 * @return  the value of account.role
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.role
	 * @param role  the value for account.role
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.created_at
	 * @return  the value of account.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.created_at
	 * @param createdAt  the value for account.created_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column account.updated_at
	 * @return  the value of account.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column account.updated_at
	 * @param updatedAt  the value for account.updated_at
	 * @mbg.generated  Thu Dec 05 13:24:26 JST 2019
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}