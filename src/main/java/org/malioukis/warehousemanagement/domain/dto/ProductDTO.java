package org.malioukis.warehousemanagement.domain.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link org.malioukis.warehousemanagement.domain.dao.Product}
 */
@Value
public class ProductDTO implements Serializable {
    Long id;
    String name;
    String description;
    Long serialNo;
    Integer warehouseQuantity;
    Double price;
    Boolean active;
    Boolean deleted;
    Long companyId;
    String companyName;
    Long supplierId;
    String supplierName;
    LocalDateTime dateAdded;
    LocalDateTime dateUpdated;
}