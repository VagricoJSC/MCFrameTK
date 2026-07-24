\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck16 CHECK (mon07_xrate_rev_flg IN ('0', '1'));

