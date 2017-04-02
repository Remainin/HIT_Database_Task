-- MySQL dump 10.13  Distrib 5.5.52, for Win32 (x86)
--
-- Host: localhost    Database: sdb
-- ------------------------------------------------------
-- Server version	5.5.52

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `sid` bigint(20) unsigned NOT NULL,
  `sname` varchar(20) NOT NULL,
  `sage` smallint(5) unsigned NOT NULL,
  `ssex` varchar(10) NOT NULL,
  `sclass` bigint(20) unsigned NOT NULL,
  `sdept` int(10) unsigned NOT NULL,
  `saddr` varchar(160) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1140110401,'老美',17,'男',1401104,1,'吉林长春'),(1140110402,'老东',23,'女',1401104,1,'吉林白城'),(1140110403,'老迪',17,'男',1401104,1,'吉林通化'),(1140110404,'老昊',23,'女',1401104,1,'吉林四平'),(1140110405,'老宁',17,'男',1401104,1,'吉林白山'),(1140110406,'老超',23,'女',1401104,1,'吉林松原'),(1140110407,'老轮',17,'男',1401104,1,'吉林松原'),(1140110408,'老张',23,'女',1401104,1,'吉林延边'),(1140110409,'老智',17,'男',1401104,1,'吉林松原'),(1140110410,'老宋',23,'女',1401104,1,'吉林长春'),(1140210301,'大美',18,'男',1402103,2,'吉林长春'),(1140210302,'大东',19,'女',1402103,2,'吉林白城'),(1140210303,'大迪',18,'男',1402103,2,'吉林通化'),(1140210304,'大昊',19,'女',1402103,2,'吉林四平'),(1140210305,'大宁',18,'男',1402103,2,'吉林白山'),(1140210306,'大超',19,'女',1402103,2,'吉林松原'),(1140210307,'大轮',18,'男',1402103,2,'吉林松原'),(1140210308,'大张',19,'女',1402103,2,'吉林延边'),(1140210309,'大智',18,'男',1402103,2,'吉林松原'),(1140210310,'大宋',19,'女',1402103,2,'吉林长春'),(1140310501,'小美',21,'男',1403105,3,'吉林长春'),(1140310502,'小东',22,'女',1403105,3,'吉林白城'),(1140310503,'小迪',21,'男',1403105,3,'吉林通化'),(1140310504,'小昊',22,'女',1403105,3,'吉林四平'),(1140310505,'小宁',21,'男',1403105,3,'吉林白山'),(1140310506,'小超',22,'女',1403105,3,'吉林松原'),(1140310507,'小轮',21,'男',1403105,3,'吉林松原'),(1140310508,'小张',22,'女',1403105,3,'吉林延边'),(1140310509,'小智',21,'男',1403105,3,'吉林松原'),(1140310510,'小宋',22,'女',1403105,3,'吉林长春'),(1140310601,'张旭',20,'男',1403106,3,'吉林长春'),(1140310602,'霍守康',20,'男',1403106,3,'吉林白城'),(1140310603,'金卓林',20,'男',1403106,3,'吉林通化'),(1140310604,'王志达',20,'男',1403106,3,'吉林四平'),(1140310605,'张旭',20,'男',1403106,3,'吉林白山'),(1140310606,'张茗帅',20,'男',1403106,3,'吉林松原'),(1140310607,'于洋',20,'男',1403106,3,'吉林松原'),(1140310608,'郭鑫',20,'男',1403106,3,'吉林延边'),(1140310609,'刘强',20,'男',1403106,3,'吉林松原'),(1140310610,'董浩洋',20,'男',1403106,3,'吉林松原'),(1140310611,'宋振',20,'男',1403106,3,'吉林长春'),(1140310612,'肖华东',20,'女',1403106,3,'吉林白城'),(1140310613,'谢博迪',20,'男',1403106,3,'吉林通化'),(1140310614,'彭泽昊',20,'女',1403106,3,'吉林四平'),(1140310615,'李宁',20,'男',1403106,3,'吉林白山'),(1140310616,'何永超',20,'女',1403106,3,'吉林松原'),(1140310617,'袁怡轮',20,'男',1403106,3,'吉林松原'),(1140310618,'张韬庚',20,'女',1403106,3,'吉林延边'),(1140310619,'王智',20,'男',1403106,3,'吉林松原'),(1140310620,'宋金波',20,'女',1403106,3,'吉林长春');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-04 14:22:58
