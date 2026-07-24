\encoding UTF-8

ALTER TABLE mst_insp_schd_all
 ADD CONSTRAINT mst_insp_schd_all_ck01 CHECK (latest_flg IN ('0', '1'));

