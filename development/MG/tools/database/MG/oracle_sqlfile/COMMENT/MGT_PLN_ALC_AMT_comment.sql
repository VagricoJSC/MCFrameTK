
COMMENT ON TABLE MGT_PLN_ALC_AMT IS '配賦費用計画 // Allocable expenses plan';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.PLN_ALC_AMT_KEY IS '配賦費用計画キー // #MG.ROW_NO // Allocable expenses plan key';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ALC_REC_TYP IS '費用発生区分 // #MG.ALC_REC_TYP // Expense incurred type';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.DPT_CD IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.CTG_CD IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.TRD_WG_CD IS '振替元ワーキンググループＣＤ // #MA.WG_CD // Previous WG cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.TRD_CALC_GRP_CD IS '振替元計算グループＣＤ // #MA.CALC_GRP_CD // Previous calculation group cd.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.TRD_CALC_NO IS '振替元原価計算ＮＯ // #MA.CALC_NO // Previous calculation No.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.PRE_ALC_FIN_FLG IS '一次配賦処理済ＦＬＧ // #MA.FLG // Departmental alloc. processed flg.';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.RMRKS IS '備考 // #MG.PLN_ALC_AMT_RMRKS // Remarks';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SUB_CHAR1 IS '予備１ // #MG.PLN_ALC_AMT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SUB_CHAR2 IS '予備２ // #MG.PLN_ALC_AMT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.SUB_CHAR3 IS '予備３ // #MG.PLN_ALC_AMT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_PLN_ALC_AMT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

