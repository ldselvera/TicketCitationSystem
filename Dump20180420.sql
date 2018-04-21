-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: citation
-- ------------------------------------------------------
-- Server version	5.7.21-0ubuntu0.16.04.1

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
-- Table structure for table `ticketSystem`
--

DROP TABLE IF EXISTS `ticketSystem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticketSystem` (
  `id` int(11) DEFAULT NULL,
  `ticketNo` int(11) NOT NULL,
  `license` varchar(45) DEFAULT NULL,
  `permit` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `vehicle` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `violation` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `issued` varchar(45) DEFAULT NULL,
  `paid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ticketNo`),
  UNIQUE KEY `ticketNo_UNIQUE` (`ticketNo`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketSystem`
--

LOCK TABLES `ticketSystem` WRITE;
/*!40000 ALTER TABLE `ticketSystem` DISABLE KEYS */;
INSERT INTO `ticketSystem` VALUES (1,8359,'74KJ2','2389','TX','HONDA','BLACK','DOUBLE PARKING','10-05-17','HARLINGEN','14:50','DANIEL','unpaid'),(2,8492,'32JK3','5427','TX','FORD','BLUE','NO PERMIT','09-08-18','BROWNSVILLE','13:10','LUIS','unpaid');
/*!40000 ALTER TABLE `ticketSystem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-20 21:18:28
