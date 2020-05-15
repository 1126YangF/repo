package com.qyqx.ssm.service;

import com.qyqx.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll() throws Exception;
}
