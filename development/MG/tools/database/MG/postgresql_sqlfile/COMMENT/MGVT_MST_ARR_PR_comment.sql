\encoding UTF-8

COMMENT ON VIEW mgvt_mst_arr_pr IS '入荷進捗ビュー // Receipt progress view';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_pr_no IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mgvt_mst_arr_pr.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.rqst_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.rqst_wg_cd IS '依頼元ワーキンググループＣＤ // #MA.WG_CD // Requesting WG cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.rqst_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sret_fr_cd IS '引取先ＣＤ // #MA.BP_CD // Pickup company cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.ret_dlv_slip_d_no IS '返品元納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Return-from delivery note details No.';


COMMENT ON COLUMN mgvt_mst_arr_pr.ret_stk_arrv_bp_cd IS '返品元在庫着荷先ＣＤ // #MA.BP_CD // Return-from inventory arrival destination cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_rcpt_dt IS '納期回答受領日 // #MA.DT // Order promising result received date';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_dlv_dt IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_refl_dt IS '納期回答反映日 // #MA.DT // Order promising applied date';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_dt IS '納入指示日 // #MA.DT // Delivery order date';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_prms_rcpt_dt IS '納入指示回答受領日 // #MA.DT // Delivery order replied received date';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_prms_refl_dt IS '納入指示回答反映日 // #MA.DT // Delivery order reply applied date';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_schd_tm IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_tm IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_dt IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN mgvt_mst_arr_pr.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_rcpt_qty IS '納期回答受領数量 // #MA.QTY // Order promising result received qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_refl_qty IS '納期回答反映済数量 // #MA.QTY // Order promising applied qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_qty IS '納入指示数量 // #MA.QTY // Delivery order qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_prms_rcpt_qty IS '納入指示回答受領数量 // #MA.QTY // Delivery order replied received qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_inst_prms_refl_qty IS '納入指示回答反映済数量 // #MA.QTY // Delivery order reply applied qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.re_arr_schd_qty IS '再入荷予定数量 // #MA.QTY // Scheduled re-receipt qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.rcpt_iv_qty IS '受領インボイス数量 // #MA.QTY // Purchase invoice qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_qty IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_qty IS '仕入数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sls_ret_qty IS '売上返品数量 // #MA.QTY // Sales return qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_schd_abort_qty IS '入荷予定打切数量 // #MA.QTY // Cancelled remaining receipt schedule qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_schd_abort_qty IS '仕入予定打切数量 // #MA.QTY // Cancelled remaining purchase schedule qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sls_ret_schd_abort_qty IS '売上返品予定打切数量 // #MA.QTY // Cancelled remaining sales return schedule qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.accpt_dfct_qty IS '検収不良数量 // #MA.QTY // Acceptance defective qty.';


COMMENT ON COLUMN mgvt_mst_arr_pr.std_purc_lt IS '標準納入ＬＴ // #MA.LT // Standard delivery LT';


COMMENT ON COLUMN mgvt_mst_arr_pr.act_purc_lt IS '納入ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN mgvt_mst_arr_pr.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.bd_wg_cd IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_ddlv_flg IS '仕入直送ＦＬＧ // #MA.FLG // Direct delivery flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_sts_typ IS '購買状況区分 //  // Purchase status type';


COMMENT ON COLUMN mgvt_mst_arr_pr.prms_dlv_dt_overdue_flg IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.dlv_rqst_dt_overdue_flg IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_schd_split_flg IS '入荷予定分割ＦＬＧ // #MA.FLG // Scheduled receipt split flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_schd_refl_flg IS '入荷予定反映済ＦＬＧ // #MA.FLG // Receipt schedule applied flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_cmpl_flg IS '入荷完了ＦＬＧ // #MA.FLG // Receipt completed flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.purc_cmpl_flg IS '仕入完了ＦＬＧ // #MA.FLG // Purchase completion flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.sls_ret_cmpl_flg IS '売上返品完了ＦＬＧ // #MA.FLG // Sales return completion flg.';


COMMENT ON COLUMN mgvt_mst_arr_pr.arr_cnt_rmrks IS '入荷連絡備考 //  // Receipt contact remarks';


COMMENT ON COLUMN mgvt_mst_arr_pr.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_arr_pr.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_arr_pr.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_arr_pr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_arr_pr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_arr_pr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_arr_pr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_arr_pr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

