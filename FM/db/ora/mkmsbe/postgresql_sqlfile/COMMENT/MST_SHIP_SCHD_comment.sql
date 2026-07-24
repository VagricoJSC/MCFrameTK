\encoding UTF-8

COMMENT ON VIEW mst_ship_schd IS '出荷予定 // Shipping schedule';


COMMENT ON COLUMN mst_ship_schd.ship_schd_no IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN mst_ship_schd.pr_sts_typ IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN mst_ship_schd.ship_pr_no IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN mst_ship_schd.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_ship_schd.dlv_inst_rcpt_no IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN mst_ship_schd.slo_prms_no IS '受注納期回答ＮＯ // #MA.SLO_PRMS_NO // Sales order promising No.';


COMMENT ON COLUMN mst_ship_schd.sls_act_d_no IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN mst_ship_schd.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_schd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_ship_schd.pd_inst_dlv_tm IS '納品依頼日時 // #MA.TM // Delivery request date and time';


COMMENT ON COLUMN mst_ship_schd.ship_rqst_tm IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN mst_ship_schd.ship_schd_tm IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN mst_ship_schd.dlv_schd_tm IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN mst_ship_schd.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_ship_schd.ship_wk_cd IS '出荷作業ＣＤ // #MA.SHIP_WK_CD // Shipping operation cd.';


COMMENT ON COLUMN mst_ship_schd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ship_schd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ship_schd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ship_schd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ship_schd.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_ship_schd.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_ship_schd.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_ship_schd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ship_schd.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_ship_schd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ship_schd.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_ship_schd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ship_schd.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_ship_schd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ship_schd.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_ship_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_ship_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_ship_schd.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ship_schd.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_ship_schd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_ship_schd.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_ship_schd.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_ship_schd.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_ship_schd.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_ship_schd.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ship_schd.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ship_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ship_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ship_schd.alloc_qty IS '引当数量 // #MA.QTY // Allocation qty.';


COMMENT ON COLUMN mst_ship_schd.wait_qty IS '保留数量 // #MA.QTY // Pending qty.';


COMMENT ON COLUMN mst_ship_schd.ship_inst_qty IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN mst_ship_schd.ship_act_qty IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN mst_ship_schd.iv_schd_qty IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN mst_ship_schd.iv_act_qty IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN mst_ship_schd.sls_qty IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN mst_ship_schd.dlv_qty IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN mst_ship_schd.ship_ret_qty IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN mst_ship_schd.abort_qty IS '打切数量 // #MA.QTY // Cancelled remaining qty.';


COMMENT ON COLUMN mst_ship_schd.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_ship_schd.not_dt_calc_flg IS '予定日計算対象外ＦＬＧ // #MA.FLG // Not to calculate scheduled date flg.';


COMMENT ON COLUMN mst_ship_schd.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_ship_schd.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_ship_schd.alloc_prio IS '引当順ＮＯ // #MS.STK_ALLOC_PRIO // Allocation sequence No.';


COMMENT ON COLUMN mst_ship_schd.ship_abl_flg IS '出荷判定ＦＬＧ // #MA.FLG // Shipping decision flg.';


COMMENT ON COLUMN mst_ship_schd.ship_lot_chk_tar_flg IS '出荷ロットチェックＦＬＧ // #MA.FLG // Shipping lot check flg.';


COMMENT ON COLUMN mst_ship_schd.ship_block_flg IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN mst_ship_schd.inst_bndl_flg IS '指図まとめＦＬＧ // #MA.FLG // Order aggregation flg.';


COMMENT ON COLUMN mst_ship_schd.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_ship_schd.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN mst_ship_schd.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_ship_schd.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_ship_schd.ship_skip_flg IS '出荷不要ＦＬＧ // #MA.FLG // Shipping unnecessary flg.';


COMMENT ON COLUMN mst_ship_schd.re_ship_schd_flg IS '再出荷予定ＦＬＧ // #MA.FLG // Shipping re-schedule flg.';


COMMENT ON COLUMN mst_ship_schd.intr_rmrks IS '内部備考 // #MS.SHIP_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_ship_schd.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_ship_schd.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_ship_schd.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN mst_ship_schd.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_ship_schd.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_ship_schd.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_ship_schd.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_ship_schd.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_ship_schd.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_ship_schd.dlv_lg_grp_cd IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN mst_ship_schd.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_ship_schd.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_ship_schd.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_ship_schd.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_ship_schd.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mst_ship_schd.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_ship_schd.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_ship_schd.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_ship_schd.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_ship_schd.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_ship_schd.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_ship_schd.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_ship_schd.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_ship_schd.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_ship_schd.tdlv_lg_grp_cd IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_ship_schd.dlv_day_week_typ IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN mst_ship_schd.base_dlv_slip_no IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN mst_ship_schd.base_prov_act_no IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN mst_ship_schd.base_ac_dt IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN mst_ship_schd.sub_char1 IS '予備１ // #MS.SHIP_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ship_schd.sub_char2 IS '予備２ // #MS.SHIP_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ship_schd.sub_char3 IS '予備３ // #MS.SHIP_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ship_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

