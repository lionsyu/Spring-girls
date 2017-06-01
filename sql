//用户信息表
CREATE TABLE `user`(
    `id` BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(64) COMMENT '用户名',
    `tel` VARCHAR(32) UNIQUE KEY COMMENT '登录手机号',
    `password` VARCHAR(64) NOT NULL COMMENT '密码',
    `role` INT(4) DEFAULT '2' COMMENT '角色 1代表root用户，2代表普通用户',
    `create_time` TIMESTAMP COMMENT '首次注册时间'
)ENGINE =InnoDB DEFAULT CHARSET =utf8 COMMENT '用户信息表';


