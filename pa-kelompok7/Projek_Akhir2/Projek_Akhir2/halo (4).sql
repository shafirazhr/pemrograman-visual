-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Des 2023 pada 13.40
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `halo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(30) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `nik` int(22) NOT NULL,
  `username_user` varchar(222) NOT NULL,
  `nama` varchar(222) NOT NULL,
  `telp` varchar(222) NOT NULL,
  `jenis_kelamin` set('Pria','Wanita','','') NOT NULL,
  `tanggal` date NOT NULL,
  `alamat` text NOT NULL,
  `id` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`nik`, `username_user`, `nama`, `telp`, `jenis_kelamin`, `tanggal`, `alamat`, `id`) VALUES
(123, 'sigma', '123', '1231', 'Pria', '2023-12-11', '1123', 31),
(331, 'dani', 'Dani ', '1231', 'Pria', '2023-12-13', 'LMG', 32),
(333, 'ehsan', 'Ehsan', '132213', 'Pria', '2023-12-11', 'JKT', 35),
(334, 'revalina19', 'revaa', '059098', 'Wanita', '2023-12-18', 'reee', 37),
(441, 'Jaka', 'Jaka Sambung', '1231', 'Pria', '2023-12-13', 'GRSK', 33);

-- --------------------------------------------------------

--
-- Struktur dari tabel `angsuran`
--

CREATE TABLE `angsuran` (
  `no` int(22) NOT NULL,
  `nik` int(22) NOT NULL,
  `nama` varchar(222) NOT NULL,
  `pinjaman` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `angsuran`
--

INSERT INTO `angsuran` (`no`, `nik`, `nama`, `pinjaman`) VALUES
(1, 123, '123', '123'),
(7, 441, 'Jaka Sambung', 'Rp.700.000'),
(8, 331, 'Dani', '1.000.000'),
(10, 334, 'Revalina', '1.000.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam`
--

CREATE TABLE `pinjam` (
  `nama` varchar(222) NOT NULL,
  `nik` int(22) NOT NULL,
  `tanggal` date NOT NULL,
  `barang` set('BPKB','EMAS','AKTA TANAH','HANDPHONE','LAPTOP','LAPTOP') NOT NULL,
  `pinjaman` enum('1.000.000','2.000.000','3.000.000','4.000.000','5.000.000','6.000.000','7.000.000','8.000.000','9.000.000','10.000.000') NOT NULL,
  `persetujuan` enum('--Persetujuan--','Terima','Tolak','') NOT NULL,
  `waktu` set('3 Bulan','6 Bulan','12 Bulan','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pinjam`
--

INSERT INTO `pinjam` (`nama`, `nik`, `tanggal`, `barang`, `pinjaman`, `persetujuan`, `waktu`) VALUES
('Dani', 331, '2023-12-13', 'BPKB', '1.000.000', '--Persetujuan--', '3 Bulan'),
('Ehsan', 333, '2023-12-13', 'BPKB', '1.000.000', '--Persetujuan--', '3 Bulan'),
('Jaka Sambung', 441, '2023-12-13', 'BPKB', '2.000.000', 'Terima', '3 Bulan'),
('Revalina', 334, '2023-12-18', 'EMAS', '1.000.000', 'Terima', '3 Bulan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `register`
--

CREATE TABLE `register` (
  `id` int(30) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `register`
--

INSERT INTO `register` (`id`, `username`, `password`) VALUES
(31, 'sigma', '123'),
(32, 'dani', '123'),
(33, 'Jaka', '122'),
(34, 'sigmaguntur', '123'),
(35, 'ehsan', '123'),
(36, 'Jono', '123'),
(37, 'revalina19', '112233');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`nik`),
  ADD KEY `id` (`id`);

--
-- Indeks untuk tabel `angsuran`
--
ALTER TABLE `angsuran`
  ADD PRIMARY KEY (`no`),
  ADD KEY `nik` (`nik`);

--
-- Indeks untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`nama`),
  ADD KEY `nik` (`nik`);

--
-- Indeks untuk tabel `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `anggota`
--
ALTER TABLE `anggota`
  MODIFY `nik` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=412314;

--
-- AUTO_INCREMENT untuk tabel `angsuran`
--
ALTER TABLE `angsuran`
  MODIFY `no` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `register`
--
ALTER TABLE `register`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `register` (`id`);

--
-- Ketidakleluasaan untuk tabel `angsuran`
--
ALTER TABLE `angsuran`
  ADD CONSTRAINT `angsuran_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `anggota` (`nik`);

--
-- Ketidakleluasaan untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD CONSTRAINT `nik` FOREIGN KEY (`nik`) REFERENCES `anggota` (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
