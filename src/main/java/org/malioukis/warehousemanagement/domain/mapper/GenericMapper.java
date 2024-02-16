package org.malioukis.warehousemanagement.domain.mapper;

import org.malioukis.warehousemanagement.domain.dao.Product;
import org.malioukis.warehousemanagement.domain.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenericMapper {
    ProductDTO toDTO(Product product);
}

