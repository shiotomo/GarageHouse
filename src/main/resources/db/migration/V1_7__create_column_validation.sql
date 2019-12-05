CREATE TABLE IF NOT EXISTS `column_validation` (
    `id` BIGINT AUTO_INCREMENT,
    `column_manage_id` BIGINT NOT NULL,
    `validate` VARCHAR(256) NOT NULL,
    `created_by` BIGINT NOT NULL,
    `updated_by` BIGINT NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`column_manage_id`) REFERENCES column_manage(`id`)
);