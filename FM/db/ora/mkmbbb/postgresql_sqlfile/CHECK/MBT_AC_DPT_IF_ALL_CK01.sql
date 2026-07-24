\encoding UTF-8

ALTER TABLE mbt_ac_dpt_if_all
 ADD CONSTRAINT mbt_ac_dpt_if_all_ck01 CHECK (imp_flg IN ('0', '1'));

