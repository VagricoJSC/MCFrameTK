\encoding UTF-8

ALTER TABLE fcm_mining_method
 ADD CONSTRAINT fcm_mining_method_ck04 CHECK (graph_label_flg IN ('0', '1'));

