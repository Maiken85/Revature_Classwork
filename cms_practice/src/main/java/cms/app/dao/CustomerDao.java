package cms.app.dao;


import cms.app.model.Customer;
import cms.app.exception.BusinessExcpetion;


//DOA - Data access object
//it represents that all code related to the db or persistence or storage will be written inside this
public interface CustomerDao {
	
	public int createCustomer(Customer customer) throws BusinessExcpetion;
	
	public int updateCustomerContact (int id,long newContact)throws BusinessExcpetion;
	
	public void deleteCustomer(int id)throws BusinessExcpetion;
	
	public Customer getCustomerById(int id)throws BusinessExcpetion;
	

}
