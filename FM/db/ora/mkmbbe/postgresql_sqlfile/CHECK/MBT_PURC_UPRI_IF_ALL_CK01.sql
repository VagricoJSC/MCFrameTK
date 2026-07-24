\encoding UTF-8

ALTER TABLE mbt_purc_upri_if_all
 ADD CONSTRAINT mbt_purc_upri_if_all_ck01 CHECK (del_flg IN ('0', '1'));

