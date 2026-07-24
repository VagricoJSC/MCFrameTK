\encoding UTF-8

CREATE TABLE fct_design_vector_segs
(design_no varchar (20) NOT NULL,
vector_id varchar (20) NOT NULL,
segment_id varchar (20) NOT NULL,
x numeric (21,8) NULL,
y numeric (21,8) NULL,
fixed_horizontal numeric (20) NULL,
fixed_vertical numeric (20) NULL,
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


ALTER TABLE fct_design_vector_segs
ADD CONSTRAINT fct_design_vector_segs_pk PRIMARY KEY(design_no,vector_id,segment_id);

