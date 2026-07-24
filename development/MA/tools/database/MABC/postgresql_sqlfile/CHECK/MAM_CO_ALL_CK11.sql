\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck11 CHECK (mon02_xrate_rev_flg IN ('0', '1'));

