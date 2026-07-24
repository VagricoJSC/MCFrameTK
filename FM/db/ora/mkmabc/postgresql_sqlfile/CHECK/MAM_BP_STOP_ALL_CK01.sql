\encoding UTF-8

ALTER TABLE mam_bp_stop_all
 ADD CONSTRAINT mam_bp_stop_all_ck01 CHECK (del_flg IN ('0', '1'));

