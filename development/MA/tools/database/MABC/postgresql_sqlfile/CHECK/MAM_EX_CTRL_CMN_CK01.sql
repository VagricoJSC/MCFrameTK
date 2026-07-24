\encoding UTF-8

ALTER TABLE mam_ex_ctrl_cmn
 ADD CONSTRAINT mam_ex_ctrl_cmn_ck01 CHECK (del_flg IN ('0', '1'));

