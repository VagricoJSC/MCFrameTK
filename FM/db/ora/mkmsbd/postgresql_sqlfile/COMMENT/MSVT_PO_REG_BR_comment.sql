\encoding UTF-8

COMMENT ON VIEW msvt_po_reg_br IS '発注一括登録バッチ結果確認ビュー // Check view for PO bulk entry batch result';


COMMENT ON COLUMN msvt_po_reg_br.batch_data_no IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN msvt_po_reg_br.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_po_reg_br.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_po_reg_br.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_po_reg_br.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_po_reg_br.po_schd_no IS '発注予定ＮＯ // #MA.PO_SCHD_NO // PO schedule No.';


COMMENT ON COLUMN msvt_po_reg_br.wg_cd IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvt_po_reg_br.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvt_po_reg_br.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_po_reg_br.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_po_reg_br.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_po_reg_br.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_po_reg_br.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN msvt_po_reg_br.po_schd_dt IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN msvt_po_reg_br.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN msvt_po_reg_br.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_po_reg_br.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_po_reg_br.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_po_reg_br.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_po_reg_br.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_po_reg_br.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_po_reg_br.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_po_reg_br.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_po_reg_br.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_po_reg_br.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

