\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck01 CHECK (minus_stk_flg IN ('0', '1'));

