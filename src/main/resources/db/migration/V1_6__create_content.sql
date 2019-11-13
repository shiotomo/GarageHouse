CREATE TABLE IF NOT EXISTS `content` (
    `id` BIGINT AUTO_INCREMENT,
    `column_manage_id` BIGINT NOT NULL,
    `content_data_id` BIGINT NOT NULL,
    `body` TEXT,
    `created_by` BIGINT NOT NULL,
    `updated_by` BIGINT NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`column_manage_id`) REFERENCES column_manage(`id`),
    FOREIGN KEY (`content_data_id`) REFERENCES content_data(`id`)
);