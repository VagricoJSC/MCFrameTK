\encoding UTF-8

ALTER TABLE mam_wk_cost_cmn
 ADD CONSTRAINT mam_wk_cost_cmn_ck01 CHECK (del_flg IN ('0', '1'));

