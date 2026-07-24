\encoding UTF-8

COMMENT ON VIEW msvt_mfg_inst_act IS '製造指図・実績ビュー // Mfg. order/results view';


COMMENT ON COLUMN msvt_mfg_inst_act.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_mfg_inst_rev IS '（製造指図）製造指図改訂番号 // #MA.SLIP_REV // (Mfg. order) Mfg. order rev. number';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_itm_mfg_inst_no IS '（製造指図）品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // (Mfg. order) Item mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_po_d_no IS '（製造指図）発注明細ＮＯ // #MA.PO_D_NO // (Mfg. order) PO details No.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_base_unit_yield_qty IS '（製造指図）基準単位出来高予定数量 // #MA.QTY // (Mfg. order) Base unit output scheduled qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_base_unit_inst_qty IS '（製造指図）基準単位製造指図数量 // #MA.QTY // (Mfg. order) Base unit mfg. order qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_base_unit_cd IS '（製造指図）基準単位ＣＤ // #MA.UNIT_CD // (Mfg. order) Base unit cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_st_schd_tm IS '（製造指図）着手予定日時 // #MA.TM // (Mfg. order) Scheduled start date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_end_schd_tm IS '（製造指図）終了予定日時 // #MA.TM // (Mfg. order) Scheduled end date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_rqst_dlv_rqst_tm IS '（製造指図）納入希望日時 // #MA.DT // (Mfg. order) Desired delivery date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_dt IS '（製造指図）指図日 // #MA.DT // (Mfg. order) Order date';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_prnt_tm IS '（製造指図）指図書発行日時 // #MA.TM // (Mfg. order) Order sheet issued date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_prnt_flg IS '（製造指図）指図書発行済ＦＬＧ // #MA.FLG // (Mfg. order) Order sheet issued flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_flg IS '（製造指図）承認対象ＦＬＧ // #MA.FLG // (Mfg. order) For approval flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_mfg_aprv_sts_typ IS '（製造指図）製造承認状況区分 // #MS.MFG_APRV_STS_TYP // (Mfg. order) Mfg. approval status type';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_dt IS '（製造指図）承認日 // #MA.DT // (Mfg. order) Approval date';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_dpt_cd IS '（製造指図）承認部門ＣＤ // #MA.DPT_CD // (Mfg. order) Approval dept. cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_usr_cd IS '（製造指図）承認者ＣＤ // #MA.USR_CD // (Mfg. order) Approver cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_tm IS '（製造指図）承認日時 // #MA.TM // (Mfg. order) Approval date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_aprv_rsn IS '（製造指図）承認理由 // #MS.APRV_RSN // (Mfg. order) Approval reason';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_mfg_aprv_role_cd IS '（製造指図）製造承認役割ＣＤ // #MA.APRV_ROLE_CD // (Mfg. order) Mfg. approval role cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_disp_pd IS '（製造指図）印字用表示期限 // #MS.DISP_PD // (Mfg. order) Display expiration for print';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_dpt_cd IS '（製造指図）指図部門ＣＤ // #MA.DPT_CD // (Mfg. order) Order dept. cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_usr_cd IS '（製造指図）指図担当者ＣＤ // #MA.USR_CD // (Mfg. order) Order PIC cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_can_flg IS '（製造指図）取消ＦＬＧ // #MA.FLG // (Mfg. order) Cancellation flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_abort_flg IS '（製造指図）打切ＦＬＧ // #MA.FLG // (Mfg. order) Cancel remaining flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_schd_chg_flg IS '（製造指図）計画変更ＦＬＧ // #MA.FLG // (Mfg. order) Plan change flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_po_locked_flg IS '（製造指図）発注訂正・取消不可ＦＬＧ // #MA.FLG // Do not allow (mfg. order) po correction/cancel flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_po_auto_reg_flg IS '（製造指図）発注時自動作成ＦＬＧ // #MA.FLG // (Mfg. order) Auto-create flg. at PO';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_mfg_inst_unit_typ IS '（製造指図）製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // (Mfg. order) Mfg. order unit type';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_intr_rmrks IS '（製造指図）内部備考 // #MS.MFG_INST_INTR_RMRKS // (Mfg. order) Internal remarks';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_rpt_rmrks IS '（製造指図）指図書備考 // #MS.MFG_INST_RPT_RMRKS // (Mfg. order) Order sheet remarks';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_inst_po_cnt_rmrks IS '（製造指図）指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // (Mfg. order) Order/PO contact remarks';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_sub_char1 IS '（製造指図）予備１ // #MS.MFG_INST_SUB_CHAR1 // (Mfg. order) Spare 1';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_sub_char2 IS '（製造指図）予備２ // #MS.MFG_INST_SUB_CHAR2 // (Mfg. order) Spare 2';


