\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck03 CHECK (temp_ap_use_flg IN ('0', '1'));

