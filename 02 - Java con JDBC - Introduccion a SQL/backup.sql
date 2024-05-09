-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         11.1.2-MariaDB-log - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para sga-mario
CREATE DATABASE IF NOT EXISTS `sga-mario` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `sga-mario`;

-- Volcando estructura para tabla sga-mario.persona
CREATE TABLE IF NOT EXISTS `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Volcando datos para la tabla sga-mario.persona: ~0 rows (aproximadamente)
DELETE FROM `persona`;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`id_persona`, `nombre`, `apellido`) VALUES
	(1, 'Juanito', 'Perez'),
	(2, 'Karla', 'Esparza');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
