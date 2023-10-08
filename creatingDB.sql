USE my_db;

CREATE TABLE books (
  id int NOT NULL AUTO_INCREMENT,
  title varchar(30),
  author varchar(30),
  publication_date varchar(4),
  PRIMARY KEY (id)
) ;

INSERT INTO my_db.books (title, author, publication_date)
VALUES
	('The Divine Comedy', 'Dante Alighieri', '1472'),
	('Fahrenheit 451', 'Ray Bradbury', '1953'),
	('I Am Legend', 'Richard Matheson', '1954');