COMMENT ON COLUMN msvt_mfg_inst_act.mi_sub_char3 IS '（製造指図）予備３ // #MS.MFG_INST_SUB_CHAR3 // (Mfg. order) Spare 3';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_ord_no IS '（品目製造指図）品目オーダＮＯ // #MA.ITM_ORD_NO // (Item mfg. order) Item order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_io_schd_pr_no IS '（品目製造指図）受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // (Item mfg. order) GR/GI progress management No.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_frst_mfg_inst_no IS '（品目製造指図）初回製造指図ＮＯ // #MA.MFG_INST_NO // (Item mfg. order) Initial mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_mfg_mtd_typ IS '（品目製造指図）生産方法区分 // #MS.MFG_MTD_TYP // (Item mfg. order) Production method type';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sppl_cd IS '（品目製造指図）外注先ＣＤ // #MA.BP_CD // (Item mfg. order) Subcontractor cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_cd IS '（品目製造指図）品目ＣＤ // #MA.ITM_CD // (Item mfg. order) Item cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_sub1 IS '（品目製造指図）枝番１ // #MA.ITM_SUB1 // (Item mfg. order) Branch No. 1';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_sub2 IS '（品目製造指図）枝番２ // #MA.ITM_SUB2 // (Item mfg. order) Branch No. 2';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_sub3 IS '（品目製造指図）枝番３ // #MA.ITM_SUB3 // (Item mfg. order) Branch No. 3';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_oper_ptn IS '（品目製造指図）工程パタン // #MA.OPER_PTN // (Item mfg. order) Operation pattern';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_bom_ptn IS '（品目製造指図）構成パタン // #MA.BOM_PTN // (Item mfg. order) BOM pattern';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_base_unit_yield_qty IS '（品目製造指図）基準単位出来高予定数量 // #MA.QTY // (Item mfg. order) Base unit output scheduled qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_base_unit_inst_qty IS '（品目製造指図）基準単位製造指図数量 // #MA.QTY // (Item mfg. order) Base unit mfg. order qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_base_unit_cd IS '（品目製造指図）基準単位ＣＤ // #MA.UNIT_CD // (Item mfg. order) Base unit cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_master_dt IS '（品目製造指図）マスタ適用日 // #MA.DT // (Item mfg. order) Master application date';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_lot_no IS '（品目製造指図）ロットＮＯ // #MA.LOT_NO // (Item mfg. order) Lot No.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sublot_no IS '（品目製造指図）サブロットＮＯ // #MA.SUBLOT_NO // (Item mfg. order) Sublot No.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sno1 IS '（品目製造指図）手配ＮＯ１ // #MA.SNO1 // (Item mfg. order) SEIBAN No. 1';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sno2 IS '（品目製造指図）手配ＮＯ２ // #MA.SNO2 // (Item mfg. order) SEIBAN No. 2';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sno3 IS '（品目製造指図）手配ＮＯ３ // #MA.SNO3 // (Item mfg. order) SEIBAN No. 3';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sno4 IS '（品目製造指図）手配ＮＯ４ // #MA.SNO4 // (Item mfg. order) SEIBAN No. 4';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_unschd_inst_flg IS '（品目製造指図）計画外指図ＦＬＧ // #MA.FLG // (Item mfg. order) Without plan order flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_unschd_act_flg IS '（品目製造指図）計画外実績ＦＬＧ // #MA.FLG // (Item mfg. order) Unplanned result flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_strg_loc_cd IS '（品目製造指図）格納先場所ＣＤ // #MA.LOC_CD // (Item mfg. order) Storage location cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_strg_str_ln_cd IS '（品目製造指図）格納棚・ラインＣＤ // #MA.STR_LN_CD // (Item mfg. order) Storage rack/line cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_mfg_loc_cd IS '（品目製造指図）製造場所ＣＤ // #MA.LOC_CD // (Item mfg. order) Mfg. location cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_mfg_str_ln_cd IS '（品目製造指図）製造棚・ラインＣＤ // #MA.STR_LN_CD // (Item mfg. order) Mfg. rack/line cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_wg_cd IS '（品目製造指図）ワーキンググループＣＤ // #MA.WG_CD // (Item mfg. order) WG cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_site_cd IS '（品目製造指図）工場・物流倉庫ＣＤ // #MA.SITE_CD // (Item mfg. order) Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_lower_yield IS '（品目製造指図）品目下限収率 // #MA.YIELD // (Item mfg. order) Item min. yield';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_std_yield IS '（品目製造指図）品目標準収率 // #MA.YIELD // (Item mfg. order) Item standard yield';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_itm_upper_yield IS '（品目製造指図）品目上限収率 // #MA.YIELD // (Item mfg. order) Item max. yield';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sub_char1 IS '（品目製造指図）予備１ // #MS.ITM_MFG_INST_SUB_CHAR1 // (Item mfg. order) Spare 1';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sub_char2 IS '（品目製造指図）予備２ // #MS.ITM_MFG_INST_SUB_CHAR2 // (Item mfg. order) Spare 2';


