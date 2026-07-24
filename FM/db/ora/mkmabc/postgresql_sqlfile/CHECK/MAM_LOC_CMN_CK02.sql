\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck02 CHECK (pre_outsrc_act_flg IN ('0', '1'));

