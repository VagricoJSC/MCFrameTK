\encoding UTF-8

COMMENT ON TABLE mgt_batch_out_all IS '処理対象外バッチ情報 // Exclude specific jobs on calculation';


COMMENT ON COLUMN mgt_batch_out_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_batch_out_all.batch_typ IS '原価バッチ区分 // #MG.BATCH_TYP // Cost batch type';


COMMENT ON COLUMN mgt_batch_out_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_batch_out_all.rmrks IS '備考 // #MG.BATCH_OUT_RMRKS // Remarks';


COMMENT ON COLUMN mgt_batch_out_all.sub_char1 IS '予備１ // #MG.BATCH_OUT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_batch_out_all.sub_char2 IS '予備２ // #MG.BATCH_OUT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_batch_out_all.sub_char3 IS '予備３ // #MG.BATCH_OUT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_batch_out_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_batch_out_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_batch_out_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_batch_out_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_batch_out_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_batch_out_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_batch_out_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_batch_out_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_batch_out_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_batch_out_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

