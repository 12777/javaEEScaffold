package com.vino.scaffold.shiro.service;


import com.vino.scaffold.service.base.BaseService;
import com.vino.scaffold.shiro.entity.Role;

public interface RoleService extends  BaseService<Role, Long> {


	/**
	 * ������ɫ����Դ֮�����ϵ
	 * @param roleId
	 * @param resourceIds
	 */
	public void connectRoleAndResource(Long roleId,Long ...resourceIds );
	public void disconnnectRoleAndResource(Long roledId,Long... resourceIds);
}
