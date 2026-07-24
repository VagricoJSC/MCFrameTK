\encoding UTF-8

ALTER TABLE mam_loss_rsn_all
 ADD CONSTRAINT mam_loss_rsn_all_ck01 CHECK (def_disp_flg IN ('0', '1'));

