
COMMENT ON TABLE MGW_IMP_ITM_SLS IS '原価品目販売単価取込対象ワーク // Work for cost item sales unit price import';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.DPT_CD IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.BASE_QTY IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPRI IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.PRIO IS '優先順位 // #MG.SLS_UNIT_PRIO // Priority';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.RMRKS IS '備考 // #MG.ITM_SLS_RMRKS // Remarks';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.SUB_CHAR1 IS '予備１ // #MG.ITM_SLS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.SUB_CHAR2 IS '予備２ // #MG.ITM_SLS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.SUB_CHAR3 IS '予備３ // #MG.ITM_SLS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.IMP_ERR_FLG IS '取込エラーＦＬＧ // #MA.FLG // Import error flg.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGW_IMP_ITM_SLS.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

