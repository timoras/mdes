CREATE TABLE IF NOT EXISTS expo(
  id BIGINT not null,
  name VARCHAR not null,
  description VARCHAR not null,
  url_code VARCHAR not null UNIQUE,
  secret_code VARCHAR not null,
  primary key (id)
);
--;;
create sequence expo_seq;