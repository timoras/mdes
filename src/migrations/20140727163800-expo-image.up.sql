CREATE TABLE IF NOT EXISTS expo_item(
  id BIGINT not null,
  expo_id BIGINT not null references expo(id),
  name VARCHAR not null,
  description VARCHAR,
  file_path VARCHAR not null UNIQUE,
  primary key (id)
);
--;;
create sequence expo_item_seq;
--;;
insert into expo_item
  (id, expo_id, name, description, file_path)
  values
  (nextval('expo_item_seq'), 1, 'imgName1', 'imgDesctiption1', 'path1'),
  (nextval('expo_item_seq'), 1, 'imgName2', 'imgDesctiption2', 'path2');


