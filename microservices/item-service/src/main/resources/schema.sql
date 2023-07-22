CREATE TABLE IF NOT EXISTS Item(
    id INTEGER AUTO_INCREMENT,
    name VARCHAR NOT NULL,
    breed VARCHAR NOT NULL,
    origin VARCHAR NOT NULL,
    primary key (id)
);

INSERT INTO Item(name, breed, origin)
VALUES('Rina', 'Shiba Inu', 'Japan');

INSERT INTO Item(name, breed, origin)
VALUES('Ren', 'Akita', 'Japan');

INSERT INTO Item(name, breed, origin)
VALUES('Rocky', 'Beagle', 'Great Britain');

INSERT INTO Item(name, breed, origin)
VALUES('Tazi', 'Afghan Hound', 'Afghanistan');

INSERT INTO Item(name, breed, origin)
VALUES('Jasper', 'Boxer', 'Germany');

INSERT INTO Item (name, breed, origin)
VALUES ('Fluffy', 'Pomeranian', 'Mountain View, CA');

INSERT INTO Item (name, breed, origin)
VALUES ('Spot', 'Pit Bull', 'Austin, TX');

INSERT INTO Item (name, breed, origin)
VALUES ('Ginger', 'Cocker Spaniel', 'Kansas City, KS');

INSERT INTO Item (name, breed, origin)
VALUES ('Lady', 'Direwolf', 'The North');

INSERT INTO Item (name, breed, origin)
VALUES  ('Sasha', 'Husky', 'Buffalo, NY');