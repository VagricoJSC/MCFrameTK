\encoding UTF-8

COMMENT ON VIEW mst_sls_schd IS '売上予定 // Sales schedule';


COMMENT ON COLUMN mst_sls_schd.sls_schd_no IS '売上予定ＮＯ // #MA.SLS_SCHD_NO // Sales schedule No.';


COMMENT ON COLUMN mst_sls_schd.sls_schd_src_typ IS '売上予定作成元区分 // #MS.SLS_SCHD_SRC_TYP // Sales schedule creating source type';


COMMENT ON COLUMN mst_sls_schd.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_sls_schd.dlv_inst_rcpt_no IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN mst_sls_schd.ship_schd_no IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN mst_sls_schd.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_sls_schd.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_sls_schd.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_sls_schd.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_sls_schd.wg_rqst_no IS 'ワーキンググループ間依頼ＮＯ // #MA.WG_RQST_NO // Inventory request No. from other WG';


COMMENT ON COLUMN mst_sls_schd.po_schd_no IS '発注予定ＮＯ // #MA.PO_SCHD_NO // PO schedule No.';


COMMENT ON COLUMN mst_sls_schd.purc_schd_no IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN mst_sls_schd.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_sls_schd.sls_schd_dt IS '売上予定日 // #MA.DT // Scheduled sales date';


COMMENT ON COLUMN mst_sls_schd.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_sls_schd.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_sls_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_sls_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_sls_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_sls_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_sls_schd.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_sls_schd.not_auto_sls_flg IS 'バッチ処理対象外ＦＬＧ // #MA.FLG // Not for batch process flg.';


COMMENT ON COLUMN mst_sls_schd.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_sls_schd.sls_ac_abl_flg IS '売上計上可能ＦＬＧ // #MA.FLG // Revenue recording possible flg.';


COMMENT ON COLUMN mst_sls_schd.base_unit_abort_qty IS '基準単位打切数量 // #MA.QTY // Base unit cancelled remaining qty.';


COMMENT ON COLUMN mst_sls_schd.base_unit_sls_qty IS '基準単位売上数量 // #MA.QTY // Base unit sales qty.';


COMMENT ON COLUMN mst_sls_schd.sub_char1 IS '予備１ // #MS.SLS_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_schd.sub_char2 IS '予備２ // #MS.SLS_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_schd.sub_char3 IS '予備３ // #MS.SLS_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

