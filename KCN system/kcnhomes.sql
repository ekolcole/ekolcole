-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2022 at 03:27 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kcnhomes`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `MiddleName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `E-mail Address` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `Office_Name` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `FirstName`, `MiddleName`, `LastName`, `E-mail Address`, `username`, `password`, `Office_Name`, `location`) VALUES
(2, 'Nicole', 'Balutan', 'Morales', ' nicole@gmail.com', 'icole', 'colay', 'KCN Tubigon', ' Bohol');

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `branch` int(1) NOT NULL,
  `officename` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `Mobile_num` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`branch`, `officename`, `location`, `Mobile_num`) VALUES
(1, 'KCN Tubigon', 'Bohol', '639503559351'),
(2, 'KCN Mandaue', 'Cebu', '639056559824'),
(3, 'KCN Iloilo City', 'Iloilo', '639073829421'),
(4, 'KCN Davao City', 'Davao', '639056559824'),
(5, 'KCN Surigao', 'Surigao Del Norte', '09095665389');

-- --------------------------------------------------------

--
-- Table structure for table `house_model`
--

CREATE TABLE `house_model` (
  `housemodel_id` int(1) NOT NULL,
  `housemodel` varchar(50) NOT NULL,
  `branch` int(11) NOT NULL,
  `sqr_mtr` int(11) NOT NULL,
  `lot` int(11) NOT NULL,
  `block` int(11) NOT NULL,
  `numbedrooms` int(11) NOT NULL,
  `numbathrooms` int(11) NOT NULL,
  `numgarage` int(11) NOT NULL,
  `price` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `house_model`
--

INSERT INTO `house_model` (`housemodel_id`, `housemodel`, `branch`, `sqr_mtr`, `lot`, `block`, `numbedrooms`, `numbathrooms`, `numgarage`, `price`) VALUES
(1, 'Freya Model House', 1, 87, 1, 3, 3, 2, 1, 5000000),
(2, 'Greta Model House', 3, 125, 1, 2, 3, 3, 1, 5400000),
(3, 'Gardenia Model House', 4, 156, 2, 2, 4, 2, 1, 6800000),
(4, 'Cara Model House', 1, 160, 2, 3, 4, 3, 2, 8800000),
(5, 'Dani Model House', 3, 187, 2, 3, 5, 3, 2, 9000000),
(6, 'Casa Model House', 2, 80, 3, 3, 2, 2, 1, 4000000),
(7, 'Naya Model House', 1, 79, 2, 1, 2, 1, 1, 3500000),
(8, 'Sami Model House', 4, 79, 2, 1, 1, 1, 1, 2000000),
(9, 'Clarita Model House', 2, 250, 3, 4, 4, 2, 2, 15000000),
(10, 'Wensley Model House', 1, 150, 1, 2, 2, 2, 1, 8000000),
(11, 'Clarence Model House', 3, 100, 3, 2, 2, 1, 1, 6000000),
(12, 'Cassey Model House', 4, 200, 2, 6, 2, 1, 1, 6500000),
(13, 'Granda Model House', 2, 250, 3, 5, 3, 2, 2, 10500000),
(14, 'Yuan Model House', 3, 150, 2, 6, 2, 2, 1, 7500000),
(15, 'Grey Model House', 4, 300, 1, 4, 4, 4, 2, 15000000),
(16, 'Lovey Model House', 2, 200, 3, 5, 4, 2, 1, 12000000),
(17, 'Ayala House Model', 2, 100, 1, 1, 2, 2, 1, 4000000),
(18, 'Bethany Model House', 4, 120, 3, 3, 2, 1, 1, 5500000),
(19, 'Nicey Model House', 4, 150, 2, 3, 2, 1, 1, 4500000);

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `user_id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `middlename` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `Email Address` varchar(50) NOT NULL,
  `Mobile Number` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`user_id`, `firstname`, `middlename`, `lastname`, `Gender`, `Address`, `username`, `password`, `Email Address`, `Mobile Number`) VALUES
(1, 'Jon', 'Stark', 'Snow', 'Male', 'Cogon, Tubigon, Bohol', 'jonsnow', 'jonstark', 'jon@yahoo.com', '09348204938'),
(2, 'Nicole', 'Morales', 'Palwa', 'Female', 'Banlasan, Tubigon, Bohol', 'cole', 'colay', 'colecole@gmail.com', '095827481648'),
(3, 'Chandlee Rey', 'Almedilla', 'Belarmino', 'Male', 'Tinangnan, Tubigon, Bohol', 'Chang', 'Lee', 'chandleerey54@gmail.com', '09827183728'),
(5, 'Kim', 'Boligao', 'Concha', 'Male', 'Cogon, Tubigon, Bohol', 'kim123', 'Justine', 'Kimjustine@yahoo.com', '09786754325'),
(6, 'Glenn Cyril', 'Bugwak', 'Garidos', 'Male', 'Cabudburan, Calape, Bohol', 'jorge', 'bugwak', 'cyril@gmail.com', '09080706050');

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `reservations_id` int(1) NOT NULL,
  `user_id` int(1) NOT NULL,
  `housemodel` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `interestrate` varchar(50) NOT NULL,
  `downpayment` double NOT NULL,
  `numperiod` varchar(50) NOT NULL,
  `totalpayable` double NOT NULL,
  `paymentsched` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`reservations_id`, `user_id`, `housemodel`, `price`, `interestrate`, `downpayment`, `numperiod`, `totalpayable`, `paymentsched`) VALUES
(1, 2, 'Casa Model House', 4000000, '4', 300000, '15', 158571.43, '07/ 21/ 22'),
(2, 3, 'Freya Model House', 5000000, '10', 200000, '3', 720000, '12/ 12/ 22'),
(3, 3, 'Freya Model House', 5000000, '10', 1500000, '4', 466666.67, '12/ 12/ 25');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`branch`);

--
-- Indexes for table `house_model`
--
ALTER TABLE `house_model`
  ADD PRIMARY KEY (`housemodel_id`),
  ADD KEY `branch` (`branch`);

--
-- Indexes for table `login_info`
--
ALTER TABLE `login_info`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservations_id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `branch`
--
ALTER TABLE `branch`
  MODIFY `branch` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `house_model`
--
ALTER TABLE `house_model`
  MODIFY `housemodel_id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `login_info`
--
ALTER TABLE `login_info`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `reservations_id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `house_model`
--
ALTER TABLE `house_model`
  ADD CONSTRAINT `house_model_ibfk_1` FOREIGN KEY (`branch`) REFERENCES `branch` (`branch`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `login_info` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
