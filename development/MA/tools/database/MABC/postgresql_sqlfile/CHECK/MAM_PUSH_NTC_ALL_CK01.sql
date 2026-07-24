\encoding UTF-8

ALTER TABLE mam_push_ntc_all
 ADD CONSTRAINT mam_push_ntc_all_ck01 CHECK (del_flg IN ('0', '1'));

