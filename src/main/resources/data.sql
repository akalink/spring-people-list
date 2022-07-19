INSERT INTO ethnicity (ethnicity)
VALUES ('White'),
('Black or African American'),
('American Indian or Alaska Native'),
('Asian'),
('Native Hawaiian or Other Pacific Islander');

INSERT INTO gender (gender)
VALUES ('Male'),
('Female'),
('Non-binary'),
('Other');

INSERT INTO person (full_name, age, gender_id, ethnicity_id)
VALUES ('John Robert Matz', 34, 1, 1),
('Robby Duguay', 30, 1,1),
('Laura Baily', 41,2,1),
('Sam', 52,1,5),
('Sammi', 13, 3,3);