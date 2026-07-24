\encoding UTF-8

ALTER TABLE mst_purc_schd_all
 ADD CONSTRAINT mst_purc_schd_all_ck01 CHECK (non_purc_flg IN ('0', '1'));

