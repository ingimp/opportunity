import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.manager.bo.ICustomerBo;
import org.certifiedCV.manager.bo.IUserBO;
import org.certifiedCV.persistence.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * @param args
     * @throws DataAccessLayerException
     */
    public static void main(String[] args) throws DataAccessLayerException {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(
		"applicationContext.xml");

	IUserBO bo2 = (IUserBO) appContext.getBean("userManager");
	 User user = new User();
	 user.setUserName("ingimp");
	 user.setPassword("theoros");
	 user.setFirstName("Luca");
	 user.setLastName("Di Cesare");
	 user.setEmail("ing.dicesare@gmail.com");
	 System.out.println("ID = " + bo2.addUser(user));
	 
	 
	//
//	ICustomerBo bo = new CustomerBo();
//	List<Customer> c = bo.getAllCustomers();
//	System.out.println(c);

	// IUserBO bo = new UserBo();
	// User user = bo.getUser("ingimp");
	// System.out.println(user);
	// bo.delete(user);

//	ApplicationContext appContext = new ClassPathXmlApplicationContext(
//		"SpringBeans.xml");
//	
//	ICustomerBo bo2 = (ICustomerBo)appContext.getBean("customerBo");
//	List<Customer> list = bo2.getAllCustomers();
//	System.out.println(list);

    }

}
