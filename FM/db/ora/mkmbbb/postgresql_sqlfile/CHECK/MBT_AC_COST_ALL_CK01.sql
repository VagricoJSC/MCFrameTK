\encoding UTF-8

ALTER TABLE mbt_ac_cost_all
 ADD CONSTRAINT mbt_ac_cost_all_ck01 CHECK (repurc_obli_flg IN ('0', '1'));

