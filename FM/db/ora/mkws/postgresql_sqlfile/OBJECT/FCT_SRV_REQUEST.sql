\encoding UTF-8

CREATE TABLE fct_srv_request
(srv_req_no varchar (50) NOT NULL,
user_id varchar (500) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
status varchar (3) NULL,
start_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
clt_id varchar (50) NULL,
c_req_no varchar (50) NULL,
c_req_ts timestamp(3)  NULL,
c_locale varchar (20) NULL,
c_time_zone varchar (50) NULL,
call_pg_id varchar (50) NULL,
operation_cd varchar (2) NULL,
btn_res_key varchar (512) NULL,
action_id varchar (15) NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
ope_id varchar (50) NULL,
gp_batch_grp_cd varchar (50) NULL,
srv_id varchar (50) NULL,
async_flg char (1) DEFAULT '0' NOT NULL,
up_param numeric  NULL,
down_param numeric  NULL,
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


ALTER TABLE fct_srv_request
ADD CONSTRAINT fct_srv_request_pk PRIMARY KEY(srv_req_no);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_srv_request','up_param');


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fct_srv_request','down_param');

