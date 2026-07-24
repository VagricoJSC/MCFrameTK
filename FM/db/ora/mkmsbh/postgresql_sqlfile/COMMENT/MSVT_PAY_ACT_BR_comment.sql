\encoding UTF-8

COMMENT ON VIEW msvt_pay_act_br IS '支払実績計上バッチ結果確認ビュー // Check view for payment result recording batch result';


COMMENT ON COLUMN msvt_pay_act_br.batch_data_no IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN msvt_pay_act_br.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN msvt_pay_act_br.pay_schd_no IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN msvt_pay_act_br.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN msvt_pay_act_br.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN msvt_pay_act_br.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN msvt_pay_act_br.bsppl_dpt_nm IS '支払予定管理先担当部門名 // #MA.DPT_NM // Name of dept. in charge of scheduled payee';


COMMENT ON COLUMN msvt_pay_act_br.ap_sttl_cd IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN msvt_pay_act_br.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN msvt_pay_act_br.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN msvt_pay_act_br.reg_dt IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN msvt_pay_act_br.bsppl_cl_dt IS '支払予定管理先締年月日 // #MA.DT // Scheduled payee closing year, month, and date';


COMMENT ON COLUMN msvt_pay_act_br.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_pay_act_br.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_pay_act_br.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_pay_act_br.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_pay_act_br.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_pay_act_br.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_pay_act_br.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_pay_act_br.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_pay_act_br.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_pay_act_br.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_pay_act_br.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_pay_act_br.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_pay_act_br.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_pay_act_br.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

