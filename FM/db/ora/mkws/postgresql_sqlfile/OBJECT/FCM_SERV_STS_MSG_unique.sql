\encoding UTF-8

ALTER TABLE fcm_serv_sts_msg
 ADD CONSTRAINT fcm_serv_sts_msg_ak01 UNIQUE (sid,lcl_cd);

