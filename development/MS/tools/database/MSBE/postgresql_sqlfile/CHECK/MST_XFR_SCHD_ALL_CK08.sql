\encoding UTF-8

ALTER TABLE mst_xfr_schd_all
 ADD CONSTRAINT mst_xfr_schd_all_ck08 CHECK (rqst_can_flg IN ('0', '1'));

