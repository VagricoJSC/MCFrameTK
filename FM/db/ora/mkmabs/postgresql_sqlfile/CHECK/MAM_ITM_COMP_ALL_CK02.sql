\encoding UTF-8

ALTER TABLE mam_itm_comp_all
 ADD CONSTRAINT mam_itm_comp_all_ck02 CHECK (del_flg IN ('0', '1'));

