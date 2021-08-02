-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-08-2021 a las 01:46:21
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `admin_user_db_g43`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_department`
--

CREATE TABLE `tb_department` (
  `id` int(11) NOT NULL,
  `department` varchar(25) NOT NULL,
  `cant_employee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_department`
--

INSERT INTO `tb_department` (`id`, `department`, `cant_employee`) VALUES
(2, 'Sistemas', 4),
(3, 'Producción', 13),
(4, 'Contabilidad', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_employee`
--

CREATE TABLE `tb_employee` (
  `id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `document` int(11) NOT NULL,
  `id_department` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_employee`
--

INSERT INTO `tb_employee` (`id`, `name`, `document`, `id_department`) VALUES
(2, 'Martha Lucia', 20202020, 2),
(7, 'Mariana', 100254673, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_department`
--
ALTER TABLE `tb_department`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tb_employee`
--
ALTER TABLE `tb_employee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_department` (`id_department`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_department`
--
ALTER TABLE `tb_department`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tb_employee`
--
ALTER TABLE `tb_employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_employee`
--
ALTER TABLE `tb_employee`
  ADD CONSTRAINT `tb_employee_ibfk_1` FOREIGN KEY (`id_department`) REFERENCES `tb_department` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
