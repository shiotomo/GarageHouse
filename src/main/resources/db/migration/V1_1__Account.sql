CREATE TABLE IF NOT EXISTS `account` (
    `id` BIGINT AUTO_INCREMENT,
    `name` VARCHAR(256) NOT NULL,
    `password` VARCHAR(256) NOT NULL,
    `api_token` VARCHAR(256) NOT NULL,
    `role` VARCHAR(256) NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);