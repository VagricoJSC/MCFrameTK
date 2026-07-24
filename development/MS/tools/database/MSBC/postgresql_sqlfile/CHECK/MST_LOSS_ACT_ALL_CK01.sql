\encoding UTF-8

ALTER TABLE mst_loss_act_all
 ADD CONSTRAINT mst_loss_act_all_ck01 CHECK (fxd_loss_flg IN ('0', '1'));

