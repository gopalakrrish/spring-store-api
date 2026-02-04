CREATE TABLE carts (
  id BINARY(16) NOT NULL DEFAULT (uuid_to_bin(uuid())),
  date_created DATE NOT NULL DEFAULT (curdate()),
  PRIMARY KEY (id)
);

CREATE TABLE cart_items (
  id BIGINT NOT NULL AUTO_INCREMENT,
  cart_id BINARY(16) NOT NULL,
  product_id BIGINT NOT NULL,
  quantity INT NOT NULL DEFAULT 1,
  PRIMARY KEY (id),

  KEY fk_cart_items_carts (cart_id),
  KEY fk_cart_items_products (product_id),

  CONSTRAINT fk_cart_items_carts
    FOREIGN KEY (cart_id)
    REFERENCES carts (id)
    ON DELETE CASCADE,

  CONSTRAINT fk_cart_items_products
    FOREIGN KEY (product_id)
    REFERENCES products (id)
    ON DELETE CASCADE,

  CONSTRAINT uk_cart_items_cart_product
    UNIQUE (cart_id, product_id)
);