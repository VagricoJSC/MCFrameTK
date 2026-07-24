
COMMENT ON TABLE MAM_CO_PARM_ALL IS '原価会社パラメータマスタ // Cost company parameter master';


COMMENT ON COLUMN MAM_CO_PARM_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STD_RND_TYP IS '標準端数処理区分 // #MA.RND_TYP // Rounding type (Standard)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STD_DEC_PLACE IS '標準小数部有効桁数 // #MA.DEC_PLACE // Standard number of decimal places';


COMMENT ON COLUMN MAM_CO_PARM_ALL.AMT_RND_TYP IS '金額端数処理区分 // #MA.RND_TYP // Rounding type (Amount)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.AMT_DEC_PLACE IS '金額小数部有効桁数 // #MA.DEC_PLACE // Amount number of decimal places';


COMMENT ON COLUMN MAM_CO_PARM_ALL.AVE_RND_TYP IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.AVE_DEC_PLACE IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN MAM_CO_PARM_ALL.ADJ_TYP IS '端数調整区分 // #MA.ADJ_TYP // Fraction adjustment type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.MRGN_EXPNS_CD IS '調整費目ＣＤ // #MA.EXPNS_CD // Adjustment cost element cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.PURC_EXPNS_CD IS '購買費目ＣＤ // #MA.EXPNS_CD // Purchase cost element item cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.OUT_EXPNS_CD IS '外注費目ＣＤ // #MA.EXPNS_CD // Subcontract cost element cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.INPT_EXPNS_CD IS '投入費目ＣＤ // #MA.EXPNS_CD // Input cost element cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SS_EXPNS_CD IS '自給費目ＣＤ // #MA.EXPNS_CD // Self supply cost element cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.PROV_EXPNS_CD IS '有償差額費目ＣＤ // #MA.EXPNS_CD // Cost element cd. for gain or loss of chargeable item';


COMMENT ON COLUMN MAM_CO_PARM_ALL.PRE_ALC_MAX_LVL IS '一次配賦最大配賦階層 // #MA.PRE_ALC_MAX_LVL // Departmental alloc. max. allocation hierarchy';


COMMENT ON COLUMN MAM_CO_PARM_ALL.PRE_ALC_MAX_REC IS '一次配賦最大レコード数 // #MA.PRE_ALC_MAX_REC // Departmental alloc. max. number of records';


COMMENT ON COLUMN MAM_CO_PARM_ALL.DIFF_USE_TYP IS '差異使用区分 // #MA.DIFF_USE_TYP // Variance use type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.DEF_CALC_CTG_CD IS 'デフォルト計算カテゴリＣＤ // #MA.CALC_CTG_CD // Default calculation category cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.FIX_DPT_CD IS '固定管理部門ＣＤ // #MA.COST_DPT_CD // Constant management dept. cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.LOT_USE_TYP IS 'ロットＮＯ生販使用区分 // #MA.PS_USE_TYP // Lot No. use type for production/sales';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SUBLOT_USE_TYP IS 'サブロットＮＯ生販使用区分 // #MA.PS_USE_TYP // Sublot No. use type for production/sales';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO1_USE_TYP IS '手配ＮＯ１生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 1 production/sales use type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO2_USE_TYP IS '手配ＮＯ２生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 2 production/sales use type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO3_USE_TYP IS '手配ＮＯ３生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 3 production/sales use type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO4_USE_TYP IS '手配ＮＯ４生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 4 production/sales use type';


COMMENT ON COLUMN MAM_CO_PARM_ALL.TRD_RATIO_FLG IS '振替比率設定時に標準単価を使用する // #MA.FLG // Use standard unit cost at transfer ratio setting';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STOP_SLIP_FLG IS '取り消した伝票を取り込む // #MA.FLG // Take in canceled slip';


COMMENT ON COLUMN MAM_CO_PARM_ALL.NON_PROD_FLG IS '生産データを取り込まない // #MA.FLG // Do not import production data';


COMMENT ON COLUMN MAM_CO_PARM_ALL.OPER_SUM_FLG IS '工程ＣＤを工程実績ＮＯとして取り込む // #MA.FLG // Import operation cd. as operation result No.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.NON_SLS_FLG IS '販売データを取り込まない // #MA.FLG // Do not import sales data';


COMMENT ON COLUMN MAM_CO_PARM_ALL.ASST_FLG IS '販売資産を生産資産として取り込む // #MA.FLG // Import sales asset as production asset';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STK_BP_FLG IS '出荷先の在庫を考慮する // #MA.FLG // Include receiving point inventory';


COMMENT ON COLUMN MAM_CO_PARM_ALL.NON_TRANSIT_FLG IS '未着品仕入データを取り込まない // #MA.FLG // Do not import purchase data of items in transit';


COMMENT ON COLUMN MAM_CO_PARM_ALL.WG_NON_MOV_FLG IS 'ワーキンググループ滞留使用ＦＬＧ // #MA.FLG // WG with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.LOT_NON_MOV_FLG IS 'ロットＮＯ滞留使用ＦＬＧ // #MA.FLG // Lot No. with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SUBLOT_NON_MOV_FLG IS 'サブロットＮＯ滞留使用ＦＬＧ // #MA.FLG // Sublot No. with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO1_NON_MOV_FLG IS '手配ＮＯ１滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 1 with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO2_NON_MOV_FLG IS '手配ＮＯ２滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 2 with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO3_NON_MOV_FLG IS '手配ＮＯ３滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 3 with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.SNO4_NON_MOV_FLG IS '手配ＮＯ４滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 4 with non-moving flg.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.TMP_DPT_CD IS '振替用部門ＣＤ // #MA.COST_DPT_CD // Transfer dept. cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.ACT_TRD_CALC_CTG_CD IS '実績振替計算カテゴリＣＤ // #MA.CALC_CTG_CD // Result transfer calculation category cd.';


COMMENT ON COLUMN MAM_CO_PARM_ALL.CHK_MST_FLG IS 'マスタの存在チェックを行う // #MA.FLG // Check existence of master';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STKTK_SUM_FLG IS '棚卸を集約しない // #MA.FLG // Do not consolidate the inventory count';


COMMENT ON COLUMN MAM_CO_PARM_ALL.OTH_CCN_SUM_FLG IS '他勘定を集約しない // #MA.FLG // Do not consolidate other accounting data';


COMMENT ON COLUMN MAM_CO_PARM_ALL.AMT_DISP_DIGIT IS '金額小数部表示桁 // #MA.DISP_DIGIT // Display digits (Amount decimal places)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UNIT_DISP_DIGIT IS '単価小数部表示桁 // #MA.DISP_DIGIT // Display digits (Unit price decimal places)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.STD_DISP_DIGIT IS '標準小数部表示桁 // #MA.DISP_DIGIT // Display digits (Standard decimal places)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.RATE_DISP_DIGIT IS '比率小数部表示桁 // #MA.DISP_DIGIT // Display digits (Ratio decimal places)';


COMMENT ON COLUMN MAM_CO_PARM_ALL.EXCEL_PLN_FLG IS '計画データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output planning data in Excel';


COMMENT ON COLUMN MAM_CO_PARM_ALL.EXCEL_ACT_FLG IS '実績データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output result data in Excel';


COMMENT ON COLUMN MAM_CO_PARM_ALL.EXCEL_ALC_FLG IS '配賦データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output allocation data in Excel';


COMMENT ON COLUMN MAM_CO_PARM_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_CO_PARM_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_CO_PARM_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_CO_PARM_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_CO_PARM_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_CO_PARM_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_CO_PARM_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_CO_PARM_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

