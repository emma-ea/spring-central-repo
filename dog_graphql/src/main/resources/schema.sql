CREATE TABLE IF NOT EXISTS Dog(
    id INTEGER AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    breed VARCHAR(255) NOT NULL,
    origin VARCHAR(255) NOT NULL,
    primary key (id)
);

INSERT INTO Dog(name, breed, origin)
VALUES('Rina', 'Shiba Inu', 'Japan');

INSERT INTO Dog(name, breed, origin)
VALUES('Ren', 'Akita', 'Japan');

INSERT INTO Dog(name, breed, origin)
VALUES('Rocky', 'Beagle', 'Great Britain');

INSERT INTO Dog(name, breed, origin)
VALUES('Tazi', 'Afghan Hound', 'Afghanistan');

INSERT INTO Dog(name, breed, origin)
VALUES('Jasper', 'Boxer', 'Germany');

INSERT INTO Dog (name, breed, origin)
VALUES ('Fluffy', 'Pomeranian', 'Mountain View, CA');

INSERT INTO Dog (name, breed, origin)
VALUES ('Spot', 'Pit Bull', 'Austin, TX');

INSERT INTO Dog (name, breed, origin)
VALUES ('Ginger', 'Cocker Spaniel', 'Kansas City, KS');

INSERT INTO Dog (name, breed, origin)
VALUES ('Lady', 'Direwolf', 'The North');

INSERT INTO Dog (name, breed, origin)
VALUES  ('Sasha', 'Husky', 'Buffalo, NY');