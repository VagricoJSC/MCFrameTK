
COMMENT ON TABLE MST_SLO_STS_ALL IS '受注状況 // Sales order status';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLO_STS_NO IS '受注状況ＮＯ // #MA.SLO_STS_NO // Sales order status No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLO_STS_TYP IS '受注状況区分 // #MS.SLO_STS_TYP // Sales order status type';


COMMENT ON COLUMN MST_SLO_STS_ALL.UNIT_CD IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MST_SLO_STS_ALL.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPRI IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN MST_SLO_STS_ALL.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MST_SLO_STS_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.TAX_AMT IS '税額 // #MA.MONEY // Tax amount';


COMMENT ON COLUMN MST_SLO_STS_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SHIP_LG_GRP_CD IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.ALLOC_GRP_CD IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLO_PRMS_REV IS '受注納期回答改訂番号 // #MA.SLIP_REV // Sales order promising Rev. No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.RCPT_IV_D_NO IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.BILL_NO IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_SLO_STS_ALL.BIZ_TM IS '業務実施日時 // #MA.TM // Business processed date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.ST_SCHD_TM IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.END_SCHD_TM IS '完了予定日時 // #MA.TM // Scheduled completion date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.END_ACT_TM IS '完了実績日時 // #MA.TM // Actual completion date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.SHIP_INST_NO IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SHIP_INST_D_NO IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.ARR_ACT_NO IS '入荷実績NO // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLS_ACT_NO IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.SLS_ACT_D_NO IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.WG_RQST_NO IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN MST_SLO_STS_ALL.DLV_INST_NO IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.DLV_INST_D_NO IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.DLV_INST_RCPT_NO IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.ITM_ORD_NO IS '品目オーダNO // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.INSP_ACT_NO IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.XFR_INST_NO IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.XFR_INST_D_NO IS '移動指図明細ＮＯ // #MA.XFR_INST_D_NO // Movement order details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.XFR_ACT_NO IS '移動実績ＮＯ // #MA.XFR_ACT_NO // Movement result No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.XFR_ACT_D_NO IS '移動実績明細ＮＯ // #MA.XFR_ACT_D_NO // Movement result details No.';


COMMENT ON COLUMN MST_SLO_STS_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLO_STS_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLO_STS_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLO_STS_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

