\encoding UTF-8

CREATE TABLE fct_scenario
(scenario_no numeric (22) NOT NULL,
scenario_cd varchar (100) NOT NULL,
scenario_nm varchar (1000) NULL,
module_id varchar (3) NULL,
screen_id varchar (10) NULL,
co_cd varchar (10) NULL,
user_id varchar (500) NULL,
check_test varchar (10) NULL,
scenario_type varchar (100) NULL,
is_share varchar (1) DEFAULT 0 NOT NULL,
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


ALTER TABLE fct_scenario
ADD CONSTRAINT fct_scenario_pk PRIMARY KEY(scenario_no);

