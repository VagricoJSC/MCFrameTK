\encoding UTF-8

ALTER TABLE mst_xfr_schd_all
 ADD CONSTRAINT mst_xfr_schd_all_ck10 CHECK (not_sublot_mix_flg IN ('0', '1'));

