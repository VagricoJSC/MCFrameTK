\encoding UTF-8

COMMENT ON TABLE mam_if_x_all IS 'ＩＦコード変換マスタ_（全社）_ // IF code conversion master_(Company-wide)_';


COMMENT ON COLUMN mam_if_x_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_if_x_all.if_col_typ IS 'ＩＦ項目区分 // #MA.IF_COL_TYP // IF column type';


COMMENT ON COLUMN mam_if_x_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_if_x_all.if_col_cd IS '自社用ＣＤ // #MA.IF_COL_CD // cd. for own company';


COMMENT ON COLUMN mam_if_x_all.if_itm_cd IS '自社品目ＣＤ // #MA.ITM_CD // Own company item cd.';


COMMENT ON COLUMN mam_if_x_all.if_itm_sub1 IS '自社枝番１ // #MA.ITM_SUB1 // Own company branch No. 1';


COMMENT ON COLUMN mam_if_x_all.if_itm_sub2 IS '自社枝番２ // #MA.ITM_SUB2 // Own company branch No. 2';


COMMENT ON COLUMN mam_if_x_all.if_itm_sub3 IS '自社枝番３ // #MA.ITM_SUB3 // Own company branch No. 3';


COMMENT ON COLUMN mam_if_x_all.conv_cd IS '相手先ＣＤ // #MA.CONV_CD // Counterpart cd.';


COMMENT ON COLUMN mam_if_x_all.conv_itm_sub1 IS '相手先枝番１ // #MA.ITM_SUB1 // Counterpart branch No. 1';


COMMENT ON COLUMN mam_if_x_all.conv_itm_sub2 IS '相手先枝番２ // #MA.ITM_SUB2 // Counterpart branch No. 2';


COMMENT ON COLUMN mam_if_x_all.conv_itm_sub3 IS '相手先枝番３ // #MA.ITM_SUB3 // Counterpart branch No. 3';


COMMENT ON COLUMN mam_if_x_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_if_x_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_if_x_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_if_x_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_if_x_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_if_x_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_if_x_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_if_x_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_if_x_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_if_x_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_if_x_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_if_x_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_if_x_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_if_x_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_if_x_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_if_x_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_if_x_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_if_x_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

