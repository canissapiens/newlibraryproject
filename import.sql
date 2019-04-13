INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (1, 'Shakespeare', 'William', 'London');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (2, 'Niziurski', 'Edmund', 'Kielce');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (3, 'Mickiewicz', 'Adam', 'Zaosie');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (4, 'Miłosz', 'Czesław', 'Szetejnie');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (5, 'Szmaglewska', 'Seweryna', 'Przygłów');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (6, 'Sapkowski', 'Andrzej', 'Łódź');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (7, 'Twain', 'Mark', 'Florida');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (8, 'Nienacki', 'Zbigniew', 'Łódź');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (9, 'Bahdaj', 'Adam', 'Zakopane');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (10, 'Dumas', 'Aleksander', 'Aisne');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (11, 'Musierowicz', 'Małgorzata', 'Poznań');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (12, 'Słowacki', 'Juliusz', 'Krzemieniec');
INSERT INTO `author` (`id_author`, `last_name`, `first_name`, `birth_place`) VALUES (13, 'Szymborska', 'Wisława', 'Kraków');


INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (3, b'0', 'intryga', '9876655678373', 334, 1500, 'trupy panie', 'Hamlet', 1);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (9, b'0', 'romans z trupem', '4345353353333', 418, 1512, 'u niego zawsze kończy się trupem', 'Romeo i Julia', 1);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (13, b'0', 'przygoda', '8354385736487', 249, 1969, 'z niespodziewanym zakończeniem', 'Siódme wtajemniczenie', 2);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (1, b'0', 'powieść', '2223336789836', 222, 1955, 'jcprdl', 'Dolina Issy', 4);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (2, b'0', 'przygoda', '4545848484737', 196, 1960, 'sie porobiło', 'Czarne stopy', 5);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (10, b'0', 'fantasy', '4686353235475', 555, 1990, 'cuda panie', 'Wiedźmin', 6);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (12, b'0', 'fantasy', '7854389563568', 436, 1993, 'to się podziało', 'Miecz przeznaczenia', 6);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (4, b'0', 'przygoda', '5678942453726', 275, 1881, 'nie do wiary', 'Książe i żebrak', 7);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (14, b'0', 'romansidło', '8658239895691', 387, 1830, 'a telimena, panie...', 'Pan Tadeusz', 3);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (7, b'0', 'draka', '9865458398463', 315, 1957, 'dla twardzieli', 'Uroczysko', 8);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (8, b'0', 'kryminał', '4545532535514', 198, 1964, 'strach się bać', 'Wyspa złoczyńców', 8);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (5, b'0', 'przygoda', '6464546355345', 312, 1964, 'duduś nie grzeb się', 'Podróż za jeden uśmiech', 9);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (11, b'0', 'awanturka', '8967543567854', 368, 1844, 'nie do wiary', 'Trzej muszkieterowie', 10);
INSERT INTO `book` (`id_book`, `borrow`, `category`, `isbn`, `pages`, `release_date`, `summary`, `title`, `author_id`) VALUES (6, b'0', 'hwc', '8567467347859', 280, 1986, 'gdzie kucharek sześć', 'Opium w rosole', 11);



