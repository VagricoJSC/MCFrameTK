\encoding UTF-8

COMMENT ON TABLE mam_cst_sls_upri_apl_all IS '得意先販売単価マスタ（申請） // Customer sales unit price master (Apply)';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.sls_upri_grp_cd IS '販売単価分類ＣＤ // #MA.SLS_UPRI_GRP_CD // Sales unit price classification cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.lot_qty IS 'ロット数量 // #MA.QTY // Lot qty.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upri_bf IS '改定前単価 // #MA.MONEY // Unit price before revised';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upri_rate IS '掛率（％） // #MA.PER // Ratio (%)';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upri_rate_bf IS '改定前掛率（％） // #MA.PER // Ratio before revision (%)';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.sub_upri1 IS '予備単価１ // #MA.MONEY // Spare unit price 1';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.sub_upri2 IS '予備単価２ // #MA.MONEY // Spare unit price 2';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.sub_upri3 IS '予備単価３ // #MA.MONEY // Spare unit price 3';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.not_cost_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.apl_no IS '申請ＮＯ // #MA.APL_NO // Application No.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.st_dt_bf IS '更新前適用開始日 // #MA.DT // Application start date before update';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.ref_flg IS '反映済ＦＬＧ // #MA.FLG // Applied flg.';


COMMENT ON COLUMN mam_cst_sls_upri_apl_all.mst_apl_memo IS '申請メモ // #MA.MST_APL_MEMO // Application memo';

