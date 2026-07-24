\encoding UTF-8

ALTER TABLE fcm_mining_method
 ADD CONSTRAINT fcm_mining_method_ak01 UNIQUE (mining_id,col_id,sum_info_typ,sumcond,dec_place,round_mode_typ,inv_flg);

CREATE UNIQUE INDEX fcm_mining_method_ak01_ie ON fcm_mining_method (mining_id,col_id,sum_info_typ,COALESCE(sumcond,''),COALESCE(dec_place,0),COALESCE(round_mode_typ,''),inv_flg);

