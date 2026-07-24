\encoding UTF-8

COMMENT ON VIEW msvt_bill_cl_br IS '請求締バッチ結果確認ビュー // Check view for billing closing batch result';


COMMENT ON COLUMN msvt_bill_cl_br.batch_data_no IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN msvt_bill_cl_br.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN msvt_bill_cl_br.bill_dpt_cd IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN msvt_bill_cl_br.bill_dpt_nm IS '請求部門名 // #MA.DPT_NM // Billing dept. name';


COMMENT ON COLUMN msvt_bill_cl_br.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN msvt_bill_cl_br.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN msvt_bill_cl_br.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN msvt_bill_cl_br.bill_cl_dt IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN msvt_bill_cl_br.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_bill_cl_br.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_bill_cl_br.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_bill_cl_br.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_bill_cl_br.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_bill_cl_br.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_bill_cl_br.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_bill_cl_br.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_bill_cl_br.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_bill_cl_br.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_bill_cl_br.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_bill_cl_br.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_bill_cl_br.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_bill_cl_br.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

