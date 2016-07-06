/*
Navicat MySQL Data Transfer

Source Server         : localhost_3366
Source Server Version : 50536
Source Host           : localhost:3366
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-07-03 14:59:56
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '23');
INSERT INTO `user` VALUES ('2', '李斯', '24');
INSERT INTO `user` VALUES ('15', '王五', '25');
INSERT INTO `user` VALUES ('16', '赵六', '26');
INSERT INTO `user` VALUES ('17', '田七', '27');
INSERT INTO `user` VALUES ('18', null, null);
