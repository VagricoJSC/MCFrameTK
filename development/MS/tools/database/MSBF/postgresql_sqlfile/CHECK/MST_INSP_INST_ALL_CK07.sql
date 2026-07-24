\encoding UTF-8

ALTER TABLE mst_insp_inst_all
 ADD CONSTRAINT mst_insp_inst_all_ck07 CHECK (lmt_up_flg IN ('0', '1'));

