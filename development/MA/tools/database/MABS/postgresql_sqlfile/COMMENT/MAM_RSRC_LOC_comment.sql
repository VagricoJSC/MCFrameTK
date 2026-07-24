\encoding UTF-8

COMMENT ON VIEW mam_rsrc_loc IS '場所別資源マスタ // Resource master by location';


COMMENT ON COLUMN mam_rsrc_loc.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mam_rsrc_loc.rsrc_cd IS '資源ＣＤ // #MA.RSRC_CD // Resource cd.';


COMMENT ON COLUMN mam_rsrc_loc.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_rsrc_loc.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_rsrc_loc.rsrc_base_qty IS '基準値／日 // #MA.QTY // Reference value/day';


COMMENT ON COLUMN mam_rsrc_loc.var_per IS '変動率（％） // #MA.PER // Variation rates (%)';


COMMENT ON COLUMN mam_rsrc_loc.alert_per IS 'アラート通知率（％） // #MA.PER // Alert notification rate (%)';


COMMENT ON COLUMN mam_rsrc_loc.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_rsrc_loc.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rsrc_loc.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rsrc_loc.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rsrc_loc.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rsrc_loc.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rsrc_loc.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rsrc_loc.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rsrc_loc.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rsrc_loc.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rsrc_loc.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rsrc_loc.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rsrc_loc.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rsrc_loc.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rsrc_loc.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rsrc_loc.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rsrc_loc.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rsrc_loc.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

