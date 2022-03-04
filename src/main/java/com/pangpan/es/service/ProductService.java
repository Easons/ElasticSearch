package com.pangpan.es.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pangpan.es.entity.Product;
import com.pangpan.es.mapper.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends ServiceImpl<ProductMapper, Product> {
}
