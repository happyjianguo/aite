package com.nj.model.generate;

public class SysUserRoleKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user_role.user_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_user_role.role_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	private String roleId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user_role.user_id
	 * @return  the value of sys_user_role.user_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user_role.user_id
	 * @param userId  the value for sys_user_role.user_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_user_role.role_id
	 * @return  the value of sys_user_role.role_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_user_role.role_id
	 * @param roleId  the value for sys_user_role.role_id
	 * @mbg.generated  Thu Mar 09 10:52:44 CST 2017
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}