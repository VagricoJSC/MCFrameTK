\encoding UTF-8

ALTER TABLE mam_sttl_all
 ADD CONSTRAINT mam_sttl_all_ck04 CHECK (ap_setoff_act_flg IN ('0', '1'));

