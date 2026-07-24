\encoding UTF-8

ALTER TABLE mst_insp_schd_all
 ADD CONSTRAINT mst_insp_schd_all_ck03 CHECK (in_prmt_insp_flg IN ('0', '1'));

