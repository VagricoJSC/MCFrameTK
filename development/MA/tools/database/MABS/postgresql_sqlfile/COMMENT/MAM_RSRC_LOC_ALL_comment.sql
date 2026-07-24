\encoding UTF-8

COMMENT ON TABLE mam_rsrc_loc_all IS '場所別資源マスタ // Resource master by location';


COMMENT ON COLUMN mam_rsrc_loc_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mam_rsrc_loc_all.rsrc_cd IS '資源ＣＤ // #MA.RSRC_CD // Resource cd.';


COMMENT ON COLUMN mam_rsrc_loc_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_rsrc_loc_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_rsrc_loc_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_rsrc_loc_all.rsrc_base_qty IS '基準値／日 // #MA.QTY // Reference value/day';


COMMENT ON COLUMN mam_rsrc_loc_all.var_per IS '変動率（％） // #MA.PER // Variation rates (%)';


COMMENT ON COLUMN mam_rsrc_loc_all.alert_per IS 'アラート通知率（％） // #MA.PER // Alert notification rate (%)';


COMMENT ON COLUMN mam_rsrc_loc_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_rsrc_loc_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rsrc_loc_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rsrc_loc_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rsrc_loc_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rsrc_loc_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rsrc_loc_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rsrc_loc_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rsrc_loc_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rsrc_loc_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rsrc_loc_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rsrc_loc_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rsrc_loc_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

