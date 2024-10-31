-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-10-2024 a las 01:23:04
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gbox`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(50) NOT NULL,
  `descripcionProducto` varchar(200) NOT NULL,
  `categoria` varchar(15) NOT NULL,
  `imgProducto` varchar(50) NOT NULL,
  `precioProducto` decimal(20,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcionProducto`, `categoria`, `imgProducto`, `precioProducto`) VALUES
(1, 'Wafle Primavera', 'Waffle con crema dulce y naranja en conserva caramelizada', 'desayuno', '../img_comidas/DESAYUNOS/Wafle_primavera.png', 12500.00),
(2, 'Tostada Napolitana', 'Tostada de pan de masa madre, salsa napolitana, huevo estrellado y se acompaña con café con leche', 'desayuno', '../img_comidas/DESAYUNOS/Tostada_napolitana.png', 16500.00),
(3, 'Bowl Exotic', 'Mariscos salteados, una base de vegetales (Aguacate, lechuga y acelgas) y huevo estrellado', 'desayuno', '../img_comidas/DESAYUNOS/Bowl_exotic.png', 18500.00),
(4, 'Solomito en Cerveza', 'Porción de 700g de solomito marinado en cerveza artesanal, acompañado de papas y ensalada.', 'almuerzo', '../img_comidas/ALMUERZOS/solomito_en_cerveza.png', 22500.00),
(5, 'Bowl Junior', 'Pollo crunchy con una base de huevo cocido y vegetales: aguacate, tomate cherry y lechuga iceberg.', 'almuerzo', '../img_comidas/ALMUERZOS/bowl_junior.png', 22500.00),
(6, 'Marinado Senior', 'Porción de pulpo de la casa acompañado de papas fileteadas al horno en salsa amarrilla', 'almuerzo', '../img_comidas/ALMUERZOS/marinado_senior.png', 34500.00),
(7, 'Gourmet Romero', 'Porción de costilla asada con papas criollas y base de salsa de champiñones', 'almuerzo', '../img_comidas/ALMUERZOS/gourmet_romero.png', 34500.00),
(8, 'Rojo Escarlata', 'Manjar de leche acompañado por cerezas, sobre una cama de red veltet.', 'postre', '../img_comidas/POSTRES/porstreescarlata.jpg', 16500.00),
(9, 'Vainilla Invierno', 'Helado de vainilla, junto a frutos secos y polvo de chocolate amargo.', 'postre', '../img_comidas/POSTRES/Postreinvierno.jpg', 12500.00),
(10, 'Verde Aguacate', 'Helado de aguacate acompañado de uvas chilenas y una crema dulce de espinacas.', 'postre', '../img_comidas/POSTRES/postreverdeagucate.jpg', 12500.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosagregados`
--

CREATE TABLE `productosagregados` (
  `idProductosAgregados` int(11) NOT NULL,
  `usuarioId` int(10) NOT NULL,
  `productoId` int(10) NOT NULL,
  `cantidadProducto` int(10) NOT NULL,
  `subtotal` decimal(20,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `productosagregados`
--

INSERT INTO `productosagregados` (`idProductosAgregados`, `usuarioId`, `productoId`, `cantidadProducto`, `subtotal`) VALUES
(1, 2, 1, 2, 25000.00),
(2, 3, 2, 1, 16500.00),
(3, 4, 3, 3, 55500.00),
(4, 5, 4, 1, 22500.00),
(5, 6, 5, 2, 45000.00),
(6, 2, 6, 1, 34500.00),
(7, 3, 7, 1, 34500.00),
(8, 4, 8, 2, 33000.00),
(9, 5, 9, 1, 12500.00),
(10, 6, 10, 3, 37500.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resumencompra`
--

CREATE TABLE `resumencompra` (
  `idResumenCompra` int(11) NOT NULL,
  `usuarioId` int(11) NOT NULL,
  `precioTotalProductos` double NOT NULL,
  `precioDomicilio` decimal(10,2) NOT NULL,
  `precioTotal` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `resumencompra`
--

INSERT INTO `resumencompra` (`idResumenCompra`, `usuarioId`, `precioTotalProductos`, `precioDomicilio`, `precioTotal`) VALUES
(1, 2, 59500, 12000.00, 71500.00),
(2, 3, 51000, 12000.00, 63000.00),
(3, 4, 68500, 12000.00, 80500.00),
(4, 5, 35000, 12000.00, 47000.00),
(5, 6, 95000, 12000.00, 107000.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suscripcion`
--

CREATE TABLE `suscripcion` (
  `idSuscripcion` int(11) NOT NULL,
  `nombrePlan` varchar(100) NOT NULL,
  `descripcionPlan` varchar(200) NOT NULL,
  `precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `suscripcion`
--

INSERT INTO `suscripcion` (`idSuscripcion`, `nombrePlan`, `descripcionPlan`, `precio`) VALUES
(1, 'Box Senior', '5 Almuerzos de nuestra carta, Postre gourmet, 25 % de Cashback', 320000.00),
(2, 'Box Friends', '10 Almuerzos para compartir, Limonada natural, 25 % de Cashback', 310000.00),
(3, 'Box Code BreakFast', '3 Desayunos (Personalizados), Latte, Postre saludable', 300000.00),
(4, 'Debug Box', '3 Desayunos, 3 Almuerzos, Bebida del día', 340000.00),
(5, 'Bakend Power', '4 Almuerzos (Personalizados), Bebida del día, Sopa del día', 250000.00),
(6, 'Senior Box Deluxe', '3 Desayunos (Personalizados), 2 Almuerzos ligeros, Smoothie proteico', 320000.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `contraseña` varchar(200) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `esAdmistrador` tinyint(4) NOT NULL,
  `suscripcionId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `userName`, `contraseña`, `correo`, `telefono`, `esAdmistrador`, `suscripcionId`) VALUES
(1, 'Software sinfoni', 'admin', '1e5a20531399139d', 'softwaresinfoni@gmail.com', '6045555555', 1, NULL),
(2, 'john forer', 'john', '1d3828ef1337', 'johnforero@hotmail.com', '3201235654', 0, NULL),
(3, 'Eduard Idrobo', 'Eduard', '1b392df62ccd1337', 'Eduard@hotmail.com', '3201234567', 0, NULL),
(4, 'Mafe Saavedra', 'Mafe', '1e56281e1337', 'MafeSaavedra@hotmail.com.co', '3215165454', 0, NULL),
(5, 'RafaArteaga', 'Rafa', '204a281a1337', 'rafa@hotmail.com', '3321546987', 0, NULL),
(6, 'John Alexander', 'Alex', '1d3828ef1337', 'johnalexfr@hotmail.com', '3202173409', 0, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `productosagregados`
--
ALTER TABLE `productosagregados`
  ADD PRIMARY KEY (`idProductosAgregados`),
  ADD KEY `usuarioId` (`usuarioId`),
  ADD KEY `productoId` (`productoId`);

--
-- Indices de la tabla `resumencompra`
--
ALTER TABLE `resumencompra`
  ADD PRIMARY KEY (`idResumenCompra`),
  ADD KEY `usuarioId` (`usuarioId`);

--
-- Indices de la tabla `suscripcion`
--
ALTER TABLE `suscripcion`
  ADD PRIMARY KEY (`idSuscripcion`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `suscripcionId` (`suscripcionId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `productosagregados`
--
ALTER TABLE `productosagregados`
  MODIFY `idProductosAgregados` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `resumencompra`
--
ALTER TABLE `resumencompra`
  MODIFY `idResumenCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `suscripcion`
--
ALTER TABLE `suscripcion`
  MODIFY `idSuscripcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productosagregados`
--
ALTER TABLE `productosagregados`
  ADD CONSTRAINT `productosagregados_ibfk_1` FOREIGN KEY (`usuarioId`) REFERENCES `usuario` (`idUsuario`),
  ADD CONSTRAINT `productosagregados_ibfk_2` FOREIGN KEY (`productoId`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `resumencompra`
--
ALTER TABLE `resumencompra`
  ADD CONSTRAINT `resumencompra_ibfk_1` FOREIGN KEY (`usuarioId`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`suscripcionId`) REFERENCES `suscripcion` (`idSuscripcion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
