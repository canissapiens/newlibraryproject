-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Wersja serwera:               10.1.37-MariaDB - mariadb.org binary distribution
-- Serwer OS:                    Win32
-- HeidiSQL Wersja:              10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Zrzut struktury tabela library.author
DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
  `id_author` bigint(20) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) NOT NULL,
  `birth_place` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_author`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- Zrzucanie danych dla tabeli library.author: ~13 rows (około)
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES
	(1, 'Shakespeare', 'William', 'London'),
	(2, 'Niziurski', 'Edmund', 'Kielce'),
	(3, 'Mickiewicz', 'Adam', 'Zaosie'),
	(4, 'Miłosz', 'Czesław', 'Szetejnie'),
	(5, 'Szmaglewska', 'Seweryna', 'Przygłów'),
	(6, 'Sapkowski', 'Andrzej', 'Łódź'),
	(7, 'Twain', 'Mark', 'Florida'),
	(8, 'Nienacki', 'Zbigniew', 'Łódź'),
	(9, 'Bahdaj', 'Adam', 'Zakopane'),
	(10, 'Dumas', 'Aleksander', 'Aisne'),
	(11, 'Musierowicz', 'Małgorzata', 'Poznań'),
	(12, 'Słowacki', 'Juliusz', 'Krzemieniec'),
	(13, 'Szymborska', 'Wisława', 'Kraków');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;

-- Zrzut struktury tabela library.book
DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id_book` bigint(20) NOT NULL AUTO_INCREMENT,
  `borrow` bit(1) NOT NULL DEFAULT b'0',
  `category` varchar(255) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `pages` int(11) DEFAULT NULL,
  `release_date` int(11) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_book`),
  KEY `FKklnrv3weler2ftkweewlky958` (`author_id`),
  CONSTRAINT `FKklnrv3weler2ftkweewlky958` FOREIGN KEY (`author_id`) REFERENCES `author` (`id_author`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- Zrzucanie danych dla tabeli library.book: ~14 rows (około)
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES
	(1, b'0', 'powieść', '2223336789834', 225, 1955, 'jcprdl', 'Dolina Issy', 4),
	(2, b'0', 'przygoda', '4545848484737', 196, 1960, 'sie porobiło', 'Czarne stopy', 5),
	(3, b'0', 'intryga', '9876655678373', 334, 1500, 'trupy panie', 'Hamlet', 1),
	(4, b'0', 'przygoda', '5678942453726', 275, 1881, 'nie do wiary', 'Książe i żebrak', 7),
	(5, b'0', 'przygoda', '6464546355345', 312, 1964, 'duduś nie grzeb się', 'Podróż za jeden uśmiech', 9),
	(6, b'0', 'hwc', '8567467347859', 280, 1986, 'gdzie kucharek sześć', 'Opium w rosole', 11),
	(7, b'0', 'draka', '9865458398463', 315, 1957, 'dla twardzieli', 'Uroczysko', 8),
	(8, b'0', 'kryminał', '4545532535514', 198, 1964, 'strach się bać', 'Wyspa złoczyńców', 8),
	(9, b'0', 'romans z trupem', '4345353353333', 418, 1512, 'u niego zawsze kończy się trupem', 'Romeo i Julia', 1),
	(10, b'0', 'fantasy', '4686353235475', 555, 1990, 'cuda panie', 'Wiedźmin', 6),
	(11, b'0', 'awanturka', '8967543567854', 368, 1844, 'nie do wiary', 'Trzej muszkieterowie', 10),
	(12, b'0', 'fantasy', '7854389563568', 436, 1993, 'to się podziało', 'Miecz przeznaczenia', 6),
	(13, b'0', 'przygoda', '8354385736487', 249, 1969, 'z niespodziewanym zakończeniem', 'Siódme wtajemniczenie', 2),
	(14, b'0', 'romansidło', '8658239895691', 387, 1830, 'a telimena, panie...', 'Pan Tadeusz', 3);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;

-- Zrzut struktury tabela library.borrow
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE IF NOT EXISTS `borrow` (
  `book_id` bigint(20) NOT NULL,
  `borrower_id` bigint(20) NOT NULL,
  PRIMARY KEY (`book_id`,`borrower_id`),
  KEY `FKissrcc41xgxpf53wfga2mlmu5` (`borrower_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Zrzucanie danych dla tabeli library.borrow: ~0 rows (około)
/*!40000 ALTER TABLE `borrow` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrow` ENABLE KEYS */;

-- Zrzut struktury tabela library.borrower
DROP TABLE IF EXISTS `borrower`;
CREATE TABLE IF NOT EXISTS `borrower` (
  `id_borrower` bigint(20) NOT NULL AUTO_INCREMENT,
  `borrower_details_id` bigint(20) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `id_borrower_detail` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_borrower`),
  KEY `FKpo7pbkvlr8qsjul8we4tx15qy` (`id_borrower_detail`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Zrzucanie danych dla tabeli library.borrower: ~0 rows (około)
/*!40000 ALTER TABLE `borrower` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrower` ENABLE KEYS */;

-- Zrzut struktury tabela library.borrower_details
DROP TABLE IF EXISTS `borrower_details`;
CREATE TABLE IF NOT EXISTS `borrower_details` (
  `id_borrower_details` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_borrower_details`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Zrzucanie danych dla tabeli library.borrower_details: ~0 rows (około)
/*!40000 ALTER TABLE `borrower_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrower_details` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
