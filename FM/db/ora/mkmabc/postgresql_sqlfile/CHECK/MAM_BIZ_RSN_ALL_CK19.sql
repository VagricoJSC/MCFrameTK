\encoding UTF-8

ALTER TABLE mam_biz_rsn_all
 ADD CONSTRAINT mam_biz_rsn_all_ck19 CHECK (not_lot_trace_flg IN ('0', '1'));

