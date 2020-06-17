package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1> getCatlog1();

    List<PmsBaseCatalog2> getCatlog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatlog3(String catalog2Id);
}
