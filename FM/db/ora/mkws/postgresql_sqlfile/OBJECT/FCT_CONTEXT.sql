\encoding UTF-8

CREATE TABLE fct_context
(pid numeric (10) NOT NULL,
co_cd varchar (10) NULL,
user_id varchar (500) NULL,
lcl_cd varchar (20) NULL
);


ALTER TABLE fct_context
ADD CONSTRAINT fct_context_pk PRIMARY KEY(pid);

