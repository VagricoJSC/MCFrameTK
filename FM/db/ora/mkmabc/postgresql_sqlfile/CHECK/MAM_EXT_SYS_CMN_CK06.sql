\encoding UTF-8

ALTER TABLE mam_ext_sys_cmn
 ADD CONSTRAINT mam_ext_sys_cmn_ck06 CHECK (dlv_slip_split_flg IN ('0', '1'));

