CREATE TABLE `account`
(
    `id`      bigint(11) NOT NULL AUTO_INCREMENT COMMENT '' id '',
    `user_id` bigint(11) DEFAULT NULL COMMENT '' 用户id '',
    `total`   decimal(10, 0) DEFAULT NULL COMMENT '' 总额度 '',
    `used`    decimal(10, 0) DEFAULT NULL COMMENT '' 已用余额 '',
    `residue` decimal(10, 0) DEFAULT '' 0 '' COMMENT '' 剩余可用额度 '',
    `frozen`  decimal(11, 2) DEFAULT '' 0.00 '' COMMENT '' TCC事务锁定的金额 '',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;