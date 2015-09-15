package com.vino.shirospring.service;

import java.util.List;
import java.util.Set;

import com.vino.shirospring.entity.Role;

public interface RoleService {
	public Role findRole(Long id);
	public List<Role> findAllRole();
	void save(Role role);
	void delete(Long id);
	/**
	 * ������ɫ����Դ֮�����ϵ
	 * @param roleId
	 * @param resourceIds
	 */
	public void connectRoleAndResource(Long roleId,Long ...resourceIds );
	public void disconnnectRoleAndResource(Long roledId,Long... resourceIds);
}
