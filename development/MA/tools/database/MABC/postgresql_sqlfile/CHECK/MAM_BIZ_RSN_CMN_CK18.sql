\encoding UTF-8

ALTER TABLE mam_biz_rsn_cmn
 ADD CONSTRAINT mam_biz_rsn_cmn_ck18 CHECK (fxd_loss_flg IN ('0', '1'));

