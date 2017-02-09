package dubboconsumer;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.langqiao.dubbo.api.DemoService;
import com.langqiao.dubbo.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ConsumerTest extends TestCase {

	@Autowired
	private DemoService demoService;
	
	@Test
	public void test() throws Exception {
		String hello = demoService.sayHello("tom");
		System.out.println(hello);

		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
		}
		System.in.read();
	}
}
