-- MySQL dump 10.13  Server Version Distrib 8.0.13, for Linux (x86_64) Fedora release 28 (Twenty Eight)
-- Host: localhost    Database: AGRO
-- Ibarra Gustavo | ibarrags@gmail.com 
-- Este DUMP SQL abarca el siguiente puntos reflejado en la consignas a resolver: 
-- "Crear la base de datos, utilizando la herramienta MySQL Workbench.
-- Crear un script de exportación de la base de datos."

CREATE DATABASE  IF NOT EXISTS `AGRO` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

USE `AGRO`;



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Cultivo`
--

DROP TABLE IF EXISTS `Cultivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Cultivo` (
  `idCultivo` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `fkLaboreo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCultivo`),
  KEY `fkCultivoLaboreo` (`fkLaboreo`),
  CONSTRAINT `fkCultivoLaboreo` FOREIGN KEY (`fkLaboreo`) REFERENCES `Laboreo` (`idlaboreo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `EmpresaAdministradora`
--

DROP TABLE IF EXISTS `EmpresaAdministradora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `EmpresaAdministradora` (
  `idEmpresaAdministradora` int(11) NOT NULL AUTO_INCREMENT,
  `RazonSocial` varchar(45) NOT NULL,
  `pkEstablecimiento` int(10) NOT NULL,
  PRIMARY KEY (`idEmpresaAdministradora`),
  KEY `fkEmpresa_Establecimiento` (`pkEstablecimiento`),
  CONSTRAINT `fkEmpresa_Establecimiento` FOREIGN KEY (`pkEstablecimiento`) REFERENCES `Establecimiento` (`idestablecimiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Establecimiento`
--

DROP TABLE IF EXISTS `Establecimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Establecimiento` (
  `idEstablecimiento` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Superficie` int(11) NOT NULL,
  `fkEstadoCampo` int(11) DEFAULT NULL,
  `fkLote` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEstablecimiento`),
  KEY `fkEstablecimiento_EstadoCampo` (`fkEstadoCampo`),
  KEY `fkEstablecimiento_Lote` (`fkLote`),
  CONSTRAINT `fkEstablecimiento_EstadoCampo` FOREIGN KEY (`fkEstadoCampo`) REFERENCES `EstadoCampo` (`idestadocampo`),
  CONSTRAINT `fkEstablecimiento_Lote` FOREIGN KEY (`fkLote`) REFERENCES `Lote` (`idlote`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `EstadoCampo`
--

DROP TABLE IF EXISTS `EstadoCampo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `EstadoCampo` (
  `idEstadoCampo` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstadoCampo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `EstadoProyecto`
--

DROP TABLE IF EXISTS `EstadoProyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `EstadoProyecto` (
  `idEstadoProyecto` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstadoProyecto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Laboreo`
--

DROP TABLE IF EXISTS `Laboreo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Laboreo` (
  `idLaboreo` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Orden` int(11) NOT NULL,
  `Momento` varchar(45) NOT NULL,
  PRIMARY KEY (`idLaboreo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Lote`
--

DROP TABLE IF EXISTS `Lote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Lote` (
  `idLote` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` int(11) NOT NULL,
  `superficie` int(11) NOT NULL,
  `fkSuelo` int(11) DEFAULT NULL,
  `fkProyectoActual` int(11) DEFAULT NULL,
  `fkProyectoHistorial` int(11) DEFAULT NULL,
  PRIMARY KEY (`idLote`),
  KEY `fkLote_Suelo` (`fkSuelo`),
  KEY `fkLoteProyectoActual` (`fkProyectoActual`),
  CONSTRAINT `fkLoteProyectoActual` FOREIGN KEY (`fkProyectoActual`) REFERENCES `Proyecto` (`idproyecto`),
  CONSTRAINT `fkLote_Suelo` FOREIGN KEY (`fkSuelo`) REFERENCES `Suelo` (`idsuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Proyecto`
--

DROP TABLE IF EXISTS `Proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Proyecto` (
  `idProyecto` int(11) NOT NULL AUTO_INCREMENT,
  `fkEstadoProyecto` int(11) DEFAULT NULL,
  `fkLaboreoActual` int(11) DEFAULT NULL,
  `fkCultivo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProyecto`),
  KEY `fkEstadoProyecto` (`fkEstadoProyecto`),
  KEY `fkProyectoLaboreo` (`fkLaboreoActual`),
  KEY `fkProyectoCultivo` (`fkCultivo`),
  CONSTRAINT `fkEstadoProyecto` FOREIGN KEY (`fkEstadoProyecto`) REFERENCES `EstadoProyecto` (`idestadoproyecto`),
  CONSTRAINT `fkProyectoCultivo` FOREIGN KEY (`fkCultivo`) REFERENCES `Cultivo` (`idcultivo`),
  CONSTRAINT `fkProyectoLaboreo` FOREIGN KEY (`fkLaboreoActual`) REFERENCES `Laboreo` (`idlaboreo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Suelo`
--

DROP TABLE IF EXISTS `Suelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Suelo` (
  `idSuelo` int(11) NOT NULL AUTO_INCREMENT,
  `Suelo` varchar(45) NOT NULL,
  PRIMARY KEY (`idSuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-13 20:57:36


