\encoding UTF-8

COMMENT ON VIEW mst_loss_act IS 'ロス実績 // Loss result';


COMMENT ON COLUMN mst_loss_act.loss_act_no IS 'ロス実績ＮＯ // #MA.LOSS_ACT_NO // Loss result No.';


COMMENT ON COLUMN mst_loss_act.inpt_act_no IS '投入実績ＮＯ // #MA.INPT_ACT_NO // Input result No.';


COMMENT ON COLUMN mst_loss_act.loss_rsn_cd IS 'ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd.';


COMMENT ON COLUMN mst_loss_act.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_loss_act.cont_qty IS '有効成分 // #MA.CONT_QTY // Active ingredient';


COMMENT ON COLUMN mst_loss_act.fxd_loss_flg IS '固定ロスＦＬＧ // #MA.FLG // Constant loss flg.';


COMMENT ON COLUMN mst_loss_act.intr_rmrks IS '内部備考 // #MS.LOSS_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_loss_act.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_loss_act.sub_char1 IS '予備１ // #MS.LOSS_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_loss_act.sub_char2 IS '予備２ // #MS.LOSS_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_loss_act.sub_char3 IS '予備３ // #MS.LOSS_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_loss_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_loss_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_loss_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_loss_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_loss_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_loss_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_loss_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_loss_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_loss_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_loss_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

