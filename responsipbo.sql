-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2020 at 07:45 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsipbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('amal', 'amal123');

-- --------------------------------------------------------

--
-- Table structure for table `gaji`
--

CREATE TABLE `gaji` (
  `ID` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `NoHP` varchar(20) NOT NULL,
  `Gaji` int(11) NOT NULL,
  `Jam` int(11) NOT NULL,
  `Tunjang` int(11) NOT NULL,
  `Pajak` int(11) NOT NULL,
  `Totalgaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gaji`
--

INSERT INTO `gaji` (`ID`, `Nama`, `Posisi`, `Alamat`, `NoHP`, `Gaji`, `Jam`, `Tunjang`, `Pajak`, `Totalgaji`) VALUES
('111', 'amalia', ' Manajer ', 'klaten', '2222', 1000000, 20, 300000, 10000, 1290000),
('122', 'andien', ' Programmer ', 'solo', '9999', 2000000, 10, 150000, 20000, 2130000),
('223', 'Sintia', ' Marketing ', 'condongcatur', '6234647', 3000000, 10, 150000, 30000, 3120000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
