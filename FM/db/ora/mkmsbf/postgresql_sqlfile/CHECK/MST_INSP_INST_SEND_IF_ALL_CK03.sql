\encoding UTF-8

ALTER TABLE mst_insp_inst_send_if_all
 ADD CONSTRAINT mst_insp_inst_send_if_all_ck03 CHECK (std_req_flg IN ('0', '1'));

