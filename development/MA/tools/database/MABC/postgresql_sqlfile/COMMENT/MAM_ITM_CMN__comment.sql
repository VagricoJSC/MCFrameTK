\encoding UTF-8

COMMENT ON VIEW mam_itm_cmn_ IS '品目マスタ_（共通）_ビュー // Item master view';


COMMENT ON COLUMN mam_itm_cmn_.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_cmn_.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_cmn_.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_cmn_.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_cmn_.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mam_itm_cmn_.itm_alt_nm1 IS '品目別名１ // #MA.ITM_ALT_NM1 // Item alias name 1';


COMMENT ON COLUMN mam_itm_cmn_.itm_alt_nm2 IS '品目別名２ // #MA.ITM_ALT_NM2 // Item alias name 2';


COMMENT ON COLUMN mam_itm_cmn_.itm_alt_nm3 IS '品目別名３ // #MA.ITM_ALT_NM3 // Item alias name 3';


COMMENT ON COLUMN mam_itm_cmn_.itm_alt_nm4 IS '品目別名４ // #MA.ITM_ALT_NM4 // Item alias name 4';


COMMENT ON COLUMN mam_itm_cmn_.base_itm_nm IS '標準品名 // #MA.ITM_NM // Standard Item name';


COMMENT ON COLUMN mam_itm_cmn_.base_itm_alt_nm1 IS '標準品目別名１ // #MA.ITM_ALT_NM1 // Standard item alias name 1';


COMMENT ON COLUMN mam_itm_cmn_.base_itm_alt_nm2 IS '標準品目別名２ // #MA.ITM_ALT_NM2 // Standard item alias name 2';


COMMENT ON COLUMN mam_itm_cmn_.base_itm_alt_nm3 IS '標準品目別名３ // #MA.ITM_ALT_NM3 // Standard item alias name 3';


COMMENT ON COLUMN mam_itm_cmn_.base_itm_alt_nm4 IS '標準品目別名４ // #MA.ITM_ALT_NM4 // Standard item alias name 4';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd1 IS '品目分類ＣＤ１ // #MA.ITM_GRP_CD // Item classification cd. 1';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd2 IS '品目分類ＣＤ２ // #MA.ITM_GRP_CD // Item classification cd. 2';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd3 IS '品目分類ＣＤ３ // #MA.ITM_GRP_CD // Item classification cd. 3';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd4 IS '品目分類ＣＤ４ // #MA.ITM_GRP_CD // Item classification cd. 4';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd5 IS '品目分類ＣＤ５ // #MA.ITM_GRP_CD // Item classification cd. 5';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd6 IS '品目分類ＣＤ６ // #MA.ITM_GRP_CD // Item classification cd. 6';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd7 IS '品目分類ＣＤ７ // #MA.ITM_GRP_CD // Item classification cd. 7';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd8 IS '品目分類ＣＤ８ // #MA.ITM_GRP_CD // Item classification cd. 8';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd9 IS '品目分類ＣＤ９ // #MA.ITM_GRP_CD // Item classification cd. 9';


COMMENT ON COLUMN mam_itm_cmn_.itm_grp_cd10 IS '品目分類ＣＤ１０ // #MA.ITM_GRP_CD // Item classification cd. 10';


COMMENT ON COLUMN mam_itm_cmn_.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mam_itm_cmn_.asset_mng_typ IS '資産管理区分 // #MA.ASSET_MNG_TYP // Asset management type';


COMMENT ON COLUMN mam_itm_cmn_.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mam_itm_cmn_.dscnt_itm_flg IS '値引品目ＦＬＧ // #MA.FLG // Discount item flg.';


COMMENT ON COLUMN mam_itm_cmn_.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mam_itm_cmn_.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_itm_cmn_.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mam_itm_cmn_.dim_unit_cd IS '容積単位ＣＤ // #MA.UNIT_CD // Volume unit cd.';


COMMENT ON COLUMN mam_itm_cmn_.dim IS '容積 // #MA.DIM // Volume';


COMMENT ON COLUMN mam_itm_cmn_.wt_unit_cd IS '重量単位ＣＤ // #MA.UNIT_CD // Weight unit cd.';


COMMENT ON COLUMN mam_itm_cmn_.wt IS '重量 // #MA.WT // Weight';


COMMENT ON COLUMN mam_itm_cmn_.conts_unit_cd IS '入り目単位ＣＤ // #MA.UNIT_CD // Conversion unit cd.';


COMMENT ON COLUMN mam_itm_cmn_.conts_qty IS '入り目数 // #MA.QTY // Conversion qty.';


COMMENT ON COLUMN mam_itm_cmn_.unit_dim IS '単位容積（ｍ３） // #MA.DIM // Unit volume (m3)';


COMMENT ON COLUMN mam_itm_cmn_.unit_wt IS '単位重量（ＫＧ） // #MA.WT // Unit weight (KG)';


COMMENT ON COLUMN mam_itm_cmn_.hs_cd IS 'ＨＳ ＣＤ // #MA.HS_CD // HS cd.';


COMMENT ON COLUMN mam_itm_cmn_.jan_typ IS 'ＪＡＮ区分 // #MA.JAN_TYP // JAN type';


COMMENT ON COLUMN mam_itm_cmn_.jan_cd IS 'ＪＡＮ ＣＤ // #MA.JAN_CD // JAN cd.';


COMMENT ON COLUMN mam_itm_cmn_.itf_cd IS 'ＩＴＦ ＣＤ // #MA.ITF_CD // ITF cd.';


COMMENT ON COLUMN mam_itm_cmn_.gtin_cd IS 'ＧＴＩＮ ＣＤ // #MA.GTIN_CD // GTIN cd.';


COMMENT ON COLUMN mam_itm_cmn_.th_image IS 'サムネイル画像 // #MA.BIN // Thumbnail image';


COMMENT ON COLUMN mam_itm_cmn_.sls_itm_grp_cd IS '販売品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Sales item system cd.';


COMMENT ON COLUMN mam_itm_cmn_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_cmn_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_cmn_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_cmn_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_cmn_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_cmn_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_cmn_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_cmn_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_cmn_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_cmn_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_cmn_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_cmn_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_cmn_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_cmn_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_cmn_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_cmn_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_cmn_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

