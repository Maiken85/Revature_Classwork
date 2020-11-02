package cms.app;
import cms.app.dao.CustomerDao;
import cms.app.dao.impl.CustomerDAOImp;
import cms.app.exception.BusinessExcpetion;
import cms.app.model.Customer;

public class CmsAppMain {

	public static void main(String[] args) throws BusinessExcpetion {
		
		
		CustomerDao customerDao =new CustomerDAOImp();
		
		
		//create customer		
//		Customer customer=new Customer(8, "Aaron", "Crunch", 3456217895L);
//		try {
//			if(customerDao.createCustomer(customer) > 0) {
//				System.out.println("Customer was created in DB with below details");
//				System.out.println(customer);
//				
//			}
//		} catch (BusinessExcpetion e) {
//			System.out.println(e.getMessage());
//		}

		//search by id
//		try {
//			
//			int id = 1000;
//			
//			Customer customer = customerDao.getCustomerById(id);
//		
//			if(customer!=null) {
//				System.out.println("Customer found with id = "+id+" details are : ");
//				System.out.println(customer);
//			}
//			
//		} catch (BusinessExcpetion e) {
//			System.out.println(e.getMessage());
//			
//		}
		
		
		//Delete customer
//		try {
//			int id =8;
//			
//			customerDao.deleteCustomer(id);		
//			
//			
//		}catch (BusinessExcpetion e) {
//			System.out.println(e.getMessage());
//			
//		}
			
		
		// update customer	
		try {
			
			int id=4000;
			long newContact=7778889999L;
			customerDao.updateCustomerContact(id, newContact);
			
		} catch (BusinessExcpetion e) {
			System.out.println(e.getMessage());
			
		}
			
		
		
		
		
		
		
		
		
		
	}
	

}
