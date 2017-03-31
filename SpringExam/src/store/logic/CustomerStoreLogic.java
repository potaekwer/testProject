package store.logic;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import store.CustomerStore;
import util.Pageable;

public class CustomerStoreLogic implements CustomerStore{

	
	@Override
	public Customer selectOne(String id) {

		Customer cus = new Customer();
		cus.setId(id);
		cus.setName("������");
		cus.setEmail("1234@123.com");
		cus.setAddress("����");
		return cus;
		
	}

	@Override
	public List<Customer> selectAll() {

		List<Customer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++){
			Customer cus = new Customer();
			cus.setId(i+"");
			cus.setName(i+"");
			cus.setEmail(i+"");
			cus.setAddress(i+"");
			
			list.add(cus);
		}
		
		
		return list;
	}

	@Override
	public List<Customer> selectAll(Pageable page) {
		List<Customer> list = new ArrayList<>();
		
		int index = page.getIndex();
		int size = page.getSize();
		
		for(int i=index; i<size; i++){
			Customer cus = new Customer();
			cus.setId(i+"");
			cus.setName(i+"");
			cus.setEmail(i+"");
			cus.setAddress(i+"");
			
			list.add(cus);
		}
		
		
		return list;
	}

	@Override
	public void register(Customer customer) {
		System.out.println(customer.getName()+"�� �����Ͱ� ���� �Ǿ���.");
	}

	@Override
	public void delete(String id) {

		Customer cus = selectOne(id);
		System.out.println(cus.getId()+"�� �����Ͱ� ���� �Ǿ���.");
	}

}
