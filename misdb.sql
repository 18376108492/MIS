/*
Navicat MySQL Data Transfer

Source Server         : fuck
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : misdb

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-04-21 17:33:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `name` varchar(50) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '研发部');
INSERT INTO `department` VALUES ('2', '产品部');
INSERT INTO `department` VALUES ('3', '财会部');

-- ----------------------------
-- Table structure for department_second
-- ----------------------------
DROP TABLE IF EXISTS `department_second`;
CREATE TABLE `department_second` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_dept_id` (`department_id`),
  CONSTRAINT `fk_dept_id` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department_second
-- ----------------------------
INSERT INTO `department_second` VALUES ('1', '1', '研发一组');
INSERT INTO `department_second` VALUES ('2', '1', '研发二组');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(2) DEFAULT '男' COMMENT '性别',
  `age` int(10) DEFAULT NULL COMMENT '身份证号码',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
  `job_id` int(11) DEFAULT NULL COMMENT '职位id',
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `role_id` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  `modifydate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `deptID` (`dept_id`),
  KEY `jobID` (`job_id`),
  KEY `e_fk_role_id` (`role_id`),
  CONSTRAINT `e_fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department_second` (`id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`job_id`) REFERENCES `job` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '男', '29', '1996-11-11 14:32:17', '1', '1', '2019-04-21 14:33:10', '1', '0', '2019-04-21 14:33:04');

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('1', '员工');

-- ----------------------------
-- Table structure for jurisdiction
-- ----------------------------
DROP TABLE IF EXISTS `jurisdiction`;
CREATE TABLE `jurisdiction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jurisdiction
-- ----------------------------
INSERT INTO `jurisdiction` VALUES ('1', 'xxxx数据浏览');
INSERT INTO `jurisdiction` VALUES ('2', 'yyyy数据下载权限');
INSERT INTO `jurisdiction` VALUES ('3', 'aaaa软件使用权限');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '职位名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '维护人员');
INSERT INTO `role` VALUES ('10', 'xxxx角色');
INSERT INTO `role` VALUES ('11', 'yyyy角色');

-- ----------------------------
-- Table structure for role_jurisdiction
-- ----------------------------
DROP TABLE IF EXISTS `role_jurisdiction`;
CREATE TABLE `role_jurisdiction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `jurisdiction_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_role_id` (`role_id`),
  KEY `fk_jurisdicyion_id` (`jurisdiction_id`),
  CONSTRAINT `fk_jurisdicyion_id` FOREIGN KEY (`jurisdiction_id`) REFERENCES `jurisdiction` (`id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_jurisdiction
-- ----------------------------
INSERT INTO `role_jurisdiction` VALUES ('1', '10', '1');
INSERT INTO `role_jurisdiction` VALUES ('2', '10', '2');
INSERT INTO `role_jurisdiction` VALUES ('3', '10', '3');
INSERT INTO `role_jurisdiction` VALUES ('4', '11', '1');
INSERT INTO `role_jurisdiction` VALUES ('5', '11', '2');
