\encoding UTF-8

COMMENT ON VIEW mam_prov_upri_ IS '支給単価マスタ（マスタ画面用） // Supply unit price master';


COMMENT ON COLUMN mam_prov_upri_.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_prov_upri_.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_prov_upri_.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_prov_upri_.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_prov_upri_.prsppl_cd IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mam_prov_upri_.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mam_prov_upri_.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_prov_upri_.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_prov_upri_.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_prov_upri_.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mam_prov_upri_.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mam_prov_upri_.upri_bf IS '改定前単価 // #MA.MONEY // Unit price before revised';


COMMENT ON COLUMN mam_prov_upri_.sub_upri1 IS '予備単価１ // #MA.MONEY // Spare unit price 1';


COMMENT ON COLUMN mam_prov_upri_.sub_upri2 IS '予備単価２ // #MA.MONEY // Spare unit price 2';


COMMENT ON COLUMN mam_prov_upri_.sub_upri3 IS '予備単価３ // #MA.MONEY // Spare unit price 3';


COMMENT ON COLUMN mam_prov_upri_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_prov_upri_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_prov_upri_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_prov_upri_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_prov_upri_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_prov_upri_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_prov_upri_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_prov_upri_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_prov_upri_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_prov_upri_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_prov_upri_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_prov_upri_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_prov_upri_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_prov_upri_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_prov_upri_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_prov_upri_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_prov_upri_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

