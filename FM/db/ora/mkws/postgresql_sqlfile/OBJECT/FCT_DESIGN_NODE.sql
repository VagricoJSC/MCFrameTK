\encoding UTF-8

CREATE TABLE fct_design_node
(design_no varchar (20) NOT NULL,
node_id varchar (20) NOT NULL,
title varchar (1000) NULL,
description varchar (1000) NULL,
is_changed varchar (2) NULL,
layout_x numeric (21,8) NULL,
layout_y numeric (21,8) NULL,
layout_width numeric (21,8) NULL,
layout_height numeric (21,8) NULL,
node_type numeric (10) NULL,
fill_color varchar (100) NULL,
line_color varchar (100) NULL,
line_width numeric (21,8) NULL,
font_size numeric (21,8) NULL,
vertical_index numeric (10) NULL,
vertical_sub_index numeric (10) NULL,
command varchar (1000) NULL,
screen_id varchar (10) NULL,
design_id varchar (1000) NULL,
start_date timestamp(3)  NULL,
lead_time numeric (21,8) NULL,
web_url varchar (1000) NULL,
is_zero_lead_time varchar (2) NULL,
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


ALTER TABLE fct_design_node
ADD CONSTRAINT fct_design_node_pk PRIMARY KEY(design_no,node_id);

