\encoding UTF-8

ALTER TABLE fcm_mining_task
 ADD CONSTRAINT fcm_mining_task_ck01 CHECK (inv_flg IN ('0', '1'));

