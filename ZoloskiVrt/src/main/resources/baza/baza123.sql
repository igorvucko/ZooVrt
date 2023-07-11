-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: ugovor
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.27-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `korisnik`
--

DROP TABLE IF EXISTS `korisnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `korisnik` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IBAN` varchar(255) DEFAULT NULL,
  `OIB` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `kucniBroj` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `ulica` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnik`
--

LOCK TABLES `korisnik` WRITE;
/*!40000 ALTER TABLE `korisnik` DISABLE KEYS */;
INSERT INTO `korisnik` VALUES (1,'1228-1221-1221-1431','99966905731','danial.marvin@hotmail.com','Harriet','778','Dibbert','33690 Keenan Junctions'),(2,'1234-2121-1221-1211','29754662304','jayson.cassin@yahoo.com','Sibyl','202','Aufderhar','334 Emmerich Land'),(3,'1234-2121-1221-1211','12538256638','maximo.ryan@hotmail.com','Doria','624','Berge','71801 Beth Port'),(4,'1234-2121-1221-1211','03303429593','jewel.ankunding@yahoo.com','Angila','343','Morar','557 Graham Locks'),(5,'1228-1221-1221-1431','46131068905','luvenia.wilkinson@yahoo.com','Otis','907','Grant','46107 Amos Shoal'),(24,'HR23982574574897659469346','0987654321','ikordun@gmail.com','Ivan','Kneza Trpimira','Kordun','28'),(25,'HR48274897487489724','43384527596','mniki@gmail.com','Miki','74','Niki','Radićeva'),(26,'HR48274897487489724','43384527596','mniki@gmail.com','Gordana','74','Horvat','Radićeva'),(27,'HR504305707353553534','33696940347','ffffffff@gmail.com','Florijan','67','florijanski','Ulica sv. Petra i Pavla '),(28,'HR84727842974298797590','33696940347','fikijevf@gmail.com','Florijan','46','Fikijev','Meduzina ulica'),(29,'HR972402065781939556','86551642617','mpolo@gmail.com','Marko','56','Polo','Adolfova ulica'),(30,'HR7624840809715292777','93456232381','nosic@gmail.com','Rudolf','666','Crveni','Sj. pol'),(31,'HR6824020066965558425','01905674312','robertrofl@net.hr','Robert','56','Rofl','Robertova ulica'),(32,'HR6824020066965558425','95443460340','robertrofl@net.hr','Milica','56','Rofl','Robertova ulica'),(33,'HR7224840086733848178','14976632159','otiso@gmail.com','Otis','56','Otisovic','Ulica sv. Marka');
/*!40000 ALTER TABLE `korisnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ugovor`
--

DROP TABLE IF EXISTS `ugovor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ugovor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `brojUgovora` varchar(255) DEFAULT NULL,
  `cijena` decimal(38,2) DEFAULT NULL,
  `cijenaSlovima` varchar(255) DEFAULT NULL,
  `datum` datetime(6) DEFAULT NULL,
  `nazivProjekta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ugovor`
--

LOCK TABLES `ugovor` WRITE;
/*!40000 ALTER TABLE `ugovor` DISABLE KEYS */;
INSERT INTO `ugovor` VALUES (1,'676623',510033.00,'turtle ','1959-11-16 06:45:08.621000','Kendrick Thiel'),(2,'842876',7.00,'prairie dog','1974-11-22 08:08:00.893000','Ward Barton'),(3,'474838',7.00,'wombat','1983-06-08 17:25:32.328000','Paris Wiza II'),(4,'760019',394804202.00,'elk','1983-01-15 20:54:39.182000','Spring Boehm'),(5,'921715',434926.00,'dog','1992-05-22 16:59:47.510000','Thanh Moen'),(6,'1234/asd',199.99,NULL,NULL,'Ciscenje parka'),(7,'hewk',45897.50,'pedestgosameklöjf',NULL,'hdkejwh'),(8,'4309573',344.00,'lololo',NULL,'Ciscenje parka'),(9,'97797979',445.88,'werdftgz',NULL,'');
/*!40000 ALTER TABLE `ugovor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ugovor'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-08 10:11:45
