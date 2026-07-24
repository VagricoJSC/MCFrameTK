\encoding UTF-8

COMMENT ON VIEW mst_acxfr_inst_d IS '他勘定振替指図明細 // Other accounting transfer order details';


COMMENT ON COLUMN mst_acxfr_inst_d.acxfr_inst_d_no IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN mst_acxfr_inst_d.acxfr_inst_no IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN mst_acxfr_inst_d.pr_sts_typ IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN mst_acxfr_inst_d.acxfr_schd_no IS '他勘定振替予定ＮＯ // #MA.ACXFR_SCHD_NO // Other accounting transfer schedule No.';


COMMENT ON COLUMN mst_acxfr_inst_d.acxfr_schd_dt IS '他勘定振替予定日 // #MA.DT // Scheduled other accounting transfer date';


COMMENT ON COLUMN mst_acxfr_inst_d.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_acxfr_inst_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_acxfr_inst_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_acxfr_inst_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.no_lot_fix_flg IS 'ロット指定無ＦＬＧ // #MA.FLG // Without lot flg.';


COMMENT ON COLUMN mst_acxfr_inst_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_acxfr_inst_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_acxfr_inst_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_acxfr_inst_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_acxfr_inst_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_acxfr_inst_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_acxfr_inst_d.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_acxfr_inst_d.alloc_flg IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN mst_acxfr_inst_d.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_acxfr_inst_d.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_acxfr_inst_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_acxfr_inst_d.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_acxfr_inst_d.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_acxfr_inst_d.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_acxfr_inst_d.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_acxfr_inst_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_acxfr_inst_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_loc_cd IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_ctg_cd IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_oper_cd IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_bp_cd IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_itm_cd IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_itm_sub1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_itm_sub2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_itm_sub3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_lot_no IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_sublot_no IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_sno1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_sno2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_sno3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN mst_acxfr_inst_d.bd_sno4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN mst_acxfr_inst_d.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_acxfr_inst_d.dspsl_no IS '廃棄申請ＮＯ // #MA.DSPSL_NO // Disposal application No.';


COMMENT ON COLUMN mst_acxfr_inst_d.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_acxfr_inst_d.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_acxfr_inst_d.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mst_acxfr_inst_d.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mst_acxfr_inst_d.intr_d_rmrks IS '内部明細備考 // #MS.ACXFR_INST_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_acxfr_inst_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_acxfr_inst_d.inst_d_rmrks IS '指図明細備考 // #MS.ACXFR_INST_D_RMRKS // Order details remarks';


COMMENT ON COLUMN mst_acxfr_inst_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_acxfr_inst_d.sub_char1 IS '予備１ // #MS.ACXFR_INST_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_acxfr_inst_d.sub_char2 IS '予備２ // #MS.ACXFR_INST_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_acxfr_inst_d.sub_char3 IS '予備３ // #MS.ACXFR_INST_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_acxfr_inst_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_acxfr_inst_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_acxfr_inst_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_acxfr_inst_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_acxfr_inst_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

