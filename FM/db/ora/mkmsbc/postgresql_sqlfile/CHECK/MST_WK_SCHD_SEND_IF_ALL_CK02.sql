\encoding UTF-8

ALTER TABLE mst_wk_schd_send_if_all
 ADD CONSTRAINT mst_wk_schd_send_if_all_ck02 CHECK (abort_flg IN ('0', '1'));

