\encoding UTF-8

ALTER TABLE fcm_server
 ADD CONSTRAINT fcm_server_ck01 CHECK (task_sche_mgr IN ('0', '1'));

