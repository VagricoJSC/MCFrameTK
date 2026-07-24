\encoding UTF-8

ALTER TABLE mam_bp_com_all
 ADD CONSTRAINT mam_bp_com_all_ck01 CHECK (ex_flg IN ('0', '1'));

