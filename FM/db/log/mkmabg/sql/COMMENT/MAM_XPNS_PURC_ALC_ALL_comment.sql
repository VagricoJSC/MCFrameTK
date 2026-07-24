
COMMENT ON TABLE MAM_XPNS_PURC_ALC_ALL IS '経費配賦振替マスタ // Expenses allocation transfer master';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.XPNS_ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.XPNS_ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.XPNS_ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.XPNS_ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ALC_WG_CD IS '配賦ワーキンググループＣＤ // #MA.WG_CD // Allocation WG cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DPT_FLG IS '部門引継ＦＬＧ // #MA.FLG // Dept. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DPT_CD IS '配賦先部門ＣＤ // #MA.COST_DPT_CD // Allocation destination dept. cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.BP_FLG IS '取引先引継ＦＬＧ // #MA.FLG // BP copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.BP_CD IS '配賦先取引先ＣＤ // #MA.BP_CD // Allocation destination BP cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.LOT_NO_FLG IS 'ロットＮＯ引継ＦＬＧ // #MA.FLG // Lot No. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.LOT_NO IS '配賦先ロットＮＯ // #MA.LOT_NO // Allocation destination lot No.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SUBLOT_NO_FLG IS 'サブロットＮＯ引継ＦＬＧ // #MA.FLG // Sublot No. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SUBLOT_NO IS '配賦先サブロットＮＯ // #MA.SUBLOT_NO // Allocation destination sublot No.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO1_FLG IS '手配ＮＯ１引継ＦＬＧ // #MA.FLG // SEIBAN No. 1 copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO1 IS '配賦先手配ＮＯ１ // #MA.SNO1 // Allocation destination SEIBAN No. 1';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO2_FLG IS '手配ＮＯ２引継ＦＬＧ // #MA.FLG // SEIBAN No. 2 copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO2 IS '配賦先手配ＮＯ２ // #MA.SNO2 // Allocation destination SEIBAN No. 2';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO3_FLG IS '手配ＮＯ３引継ＦＬＧ // #MA.FLG // SEIBAN No. 3 copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO3 IS '配賦先手配ＮＯ３ // #MA.SNO3 // Allocation destination SEIBAN No. 3';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO4_FLG IS '手配ＮＯ４引継ＦＬＧ // #MA.FLG // SEIBAN No. 4 copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SNO4 IS '配賦先手配ＮＯ４ // #MA.SNO4 // Allocation destination SEIBAN No. 4';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.CTG_CD IS '配賦先品群ＣＤ // #MA.COST_CTG_CD // Allocation destination item category cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ITM_CD IS '配賦先品目ＣＤ // #MA.ITM_CD // Allocation destination item cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ITM_SUB1 IS '配賦先枝番１ // #MA.ITM_SUB1 // Allocation destination branch No. 1';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ITM_SUB2 IS '配賦先枝番２ // #MA.ITM_SUB2 // Allocation destination branch No. 2';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.ITM_SUB3 IS '配賦先枝番３ // #MA.ITM_SUB3 // Allocation destination branch No. 3';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.LOC_CD IS '配賦先場所ＣＤ // #MA.LOC_CD // Allocation destination location cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.OPER_CD IS '配賦先工程ＣＤ // #MA.OPER_CD // Allocation destination operation cd.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.PO_NO_FLG IS '発注ＮＯ引継ＦＬＧ // #MA.FLG // PO No. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.SLO_NO_FLG IS '受注ＮＯ引継ＦＬＧ // #MA.FLG // Sales order No. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.IV_NO_FLG IS 'インボイスＮＯ引継ＦＬＧ // #MA.FLG // Invoice No. copy flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_XPNS_PURC_ALC_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

