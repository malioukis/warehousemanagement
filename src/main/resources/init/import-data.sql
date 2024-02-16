INSERT INTO company(id, name)
VALUES (1, 'Company1');

INSERT INTO supplier(id, name)
VALUES (1, 'Supplier1');


INSERT INTO product(id, active, dateAdded, dateUpdated, deleted, description, name, price, serialNo, warehouseQuantity,
                    companyId, supplierId)
VALUES (1, 1, null, null, 0, 'Test Description', 'Product1', 12.00, 9545, 2, 1, 1)