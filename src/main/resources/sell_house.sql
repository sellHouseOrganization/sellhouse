/*
Navicat MySQL Data Transfer

Source Server         : 黄伟
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : sell_house

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-11-16 11:54:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admitbuy
-- ----------------------------
DROP TABLE IF EXISTS `admitbuy`;
CREATE TABLE `admitbuy` (
  `admitBuyid` int(11) NOT NULL AUTO_INCREMENT COMMENT '认购ID',
  `scheduleid` int(11) DEFAULT NULL COMMENT '预定ID',
  `managePerson` int(11) DEFAULT NULL COMMENT '经办人员',
  `adviserid` int(11) DEFAULT NULL COMMENT '置业顾问ID',
  `clientid` int(11) DEFAULT NULL COMMENT '客户ID',
  `mustPrices` varchar(50) DEFAULT NULL COMMENT '应交售价',
  `payWayid` int(11) DEFAULT NULL COMMENT '付款方式ID',
  PRIMARY KEY (`admitBuyid`),
  KEY `SC_ID` (`scheduleid`),
  KEY `ADV_ID` (`adviserid`),
  KEY `ALI_ID` (`clientid`),
  KEY `FU_ID` (`payWayid`),
  CONSTRAINT `ADV_ID` FOREIGN KEY (`adviserid`) REFERENCES `adviser` (`adviserid`),
  CONSTRAINT `ALI_ID` FOREIGN KEY (`clientid`) REFERENCES `client` (`clientid`),
  CONSTRAINT `FU_ID` FOREIGN KEY (`payWayid`) REFERENCES `payway` (`payWayid`),
  CONSTRAINT `SC_ID` FOREIGN KEY (`scheduleid`) REFERENCES `schedule` (`scheduleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for adviser
-- ----------------------------
DROP TABLE IF EXISTS `adviser`;
CREATE TABLE `adviser` (
  `adviserid` int(11) NOT NULL AUTO_INCREMENT COMMENT '置业顾问ID',
  `adviserName` varchar(20) DEFAULT NULL COMMENT '置业顾问名称',
  `adviseridPhone` varchar(20) DEFAULT NULL COMMENT '电话',
  `staffid` int(11) DEFAULT NULL COMMENT '员工ID',
  PRIMARY KEY (`adviserid`),
  KEY `STAFF_ID` (`staffid`),
  CONSTRAINT `STAFF_ID` FOREIGN KEY (`staffid`) REFERENCES `staff` (`staffid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for areaprice
-- ----------------------------
DROP TABLE IF EXISTS `areaprice`;
CREATE TABLE `areaprice` (
  `areaPriceid` int(11) NOT NULL AUTO_INCREMENT COMMENT '面积售价ID',
  `price` varchar(20) DEFAULT NULL COMMENT '单价',
  `itemid` int(11) DEFAULT NULL COMMENT '项目id',
  PRIMARY KEY (`areaPriceid`),
  KEY `fk_itemid` (`itemid`),
  CONSTRAINT `fk_itemid` FOREIGN KEY (`itemid`) REFERENCES `item` (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for changehouse
-- ----------------------------
DROP TABLE IF EXISTS `changehouse`;
CREATE TABLE `changehouse` (
  `changeHouseid` int(11) NOT NULL AUTO_INCREMENT COMMENT '换房ID',
  `oldHouseid` int(11) DEFAULT NULL COMMENT '原房源ID',
  `newHouseid` int(11) DEFAULT NULL COMMENT '新房源ID',
  `ChangeHouseDate` date DEFAULT NULL COMMENT '换房日期',
  `periodizationNumber` varchar(20) DEFAULT NULL COMMENT '分期数',
  `paymentPeriodizationNumber` varchar(20) DEFAULT NULL COMMENT '付款期数',
  `paysum` varchar(20) DEFAULT NULL COMMENT '已付金额',
  PRIMARY KEY (`changeHouseid`),
  KEY `CHAN_ID` (`oldHouseid`),
  KEY `CHANG_ID` (`newHouseid`),
  CONSTRAINT `CHANG_ID` FOREIGN KEY (`newHouseid`) REFERENCES `house` (`houseid`),
  CONSTRAINT `CHAN_ID` FOREIGN KEY (`oldHouseid`) REFERENCES `house` (`houseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `clientid` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  `clientName` varchar(64) DEFAULT NULL COMMENT '客户姓名',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `cardnumber` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `age` varchar(10) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(15) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`clientid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for clientcontactcareful
-- ----------------------------
DROP TABLE IF EXISTS `clientcontactcareful`;
CREATE TABLE `clientcontactcareful` (
  `clientContactCarefulid` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户交往明细ID',
  `purposeDegree` varchar(100) DEFAULT NULL COMMENT '意向程度',
  `interviewDate` date DEFAULT NULL COMMENT '来访日期',
  `messageAddress` varchar(50) DEFAULT NULL COMMENT '通讯地址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `houseMortgageLoan` varchar(50) DEFAULT NULL COMMENT '住宅按揭贷款',
  `aim` varchar(50) DEFAULT NULL COMMENT '置业目的',
  `projectPrice` varchar(50) DEFAULT NULL COMMENT '计划置业价格',
  `needArea` varchar(50) DEFAULT NULL COMMENT '需求面积',
  `payWay` varchar(50) DEFAULT NULL COMMENT '付款方式',
  `considerFactor` varchar(50) DEFAULT NULL COMMENT '买房考虑因素',
  `contactWay` varchar(50) DEFAULT NULL COMMENT '交往方式',
  `clientid` int(11) DEFAULT NULL COMMENT '客户ID',
  PRIMARY KEY (`clientContactCarefulid`),
  KEY `CLIENT_ID` (`clientid`),
  CONSTRAINT `CLIENT_ID` FOREIGN KEY (`clientid`) REFERENCES `client` (`clientid`)
) ENGINE=InnoDB AUTO_INCREMENT=10003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for floor
-- ----------------------------
DROP TABLE IF EXISTS `floor`;
CREATE TABLE `floor` (
  `floorid` int(11) NOT NULL AUTO_INCREMENT COMMENT '楼栋ID',
  `itemid` int(11) DEFAULT NULL COMMENT '项目ID',
  `floornumber` int(11) DEFAULT NULL COMMENT '楼号',
  `structure` varchar(50) DEFAULT NULL COMMENT '楼栋结构',
  `tier` int(11) DEFAULT NULL COMMENT '层数',
  `batch` varchar(20) DEFAULT NULL COMMENT '批次',
  `notout` varchar(20) DEFAULT NULL COMMENT '是否推出',
  `notapertura` varchar(20) DEFAULT NULL COMMENT '是否开盘',
  `
creationdate` date DEFAULT NULL COMMENT '建立日期',
  PRIMARY KEY (`floorid`),
  KEY `ITEM_ID` (`itemid`),
  CONSTRAINT `ITEM_ID` FOREIGN KEY (`itemid`) REFERENCES `item` (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `houseid` int(11) NOT NULL AUTO_INCREMENT COMMENT '房源ID',
  `floorid` int(11) DEFAULT NULL COMMENT '楼栋ID',
  `tiernumber` int(11) DEFAULT NULL COMMENT '层号',
  `housedate` date DEFAULT NULL COMMENT '建立日期',
  `houseTypeid` int(11) DEFAULT NULL COMMENT '房型ID',
  `marketState` int(11) DEFAULT NULL COMMENT '销售状态',
  `houseStateid` int(11) DEFAULT NULL COMMENT '房源状态',
  `houseNumber` int(11) DEFAULT NULL COMMENT '房号',
  PRIMARY KEY (`houseid`),
  KEY `FLO_ID` (`floorid`),
  KEY `ROOM_ID` (`houseTypeid`),
  CONSTRAINT `FLO_ID` FOREIGN KEY (`floorid`) REFERENCES `floor` (`floorid`),
  CONSTRAINT `ROOM_ID` FOREIGN KEY (`houseTypeid`) REFERENCES `roomtype` (`houseTypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `itemid` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目ID',
  `itemName` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `itemCompanyName` varchar(50) DEFAULT NULL COMMENT '项目公司名称',
  `itemLevel` varchar(20) DEFAULT NULL COMMENT '项目级别',
  `notSettle` int(11) DEFAULT NULL COMMENT '是否结案',
  `reserve1` int(10) DEFAULT NULL COMMENT '备用1',
  `reserve2` int(10) DEFAULT NULL COMMENT '备用2',
  PRIMARY KEY (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for offersum
-- ----------------------------
DROP TABLE IF EXISTS `offersum`;
CREATE TABLE `offersum` (
  `offerSumid` int(11) NOT NULL AUTO_INCREMENT COMMENT '供款ID',
  `offerSumDeadline` varchar(50) DEFAULT NULL COMMENT '付款期限',
  `admitBuyid` int(11) DEFAULT NULL COMMENT '认购ID',
  `sum` varchar(20) DEFAULT NULL COMMENT '金额',
  `offerSumName` varchar(50) DEFAULT NULL COMMENT '付款名称',
  `offerSumEvent` varchar(50) DEFAULT NULL COMMENT '付款事件',
  `offerSumTime` date DEFAULT NULL COMMENT '供款时间',
  `offerperiods` varchar(20) DEFAULT NULL COMMENT '供款期数',
  PRIMARY KEY (`offerSumid`),
  KEY `ADM_ID` (`admitBuyid`),
  CONSTRAINT `ADM_ID` FOREIGN KEY (`admitBuyid`) REFERENCES `admitbuy` (`admitBuyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for payway
-- ----------------------------
DROP TABLE IF EXISTS `payway`;
CREATE TABLE `payway` (
  `payWayid` int(11) NOT NULL AUTO_INCREMENT COMMENT '付款方式ID',
  `payWayName` varchar(50) DEFAULT NULL COMMENT '付款方式名称',
  `mortgageLoanNo` varchar(10) DEFAULT NULL COMMENT '是否按揭贷款',
  `resrvedFundsLoanNo` varchar(10) DEFAULT NULL COMMENT '是否公积金贷款',
  `notStart` varchar(10) DEFAULT NULL COMMENT '是否启用',
  `mortgageTerm` varchar(10) DEFAULT NULL COMMENT '按揭年限',
  `firstScale` varchar(20) DEFAULT NULL COMMENT '首次比例',
  `twiceScale` varchar(20) DEFAULT NULL COMMENT '二次比例',
  `thriceScale` varchar(20) DEFAULT NULL COMMENT '三次比例',
  PRIMARY KEY (`payWayid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for roomtype
-- ----------------------------
DROP TABLE IF EXISTS `roomtype`;
CREATE TABLE `roomtype` (
  `houseTypeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '房型ID',
  `pooledArea` varchar(50) DEFAULT NULL COMMENT '公摊面积',
  `privateArea` varchar(50) DEFAULT NULL COMMENT '私有面积',
  `orientation` varchar(50) DEFAULT NULL COMMENT '朝向',
  `hallRoom` varchar(50) DEFAULT NULL COMMENT '厅室',
  `houseType` varchar(50) DEFAULT NULL COMMENT '户型',
  PRIMARY KEY (`houseTypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for schedule
-- ----------------------------
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
  `scheduleid` int(11) NOT NULL AUTO_INCREMENT COMMENT '预定ID',
  `houseid` int(11) DEFAULT NULL COMMENT '房源ID',
  `fromtMoney` varchar(20) DEFAULT NULL COMMENT '定金',
  `adviserid` int(11) DEFAULT NULL COMMENT '置业顾问ID',
  `remake` varchar(50) DEFAULT NULL COMMENT '简要备注',
  `scheduleDate` date DEFAULT NULL COMMENT '预定日期',
  `clientid` int(11) DEFAULT NULL COMMENT '客户ID',
  PRIMARY KEY (`scheduleid`),
  KEY `CL_ID` (`clientid`),
  KEY `AD_ID` (`adviserid`),
  KEY `HOUSE_ID` (`houseid`),
  CONSTRAINT `AD_ID` FOREIGN KEY (`adviserid`) REFERENCES `adviser` (`adviserid`),
  CONSTRAINT `CL_ID` FOREIGN KEY (`clientid`) REFERENCES `client` (`clientid`),
  CONSTRAINT `HOUSE_ID` FOREIGN KEY (`houseid`) REFERENCES `house` (`houseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffid` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`staffid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
