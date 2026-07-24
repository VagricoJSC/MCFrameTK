\encoding UTF-8

ALTER TABLE mam_cost_ac_dpt_map_all
 ADD CONSTRAINT mam_cost_ac_dpt_map_all_ck01 CHECK (del_flg IN ('0', '1'));

