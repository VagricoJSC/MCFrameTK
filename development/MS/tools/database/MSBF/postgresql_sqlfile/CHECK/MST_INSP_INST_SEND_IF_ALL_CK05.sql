\encoding UTF-8

ALTER TABLE mst_insp_inst_send_if_all
 ADD CONSTRAINT mst_insp_inst_send_if_all_ck05 CHECK (plnt_aprv_flg IN ('0', '1'));

