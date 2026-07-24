\encoding UTF-8

ALTER TABLE mam_spln_itm_all
 ADD CONSTRAINT mam_spln_itm_all_ck01 CHECK (del_flg IN ('0', '1'));

