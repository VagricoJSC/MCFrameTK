\encoding UTF-8

ALTER TABLE mam_bp_sub_cmn
 ADD CONSTRAINT mam_bp_sub_cmn_ck01 CHECK (del_flg IN ('0', '1'));

