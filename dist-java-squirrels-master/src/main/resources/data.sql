insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values(1, 'Ratufa macroura', 'Grizzled giant squirrel', 'Sri Lanka', 'ggs.jpg', 1, 6);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (2, 'Petaurista philippensis', 'Indian giant flying squirrel', 'India and China', 'igfs.jpg', 2, 8);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (3, 'Pteromys momonga', 'Japanese dwarf flying squirrel', 'Japan', 'jdfs.jpg', 2, 4);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (4, 'Petaurista petaurista', 'Red giant flying squirrel', 'Southeast Asia', 'grfs.jpg', 2, 2);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (5, 'Callosciurus prevostii', 'Prevost''s squirrel', 'Thai-Malay Peninsula', 'ps.jpg', 3, 8);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (6, 'Ratufa indica', 'Malabar giant squirrel', 'India', 'mgs.jpg', 3, 2);

insert into squirrel(squirrel_id, species, common_name, habitat, image_file_name, rating, life_span)
values (7, 'Supreme Nutstealer', 'Goliath', 'Brooklyn', 'StrongSquirrel.jpg', 5, 3);

insert into location(location_id, name, country)
values (1, 'Kaziranga National Park, Assam', 'India');

insert into location(location_id, name, country)
values (2, 'Satpura National Park, Madhya Pradesh', 'India');

insert into location(location_id, name, country)
values (3, 'Hemis National Park, Jammu And Kashmir', 'India');

insert into location(location_id, name, country)
values (4, 'Minneriya National Park', 'Sri Lanka');

insert into location(location_id, name, country)
values (5, 'Sepilok Rehabilitation Centre', 'Malaysia');

insert into location(location_id, name, country)
values (6, 'Mai Khao Beach', 'Thailand');

insert into location(location_id, name, country)
values (7, 'Nikko National Park', 'Japan');

insert into location(location_id, name, country)
values (8, 'Jintang-Kongyu Nature Reserve', 'China');

insert into location(location_id, name, country)
values (9, 'Fengtongzhai Nature Reserve', 'China');

insert into location(location_id, name, country)
values (10, 'Brooklyn', 'New York');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(5, 6, 'Squirrel Boss 2020', 3, PARSEDATETIME('13 Sep 2020, 05:15', 'dd MMM yyyy, HH:mm') , 'yes');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(1, 4, 'Squirrel Boss 2020', 2, PARSEDATETIME('27 Aug 2020, 12:31', 'dd MMM yyyy, HH:mm'), 'yes');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(6, 1, 'Squirrel Boss 2020', 1, PARSEDATETIME('03 Sep 2020, 15:07', 'dd MMM yyyy, HH:mm'), 'no');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(2, 8, 'Squirrel Boss 2020', 3, PARSEDATETIME('04 Aug 2020, 13:56', 'dd MMM yyyy, HH:mm'), 'yes');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(3, 7, 'Rocky', 1, PARSEDATETIME('29 Aug 2020, 11:14', 'dd MMM yyyy, HH:mm'), 'no');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(2, 9, 'Sandy', 1, PARSEDATETIME('16 Aug 2020, 08:43', 'dd MMM yyyy, HH:mm'), 'no');

insert into sighting(sq_id, loc_id, spotter_name, count, spotted_at, was_friendly)
values(4, 2, 'Sandy', 1, PARSEDATETIME('28 Jul 2020, 07:37', 'dd MMM yyyy, HH:mm'), 'yes');