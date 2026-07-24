\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck12 CHECK (mon03_xrate_rev_flg IN ('0', '1'));

