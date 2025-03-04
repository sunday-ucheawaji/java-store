-- Create products table

CREATE TABLE products
(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category_id TINYINT NOT NULL,
    FOREIGN Key (category_id) REFERENCES categories (id) ON DELETE CASCADE

);