INSERT INTO author (id, first_name, last_name) VALUES (1, 'Emanuele', 'Giarlini');
INSERT INTO post (id, title, body, author_id, posted_on) VALUES (1, 'First post', 'Content of the first post', 1, CURRENT_DATE());
INSERT INTO post (id, title, body, author_id, posted_on) VALUES (2, 'Second post', 'Content of the second post', 1, CURRENT_DATE());