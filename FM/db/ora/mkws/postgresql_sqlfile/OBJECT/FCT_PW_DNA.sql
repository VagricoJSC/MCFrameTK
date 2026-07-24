\encoding UTF-8

CREATE TABLE fct_pw_dna
(user_id varchar (500) NOT NULL,
dna_cnt numeric (5) NOT NULL,
dna_tm timestamp(0)  NOT NULL
);


ALTER TABLE fct_pw_dna
ADD CONSTRAINT fct_pw_dna_pk PRIMARY KEY(user_id);

