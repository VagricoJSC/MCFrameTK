\encoding UTF-8

ALTER TABLE mam_trd_cmn
 ADD CONSTRAINT mam_trd_cmn_ck02 CHECK (not_sls_slip_snd_flg IN ('0', '1'));

