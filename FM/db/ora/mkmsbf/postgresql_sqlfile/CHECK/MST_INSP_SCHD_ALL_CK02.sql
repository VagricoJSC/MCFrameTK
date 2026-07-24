\encoding UTF-8

ALTER TABLE mst_insp_schd_all
 ADD CONSTRAINT mst_insp_schd_all_ck02 CHECK (lmt_up_flg IN ('0', '1'));

