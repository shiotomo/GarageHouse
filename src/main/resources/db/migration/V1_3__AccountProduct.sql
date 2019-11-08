CREATE TABLE IF NOT EXISTS `account_product` (
    `id` BIGINT AUTO_INCREMENT,
    `account_id` BIGINT NOT NULL,
    `product_id` BIGINT NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`account_id`) REFERENCES account(`id`),
    FOREIGN KEY (`product_id`) REFERENCES product(`id`)
);