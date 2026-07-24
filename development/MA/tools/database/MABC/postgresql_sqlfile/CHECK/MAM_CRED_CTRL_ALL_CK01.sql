\encoding UTF-8

ALTER TABLE mam_cred_ctrl_all
 ADD CONSTRAINT mam_cred_ctrl_all_ck01 CHECK (del_flg IN ('0', '1'));

