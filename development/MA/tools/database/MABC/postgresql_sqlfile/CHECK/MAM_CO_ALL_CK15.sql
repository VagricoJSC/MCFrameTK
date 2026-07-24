\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck15 CHECK (mon06_xrate_rev_flg IN ('0', '1'));

