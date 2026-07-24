\encoding UTF-8

CREATE TABLE fct_print_img
(print_seq numeric  NOT NULL,
picture_id varchar (100) NOT NULL,
filename varchar (1024) NOT NULL,
img numeric  NOT NULL
);


ALTER TABLE fct_print_img
ADD CONSTRAINT fct_print_img_pk PRIMARY KEY(print_seq,picture_id);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_print_img','img');

