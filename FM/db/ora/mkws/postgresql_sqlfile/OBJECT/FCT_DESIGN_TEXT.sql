\encoding UTF-8

CREATE TABLE fct_design_text
(design_no varchar (20) NOT NULL,
text_id varchar (20) NOT NULL,
text varchar (1000) NULL,
layout_x numeric (21,8) NULL,
layout_y numeric (21,8) NULL,
layout_width numeric (21,8) NULL,
layout_height numeric (21,8) NULL,
node_type numeric (10) NULL,
fill_color varchar (100) NULL,
line_color varchar (100) NULL,
line_width numeric (21,8) NULL,
font_size numeric (21,8) NULL,
grid_mode numeric (10) NULL,
start_date timestamp(3)  NULL,
vertical_index numeric (10) NULL,
offset_x numeric (21,8) NULL,
offset_y numeric (21,8) NULL,
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


ALTER TABLE fct_design_text
ADD CONSTRAINT fct_design_text_pk PRIMARY KEY(design_no,text_id);

