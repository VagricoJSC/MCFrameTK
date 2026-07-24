\encoding UTF-8

ALTER TABLE mam_cur_xrate_cmn
 ADD CONSTRAINT mam_cur_xrate_cmn_ck01 CHECK (del_flg IN ('0', '1'));

