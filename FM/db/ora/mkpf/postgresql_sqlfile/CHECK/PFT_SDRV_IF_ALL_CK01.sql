\encoding UTF-8

ALTER TABLE pft_sdrv_if_all
 ADD CONSTRAINT pft_sdrv_if_all_ck01 CHECK (not_send_flg IN ('0', '1'));

