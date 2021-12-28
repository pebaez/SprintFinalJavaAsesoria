-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         10.4.17-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para asesoria
CREATE DATABASE IF NOT EXISTS `asesoria` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `asesoria`;

-- Volcando estructura para tabla asesoria.administrativo
CREATE TABLE IF NOT EXISTS `administrativo` (
  `idadministrativo` int(11) NOT NULL AUTO_INCREMENT,
  `rutAdministrativo` varchar(45) NOT NULL,
  `area` varchar(45) NOT NULL,
  `experienciaprevia` varchar(100) NOT NULL,
  PRIMARY KEY (`idadministrativo`,`rutAdministrativo`),
  UNIQUE KEY `rutAdministrativo_UNIQUE` (`rutAdministrativo`),
  UNIQUE KEY `idadministrativo_UNIQUE` (`idadministrativo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.administrativo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `administrativo` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrativo` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.asistentes
CREATE TABLE IF NOT EXISTS `asistentes` (
  `idasistentes` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idempresa` int(11) DEFAULT NULL,
  `rutAsistente` varchar(45) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idasistentes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.asistentes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `asistentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `asistentes` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.capacitacion
CREATE TABLE IF NOT EXISTS `capacitacion` (
  `idcapacitacion` int(11) NOT NULL AUTO_INCREMENT,
  `rut` varchar(45) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `fechacapacitacion` varchar(45) DEFAULT NULL,
  `horario` varchar(45) DEFAULT NULL,
  `duracion` varchar(45) DEFAULT NULL,
  `cantidadAsistentes` varchar(45) DEFAULT NULL,
  `comentarios` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcapacitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.capacitacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `capacitacion` DISABLE KEYS */;
INSERT INTO `capacitacion` (`idcapacitacion`, `rut`, `nombres`, `direccion`, `fechacapacitacion`, `horario`, `duracion`, `cantidadAsistentes`, `comentarios`) VALUES
	(2, '13.762.579-2', 'EMPRESA MADRID', 'VERONA 354', '2021-12-22', '13:02', '14:03', '10', 'VENTAS');
/*!40000 ALTER TABLE `capacitacion` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.checklist
CREATE TABLE IF NOT EXISTS `checklist` (
  `idchecklist` int(11) NOT NULL,
  `idempresa` varchar(45) DEFAULT NULL,
  `idvisita` varchar(45) DEFAULT NULL,
  `comentario` varchar(45) DEFAULT NULL,
  `realizado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idchecklist`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.checklist: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `checklist` DISABLE KEYS */;
/*!40000 ALTER TABLE `checklist` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `rutCliente` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `afp` varchar(45) NOT NULL,
  `sistemaSalud` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `comuna` varchar(45) NOT NULL,
  `edad` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`,`rutCliente`),
  UNIQUE KEY `idCliente_UNIQUE` (`idCliente`),
  UNIQUE KEY `rutCliente_UNIQUE` (`rutCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.cliente: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idCliente`, `rutCliente`, `telefono`, `afp`, `sistemaSalud`, `direccion`, `comuna`, `edad`) VALUES
	(10, '13.762.579-2', '994637971', 'AFP Modelo', '2.- Isapre', 'VERONA 354', 'LA SERENA', '10'),
	(12, '14.116.820-7', '994637971', 'AFP Capital', '1.- Fonasa', 'BULNES 780', 'SALAMANCA', '36');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.contacto
CREATE TABLE IF NOT EXISTS `contacto` (
  `idcontacto` int(11) NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `empresa` varchar(45) DEFAULT NULL,
  `formaContacto` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcontacto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.contacto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.pagos
CREATE TABLE IF NOT EXISTS `pagos` (
  `idpagos` int(11) NOT NULL,
  `idCapacitacion` varchar(45) DEFAULT NULL,
  `rutUsuario` varchar(45) DEFAULT NULL,
  `monto` varchar(45) DEFAULT NULL,
  `formadePago` varchar(45) DEFAULT NULL,
  `cuotas` varchar(45) DEFAULT NULL,
  `valorCuotas` varchar(45) DEFAULT NULL,
  `descuento` varchar(45) DEFAULT NULL,
  `pagoscol` varchar(45) DEFAULT NULL,
  `totalPago` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpagos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.pagos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.profesional
CREATE TABLE IF NOT EXISTS `profesional` (
  `idProfesional` int(11) NOT NULL AUTO_INCREMENT,
  `rutProfesional` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `fechaIngreso` varchar(45) NOT NULL,
  PRIMARY KEY (`idProfesional`,`rutProfesional`),
  UNIQUE KEY `rutProfesional_UNIQUE` (`rutProfesional`),
  UNIQUE KEY `idProfesional_UNIQUE` (`idProfesional`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.profesional: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `profesional` DISABLE KEYS */;
INSERT INTO `profesional` (`idProfesional`, `rutProfesional`, `titulo`, `fechaIngreso`) VALUES
	(1, '13.762.579-2', 'DISEÃador', '2021-12-21');
/*!40000 ALTER TABLE `profesional` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mail` varchar(50) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_jhck7kjdogc7yia7qamc89ypv` (`mail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.users: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `IdUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `rol` varchar(45) DEFAULT NULL,
  `rutUsuario` varchar(45) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `fechaNacimiento` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`IdUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.usuarios: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`IdUsuario`, `rol`, `rutUsuario`, `nombres`, `apellidos`, `fechaNacimiento`, `usuario`, `password`) VALUES
	(12, 'Cliente', '13.762.579-2', 'PEDRO', 'BAEZ', '2021-12-21', '13.762.579-2', '$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu'),
	(15, 'Profesional', '13.762.579-2', 'PEDRO', 'BAEZ', '2021-12-21', '13.762.579-2', '$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu'),
	(16, 'Cliente', '14.116.820-7', 'jorge', 'miranda', '1982-12-21', '14.116.820-7', '$2a$12$ZxN0fFFxcNS8tJvYRmEmMeY.r3wpdOnQyG1TN0kPjM/3EXRHrkEmu');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Volcando estructura para tabla asesoria.visitas
CREATE TABLE IF NOT EXISTS `visitas` (
  `idvisitas` int(11) NOT NULL,
  `idempresa` varchar(45) DEFAULT NULL,
  `fecha` varchar(45) DEFAULT NULL,
  `rutUsuario` varchar(45) DEFAULT NULL,
  `motivos` varchar(45) DEFAULT NULL,
  `detalle` varchar(45) DEFAULT NULL,
  `comentarios` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idvisitas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla asesoria.visitas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
