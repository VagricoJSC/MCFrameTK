\encoding UTF-8

CREATE TABLE fct_mining_gadget_cache
(mining_id varchar (30) NOT NULL,
co_cd varchar (10) NULL,
data numeric  NULL,
upd_co_dt timestamp(0)  NOT NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fct_mining_gadget_cache
ADD CONSTRAINT fct_mining_gadget_cache_pk UNIQUE(mining_id,co_cd);


CREATE UNIQUE INDEX fct_mining_gadget_cache_pk_ie ON fct_mining_gadget_cache (mining_id,COALESCE(co_cd,''));

;

INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_mining_gadget_cache','data');

