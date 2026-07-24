\encoding UTF-8

COMMENT ON VIEW mst_arr_schd IS '入荷予定 // Receipt schedule';


COMMENT ON COLUMN mst_arr_schd.arr_schd_no IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN mst_arr_schd.arr_pr_no IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN mst_arr_schd.prms_rcpt_d_no IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN mst_arr_schd.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN mst_arr_schd.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_arr_schd.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_arr_schd.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_arr_schd.pr_sts_typ IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN mst_arr_schd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_mng_no IS '納品書管理ＮＯ // #MS.DLV_SLIP_MNG_NO // Delivery note management No.';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_mng_seq IS '納品書管理連番 // #MA.SLIP_SEQ // Delivery note management sequence number';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_mng_d_no IS '納品書明細管理ＮＯ // #MS.DLV_SLIP_MNG_D_NO // Delivery note details management No.';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_mng_d_seq IS '納品書明細管理連番 // #MA.SLIP_SEQ // Delivery note details management sequence number';


COMMENT ON COLUMN mst_arr_schd.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_arr_schd.arr_ptn_typ IS '入荷パタン区分 // #MA.ARR_PTN_TYP // Receipt pattern type';


COMMENT ON COLUMN mst_arr_schd.arr_schd_tm IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN mst_arr_schd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_arr_schd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_arr_schd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_arr_schd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_arr_schd.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_arr_schd.rcpt_iv_itm_nm IS '受領インボイス表記品名 // #MA.ITM_NM // Item name for purchase invoice';


COMMENT ON COLUMN mst_arr_schd.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_arr_schd.purc_id_typ IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN mst_arr_schd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_arr_schd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_arr_schd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_arr_schd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_arr_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_arr_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_arr_schd.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_arr_schd.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_arr_schd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_arr_schd.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_arr_schd.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_arr_schd.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_arr_schd.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_arr_schd.ret_loc_cd IS '返品元場所ＣＤ // #MA.LOC_CD // Return-from location cd.';


COMMENT ON COLUMN mst_arr_schd.ret_str_ln_cd IS '返品元棚・ラインＣＤ // #MA.STR_LN_CD // Return-from rack/line cd.';


COMMENT ON COLUMN mst_arr_schd.ret_gd_cd IS '返品元格付ＣＤ // #MA.STK_GD_CD // Return-from grading cd.';


COMMENT ON COLUMN mst_arr_schd.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_arr_schd.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_arr_schd.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_arr_schd.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_arr_schd.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mst_arr_schd.arr_loc_cd IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN mst_arr_schd.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_arr_schd.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_arr_schd.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_arr_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_arr_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_arr_schd.arr_qty IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN mst_arr_schd.purc_qty IS '仕入数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN mst_arr_schd.sls_ret_qty IS '売上返品数量 // #MA.QTY // Sales return qty.';


COMMENT ON COLUMN mst_arr_schd.abort_qty IS '打切数量 // #MA.QTY // Cancelled remaining qty.';


COMMENT ON COLUMN mst_arr_schd.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_arr_schd.sls_ret_schd_abort_qty IS '売上返品予定打切数量 // #MA.QTY // Cancelled remaining sales return schedule qty.';


COMMENT ON COLUMN mst_arr_schd.sls_ret_schd_abort_flg IS '売上返品予定打切ＦＬＧ // #MA.FLG // Cancel remaining sales return schedule flg.';


COMMENT ON COLUMN mst_arr_schd.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_arr_schd.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_arr_schd.sls_ret_schd_cmpl_flg IS '売上返品予定完了ＦＬＧ // #MA.FLG // Sales return schedule completion flg.';


COMMENT ON COLUMN mst_arr_schd.arr_split_flg IS '入荷実績分割ＦＬＧ // #MA.FLG // Receipt result split flg.';


COMMENT ON COLUMN mst_arr_schd.arr_skip_flg IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN mst_arr_schd.re_arr_schd_flg IS '再入荷予定ＦＬＧ // #MA.FLG // Scheduled re-receipt flg.';


COMMENT ON COLUMN mst_arr_schd.outsrc_flg IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN mst_arr_schd.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_arr_schd.pre_outsrc_act_flg IS '外注実績先行ＦＬＧ // #MA.FLG // Subcontracting result prior flg.';


COMMENT ON COLUMN mst_arr_schd.pre_mfg_act_no IS '先行製造実績ＮＯ // #MA.MFG_ACT_NO // Prior mfg. result No.';


COMMENT ON COLUMN mst_arr_schd.wms_flg IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN mst_arr_schd.intr_rmrks IS '内部備考 // #MS.ARR_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_arr_schd.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_arr_schd.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_arr_schd.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN mst_arr_schd.dlv_slip_d_rmrks IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN mst_arr_schd.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_arr_schd.sub_char1 IS '予備１ // #MS.ARR_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_arr_schd.sub_char2 IS '予備２ // #MS.ARR_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_arr_schd.sub_char3 IS '予備３ // #MS.ARR_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_arr_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_arr_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_arr_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_arr_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_arr_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_arr_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_arr_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_arr_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_arr_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_arr_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

