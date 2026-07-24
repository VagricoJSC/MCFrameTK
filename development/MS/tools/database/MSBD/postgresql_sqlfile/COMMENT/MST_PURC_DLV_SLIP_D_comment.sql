\encoding UTF-8

COMMENT ON VIEW mst_purc_dlv_slip_d IS '購買納品伝票明細 // Purchase delivery slip details';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_mng_d_no IS '納品書明細管理ＮＯ // #MS.DLV_SLIP_MNG_D_NO // Delivery note details management No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_mng_d_seq IS '納品書明細管理連番 // #MA.SLIP_SEQ // Delivery note details management sequence number';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_d_seq IS '納品書明細連番 // #MA.SLIP_SEQ // Delivery note details serial number';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_mng_no IS '納品書管理ＮＯ // #MS.DLV_SLIP_MNG_NO // Delivery note management No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_mng_seq IS '納品書管理連番 // #MA.SLIP_SEQ // Delivery note management sequence number';


COMMENT ON COLUMN mst_purc_dlv_slip_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_purc_dlv_slip_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_purc_dlv_slip_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_purc_dlv_slip_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_purc_dlv_slip_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_unit_po_qty IS '取引単位発注数量 // #MA.QTY // Transaction unit PO qty.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.base_unit_po_qty IS '基準単位数量発注数量 // #MA.QTY // Base unit qty. PO qty.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip_d.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_purc_dlv_slip_d.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_purc_dlv_slip_d.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.prms_rcpt_d_no IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_purc_dlv_slip_d.purc_ddlv_dlv_slip_no IS '仕入直送納品書ＮＯ // #MA.DLV_SLIP_NO // Direct delivery delivery note No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.purc_ddlv_dlv_slip_seq IS '仕入直送納品書連番 // #MA.SLIP_SEQ // Direct delivery delivery note sequence number';


COMMENT ON COLUMN mst_purc_dlv_slip_d.purc_ddlv_dlv_slip_d_no IS '仕入直送納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Direct delivery delivery note details No.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.prov_ddlv_flg IS '支給直送ＦＬＧ // #MA.FLG // Direct supply flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.purc_ddlv_flg IS '仕入直送ＦＬＧ // #MA.FLG // Direct delivery flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.dlv_slip_invalid_flg IS '納品書対象外ＦＬＧ // #MA.FLG // Not for delivery note flg.';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sub_char1 IS '予備１ // #MS.DLV_SLIP_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sub_char2 IS '予備２ // #MS.DLV_SLIP_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_dlv_slip_d.sub_char3 IS '予備３ // #MS.DLV_SLIP_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_dlv_slip_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_dlv_slip_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_dlv_slip_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_dlv_slip_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_dlv_slip_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

