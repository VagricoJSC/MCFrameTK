\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck20 CHECK (mon11_xrate_rev_flg IN ('0', '1'));

