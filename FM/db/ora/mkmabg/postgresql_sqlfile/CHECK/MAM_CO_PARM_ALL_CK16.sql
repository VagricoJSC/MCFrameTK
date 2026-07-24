\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck16 CHECK (chk_mst_flg IN ('0', '1'));

