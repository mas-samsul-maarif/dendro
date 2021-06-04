-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2021 at 02:15 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dendro`
--

-- --------------------------------------------------------

--
-- Table structure for table `hama`
--

CREATE TABLE `hama` (
  `no` int(18) NOT NULL,
  `hama` varchar(50) NOT NULL,
  `solusi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hama`
--

INSERT INTO `hama` (`no`, `hama`, `solusi`) VALUES
(1, 'Tikus', 'Menutup lubang yang ada disekitar sawah yang digunakan sebagai tempat persembunyian, lalu menangkap tikus, Gunakan ular yang sudah dijinakkan untuk mengusir atau memangsa tikus, dan menggunakan pembasmi tikus atau umpan beracun digunakan secara berhati-hati.'),
(2, 'Ulat', 'Mengecek bagian bawah daun apabila terdapat telur kupu berwarna putih maka segera dibersihkan, Genangilah tempat persemaian dengan air agar ulat naik ke atas dan mudah untuk dibasmi, dan apabila cara sebelumnya tidak efektif, maka opsi terakhir adalah dengan menggunakan pestisida.'),
(3, 'Walang Sangit', 'Menerapkan sistem tanam serentak, Menjaga kebersihan sawah dari rumput liar, Menangkap walang sangit, Menanam jamur yang memberikan efek bagi walang sangit, Menggunakan predator seperti laba-laba, dan menggunakan insektisida.'),
(4, 'Wereng', 'Mengatur Pola Tanam pada tanaman dengan melakukan penanaman bersamaan atau bergilir untuk memutus siklus hidup hama wereng, Menggunakan Predator seperti kumbang Paederuss fuscipes, Ophinea nigrofasciata dan laba-laba Lycosa Pseudoannulata, dan Menggunakan insektisida. Namun cara ini harus dilakukan dengan efisien dan tetap dengan menjaga lingkungan.'),
(5, 'Penyakit Tungro', 'Tanam secara serempak, pengaturan waktu tanam, varietas tahan, sanitasi lingkungan, dan penyemprotan insektisida.'),
(6, 'Penyakit Mosaik', 'Gunakan varietas yang tahan penyakit atau toleran. Gunakan uap-pasteurisasi untuk membersihkan tanah dari virus. Jangan menanam di lahan yang sebelumnya terinfeksi oleh virus. Optimalkan penanganan tanaman dengan mencuci tangan, memakai sarung tangan dan mendesinfeksi peralatan kerja Anda.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hama`
--
ALTER TABLE `hama`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hama`
--
ALTER TABLE `hama`
  MODIFY `no` int(18) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
