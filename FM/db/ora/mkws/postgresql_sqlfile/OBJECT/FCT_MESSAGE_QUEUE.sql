\encoding UTF-8

CREATE TABLE fct_message_queue
(message_queue_id varchar (50) NOT NULL,
user_id varchar (500) NOT NULL,
user_nm varchar (40) NULL,
co_cd varchar (10) NOT NULL,
locale_language varchar (8) NOT NULL,
locale_country varchar (3) NULL,
func_id varchar (50) NULL,
status varchar (2) NOT NULL,
consumer_id varchar (15) NOT NULL,
srv_req_no varchar (50) NULL,
start_ts timestamp(3)  NULL,
end_ts timestamp(3)  NULL,
msg_id varchar (10) NULL,
msg_lvl varchar (1) NULL,
msg_txt varchar (1000) NULL,
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


ALTER TABLE fct_message_queue
ADD CONSTRAINT fct_message_queue_pk PRIMARY KEY(message_queue_id);

