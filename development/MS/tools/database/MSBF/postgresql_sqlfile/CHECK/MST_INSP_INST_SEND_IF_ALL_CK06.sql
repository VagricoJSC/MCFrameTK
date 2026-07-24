\encoding UTF-8

ALTER TABLE mst_insp_inst_send_if_all
 ADD CONSTRAINT mst_insp_inst_send_if_all_ck06 CHECK (insp_rslt_prnt_flg IN ('0', '1'));

