\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck15 CHECK (sno4_non_mov_flg IN ('0', '1'));

