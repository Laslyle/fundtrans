/**
 * 
 */
package com.mybank.fundtrans.dao;

import java.util.List;

import com.mybank.fundtrans.domain.Client;
import com.mybank.fundtrans.domain.Fund;

/**
 * @author Hong
 *
 */
public interface ClientDao {
	List findAll();    
	void insert(Client client);    
	void delete(int id);    
	void update(Client client);   
	Fund findById(int id); 
}
