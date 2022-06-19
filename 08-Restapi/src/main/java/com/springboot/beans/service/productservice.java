package com.springboot.beans.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.models.product;
import com.springboot.beans.repositories.productrepository;

@Service
public class productservice {
@Autowired
private productrepository productrepo;

public product saveproduct(product pro) {
	return productrepo.save(pro);
}

public product fetchproductbyid(Integer id) throws Exception {
	return productrepo.findById(id).orElseThrow(()->new Exception("id not valid"));
	
}

public product fetchdeletebyid(Integer id) throws Exception {
	product f=fetchproductbyid(id);
	if(f!=null) {
		 productrepo.deleteById(id);
	}
	return null;
}

public Iterable<product> fetchallproducts() {
	return productrepo.findAll();
}

public product updateproducts(Integer id,product pro) throws Exception {
	product f1=fetchproductbyid(id);
	if(f1!=null) {
		f1.setProductname(pro.getProductname());
		f1.setProductaddress(pro.getProductaddress());
		f1.setDate(pro.getDate());
        
		productrepo.save(pro);
	}
	return null;
}

}
