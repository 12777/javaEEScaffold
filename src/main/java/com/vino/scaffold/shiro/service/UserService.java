package com.vino.scaffold.shiro.service;


import java.util.Set;





import com.vino.scaffold.service.base.BaseService;
import com.vino.scaffold.shiro.entity.User;

public interface UserService extends  BaseService<User, Long>{
	//public List<Resource>findAllResources();
	public User findByUsername(String username);

	public Set<String> findAllRoleMarksByUsername(String username);
	public Set<String> findAllPermissionsByUsername(String username);
	void changePassword(Long userId, String newPassword);
	//����User��Role,����ʹ�õ���Set���ϣ���ʹ��β�����ͬ�ģ����ݿ���Ҳ�������ظ���
	public void connectUserAndRole(Long userId,Long ...roleIds);
	//ȡ������
	public void disconnectUserAndRole(Long userId,Long... roleIds);
}
