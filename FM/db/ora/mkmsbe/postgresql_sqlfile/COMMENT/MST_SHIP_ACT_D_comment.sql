\encoding UTF-8

COMMENT ON VIEW mst_ship_act_d IS '出荷実績明細 // Shipping result details';


COMMENT ON COLUMN mst_ship_act_d.ship_act_d_no IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN mst_ship_act_d.ship_act_no IS '出荷実績ＮＯ // #MA.SHIP_ACT_NO // Shipping result No.';


COMMENT ON COLUMN mst_ship_act_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_ship_act_d.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN mst_ship_act_d.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_ship_act_d.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_ship_act_d.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_ship_act_d.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_ship_act_d.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_ship_act_d.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mst_ship_act_d.ship_str_ln_cd IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_act_d.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_ship_act_d.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_act_d.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_ship_act_d.dlv_str_ln_cd IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN mst_ship_act_d.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_ship_act_d.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_ship_act_d.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_d.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_ship_act_d.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_ship_act_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ship_act_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ship_act_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ship_act_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ship_act_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_ship_act_d.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_ship_act_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_ship_act_d.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mst_ship_act_d.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mst_ship_act_d.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mst_ship_act_d.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mst_ship_act_d.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mst_ship_act_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ship_act_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ship_act_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ship_act_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ship_act_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_ship_act_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_ship_act_d.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ship_act_d.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_ship_act_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_ship_act_d.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_ship_act_d.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_ship_act_d.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_ship_act_d.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_ship_act_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ship_act_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ship_act_d.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_ship_act_d.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_ship_act_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ship_act_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ship_act_d.dlv_qty IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN mst_ship_act_d.ship_ret_qty IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN mst_ship_act_d.skip_chk_ship_flg IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN mst_ship_act_d.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_ship_act_d.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_ship_act_d.bd_wg_cd IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN mst_ship_act_d.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_ship_act_d.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_ship_act_d.cst_dlv_inst_no IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN mst_ship_act_d.cst_dlv_inst_d_no IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN mst_ship_act_d.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_ship_act_d.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_ship_act_d.ship_ret_flg IS '出荷返品対象ＦＬＧ // #MA.FLG // For shipping return flg.';


COMMENT ON COLUMN mst_ship_act_d.wms_flg IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN mst_ship_act_d.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_ship_act_d.ext_ship_act_no IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN mst_ship_act_d.base_dlv_slip_no IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN mst_ship_act_d.base_prov_act_no IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN mst_ship_act_d.base_ac_dt IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN mst_ship_act_d.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_ship_act_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_ship_act_d.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN mst_ship_act_d.intr_d_rmrks IS '内部明細備考 // #MS.SHIP_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_ship_act_d.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_ship_act_d.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_ship_act_d.stk_lst_prnt_flg IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN mst_ship_act_d.sub_char1 IS '予備１ // #MS.SHIP_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ship_act_d.sub_char2 IS '予備２ // #MS.SHIP_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ship_act_d.sub_char3 IS '予備３ // #MS.SHIP_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ship_act_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_act_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_act_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_act_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_act_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_act_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_act_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_act_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_act_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_act_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

