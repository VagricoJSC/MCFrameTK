\encoding UTF-8

ALTER TABLE mam_biz_rsn_cmn
 ADD CONSTRAINT mam_biz_rsn_cmn_ck04 CHECK (slo_xpns_purc_flg IN ('0', '1'));

