\encoding UTF-8

ALTER TABLE mam_trd_cmn
 ADD CONSTRAINT mam_trd_cmn_ck03 CHECK (not_purc_slip_snd_flg IN ('0', '1'));

