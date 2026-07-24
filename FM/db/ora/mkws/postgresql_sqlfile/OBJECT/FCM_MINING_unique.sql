\encoding UTF-8

ALTER TABLE fcm_mining
 ADD CONSTRAINT fcm_mining_ak01 UNIQUE (mining_nm,public_lv);

