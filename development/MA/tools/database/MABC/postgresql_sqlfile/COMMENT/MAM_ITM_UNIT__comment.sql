\encoding UTF-8

COMMENT ON VIEW mam_itm_unit_ IS '品目単位マスタ（マスタ画面用） // Item unit master (Master screen)';


COMMENT ON COLUMN mam_itm_unit_.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_unit_.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_unit_.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_unit_.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_unit_.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mam_itm_unit_.conv_base_qty IS '換算基準数量 // #MA.QTY // Conversion base qty.';


COMMENT ON COLUMN mam_itm_unit_.conv_qty IS '換算数量 // #MA.QTY // Conversion qty.';


COMMENT ON COLUMN mam_itm_unit_.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_itm_unit_.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mam_itm_unit_.pack_flg IS '荷姿ＦＬＧ // #MA.FLG // SKU flg.';


COMMENT ON COLUMN mam_itm_unit_.pckg_flg IS '梱包単位ＦＬＧ // #MA.FLG // Packing unit flg.';


COMMENT ON COLUMN mam_itm_unit_.unit_dim IS '単位容積（ｍ３） // #MA.DIM // Unit volume (m3)';


COMMENT ON COLUMN mam_itm_unit_.unit_wt IS '単位重量（ＫＧ） // #MA.WT // Unit weight (KG)';


COMMENT ON COLUMN mam_itm_unit_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_unit_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_unit_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_unit_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_unit_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_unit_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_unit_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_unit_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_unit_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_unit_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_unit_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_unit_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_unit_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_unit_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_unit_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_unit_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_unit_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

