-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-12-2021 a las 22:33:53
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juego_preguntas_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_cate` int(10) UNSIGNED NOT NULL,
  `descripcion_cate` varchar(50) NOT NULL,
  `nivel_dificultad_cate` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_cate`, `descripcion_cate`, `nivel_dificultad_cate`) VALUES
(1, 'Categoria 1', 1),
(2, 'Categoria 2', 2),
(3, 'Categoria 3', 3),
(4, 'Categoria 4', 4),
(5, 'Categoria 5', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego`
--

CREATE TABLE `juego` (
  `id_jueg` int(10) UNSIGNED NOT NULL,
  `id_juga_jueg` int(10) UNSIGNED NOT NULL,
  `acumulado_jueg` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `id_juga` int(10) UNSIGNED NOT NULL,
  `name_juga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`id_juga`, `name_juga`) VALUES
(1, 'angela'),
(2, 'angela'),
(3, 'MICHELL'),
(4, 'andres'),
(5, 'camilo'),
(6, 'sergio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id_preg` int(10) UNSIGNED NOT NULL,
  `descripcion_preg` varchar(50) NOT NULL,
  `id_cate_preg` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id_preg`, `descripcion_preg`, `id_cate_preg`) VALUES
(2, 'dia de la independencia de colombia', 1),
(3, 'idioma que hablan en italia', 2),
(5, 'Quien invento la imprenta?', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id_resp` int(10) UNSIGNED NOT NULL,
  `descripcion_resp` varchar(50) NOT NULL,
  `estado_resp` tinyint(4) NOT NULL,
  `id_preg_resp` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`id_resp`, `descripcion_resp`, `estado_resp`, `id_preg_resp`) VALUES
(1, '20 de julio', 1, 2),
(2, '3 de septiembre', 0, 2),
(3, '2 de junio', 0, 2),
(4, '24 de diciembre', 0, 2),
(5, 'italiano', 1, 3),
(6, 'español', 0, 3),
(7, 'mandarin', 0, 3),
(8, 'ruso', 0, 3),
(9, 'Gutemberg', 1, 5),
(10, 'alfredo nobel', 0, 5),
(11, 'vicente fernandez', 0, 5),
(12, 'shakira', 0, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ronda`
--

CREATE TABLE `ronda` (
  `id_rond` int(10) UNSIGNED NOT NULL,
  `descripcion_rond` varchar(50) NOT NULL,
  `premio_rond` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ronda`
--

INSERT INTO `ronda` (`id_rond`, `descripcion_rond`, `premio_rond`) VALUES
(1, 'Ronda 1', 200000),
(2, 'Ronda 2', 500000),
(3, 'Ronda 3', 1000000),
(4, 'Ronda 4', 1500000),
(5, 'Ronda 5', 2000000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_cate`);

--
-- Indices de la tabla `juego`
--
ALTER TABLE `juego`
  ADD PRIMARY KEY (`id_jueg`),
  ADD KEY `id_juga_jueg` (`id_juga_jueg`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`id_juga`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id_preg`),
  ADD KEY `id_cate_preg` (`id_cate_preg`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id_resp`),
  ADD KEY `id_preg_resp` (`id_preg_resp`);

--
-- Indices de la tabla `ronda`
--
ALTER TABLE `ronda`
  ADD PRIMARY KEY (`id_rond`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_cate` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `juego`
--
ALTER TABLE `juego`
  MODIFY `id_jueg` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `id_juga` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id_preg` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id_resp` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `ronda`
--
ALTER TABLE `ronda`
  MODIFY `id_rond` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `juego`
--
ALTER TABLE `juego`
  ADD CONSTRAINT `juego_ibfk_1` FOREIGN KEY (`id_juga_jueg`) REFERENCES `jugador` (`id_juga`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`id_cate_preg`) REFERENCES `categoria` (`id_cate`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_1` FOREIGN KEY (`id_preg_resp`) REFERENCES `pregunta` (`id_preg`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
