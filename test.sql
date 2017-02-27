/*
Navicat MySQL Data Transfer

Source Server         : zlnewserver
Source Server Version : 50621
Source Host           : 192.168.3.100:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-02-27 16:45:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for XXGL_BanJi
-- ----------------------------
DROP TABLE IF EXISTS `XXGL_BanJi`;
CREATE TABLE `XXGL_BanJi` (
  `BanJi_Guid` varchar(36) NOT NULL,
  `BanJi_Name` varchar(100) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `Remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`BanJi_Guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of XXGL_BanJi
-- ----------------------------
INSERT INTO `XXGL_BanJi` VALUES ('1', '测试一班', '一班的地址', '1班的备注');

-- ----------------------------
-- Table structure for XXGL_XueSheng
-- ----------------------------
DROP TABLE IF EXISTS `XXGL_XueSheng`;
CREATE TABLE `XXGL_XueSheng` (
  `XueSheng_Guid` varchar(36) NOT NULL,
  `XueSheng_Name` varchar(50) DEFAULT NULL,
  `Sex` bit(1) DEFAULT NULL,
  `Remark` varchar(500) DEFAULT NULL,
  `BanJi_Guid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`XueSheng_Guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of XXGL_XueSheng
-- ----------------------------
INSERT INTO `XXGL_XueSheng` VALUES ('46d3f6cdfcc511e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', '1');
INSERT INTO `XXGL_XueSheng` VALUES ('50a927defcc511e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', null);
INSERT INTO `XXGL_XueSheng` VALUES ('59dd6ae2fcc511e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', null);
INSERT INTO `XXGL_XueSheng` VALUES ('65174d1ffcc811e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', null);
INSERT INTO `XXGL_XueSheng` VALUES ('8dab85dffcc811e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', null);
INSERT INTO `XXGL_XueSheng` VALUES ('b5c19b94fcc411e6a4e1e03f4947f22f', '学生1', '', '嘿嘿', null);

-- ----------------------------
-- Procedure structure for aa
-- ----------------------------
DROP PROCEDURE IF EXISTS `aa`;
DELIMITER ;;
CREATE DEFINER=`root`@`%` PROCEDURE `aa`()
begin 
select count(*) as a from aaa ;
end
;;
DELIMITER ;
