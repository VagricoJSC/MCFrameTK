\encoding UTF-8

ALTER TABLE mst_accpt_send_if_all
 ADD CONSTRAINT mst_accpt_send_if_all_ck06 CHECK (sundry_itm_flg IN ('0', '1'));

