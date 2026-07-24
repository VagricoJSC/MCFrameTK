\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck02 CHECK (ap_no_use_flg IN ('0', '1'));

