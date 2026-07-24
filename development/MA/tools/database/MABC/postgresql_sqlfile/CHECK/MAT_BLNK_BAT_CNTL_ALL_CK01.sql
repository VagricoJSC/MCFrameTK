\encoding UTF-8

ALTER TABLE mat_blnk_bat_cntl_all
 ADD CONSTRAINT mat_blnk_bat_cntl_all_ck01 CHECK (bat_exec_flg IN ('0', '1'));

