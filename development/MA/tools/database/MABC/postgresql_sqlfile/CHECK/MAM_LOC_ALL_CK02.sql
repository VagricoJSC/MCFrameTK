\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck02 CHECK (pre_outsrc_act_flg IN ('0', '1'));

