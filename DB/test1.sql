/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 27/04/2019 08:46:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xm
-- ----------------------------
DROP TABLE IF EXISTS `xm`;
CREATE TABLE `xm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xm
-- ----------------------------
BEGIN;
INSERT INTO `xm` VALUES (1, '123123');
INSERT INTO `xm` VALUES (2, '123123');
INSERT INTO `xm` VALUES (3, '123123');
INSERT INTO `xm` VALUES (4, '123123');
INSERT INTO `xm` VALUES (5, '123123');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
