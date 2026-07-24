\encoding UTF-8

ALTER TABLE mst_prms_rcpt_all
 ADD CONSTRAINT mst_prms_rcpt_all_ck01 CHECK (arr_schd_refl_flg IN ('0', '1'));

