\encoding UTF-8

ALTER TABLE mgt_bom_all
 ADD CONSTRAINT mgt_bom_all_ck01 CHECK (non_calc_flg IN ('0', '1'));

