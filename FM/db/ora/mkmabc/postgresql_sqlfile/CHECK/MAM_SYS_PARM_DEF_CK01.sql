\encoding UTF-8

ALTER TABLE mam_sys_parm_def
 ADD CONSTRAINT mam_sys_parm_def_ck01 CHECK (del_flg IN ('0', '1'));

