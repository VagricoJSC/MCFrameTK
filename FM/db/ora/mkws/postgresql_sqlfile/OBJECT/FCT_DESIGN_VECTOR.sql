\encoding UTF-8

CREATE TABLE fct_design_vector
(design_no varchar (20) NOT NULL,
vector_id varchar (20) NOT NULL,
from_node_id numeric (20) NULL,
to_node_id numeric (20) NULL,
title varchar (1000) NULL,
description varchar (1000) NULL,
from_label varchar (1000) NULL,
to_label varchar (1000) NULL,
line_color varchar (100) NULL,
font_color varchar (100) NULL,
font_size numeric (21,8) NULL,
line_width numeric (21,8) NULL,
from_placement numeric (10) NULL,
to_placement numeric (10) NULL,
from_direction numeric (10) NULL,
to_direction numeric (10) NULL,
from_arrow_type numeric (10) NULL,
to_arrow_type numeric (10) NULL,
line_style numeric (10) NULL,
save_from_node_x numeric (21,8) NULL,
save_from_node_y numeric (21,8) NULL,
save_to_node_x numeric (21,8) NULL,
save_to_node_y numeric (21,8) NULL,
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


ALTER TABLE fct_design_vector
ADD CONSTRAINT fct_design_vector_pk PRIMARY KEY(design_no,vector_id);

