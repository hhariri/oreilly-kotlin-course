package com.hadihariri.kotlincourse.interop;


import java.util.List;

/**
 * Created by hadihariri on 25/08/16.
 */
public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
