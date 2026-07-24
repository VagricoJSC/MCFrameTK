\encoding UTF-8

ALTER TABLE mam_calc_rpt_ptn_all
 ADD CONSTRAINT mam_calc_rpt_ptn_all_ck01 CHECK (auto_flg IN ('0', '1'));

