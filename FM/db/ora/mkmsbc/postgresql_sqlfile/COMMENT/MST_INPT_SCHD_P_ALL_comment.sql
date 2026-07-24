\encoding UTF-8

COMMENT ON TABLE mst_inpt_schd_p_all IS '投入予定（改訂履歴） // Input schedule (Rev. history)';


COMMENT ON COLUMN mst_inpt_schd_p_all.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_inpt_schd_p_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.schd_tm IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN mst_inpt_schd_p_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_inpt_schd_p_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_inpt_schd_p_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_inpt_schd_p_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.base_unit_inpt_qty IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.base_unit_rqmt_qty IS '基準単位必要数量 // #MA.QTY // Base unit required qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.base_unit_fxd_rqmt_qty IS '基準単位固定必要数量 // #MA.QTY // Base unit fixed required qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_schd_p_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_sno1 IS '引当手配ＮＯ１ // #MA.SNO1 // Allocation SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_sno2 IS '引当手配ＮＯ２ // #MA.SNO2 // Allocation SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_sno3 IS '引当手配ＮＯ３ // #MA.SNO3 // Allocation SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_sno4 IS '引当手配ＮＯ４ // #MA.SNO4 // Allocation SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_schd_p_all.bkf_typ IS '投入品バックフラッシュ区分 // #MA.BKF_TYP // Input item backflush type';


COMMENT ON COLUMN mst_inpt_schd_p_all.cont_inpt_qty IS '有効成分（投入数量） // #MA.CONT_QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN mst_inpt_schd_p_all.cont_rqmt_qty IS '有効成分（必要数量） // #MA.CONT_QTY // Active ingredient (Required qty.)';


COMMENT ON COLUMN mst_inpt_schd_p_all.cont_fxd_rqmt_qty IS '有効成分（固定必要数量） // #MA.CONT_QTY // Active ingredient (Fixed required qty.)';


COMMENT ON COLUMN mst_inpt_schd_p_all.cont_fctr_unit_cd IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.std_cont_fctr IS '標準有効成分係数 // #MA.STD_CONT_FCTR // Standard active ingredient coefficient';


COMMENT ON COLUMN mst_inpt_schd_p_all.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_inpt_schd_p_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_inpt_schd_p_all.inpt_rsn_cd IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN mst_inpt_schd_p_all.par_inst_qty IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.chd_inpt_qty IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.chd_rqmt_qty IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.fxd_chd_rqmt_qty IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.main_itm_flg IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.inst_lot_fix_flg IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mst_inpt_schd_p_all.lot_mix_flg IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.sublot_mix_flg IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.bom_memo1 IS 'ＢＯＭメモ１ // #MA.MST_MEMO1 // BOM memo 1';


COMMENT ON COLUMN mst_inpt_schd_p_all.bom_memo2 IS 'ＢＯＭメモ２ // #MA.MST_MEMO2 // BOM memo 2';


COMMENT ON COLUMN mst_inpt_schd_p_all.bom_memo3 IS 'ＢＯＭメモ３ // #MA.MST_MEMO3 // BOM memo 3';


COMMENT ON COLUMN mst_inpt_schd_p_all.yield_calc_flg IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_flg IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.base_unit_alt_qty IS '基準単位代替元数量 // #MA.QTY // Base unit alternative sources qty.';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_itm_fix_flg IS '代替品目指定ＦＬＧ // #MA.FLG // Alternative item specification flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_alloc_prio IS '代替品目引当優先順位 // #MA.INT // Alternative item allocation priority';


COMMENT ON COLUMN mst_inpt_schd_p_all.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mst_inpt_schd_p_all.alloc_ctl_typ IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN mst_inpt_schd_p_all.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mst_inpt_schd_p_all.in_offst_typ IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN mst_inpt_schd_p_all.in_offst IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN mst_inpt_schd_p_all.bom_id_no IS '工程内ＢＯＭ識別番号 // #MA.INT // In-operation BOM identification number';


COMMENT ON COLUMN mst_inpt_schd_p_all.chd_itm_seq IS '同一子品目連番 // #MA.INT // Allow same child item sequence number';


COMMENT ON COLUMN mst_inpt_schd_p_all.recalc_grp IS '再計算グループ // #MA.INT // Re-calculation group';


COMMENT ON COLUMN mst_inpt_schd_p_all.recalc_grp_seq IS '再計算グループ連番 // #MA.INT // Re-calculation group sequence number';


COMMENT ON COLUMN mst_inpt_schd_p_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_inpt_schd_p_all.intr_rmrks IS '内部備考 // #MS.INPT_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_inpt_schd_p_all.inst_rpt_rmrks IS '指図書備考 // #MS.INPT_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN mst_inpt_schd_p_all.sub_char1 IS '予備１ // #MS.INPT_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_inpt_schd_p_all.sub_char2 IS '予備２ // #MS.INPT_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_inpt_schd_p_all.sub_char3 IS '予備３ // #MS.INPT_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_inpt_schd_p_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_schd_p_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_schd_p_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_schd_p_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_schd_p_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

