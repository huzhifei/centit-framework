package com.centit.framework.model.basedata;

import java.util.List;

/**
 * Userinfo entity.
 * 系统用户信息
 * @author codefan@sina.com
 */
 public interface IUserInfo{
	/**
	 * 用户编码，是用户的主键
	 * @return 用户编码，是用户的主键
	 */
     String getUserCode();
    
    /**
     *  String getUserPin()
     * @return getUserPin
     */
     String getUserPin();
    /**
	 * 用户是否有效 T/F/A  T 正常 ， F 禁用,A为新建可以删除
	 * @return 用户是否有效 T/F/A  T 正常 ， F 禁用,A为新建可以删除
	 */
	 String getIsValid();
	
    /**
	 * 用户名称  ，和 getUsername()不同后者返回的是用户登录名称
	 * @return 用户名称
     */
     String getUserName();
    
    /**
	 * 用户登录名 同 getUsername
	 * @return 用户登录名
	 */
     String getLoginName();
    /**
     * 用户默认机构（主机构）代码
     * @return 用户默认机构（主机构）代码
     */
     String getPrimaryUnit();
    /**
     * 用户类别，各个业务系统自定义类别信息
     * @return 用户类别，各个业务系统自定义类别信息
     */
     String getUserType(); 
    
    /**
     * 用户注册邮箱
     * @return 用户注册邮箱
     */
     String getRegEmail(); 
    /**
     * 用户注册手机号码
     * @return 用户注册手机号码
     */
     String getRegCellPhone(); 
    
    /**
     * 用户排序号
     * @return 用户排序号
     */
     Long getUserOrder();
    /**
	 * 获取用户归属机构关系
	 * @return 获取用户归属机构关系
	 */
	 List<? extends IUserUnit> getUserUnits();
}
