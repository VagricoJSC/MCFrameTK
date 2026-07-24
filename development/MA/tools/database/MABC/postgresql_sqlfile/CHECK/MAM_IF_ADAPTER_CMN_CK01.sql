\encoding UTF-8

ALTER TABLE mam_if_adapter_cmn
 ADD CONSTRAINT mam_if_adapter_cmn_ck01 CHECK (del_flg IN ('0', '1'));

