\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck13 CHECK (sno2_non_mov_flg IN ('0', '1'));

