\encoding UTF-8

ALTER TABLE mam_biz_rsn_cmn
 ADD CONSTRAINT mam_biz_rsn_cmn_ck19 CHECK (not_lot_trace_flg IN ('0', '1'));

