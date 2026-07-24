\encoding UTF-8

CREATE TABLE fct_scenario_script
(scenario_no numeric (22) NOT NULL,
scenario_cd varchar (100) NOT NULL,
script_line_no numeric (22) NOT NULL,
script_disable varchar (10) NULL,
script_line varchar (1000) NULL,
id numeric (22) NULL,
x numeric (22) NULL,
y numeric (22) NULL,
click_count numeric (22) NULL,
button numeric (22) NULL,
key_char numeric (22) NULL,
key_code numeric (22) NULL,
module_id varchar (3) NULL,
screen_id varchar (10) NULL,
component_id varchar (200) NULL,
component_nm varchar (200) NULL,
local_x numeric (22) NULL,
local_y numeric (22) NULL,
component_x numeric (21,8) NULL,
component_y numeric (21,8) NULL,
component_w numeric (21,8) NULL,
component_h numeric (21,8) NULL,
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


ALTER TABLE fct_scenario_script
ADD CONSTRAINT fct_scenario_script_pk PRIMARY KEY(scenario_no,script_line_no);

