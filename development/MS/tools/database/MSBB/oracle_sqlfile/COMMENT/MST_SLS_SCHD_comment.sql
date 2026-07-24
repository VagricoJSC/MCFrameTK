
COMMENT ON TABLE MST_SLS_SCHD IS '売上予定 // Sales schedule';


COMMENT ON COLUMN MST_SLS_SCHD.SLS_SCHD_NO IS '売上予定ＮＯ // #MA.SLS_SCHD_NO // Sales schedule No.';


COMMENT ON COLUMN MST_SLS_SCHD.SLS_SCHD_SRC_TYP IS '売上予定作成元区分 // #MS.SLS_SCHD_SRC_TYP // Sales schedule creating source type';


COMMENT ON COLUMN MST_SLS_SCHD.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_SLS_SCHD.DLV_INST_RCPT_NO IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN MST_SLS_SCHD.SHIP_SCHD_NO IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN MST_SLS_SCHD.SHIP_INST_D_NO IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN MST_SLS_SCHD.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_SLS_SCHD.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLS_SCHD.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_SLS_SCHD.WG_RQST_NO IS 'ワーキンググループ間依頼ＮＯ // #MA.WG_RQST_NO // Inventory request No. from other WG';


COMMENT ON COLUMN MST_SLS_SCHD.PO_SCHD_NO IS '発注予定ＮＯ // #MA.PO_SCHD_NO // PO schedule No.';


COMMENT ON COLUMN MST_SLS_SCHD.PURC_SCHD_NO IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN MST_SLS_SCHD.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_SLS_SCHD.SLS_SCHD_DT IS '売上予定日 // #MA.DT // Scheduled sales date';


COMMENT ON COLUMN MST_SLS_SCHD.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SLS_SCHD.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SLS_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SLS_SCHD.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SLS_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SLS_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SLS_SCHD.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MST_SLS_SCHD.NOT_AUTO_SLS_FLG IS 'バッチ処理対象外ＦＬＧ // #MA.FLG // Not for batch process flg.';


COMMENT ON COLUMN MST_SLS_SCHD.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SLS_SCHD.SLS_AC_ABL_FLG IS '売上計上可能ＦＬＧ // #MA.FLG // Revenue recording possible flg.';


COMMENT ON COLUMN MST_SLS_SCHD.BASE_UNIT_ABORT_QTY IS '基準単位打切数量 // #MA.QTY // Base unit cancelled remaining qty.';


COMMENT ON COLUMN MST_SLS_SCHD.BASE_UNIT_SLS_QTY IS '基準単位売上数量 // #MA.QTY // Base unit sales qty.';


COMMENT ON COLUMN MST_SLS_SCHD.SUB_CHAR1 IS '予備１ // #MS.SLS_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLS_SCHD.SUB_CHAR2 IS '予備２ // #MS.SLS_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLS_SCHD.SUB_CHAR3 IS '予備３ // #MS.SLS_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLS_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLS_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLS_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLS_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLS_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

