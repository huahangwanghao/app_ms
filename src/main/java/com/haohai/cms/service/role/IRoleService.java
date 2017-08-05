package com.haohai.cms.service.role;

import com.haohai.cms.model.TRole;

import java.util.List;

public interface IRoleService {

	/**
	 * 角色查询
	 * 
	 * @return
	 */
	List<TRole> findRoles();

}
