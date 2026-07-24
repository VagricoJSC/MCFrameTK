
COMMENT ON TABLE MST_INPT_SCHD IS '投入予定 // Input schedule';


COMMENT ON COLUMN MST_INPT_SCHD.INPT_SCHD_NO IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN MST_INPT_SCHD.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_INPT_SCHD.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_INPT_SCHD.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_INPT_SCHD.SCHD_TM IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_GRP_SEQ IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN MST_INPT_SCHD.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INPT_SCHD.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INPT_SCHD.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INPT_SCHD.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INPT_SCHD.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_INPT_SCHD.BASE_UNIT_INPT_QTY IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN MST_INPT_SCHD.BASE_UNIT_RQMT_QTY IS '基準単位必要数量 // #MA.QTY // Base unit required qty.';


COMMENT ON COLUMN MST_INPT_SCHD.BASE_UNIT_FXD_RQMT_QTY IS '基準単位固定必要数量 // #MA.QTY // Base unit fixed required qty.';


COMMENT ON COLUMN MST_INPT_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_INPT_SCHD.INPT_LOC_CD IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN MST_INPT_SCHD.INPT_STR_LN_CD IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN MST_INPT_SCHD.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_INPT_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INPT_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INPT_SCHD.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_INPT_SCHD.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_INPT_SCHD.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_INPT_SCHD.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_INPT_SCHD.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_INPT_SCHD.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_INPT_SCHD.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_INPT_SCHD.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_SNO1 IS '引当手配ＮＯ１ // #MA.SNO1 // Allocation SEIBAN No. 1';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_SNO2 IS '引当手配ＮＯ２ // #MA.SNO2 // Allocation SEIBAN No. 2';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_SNO3 IS '引当手配ＮＯ３ // #MA.SNO3 // Allocation SEIBAN No. 3';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_SNO4 IS '引当手配ＮＯ４ // #MA.SNO4 // Allocation SEIBAN No. 4';


COMMENT ON COLUMN MST_INPT_SCHD.BKF_TYP IS '投入品バックフラッシュ区分 // #MA.BKF_TYP // Input item backflush type';


COMMENT ON COLUMN MST_INPT_SCHD.CONT_INPT_QTY IS '有効成分（投入数量） // #MA.CONT_QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN MST_INPT_SCHD.CONT_RQMT_QTY IS '有効成分（必要数量） // #MA.CONT_QTY // Active ingredient (Required qty.)';


COMMENT ON COLUMN MST_INPT_SCHD.CONT_FXD_RQMT_QTY IS '有効成分（固定必要数量） // #MA.CONT_QTY // Active ingredient (Fixed required qty.)';


COMMENT ON COLUMN MST_INPT_SCHD.CONT_FCTR_UNIT_CD IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN MST_INPT_SCHD.STD_CONT_FCTR IS '標準有効成分係数 // #MA.STD_CONT_FCTR // Standard active ingredient coefficient';


COMMENT ON COLUMN MST_INPT_SCHD.ACT_CONT_FCTR IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN MST_INPT_SCHD.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_INPT_SCHD.INPT_RSN_CD IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN MST_INPT_SCHD.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MST_INPT_SCHD.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MST_INPT_SCHD.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MST_INPT_SCHD.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MST_INPT_SCHD.MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MST_INPT_SCHD.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MST_INPT_SCHD.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MST_INPT_SCHD.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MST_INPT_SCHD.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MST_INPT_SCHD.BOM_MEMO1 IS 'ＢＯＭメモ１ // #MA.MST_MEMO1 // BOM memo 1';


COMMENT ON COLUMN MST_INPT_SCHD.BOM_MEMO2 IS 'ＢＯＭメモ２ // #MA.MST_MEMO2 // BOM memo 2';


COMMENT ON COLUMN MST_INPT_SCHD.BOM_MEMO3 IS 'ＢＯＭメモ３ // #MA.MST_MEMO3 // BOM memo 3';


COMMENT ON COLUMN MST_INPT_SCHD.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_FLG IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN MST_INPT_SCHD.BASE_UNIT_ALT_QTY IS '基準単位代替元数量 // #MA.QTY // Base unit alternative sources qty.';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_ITM_FIX_FLG IS '代替品目指定ＦＬＧ // #MA.FLG // Alternative item specification flg.';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_ALLOC_PRIO IS '代替品目引当優先順位 // #MA.INT // Alternative item allocation priority';


COMMENT ON COLUMN MST_INPT_SCHD.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MST_INPT_SCHD.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MST_INPT_SCHD.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MST_INPT_SCHD.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MST_INPT_SCHD.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MST_INPT_SCHD.BOM_ID_NO IS '工程内ＢＯＭ識別番号 // #MA.INT // In-operation BOM identification number';


COMMENT ON COLUMN MST_INPT_SCHD.CHD_ITM_SEQ IS '同一子品目連番 // #MA.INT // Allow same child item sequence number';


COMMENT ON COLUMN MST_INPT_SCHD.RECALC_GRP IS '再計算グループ // #MA.INT // Re-calculation group';


COMMENT ON COLUMN MST_INPT_SCHD.RECALC_GRP_SEQ IS '再計算グループ連番 // #MA.INT // Re-calculation group sequence number';


COMMENT ON COLUMN MST_INPT_SCHD.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_INPT_SCHD.INTR_RMRKS IS '内部備考 // #MS.INPT_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_INPT_SCHD.INST_RPT_RMRKS IS '指図書備考 // #MS.INPT_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN MST_INPT_SCHD.SUB_CHAR1 IS '予備１ // #MS.INPT_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INPT_SCHD.SUB_CHAR2 IS '予備２ // #MS.INPT_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INPT_SCHD.SUB_CHAR3 IS '予備３ // #MS.INPT_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INPT_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INPT_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INPT_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INPT_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INPT_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

