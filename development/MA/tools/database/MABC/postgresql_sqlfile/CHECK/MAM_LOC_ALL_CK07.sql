\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck07 CHECK (stktk_act_ex_zero_flg IN ('0', '1'));

