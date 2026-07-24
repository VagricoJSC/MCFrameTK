\encoding UTF-8

ALTER TABLE pft_sdrv_if_all
 ADD CONSTRAINT pft_sdrv_if_all_ck02 CHECK (not_send_upd_flg IN ('0', '1'));

