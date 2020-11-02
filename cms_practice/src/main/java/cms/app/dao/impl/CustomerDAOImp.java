package cms.app.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cms.app.dao.CustomerDao;
import cms.app.dbutil.PostgresSqlConnection;
import cms.app.exception.BusinessExcpetion;
import cms.app.model.Customer;

public class CustomerDAOImp implements CustomerDao {

	@Override
	public int createCustomer(Customer customer) throws BusinessExcpetion {
		int c=0;
		try(Connection connection=PostgresSqlConnection.getConnection() ){
			
			String sql ="insert into practice.customer "
					+ "(cus_id,	fname,	lname,	contact)"
					+ "values (?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,customer.getCus_id());
			preparedStatement.setString(2, customer.getfName());
			preparedStatement.setString(3, customer.getlName());
			preparedStatement.setLong(4,customer.getContact());
			
			c=preparedStatement.executeUpdate();

			
		} catch (ClassNotFoundException | SQLException e) {			
			//System.out.println(e);//take off this line when app is live
			throw new  BusinessExcpetion("Interal error occured.. please contact System Admin. create customer");
			
		}		return c;
	}
	
	
	

	@Override
	public int updateCustomerContact(int id, long newContact) throws BusinessExcpetion {		
		
		try(Connection connection=PostgresSqlConnection.getConnection() ){
			
			
				if(getCustomerById(id)!=null) {
				String sql ="UPDATE practice.customer"
						+ "SET contact =?"
						+ "WHERE cus_id?";
				
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setLong(2,newContact);
				preparedStatement.setInt(2,id);					
				preparedStatement.executeLargeUpdate();				
				Customer c= getCustomerById(id);
				System.out.println(c);
				
				} 
			}	catch (ClassNotFoundException | SQLException e) {			
			System.out.println(e);//take off this line when app is live
			throw new  BusinessExcpetion("Interal error occured.. please contact System Admin. update");
		}
		
				
		return 0;
	}
	
	
	
	

	@Override
	public void deleteCustomer(int id) throws BusinessExcpetion {
		
		try(Connection connection=PostgresSqlConnection.getConnection() ){
			
			if(getCustomerById(id)!=null) {
			String sql ="DELETE FROM practice.customer WHERE cus_id=?";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,id);					
			preparedStatement.executeUpdate();
			System.out.println("Record deleted at id = "+id);
			}
		} catch (ClassNotFoundException | SQLException e) {			
			//System.out.println(e);//take off this line when app is live
			throw new  BusinessExcpetion("Interal error occured.. please contact System Admin. delete");
		}

	}
	
	
	
	

	@Override
	public Customer getCustomerById(int id) throws BusinessExcpetion {
		Customer customer=null;
		try(Connection connection=PostgresSqlConnection.getConnection() ){
			
			String sql ="select fname,	lname,	contact "
					+ "from practice.customer "
					+ "Where cus_id=?";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,id);
			
			ResultSet resultSet =preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				customer= new Customer(id, resultSet.getString("fName"), resultSet.getString("lName"), resultSet.getLong("contact"));
				
			}else {
				throw new BusinessExcpetion("No records found for ID = "+id);
			}

			
		} catch (ClassNotFoundException | SQLException e) {			
			//System.out.println(e);//take off this line when app is live
			throw new  BusinessExcpetion("Interal error occured.. please contact System Admin.get customer");
			
		}		return customer;
	}

	
}
	

