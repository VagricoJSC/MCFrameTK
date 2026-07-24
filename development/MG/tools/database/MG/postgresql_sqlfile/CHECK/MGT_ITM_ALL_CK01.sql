\encoding UTF-8

ALTER TABLE mgt_itm_all
 ADD CONSTRAINT mgt_itm_all_ck01 CHECK (cmn_upri_flg IN ('0', '1'));

