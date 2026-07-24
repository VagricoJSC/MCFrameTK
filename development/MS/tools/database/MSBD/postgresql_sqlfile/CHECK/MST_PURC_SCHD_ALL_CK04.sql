\encoding UTF-8

ALTER TABLE mst_purc_schd_all
 ADD CONSTRAINT mst_purc_schd_all_ck04 CHECK (purc_split_flg IN ('0', '1'));

