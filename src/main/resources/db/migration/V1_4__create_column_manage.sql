CREATE TABLE IF NOT EXISTS `column_manage` (
    `id` BIGINT AUTO_INCREMENT,
    `product_id` BIGINT NOT NULL,
    `name` VARCHAR(256) NOT NULL,
    `column_type` VARCHAR(256) NOT NULL,
    `created_by` BIGINT NOT NULL,
    `updated_by` BIGINT NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`product_id`) REFERENCES product(`id`)
);