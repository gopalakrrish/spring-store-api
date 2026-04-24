CREATE TABLE `store_api`.`orders` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `customer_id` BIGINT NOT NULL,
  `status` VARCHAR(20) NOT NULL,
  `created_at` DATETIME NOT NULL DEFAULT current_timestamp,
  `total_price` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `orders_users_fk`
    FOREIGN KEY (`customer_id`)
    REFERENCES `store_api`.`users` (`id`)
);

CREATE TABLE `store_api`.`order_items` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `order_id` BIGINT NOT NULL,
  `product_id` BIGINT NOT NULL,
  `unit_price` DECIMAL(10,2) NOT NULL,
  `quantity` INT NOT NULL,
  `total_price` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `order_items_orders_fk`
    FOREIGN KEY (`order_id`)
    REFERENCES `store_api`.`orders` (`id`),
  CONSTRAINT `order_items_products_fk`
    FOREIGN KEY (`product_id`)
    REFERENCES `store_api`.`products` (`id`)
);