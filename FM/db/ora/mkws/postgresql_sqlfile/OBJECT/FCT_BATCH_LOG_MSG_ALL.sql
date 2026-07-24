\encoding UTF-8

CREATE TABLE fct_batch_log_msg_all
(batch_log_no varchar (15) NOT NULL,
seq numeric (22,0) NOT NULL,
co_cd varchar (10) NOT NULL,
log_sub_key1 numeric (9) NULL,
log_sub_key2 numeric (9) NULL,
batch_log_typ varchar (1) NULL,
msg_id varchar (10) NULL,
msg_lvl varchar (1) NULL,
msg_txt varchar (1000) NULL,
log_ts timestamp(3)  NULL,
prm01 varchar (1000) NULL,
prm02 varchar (1000) NULL,
prm03 varchar (1000) NULL,
prm04 varchar (1000) NULL,
prm05 varchar (1000) NULL,
prm06 varchar (1000) NULL,
prm07 varchar (1000) NULL,
prm08 varchar (1000) NULL,
prm09 varchar (1000) NULL,
prm10 varchar (1000) NULL,
prm11 varchar (1000) NULL,
prm12 varchar (1000) NULL,
prm13 varchar (1000) NULL,
prm14 varchar (1000) NULL,
prm15 varchar (1000) NULL,
prm16 varchar (1000) NULL,
prm17 varchar (1000) NULL,
prm18 varchar (1000) NULL,
prm19 varchar (1000) NULL,
prm20 varchar (1000) NULL,
prm21 varchar (1000) NULL,
prm22 varchar (1000) NULL,
prm23 varchar (1000) NULL,
prm24 varchar (1000) NULL,
prm25 varchar (1000) NULL,
prm26 varchar (1000) NULL,
prm27 varchar (1000) NULL,
prm28 varchar (1000) NULL,
prm29 varchar (1000) NULL,
prm30 varchar (1000) NULL,
prm31 varchar (1000) NULL,
prm32 varchar (1000) NULL,
prm33 varchar (1000) NULL,
prm34 varchar (1000) NULL,
prm35 varchar (1000) NULL,
prm36 varchar (1000) NULL,
prm37 varchar (1000) NULL,
prm38 varchar (1000) NULL,
prm39 varchar (1000) NULL,
prm40 varchar (1000) NULL
);


ALTER TABLE fct_batch_log_msg_all
ADD CONSTRAINT fct_batch_log_msg_all_pk PRIMARY KEY(batch_log_no,seq,co_cd);


CREATE INDEX fct_batch_log_msg_all_ie01
ON fct_batch_log_msg_all USING BTREE (batch_log_no,log_sub_key1,log_sub_key2,co_cd);

