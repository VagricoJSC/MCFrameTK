\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck27 CHECK (stk_lst_flg IN ('0', '1'));

