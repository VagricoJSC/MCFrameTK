\encoding UTF-8

ALTER TABLE mst_loss_act_all
 ADD CONSTRAINT mst_loss_act_all_ak01 UNIQUE (inpt_act_no,loss_rsn_cd,co_cd);

