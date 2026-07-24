
COMMENT ON TABLE MST_INPT_ACT IS '投入実績 // Input result';


COMMENT ON COLUMN MST_INPT_ACT.INPT_ACT_NO IS '投入実績ＮＯ // #MA.INPT_ACT_NO // Input result No.';


COMMENT ON COLUMN MST_INPT_ACT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_INPT_ACT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_INPT_ACT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_INPT_ACT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_INPT_ACT.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_INPT_ACT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_INPT_ACT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_INPT_ACT.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_INPT_ACT.INPT_SCHD_NO IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN MST_INPT_ACT.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_INPT_ACT.INPT_LOC_CD IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN MST_INPT_ACT.INPT_STR_LN_CD IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN MST_INPT_ACT.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_INPT_ACT.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_INPT_ACT.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_INPT_ACT.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_INPT_ACT.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_INPT_ACT.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_INPT_ACT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_INPT_ACT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_INPT_ACT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_INPT_ACT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_INPT_ACT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_INPT_ACT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_INPT_ACT.BASE_UNIT_INPT_QTY IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN MST_INPT_ACT.BASE_UNIT_LOSS_QTY IS '基準単位ロス数量 // #MA.QTY // Base unit loss qty.';


COMMENT ON COLUMN MST_INPT_ACT.BASE_UNIT_FXD_LOSS_QTY IS '基準単位固定ロス数量 // #MA.QTY // Base unit constant loss qty.';


COMMENT ON COLUMN MST_INPT_ACT.BASE_UNIT_CD IS '投入基準単位ＣＤ // #MA.UNIT_CD // Input base unit cd.';


COMMENT ON COLUMN MST_INPT_ACT.ACT_TM IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN MST_INPT_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_INPT_ACT.BKF_CTL_FLG IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN MST_INPT_ACT.BASE_UNIT_STD_QTY IS '基準単位標準投入数量 // #MA.QTY // Base unit standard input qty.';


COMMENT ON COLUMN MST_INPT_ACT.CONT_QTY IS '有効成分（投入数量） // #MA.CONT_QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN MST_INPT_ACT.CONT_LOSS_QTY IS '有効成分（ロス数量） // #MA.CONT_QTY // Active ingredient (Loss qty.)';


COMMENT ON COLUMN MST_INPT_ACT.CONT_FXD_LOSS_QTY IS '有効成分（固定ロス数量） // #MA.CONT_QTY // Active ingredient (Constant loss qty.)';


COMMENT ON COLUMN MST_INPT_ACT.CONT_FCTR_UNIT_CD IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN MST_INPT_ACT.ACT_CONT_FCTR IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN MST_INPT_ACT.ACXFR_QTY IS '他勘定振替数量 // #MA.QTY // Other accounting transfer qty.';


COMMENT ON COLUMN MST_INPT_ACT.ACXFR_RSN_CD IS '他勘定振替理由ＣＤ // #MA.BIZ_RSN_CD // Other accounting transfer reason cd.';


COMMENT ON COLUMN MST_INPT_ACT.ACXFR_BD_DPT_CD IS '他勘定振替負担部門ＣＤ // #MA.DPT_CD // Other accounting transfer charged dept. cd.';


COMMENT ON COLUMN MST_INPT_ACT.INPT_RSN_CD IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN MST_INPT_ACT.ADD_FLG IS '追加ＦＬＧ // #MA.FLG // Add flg.';


COMMENT ON COLUMN MST_INPT_ACT.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_INPT_ACT.MES_ID IS 'ＭＥＳＩＤ // #MS.MES_ID // MES ID';


COMMENT ON COLUMN MST_INPT_ACT.MES_FLG IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN MST_INPT_ACT.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_INPT_ACT.EXT_INPT_ACT_NO IS '外部投入実績ＮＯ // #MA.EXT_INPT_ACT_NO // External input result No.';


COMMENT ON COLUMN MST_INPT_ACT.IF_AUTO_REG_FLG IS 'ＩＦ自動作成ＦＬＧ // #MA.FLG // IF auto-create flg.';


COMMENT ON COLUMN MST_INPT_ACT.INTR_RMRKS IS '内部備考 // #MS.INPT_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_INPT_ACT.ACT_RPT_RMRKS IS '記録書備考 // #MS.INPT_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN MST_INPT_ACT.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_INPT_ACT.SUB_CHAR1 IS '予備１ // #MS.INPT_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_INPT_ACT.SUB_CHAR2 IS '予備２ // #MS.INPT_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_INPT_ACT.SUB_CHAR3 IS '予備３ // #MS.INPT_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_INPT_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_INPT_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_INPT_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_INPT_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_INPT_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_INPT_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_INPT_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_INPT_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_INPT_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_INPT_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

