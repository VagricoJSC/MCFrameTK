\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck19 CHECK (inpt_itm_del_flg IN ('0', '1'));

