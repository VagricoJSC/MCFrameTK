\encoding UTF-8

ALTER TABLE mam_trd_all
 ADD CONSTRAINT mam_trd_all_ck02 CHECK (not_sls_slip_snd_flg IN ('0', '1'));

