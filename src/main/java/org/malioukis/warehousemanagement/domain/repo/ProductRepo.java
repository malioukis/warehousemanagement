package org.malioukis.warehousemanagement.domain.repo;

import org.malioukis.warehousemanagement.domain.dao.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepo extends BaseRepo<Product>, JpaSpecificationExecutor<Product> {
}
