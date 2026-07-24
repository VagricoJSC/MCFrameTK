
COMMENT ON TABLE MAM_ITM_INSP_ALL IS '品目品管マスタ // Item inspection master';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.FROM_SITE_CD IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.TO_SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.NO_INSP_FLG IS '検査対象外ＦＬＧ // #MA.FLG // Not for inspection flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INSP_PTN_CD IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.NO_MRKT_JUDG_FLG IS '市場出荷判定対象外ＦＬＧ // #MA.FLG // Not for market release decision flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.NO_PLNT_APRV_FLG IS '工場出荷承認対象外ＦＬＧ // #MA.FLG // Not for factory release approval flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.NO_INSP_APRV_FLG IS '検査承認対象外ＦＬＧ // #MA.FLG // Not for inspection approval flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.LMT_DT_FRM_TYP IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.VLD_PD IS '有効期間 // #MA.VLD_PD // Valid period';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.LMT_PD IS '使用期間 // #MA.LMT_PD // Period until expiration';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.LOT_INSP_VLD_PD IS '有効期間（延長時） // #MA.VLD_PD // Valid period (At time of the extension)';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.CALC_PD_TYP IS '期間計算区分 // #MA.CALC_PD_TYP // Period calculation type';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.LOT_INSP_LMT_DT_FRM_TYP IS '期限起算日区分（延長時） // #MA.LMT_DT_FRM_TYP // Expiration base date type (Extended)';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INSP_INST_ISSUE_TYP IS '検査指図タイミング区分 // #MA.INSP_INST_ISSUE_TYP // Inspection order timing type';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INSP_OFFST IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INST_RSLT_ISSUE_FLG IS '検査指図時成績書発行ＦＬＧ // #MA.FLG // Inspection order at report issue flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.PRE_INSP_VALID_FLG IS '先行検査有効ＦＬＧ // #MA.FLG // Prior inspection validity flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_ITM_INSP_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

