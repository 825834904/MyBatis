package com.it.dao;

import java.util.List;
import com.it.po.Customer;
public interface CustomerDao {
    List<Customer> findAll();//查找所有用户
    void saveCustomer(Customer customer);//添加用户
    void updateCustomer(Customer customer);//更改用户信息


    List<Customer> findALLByUsernnameAndJobs(Customer customer);//查找所有用户
    List<Customer> findALLByUsernnameOrJobs(Customer customer);

    List<Customer> findALLByIds(List<Integer> list);
}
