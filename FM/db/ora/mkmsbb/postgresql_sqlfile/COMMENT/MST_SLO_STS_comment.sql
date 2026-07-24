\encoding UTF-8

COMMENT ON VIEW mst_slo_sts IS '受注状況 // Sales order status';


COMMENT ON COLUMN mst_slo_sts.slo_sts_no IS '受注状況ＮＯ // #MA.SLO_STS_NO // Sales order status No.';


COMMENT ON COLUMN mst_slo_sts.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_slo_sts.slo_sts_typ IS '受注状況区分 // #MS.SLO_STS_TYP // Sales order status type';


COMMENT ON COLUMN mst_slo_sts.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mst_slo_sts.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mst_slo_sts.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_slo_sts.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mst_slo_sts.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mst_slo_sts.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_slo_sts.tax_amt IS '税額 // #MA.MONEY // Tax amount';


COMMENT ON COLUMN mst_slo_sts.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_slo_sts.ship_lg_grp_cd IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN mst_slo_sts.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mst_slo_sts.slo_prms_rev IS '受注納期回答改訂番号 // #MA.SLIP_REV // Sales order promising Rev. No.';


COMMENT ON COLUMN mst_slo_sts.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_slo_sts.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_slo_sts.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_slo_sts.rcpt_iv_d_no IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN mst_slo_sts.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_slo_sts.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_slo_sts.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mst_slo_sts.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_slo_sts.biz_tm IS '業務実施日時 // #MA.TM // Business processed date and time';


COMMENT ON COLUMN mst_slo_sts.st_schd_tm IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mst_slo_sts.end_schd_tm IS '完了予定日時 // #MA.TM // Scheduled completion date and time';


COMMENT ON COLUMN mst_slo_sts.st_act_tm IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN mst_slo_sts.end_act_tm IS '完了実績日時 // #MA.TM // Actual completion date and time';


COMMENT ON COLUMN mst_slo_sts.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN mst_slo_sts.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_slo_sts.arr_act_no IS '入荷実績NO // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN mst_slo_sts.sls_act_no IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN mst_slo_sts.sls_act_d_no IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN mst_slo_sts.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_slo_sts.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_slo_sts.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_slo_sts.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_slo_sts.wg_rqst_no IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN mst_slo_sts.dlv_inst_no IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN mst_slo_sts.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN mst_slo_sts.dlv_inst_rcpt_no IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN mst_slo_sts.itm_ord_no IS '品目オーダNO // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_slo_sts.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_slo_sts.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_slo_sts.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_slo_sts.insp_act_no IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN mst_slo_sts.xfr_inst_no IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN mst_slo_sts.xfr_inst_d_no IS '移動指図明細ＮＯ // #MA.XFR_INST_D_NO // Movement order details No.';


COMMENT ON COLUMN mst_slo_sts.xfr_act_no IS '移動実績ＮＯ // #MA.XFR_ACT_NO // Movement result No.';


COMMENT ON COLUMN mst_slo_sts.xfr_act_d_no IS '移動実績明細ＮＯ // #MA.XFR_ACT_D_NO // Movement result details No.';


COMMENT ON COLUMN mst_slo_sts.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_sts.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_sts.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_sts.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_sts.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_sts.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_sts.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_sts.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_sts.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_sts.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

