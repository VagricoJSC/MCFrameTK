\encoding UTF-8

ALTER TABLE mam_calc_ctg_cmn
 ADD CONSTRAINT mam_calc_ctg_cmn_ck01 CHECK (del_flg IN ('0', '1'));

