\encoding UTF-8

ALTER TABLE mam_sys_parm_all
 ADD CONSTRAINT mam_sys_parm_all_ck01 CHECK (del_flg IN ('0', '1'));

