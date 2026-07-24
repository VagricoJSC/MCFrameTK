\encoding UTF-8

COMMENT ON VIEW msc_stk_anly_ctl IS '在庫分析制御情報 // Inventory analysis control info.';


COMMENT ON COLUMN msc_stk_anly_ctl.io_act_typ IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN msc_stk_anly_ctl.ctl_tgt_typ IS '制御対象区分 // #MS.CTL_TGT_TYP // Control target type';


COMMENT ON COLUMN msc_stk_anly_ctl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN msc_stk_anly_ctl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN msc_stk_anly_ctl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN msc_stk_anly_ctl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msc_stk_anly_ctl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msc_stk_anly_ctl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msc_stk_anly_ctl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msc_stk_anly_ctl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

