package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 客户服务类
 * Created by Wangzhe on 2015/11/30.
 */
public class CustomerService {
    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        // TODO: 2015/11/30
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        // TODO: 2015/11/30
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO: 2015/11/30
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO: 2015/11/30
        return false;
    }

    public boolean deleteCustomer(long id) {
        // TODO: 2015/11/30 ;
        return false;
    }
}
