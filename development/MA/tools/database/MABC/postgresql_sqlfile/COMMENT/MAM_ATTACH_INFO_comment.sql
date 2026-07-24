\encoding UTF-8

COMMENT ON VIEW mam_attach_info IS '品目付加情報マスタ // Item additional info. master';


COMMENT ON COLUMN mam_attach_info.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_attach_info.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_attach_info.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_attach_info.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_attach_info.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mam_attach_info.sno2 IS '手配ＮＯ２ // #MA.SNO1 // SEIBAN No. 2';


COMMENT ON COLUMN mam_attach_info.sno3 IS '手配ＮＯ３ // #MA.SNO1 // SEIBAN No. 3';


COMMENT ON COLUMN mam_attach_info.sno4 IS '手配ＮＯ４ // #MA.SNO1 // SEIBAN No. 4';


COMMENT ON COLUMN mam_attach_info.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_attach_info.attach_info_key1 IS '付加情報キー１ // #MA.ATTACH_INFO_KEY1 // Additional info. key 1';


COMMENT ON COLUMN mam_attach_info.attach_info_key2 IS '付加情報キー２ // #MA.ATTACH_INFO_KEY2 // Additional info. key 2';


COMMENT ON COLUMN mam_attach_info.attach_info_key3 IS '付加情報キー３ // #MA.ATTACH_INFO_KEY3 // Additional info. key 3';


COMMENT ON COLUMN mam_attach_info.attach_info_key4 IS '付加情報キー４ // #MA.ATTACH_INFO_KEY4 // Additional info. key 4';


COMMENT ON COLUMN mam_attach_info.attach_info_key5 IS '付加情報キー５ // #MA.ATTACH_INFO_KEY5 // Additional info. key 5';


COMMENT ON COLUMN mam_attach_info.attach_info_id IS '付加情報ＩＤ // #MA.ATTACH_INFO_ID // Additional info. ID';


COMMENT ON COLUMN mam_attach_info.attach_info_typ IS '付加情報区分 // #MA.ATTACH_INFO_TYP // Additional info. type';


COMMENT ON COLUMN mam_attach_info.attach_info_rmrks IS '見出し // #MA.ATTACH_INFO_RMRKS // Heading';


COMMENT ON COLUMN mam_attach_info.attach_info_path IS 'パス // #MA.ATTACH_INFO_PATH // Path';


COMMENT ON COLUMN mam_attach_info.attach_info_bin IS 'バイナリデータ // #MA.BIN // Binary data';


COMMENT ON COLUMN mam_attach_info.attach_info_bin_nm IS 'バイナリデータ名 // #MA.ATTACH_INFO_BIN_NM // Binary data name';


COMMENT ON COLUMN mam_attach_info.ext_sys_no_attach IS '外部システムＮＯ // #MA.EXT_SYS_NO_ATTACH // External system No.';


COMMENT ON COLUMN mam_attach_info.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_attach_info.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_attach_info.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_attach_info.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_attach_info.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_attach_info.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_attach_info.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_attach_info.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_attach_info.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_attach_info.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_attach_info.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_attach_info.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_attach_info.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_attach_info.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_attach_info.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_attach_info.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_attach_info.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

