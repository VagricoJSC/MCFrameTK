\encoding UTF-8

ALTER TABLE mam_cost_ac_out_all
 ADD CONSTRAINT mam_cost_ac_out_all_ck01 CHECK (del_flg IN ('0', '1'));

