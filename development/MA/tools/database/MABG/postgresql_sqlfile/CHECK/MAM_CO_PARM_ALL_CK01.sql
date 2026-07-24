\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck01 CHECK (trd_ratio_flg IN ('0', '1'));

