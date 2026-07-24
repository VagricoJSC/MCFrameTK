\encoding UTF-8

ALTER TABLE mam_sttl_cmn
 ADD CONSTRAINT mam_sttl_cmn_ck03 CHECK (calc_com_paid_flg IN ('0', '1'));