COMMENT ON COLUMN msvt_mfg_inst_act.imi_sub_char3 IS '（品目製造指図）予備３ // #MS.ITM_MFG_INST_SUB_CHAR3 // (Item mfg. order) Spare 3';


COMMENT ON COLUMN msvt_mfg_inst_act.mpr_mfg_sts_typ IS '（製造指図進捗）製造状況区分 // #MS.MFG_STS_TYP // (Mfg. order progress) Mfg. status type';


COMMENT ON COLUMN msvt_mfg_inst_act.mpr_base_unit_mfg_rem_qty IS '（製造指図進捗）基準単位製造残数量 // #MA.QTY // (Mfg. order progress) Base unit remaining mfg. qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_mfg_act_no IS '（製造実績）製造実績ＮＯ // #MA.MFG_ACT_NO // (Mfg. result) Mfg. result No.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_mfg_inst_no IS '（製造実績）製造指図ＮＯ // #MA.MFG_INST_NO // (Mfg. result) Mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_div_seq IS '（製造実績）分割連番 // #MS.DIV_SEQ // (Mfg. result) Split sequence number';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_itm_mfg_inst_no IS '（製造実績）品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // (Mfg. result) Item mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_trd_cd IS '（製造実績）取引ＣＤ // #MA.TRD_CD // (Mfg. result) Transaction cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_st_act_tm IS '（製造実績）着手実績日時 // #MA.TM // (Mfg. result) Actual start date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_end_act_tm IS '（製造実績）終了実績日時 // #MA.TM // (Mfg. result) Actual end date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_base_unit_yield_qty IS '（製造実績）基準単位良品数量 // #MA.QTY // (Mfg. result) Base unit conforming qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_base_unit_dfct_qty IS '（製造実績）基準単位不良数量 // #MA.QTY // (Mfg. result) Base unit defective qty.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_base_unit_cd IS '（製造実績）基準単位ＣＤ // #MA.UNIT_CD // (Mfg. result) Base unit cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_st_ac_dt IS '（製造実績）着手計上日 // #MA.DT // (Mfg. result) Start recording date';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_end_ac_dt IS '（製造実績）終了計上日 // #MA.DT // (Mfg. result) End recording date';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_itm_yield IS '（製造実績）品目実際収率 // #MA.YIELD // (Mfg. result) Item actual yield';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_mfg_aprv_sts_typ IS '（製造実績）製造承認状況区分 // #MS.MFG_APRV_STS_TYP // (Mfg. result) Mfg. approval status type';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_aprv_dt IS '（製造実績）承認日 // #MA.DT // (Mfg. result) Approval date';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_aprv_dpt_cd IS '（製造実績）承認部門ＣＤ // #MA.DPT_CD // (Mfg. result) Approval dept. cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_aprv_usr_cd IS '（製造実績）承認者ＣＤ // #MA.USR_CD // (Mfg. result) Approver cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_aprv_tm IS '（製造実績）承認日時 // #MA.TM // (Mfg. result) Approval date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_aprv_rsn IS '（製造実績）承認理由 // #MS.APRV_RSN // (Mfg. result) Approval reason';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_act_prnt_flg IS '（製造実績）製造記録書発行済ＦＬＧ // #MA.FLG // (Mfg. result) Mfg. record sheet issued flg.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_act_prnt_tm IS '（製造実績）製造記録書発行日時 // #MA.TM // (Mfg. result) Mfg. record sheet issue date and time';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_seq IS '（製造実績）製造記録書連番 // #MA.PRNT_SEQ // (Mfg. result) Mfg. record sheet sequence number';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_act_dpt_cd IS '（製造実績）実績部門ＣＤ // #MA.DPT_CD // (Mfg. result) Result dept. cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_act_usr_cd IS '（製造実績）実績責任者ＣＤ // #MA.USR_CD // (Mfg. result) Result management PIC cd.';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_arr_purc_auto_reg_flg IS '（製造実績）入荷・仕入時自動作成ＦＬＧ // #MA.FLG // (Mfg. result) Auto-create flg. at receipt/purchase';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_intr_rmrks IS '（製造実績）内部備考 // #MS.MFG_ACT_INTR_RMRKS // (Mfg. result) Internal remarks';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_act_rpt_rmrks IS '（製造実績）記録書備考 // #MS.MFG_ACT_RPT_RMRKS // (Mfg. result) Record sheet remarks';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_sub_char1 IS '（製造実績）予備１ // #MS.MFG_ACT_SUB_CHAR1 // (Mfg. result) Spare 1';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_sub_char2 IS '（製造実績）予備２ // #MS.MFG_ACT_SUB_CHAR2 // (Mfg. result) Spare 2';


COMMENT ON COLUMN msvt_mfg_inst_act.ma_sub_char3 IS '（製造実績）予備３ // #MS.MFG_ACT_SUB_CHAR3 // (Mfg. result) Spare 3';

