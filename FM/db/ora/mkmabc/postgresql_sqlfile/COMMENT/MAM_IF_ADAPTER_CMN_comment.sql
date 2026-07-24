\encoding UTF-8

COMMENT ON TABLE mam_if_adapter_cmn IS 'ＩＦアダプタマスタ_（共通）_ // IF adapter master_(Common)_';


COMMENT ON COLUMN mam_if_adapter_cmn.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_if_adapter_cmn.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN mam_if_adapter_cmn.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_if_adapter_cmn.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_if_adapter_cmn.conv_ope IS 'コード変換オペレーション // #MA.OPERATION // Code convert operation';


COMMENT ON COLUMN mam_if_adapter_cmn.file_io_ope IS 'ファイル入出力オペレーション // #MA.OPERATION // File I/O operations';


COMMENT ON COLUMN mam_if_adapter_cmn.web_api_ope IS 'Ｗｅｂ　ＡＰＩオペレーション // #MA.OPERATION // Web API operation';


COMMENT ON COLUMN mam_if_adapter_cmn.cmd_exec_ope IS 'コマンド実行オペレーション // #MA.OPERATION // Command execution operation';


COMMENT ON COLUMN mam_if_adapter_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_if_adapter_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_if_adapter_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_if_adapter_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_if_adapter_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_if_adapter_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_if_adapter_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_if_adapter_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_if_adapter_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_if_adapter_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_if_adapter_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_if_adapter_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

