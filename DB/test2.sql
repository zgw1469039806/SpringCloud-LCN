/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : test2

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 27/04/2019 08:46:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wc
-- ----------------------------
DROP TABLE IF EXISTS `wc`;
CREATE TABLE `wc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wc
-- ----------------------------
BEGIN;
INSERT INTO `wc` VALUES (1, '97');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
