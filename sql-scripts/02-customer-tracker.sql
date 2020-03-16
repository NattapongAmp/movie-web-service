CREATE DATABASE  IF NOT EXISTS `nmovie`
USE `nmovie`;

DROP TABLE IF EXISTS `movie_list`;

CREATE TABLE movie_list (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `release_date` varchar(30) DEFAULT NULL,
  `describe` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `movie_list`(`title`, `release_date`, `describe`) VALUES  
	('A Star Is Born','2018-10-11','After falling in love with struggling artist Ally, Jackson, a musician, coaxes her to follow her dreams, while he battles with alcoholism and his personal demons.'),
	('The Secret Life of Walter Mitty','2013-12-19','A man living a dull life dreams up romantic and action-filled scenarios in order to escape from monotony. When his own job is threatened, he sets out on a real romantic and action-packed journey.'),
	('500 Days of Summer','2009-07-17','Tom revisits the approximate one year he shared with Summer, the girl he thought he could spend the rest of his life with. She, on the other hand, does not believe in relationships or boyfriends.'),
	('Notting Hill','1999-07-30','William, a British bookseller, meets and falls in love with Anna, a high-profile American actress. However, their relationship goes through many problems due to their different social statuses.');

