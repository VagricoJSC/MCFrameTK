
COMMENT ON TABLE MST_ARR_PR IS '入荷進捗 // Receipt progress';


COMMENT ON COLUMN MST_ARR_PR.ARR_PR_NO IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN MST_ARR_PR.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_ARR_PR.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_ARR_PR.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_ARR_PR.SLS_RET_SCHD_D_NO IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN MST_ARR_PR.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_ARR_PR.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_ARR_PR.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_ARR_PR.RQST_WG_CD IS '依頼元ワーキンググループＣＤ // #MA.WG_CD // Requesting WG cd.';


COMMENT ON COLUMN MST_ARR_PR.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_ARR_PR.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_ARR_PR.SRET_FR_CD IS '引取先ＣＤ // #MA.BP_CD // Pickup company cd.';


COMMENT ON COLUMN MST_ARR_PR.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_ARR_PR.RET_DLV_SLIP_D_NO IS '返品元納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Return-from delivery note details No.';


COMMENT ON COLUMN MST_ARR_PR.RET_STK_ARRV_BP_CD IS '返品元在庫着荷先ＣＤ // #MA.BP_CD // Return-from inventory arrival destination cd.';


COMMENT ON COLUMN MST_ARR_PR.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_ARR_PR.PRMS_RCPT_DT IS '納期回答受領日 // #MA.DT // Order promising result received date';


COMMENT ON COLUMN MST_ARR_PR.PRMS_DLV_DT IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN MST_ARR_PR.PRMS_REFL_DT IS '納期回答反映日 // #MA.DT // Order promising applied date';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_DT IS '納入指示日 // #MA.DT // Delivery order date';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_PRMS_RCPT_DT IS '納入指示回答受領日 // #MA.DT // Delivery order replied received date';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_PRMS_REFL_DT IS '納入指示回答反映日 // #MA.DT // Delivery order reply applied date';


COMMENT ON COLUMN MST_ARR_PR.ARR_SCHD_TM IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN MST_ARR_PR.ARR_TM IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN MST_ARR_PR.PURC_DT IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN MST_ARR_PR.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ARR_PR.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ARR_PR.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_ARR_PR.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_ARR_PR.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_ARR_PR.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_ARR_PR.PRMS_RCPT_QTY IS '納期回答受領数量 // #MA.QTY // Order promising result received qty.';


COMMENT ON COLUMN MST_ARR_PR.PRMS_REFL_QTY IS '納期回答反映済数量 // #MA.QTY // Order promising applied qty.';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_QTY IS '納入指示数量 // #MA.QTY // Delivery order qty.';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_PRMS_RCPT_QTY IS '納入指示回答受領数量 // #MA.QTY // Delivery order replied received qty.';


COMMENT ON COLUMN MST_ARR_PR.DLV_INST_PRMS_REFL_QTY IS '納入指示回答反映済数量 // #MA.QTY // Delivery order reply applied qty.';


COMMENT ON COLUMN MST_ARR_PR.RE_ARR_SCHD_QTY IS '再入荷予定数量 // #MA.QTY // Scheduled re-receipt qty.';


COMMENT ON COLUMN MST_ARR_PR.RCPT_IV_QTY IS '受領インボイス数量 // #MA.QTY // Purchase invoice qty.';


COMMENT ON COLUMN MST_ARR_PR.ARR_QTY IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN MST_ARR_PR.PURC_QTY IS '仕入数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN MST_ARR_PR.SLS_RET_QTY IS '売上返品数量 // #MA.QTY // Sales return qty.';


COMMENT ON COLUMN MST_ARR_PR.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_ARR_PR.ARR_SCHD_ABORT_QTY IS '入荷予定打切数量 // #MA.QTY // Cancelled remaining receipt schedule qty.';


COMMENT ON COLUMN MST_ARR_PR.PURC_SCHD_ABORT_QTY IS '仕入予定打切数量 // #MA.QTY // Cancelled remaining purchase schedule qty.';


COMMENT ON COLUMN MST_ARR_PR.SLS_RET_SCHD_ABORT_QTY IS '売上返品予定打切数量 // #MA.QTY // Cancelled remaining sales return schedule qty.';


COMMENT ON COLUMN MST_ARR_PR.ACCPT_DFCT_QTY IS '検収不良数量 // #MA.QTY // Acceptance defective qty.';


COMMENT ON COLUMN MST_ARR_PR.STD_PURC_LT IS '標準納入ＬＴ // #MA.LT // Standard delivery LT';


COMMENT ON COLUMN MST_ARR_PR.ACT_PURC_LT IS '納入ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN MST_ARR_PR.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_ARR_PR.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_ARR_PR.BD_WG_CD IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_ARR_PR.PURC_DDLV_FLG IS '仕入直送ＦＬＧ // #MA.FLG // Direct delivery flg.';


COMMENT ON COLUMN MST_ARR_PR.PURC_STS_TYP IS '購買状況区分 // #MS.PURC_STS_TYP // Purchase status type';


COMMENT ON COLUMN MST_ARR_PR.PRMS_DLV_DT_OVERDUE_FLG IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN MST_ARR_PR.DLV_RQST_DT_OVERDUE_FLG IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN MST_ARR_PR.ARR_SCHD_SPLIT_FLG IS '入荷予定分割ＦＬＧ // #MA.FLG // Scheduled receipt split flg.';


COMMENT ON COLUMN MST_ARR_PR.ARR_SCHD_REFL_FLG IS '入荷予定反映済ＦＬＧ // #MA.FLG // Receipt schedule applied flg.';


COMMENT ON COLUMN MST_ARR_PR.ARR_CMPL_FLG IS '入荷完了ＦＬＧ // #MA.FLG // Receipt completed flg.';


COMMENT ON COLUMN MST_ARR_PR.PURC_CMPL_FLG IS '仕入完了ＦＬＧ // #MA.FLG // Purchase completion flg.';


COMMENT ON COLUMN MST_ARR_PR.SLS_RET_CMPL_FLG IS '売上返品完了ＦＬＧ // #MA.FLG // Sales return completion flg.';


COMMENT ON COLUMN MST_ARR_PR.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MST_ARR_PR.SUB_CHAR1 IS '予備１ // #MS.ARR_PR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ARR_PR.SUB_CHAR2 IS '予備２ // #MS.ARR_PR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ARR_PR.SUB_CHAR3 IS '予備３ // #MS.ARR_PR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ARR_PR.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ARR_PR.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ARR_PR.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ARR_PR.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ARR_PR.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ARR_PR.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ARR_PR.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ARR_PR.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ARR_PR.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ARR_PR.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

