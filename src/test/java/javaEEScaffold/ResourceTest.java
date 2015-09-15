package javaEEScaffold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vino.shirospring.entity.Resource;
import com.vino.shirospring.service.ResourceService;

public class ResourceTest {
	private  ClassPathXmlApplicationContext ctx ;
	private ResourceService resourceService;

	@Before
	public void setUp() throws Exception {
		 ctx =  new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 resourceService=ctx.getBean("resourceService",ResourceService.class);
	}

	@After
	public void tearDown() throws Exception {
		ctx.close();
	}

	@Test
	public void testSave() {
		resourceService.save(new Resource("�û�����", "menu", "user:menu"));
		resourceService.save(new Resource("�����û�", "button", "user:create"));
		resourceService.save(new Resource("ɾ���û�", "button", "user:delete"));
		resourceService.save(new Resource("�༭�û�", "button", "user:update"));
		resourceService.save(new Resource("��ѯ�û�", "button", "user:view"));
	}

}
