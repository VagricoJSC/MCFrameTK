\encoding UTF-8

COMMENT ON VIEW mam_itm_insp IS '品目品管マスタ // Item inspection master';


COMMENT ON COLUMN mam_itm_insp.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_insp.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_insp.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_insp.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_insp.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mam_itm_insp.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mam_itm_insp.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mam_itm_insp.from_site_cd IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN mam_itm_insp.to_site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mam_itm_insp.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_itm_insp.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_itm_insp.no_insp_flg IS '検査対象外ＦＬＧ // #MA.FLG // Not for inspection flg.';


COMMENT ON COLUMN mam_itm_insp.insp_ptn_cd IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN mam_itm_insp.no_mrkt_judg_flg IS '市場出荷判定対象外ＦＬＧ // #MA.FLG // Not for market release decision flg.';


COMMENT ON COLUMN mam_itm_insp.no_plnt_aprv_flg IS '工場出荷承認対象外ＦＬＧ // #MA.FLG // Not for factory release approval flg.';


COMMENT ON COLUMN mam_itm_insp.no_insp_aprv_flg IS '検査承認対象外ＦＬＧ // #MA.FLG // Not for inspection approval flg.';


COMMENT ON COLUMN mam_itm_insp.lmt_dt_frm_typ IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN mam_itm_insp.vld_pd IS '有効期間 // #MA.VLD_PD // Valid period';


COMMENT ON COLUMN mam_itm_insp.lmt_pd IS '使用期間 // #MA.LMT_PD // Period until expiration';


COMMENT ON COLUMN mam_itm_insp.lot_insp_vld_pd IS '有効期間（延長時） // #MA.VLD_PD // Valid period (At time of the extension)';


COMMENT ON COLUMN mam_itm_insp.calc_pd_typ IS '期間計算区分 // #MA.CALC_PD_TYP // Period calculation type';


COMMENT ON COLUMN mam_itm_insp.lot_insp_lmt_dt_frm_typ IS '期限起算日区分（延長時） // #MA.LMT_DT_FRM_TYP // Expiration base date type (Extended)';


COMMENT ON COLUMN mam_itm_insp.insp_inst_issue_typ IS '検査指図タイミング区分 // #MA.INSP_INST_ISSUE_TYP // Inspection order timing type';


COMMENT ON COLUMN mam_itm_insp.insp_offst IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN mam_itm_insp.inst_rslt_issue_flg IS '検査指図時成績書発行ＦＬＧ // #MA.FLG // Inspection order at report issue flg.';


COMMENT ON COLUMN mam_itm_insp.pre_insp_valid_flg IS '先行検査有効ＦＬＧ // #MA.FLG // Prior inspection validity flg.';


COMMENT ON COLUMN mam_itm_insp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_insp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_insp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_insp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_insp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_insp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_insp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_insp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_insp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_insp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_insp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_insp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_insp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_insp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_insp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_insp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_insp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

