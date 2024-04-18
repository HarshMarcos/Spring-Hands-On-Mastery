CREATE TABLE book_details (
    id INT PRIMARY KEY,
    book_title VARCHAR(255),
    book_publisher VARCHAR(255),
    book_isbn VARCHAR(20),
    book_number_of_pages INT,
    book_year INT
);

INSERT INTO book_details (id, book_title, book_publisher, book_isbn, book_number_of_pages, book_year)
VALUES
    (1, '.NET Core in Action', 'Alpha', '978-1-61729-427-3', 336, 2018),
    (2, '.NET IL Assembler', 'Beta', '978-1-484221-10-5', 176, 2016);
    
SELECT `book_details`.`id`,
    `book_details`.`book_title`,
    `book_details`.`book_publisher`,
    `book_details`.`book_isbn`,
    `book_details`.`book_number_of_pages`,
    `book_details`.`book_year`
FROM `book_store`.`book_details`;
