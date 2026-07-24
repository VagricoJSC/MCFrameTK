\encoding UTF-8

ALTER TABLE mam_sttl_all
 ADD CONSTRAINT mam_sttl_all_ck03 CHECK (calc_com_paid_flg IN ('0', '1'));

