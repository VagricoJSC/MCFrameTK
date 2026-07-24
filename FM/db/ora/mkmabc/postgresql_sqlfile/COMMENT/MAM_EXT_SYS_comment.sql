\encoding UTF-8

COMMENT ON VIEW mam_ext_sys IS '外部システムマスタ // External system master';


COMMENT ON COLUMN mam_ext_sys.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_ext_sys.ext_sys_nm IS '外部システム名 // #MA.EXT_SYS_NM // External system name';


COMMENT ON COLUMN mam_ext_sys.base_ext_sys_nm IS '外部システム名（ベース） // #MA.EXT_SYS_NM // External system name(Base)';


COMMENT ON COLUMN mam_ext_sys.ext_sys_typ IS '外部システム区分 // #MA.EXT_SYS_TYP // External system type';


COMMENT ON COLUMN mam_ext_sys.web_api_flg IS 'Ｗｅｂ　ＡＰＩＦＬＧ // #MA.FLG // Web API flg.';


COMMENT ON COLUMN mam_ext_sys.cmd_exec_flg IS 'コマンド実行ＦＬＧ // #MA.FLG // Command execution flg.';


COMMENT ON COLUMN mam_ext_sys.real_imp_flg IS 'リアルタイム取込ＦＬＧ // #MA.FLG // Real time import flg.';


COMMENT ON COLUMN mam_ext_sys.not_send_upd_flg IS '送信後訂正不可ＦＬＧ // #MA.FLG // Uncorrectable after exporting flg.';


COMMENT ON COLUMN mam_ext_sys.not_dup_imp_flg IS '重複取込不可ＦＬＧ // #MA.FLG // Do not allow duplicate import flg.';


COMMENT ON COLUMN mam_ext_sys.if_upd_typ IS 'ＩＦ更新区分 // #MA.IF_UPD_TYP // IF update type';


COMMENT ON COLUMN mam_ext_sys.dlv_slip_split_flg IS '納品書単位分割ＦＬＧ // #MA.FLG // Delivery note unit split flg.';


COMMENT ON COLUMN mam_ext_sys.null_val_if_flg IS 'ＮＵＬＬ文字ＩＦＦＬＧ // #MA.FLG // NULL character IF flg.';


COMMENT ON COLUMN mam_ext_sys.upri_not_chk_flg IS '単価チェック対象外ＦＬＧ // #MA.FLG // Not for unit price check flg.';


COMMENT ON COLUMN mam_ext_sys.amt_not_chk_flg IS '金額チェック対象外ＦＬＧ // #MA.FLG // Not for amount check flg.';


COMMENT ON COLUMN mam_ext_sys.tax_not_chk_flg IS '税チェック対象外ＦＬＧ // #MA.FLG // Not for tax check flg.';


COMMENT ON COLUMN mam_ext_sys.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_ext_sys.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_ext_sys.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_ext_sys.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_ext_sys.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_ext_sys.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_ext_sys.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_ext_sys.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_ext_sys.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_ext_sys.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_ext_sys.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_ext_sys.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_ext_sys.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_ext_sys.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_ext_sys.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_ext_sys.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_ext_sys.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

