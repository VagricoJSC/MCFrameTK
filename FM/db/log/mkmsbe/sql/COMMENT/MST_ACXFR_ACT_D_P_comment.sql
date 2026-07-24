
COMMENT ON TABLE MST_ACXFR_ACT_D_P IS '他勘定振替実績明細（改訂履歴） // Other accounting transfer result details (Rev. history)';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ACXFR_ACT_D_NO IS '他勘定振替実績明細ＮＯ // #MA.ACXFR_ACT_D_NO // Other accounting transfer result details No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ACXFR_ACT_NO IS '他勘定振替実績ＮＯ // #MA.ACXFR_ACT_NO // Other accounting transfer result No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ACXFR_ACT_REV IS '他勘定振替実績改訂番号 // #MA.SLIP_REV // Other accounting transfer result rev. number';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ACXFR_SCHD_NO IS '他勘定振替予定ＮＯ // #MA.ACXFR_SCHD_NO // Other accounting transfer schedule No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ACXFR_INST_D_NO IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.FIX_NO_TYP IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.FIX_NO IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.DSPSL_NO IS '廃棄申請ＮＯ // #MA.DSPSL_NO // Disposal application No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.WMS_FLG IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.EXT_ACXFR_ACT_NO IS '外部他勘定振替実績ＮＯ // #MA.EXT_ACXFR_ACT_NO // External other accounting transfer result No.';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.INTR_D_RMRKS IS '内部明細備考 // #MS.ACXFR_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SUB_CHAR1 IS '予備１ // #MS.ACXFR_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SUB_CHAR2 IS '予備２ // #MS.ACXFR_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.SUB_CHAR3 IS '予備３ // #MS.ACXFR_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ACXFR_ACT_D_P.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

