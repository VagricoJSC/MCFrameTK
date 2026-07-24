\encoding UTF-8

COMMENT ON TABLE mam_if_protocol_all IS 'ＩＦ通信ルールマスタ_（全社）_ // IF communication rules master_(Company-wide)_';


COMMENT ON COLUMN mam_if_protocol_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_if_protocol_all.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN mam_if_protocol_all.if_ctl_typ IS 'ＩＦ制御区分 // #MA.IF_CTL_TYP // IF control type';


COMMENT ON COLUMN mam_if_protocol_all.var_str IS '内容（文字列） // #MA.VAR_STR // Content (String)';


COMMENT ON COLUMN mam_if_protocol_all.var_num IS '内容（数値） // #MA.VAR_NUM // Content (Numeric)';


COMMENT ON COLUMN mam_if_protocol_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_if_protocol_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_if_protocol_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_if_protocol_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_if_protocol_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_if_protocol_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_if_protocol_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_if_protocol_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_if_protocol_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_if_protocol_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_if_protocol_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_if_protocol_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_if_protocol_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_if_protocol_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_if_protocol_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_if_protocol_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_if_protocol_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_if_protocol_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

