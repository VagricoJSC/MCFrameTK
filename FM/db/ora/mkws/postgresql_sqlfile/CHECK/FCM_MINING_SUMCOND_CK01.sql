\encoding UTF-8

ALTER TABLE fcm_mining_sumcond
 ADD CONSTRAINT fcm_mining_sumcond_ck01 CHECK (inv_flg IN ('0', '1'));

