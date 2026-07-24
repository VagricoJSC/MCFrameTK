\encoding UTF-8

COMMENT ON VIEW mgvt_acc_oper_cost3_if_all IS '工程原価計算結果３送信ＩＦビュー // Operation cost calculation result 3 export IF view';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.bi_not_send_flg IS '送信対象外ＦＬＧ // #MA.FLG // Not to be exported flg.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.calc_rec_typ IS '計算レコード区分 // #MG.CALC_REC_TYP // Calculation record type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.mfg_purc_typ IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_io_typ IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.stk_bp_cd IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_id IS '実績ＩＤ // #MG.ACT_ID // Result ID';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_id_sub IS '実績ＩＤ枝番 // #MG.ACT_ID_SUB // Result ID branch No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.other_dpt_cd IS '相手部門ＣＤ // #MA.COST_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sls_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_sls_cd1 IS '売上分類１ // #MA.COST_SLS_CD // Sales classification 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_sls_cd2 IS '売上分類２ // #MA.COST_SLS_CD // Sales classification 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_sls_cd3 IS '売上分類３ // #MA.COST_SLS_CD // Sales classification 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_sls_cd4 IS '売上分類４ // #MA.COST_SLS_CD // Sales classification 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cost_sls_cd5 IS '売上分類５ // #MA.COST_SLS_CD // Sales classification 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.inst_qty IS '指図数量 // #MA.QTY // Order qty.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_qty IS '標準数量 // #MA.QTY // Standard qty.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_amt IS '標準金額 // #MA.MONEY // Standard amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cur_amt IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.cur_std_amt IS '通貨標準金額 // #MA.MONEY // Currency standard amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_xrate IS '標準為替レート // #MA.MONEY // Standard exchange rate';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upri_diff IS '単価差異 // #MA.MONEY // Unit price variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.rate_diff IS 'レート差異 // #MA.MONEY // Rate variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.trd_grp IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_upri IS '実際単価 // #MA.MONEY // Actual unit price';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_upri IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.so_act_amt IS '実際相殺金額 // #MA.MONEY // Actual offset amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.so_std_amt IS '標準相殺金額 // #MA.MONEY // Standard offset amount';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.per IS '進捗度 // #MA.RATE // Progress';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.mfg_cost_ratio IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.gp_alc_cd IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_qty IS '数量差異 // #MA.MONEY // Quantity variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_wk IS '工数差異 // #MA.MONEY // Time variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_up IS '価格差異 // #MA.MONEY // Price variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_rt IS '配賦率差異 // #MA.MONEY // Allocation rate variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_std IS '標準調整差異 // #MA.MONEY // Standard adjustment variance';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_a IS '差異１ // #MA.MONEY // Variance 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_b IS '差異２ // #MA.MONEY // Variance 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_c IS '差異３ // #MA.MONEY // Variance 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_d IS '差異４ // #MA.MONEY // Variance 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.diff_e IS '差異５ // #MA.MONEY // Variance 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.mfg_inpt_cost IS '製造品投入原価 // #MA.MONEY // Mfg. item input cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_mfg_inpt_cost IS '標準製造品投入原価 // #MA.MONEY // Standard mfg. item input cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sls_cost IS '売上原価 // #MA.MONEY // Cost of goods sold';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_sls_cost IS '標準売上原価 // #MA.MONEY // Standard cost of goods sold';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.sls_mng_cost IS '販管費 // #MA.MONEY // SGA';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_sls_mng_cost IS '標準販管費 // #MA.MONEY // Standard SGA';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.fxd_cost IS '固定費 // #MA.MONEY // Fixed cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.var_cost IS '変動費 // #MA.MONEY // Variable cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.dir_cost IS '直接費 // #MA.MONEY // Direct cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.indir_cost IS '間接費 // #MA.MONEY // Indirect cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost IS '実際原価 // #MA.MONEY // Actual cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost1 IS '実際原価１ // #MA.MONEY // Actual cost 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost2 IS '実際原価２ // #MA.MONEY // Actual cost 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost3 IS '実際原価３ // #MA.MONEY // Actual cost 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost4 IS '実際原価４ // #MA.MONEY // Actual cost 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost5 IS '実際原価５ // #MA.MONEY // Actual cost 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost6 IS '実際原価６ // #MA.MONEY // Actual cost 6';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost7 IS '実際原価７ // #MA.MONEY // Actual cost 7';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost8 IS '実際原価８ // #MA.MONEY // Actual cost 8';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost9 IS '実際原価９ // #MA.MONEY // Actual cost 9';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost10 IS '実際原価１０ // #MA.MONEY // Actual cost 10';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost11 IS '実際原価１１ // #MA.MONEY // Actual cost 11';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost12 IS '実際原価１２ // #MA.MONEY // Actual cost 12';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost13 IS '実際原価１３ // #MA.MONEY // Actual cost 13';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost14 IS '実際原価１４ // #MA.MONEY // Actual cost 14';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost15 IS '実際原価１５ // #MA.MONEY // Actual cost 15';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost16 IS '実際原価１６ // #MA.MONEY // Actual cost 16';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost17 IS '実際原価１７ // #MA.MONEY // Actual cost 17';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost18 IS '実際原価１８ // #MA.MONEY // Actual cost 18';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost19 IS '実際原価１９ // #MA.MONEY // Actual cost 19';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost20 IS '実際原価２０ // #MA.MONEY // Actual cost 20';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost21 IS '実際原価２１ // #MA.MONEY // Actual cost 21';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost22 IS '実際原価２２ // #MA.MONEY // Actual cost 22';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost23 IS '実際原価２３ // #MA.MONEY // Actual cost 23';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost24 IS '実際原価２４ // #MA.MONEY // Actual cost 24';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost25 IS '実際原価２５ // #MA.MONEY // Actual cost 25';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost26 IS '実際原価２６ // #MA.MONEY // Actual cost 26';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost27 IS '実際原価２７ // #MA.MONEY // Actual cost 27';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost28 IS '実際原価２８ // #MA.MONEY // Actual cost 28';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost29 IS '実際原価２９ // #MA.MONEY // Actual cost 29';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost30 IS '実際原価３０ // #MA.MONEY // Actual cost 30';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost31 IS '実際原価３１ // #MA.MONEY // Actual cost 31';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost32 IS '実際原価３２ // #MA.MONEY // Actual cost 32';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost33 IS '実際原価３３ // #MA.MONEY // Actual cost 33';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost34 IS '実際原価３４ // #MA.MONEY // Actual cost 34';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost35 IS '実際原価３５ // #MA.MONEY // Actual cost 35';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost36 IS '実際原価３６ // #MA.MONEY // Actual cost 36';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost37 IS '実際原価３７ // #MA.MONEY // Actual cost 37';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost38 IS '実際原価３８ // #MA.MONEY // Actual cost 38';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost39 IS '実際原価３９ // #MA.MONEY // Actual cost 39';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost40 IS '実際原価４０ // #MA.MONEY // Actual cost 40';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost41 IS '実際原価４１ // #MA.MONEY // Actual cost 41';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost42 IS '実際原価４２ // #MA.MONEY // Actual cost 42';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost43 IS '実際原価４３ // #MA.MONEY // Actual cost 43';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost44 IS '実際原価４４ // #MA.MONEY // Actual cost 44';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost45 IS '実際原価４５ // #MA.MONEY // Actual cost 45';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost46 IS '実際原価４６ // #MA.MONEY // Actual cost 46';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost47 IS '実際原価４７ // #MA.MONEY // Actual cost 47';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost48 IS '実際原価４８ // #MA.MONEY // Actual cost 48';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost49 IS '実際原価４９ // #MA.MONEY // Actual cost 49';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost50 IS '実際原価５０ // #MA.MONEY // Actual cost 50';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost51 IS '実際原価５１ // #MA.MONEY // Actual cost 51';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost52 IS '実際原価５２ // #MA.MONEY // Actual cost 52';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost53 IS '実際原価５３ // #MA.MONEY // Actual cost 53';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost54 IS '実際原価５４ // #MA.MONEY // Actual cost 54';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost55 IS '実際原価５５ // #MA.MONEY // Actual cost 55';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost56 IS '実際原価５６ // #MA.MONEY // Actual cost 56';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost57 IS '実際原価５７ // #MA.MONEY // Actual cost 57';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost58 IS '実際原価５８ // #MA.MONEY // Actual cost 58';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost59 IS '実際原価５９ // #MA.MONEY // Actual cost 59';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost60 IS '実際原価６０ // #MA.MONEY // Actual cost 60';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost61 IS '実際原価６１ // #MA.MONEY // Actual cost 61';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost62 IS '実際原価６２ // #MA.MONEY // Actual cost 62';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost63 IS '実際原価６３ // #MA.MONEY // Actual cost 63';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost64 IS '実際原価６４ // #MA.MONEY // Actual cost 64';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost65 IS '実際原価６５ // #MA.MONEY // Actual cost 65';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost66 IS '実際原価６６ // #MA.MONEY // Actual cost 66';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost67 IS '実際原価６７ // #MA.MONEY // Actual cost 67';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost68 IS '実際原価６８ // #MA.MONEY // Actual cost 68';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost69 IS '実際原価６９ // #MA.MONEY // Actual cost 69';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost70 IS '実際原価７０ // #MA.MONEY // Actual cost 70';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost71 IS '実際原価７１ // #MA.MONEY // Actual cost 71';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost72 IS '実際原価７２ // #MA.MONEY // Actual cost 72';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost73 IS '実際原価７３ // #MA.MONEY // Actual cost 73';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost74 IS '実際原価７４ // #MA.MONEY // Actual cost 74';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost75 IS '実際原価７５ // #MA.MONEY // Actual cost 75';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost76 IS '実際原価７６ // #MA.MONEY // Actual cost 76';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost77 IS '実際原価７７ // #MA.MONEY // Actual cost 77';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost78 IS '実際原価７８ // #MA.MONEY // Actual cost 78';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost79 IS '実際原価７９ // #MA.MONEY // Actual cost 79';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost80 IS '実際原価８０ // #MA.MONEY // Actual cost 80';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost81 IS '実際原価８１ // #MA.MONEY // Actual cost 81';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost82 IS '実際原価８２ // #MA.MONEY // Actual cost 82';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost83 IS '実際原価８３ // #MA.MONEY // Actual cost 83';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost84 IS '実際原価８４ // #MA.MONEY // Actual cost 84';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost85 IS '実際原価８５ // #MA.MONEY // Actual cost 85';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost86 IS '実際原価８６ // #MA.MONEY // Actual cost 86';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost87 IS '実際原価８７ // #MA.MONEY // Actual cost 87';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost88 IS '実際原価８８ // #MA.MONEY // Actual cost 88';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost89 IS '実際原価８９ // #MA.MONEY // Actual cost 89';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost90 IS '実際原価９０ // #MA.MONEY // Actual cost 90';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost91 IS '実際原価９１ // #MA.MONEY // Actual cost 91';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost92 IS '実際原価９２ // #MA.MONEY // Actual cost 92';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost93 IS '実際原価９３ // #MA.MONEY // Actual cost 93';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost94 IS '実際原価９４ // #MA.MONEY // Actual cost 94';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost95 IS '実際原価９５ // #MA.MONEY // Actual cost 95';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost96 IS '実際原価９６ // #MA.MONEY // Actual cost 96';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost97 IS '実際原価９７ // #MA.MONEY // Actual cost 97';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost98 IS '実際原価９８ // #MA.MONEY // Actual cost 98';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost99 IS '実際原価９９ // #MA.MONEY // Actual cost 99';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.act_cost100 IS '実際原価１００ // #MA.MONEY // Actual cost 100';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost IS '標準原価 // #MA.MONEY // Standard cost';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost1 IS '標準原価１ // #MA.MONEY // Standard cost 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost2 IS '標準原価２ // #MA.MONEY // Standard cost 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost3 IS '標準原価３ // #MA.MONEY // Standard cost 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost4 IS '標準原価４ // #MA.MONEY // Standard cost 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost5 IS '標準原価５ // #MA.MONEY // Standard cost 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost6 IS '標準原価６ // #MA.MONEY // Standard cost 6';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost7 IS '標準原価７ // #MA.MONEY // Standard cost 7';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost8 IS '標準原価８ // #MA.MONEY // Standard cost 8';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost9 IS '標準原価９ // #MA.MONEY // Standard cost 9';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost10 IS '標準原価１０ // #MA.MONEY // Standard cost 10';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost11 IS '標準原価１１ // #MA.MONEY // Standard cost 11';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost12 IS '標準原価１２ // #MA.MONEY // Standard cost 12';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost13 IS '標準原価１３ // #MA.MONEY // Standard cost 13';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost14 IS '標準原価１４ // #MA.MONEY // Standard cost 14';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost15 IS '標準原価１５ // #MA.MONEY // Standard cost 15';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost16 IS '標準原価１６ // #MA.MONEY // Standard cost 16';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost17 IS '標準原価１７ // #MA.MONEY // Standard cost 17';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost18 IS '標準原価１８ // #MA.MONEY // Standard cost 18';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost19 IS '標準原価１９ // #MA.MONEY // Standard cost 19';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost20 IS '標準原価２０ // #MA.MONEY // Standard cost 20';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost21 IS '標準原価２１ // #MA.MONEY // Standard cost 21';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost22 IS '標準原価２２ // #MA.MONEY // Standard cost 22';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost23 IS '標準原価２３ // #MA.MONEY // Standard cost 23';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost24 IS '標準原価２４ // #MA.MONEY // Standard cost 24';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost25 IS '標準原価２５ // #MA.MONEY // Standard cost 25';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost26 IS '標準原価２６ // #MA.MONEY // Standard cost 26';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost27 IS '標準原価２７ // #MA.MONEY // Standard cost 27';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost28 IS '標準原価２８ // #MA.MONEY // Standard cost 28';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost29 IS '標準原価２９ // #MA.MONEY // Standard cost 29';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost30 IS '標準原価３０ // #MA.MONEY // Standard cost 30';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost31 IS '標準原価３１ // #MA.MONEY // Standard cost 31';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost32 IS '標準原価３２ // #MA.MONEY // Standard cost 32';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost33 IS '標準原価３３ // #MA.MONEY // Standard cost 33';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost34 IS '標準原価３４ // #MA.MONEY // Standard cost 34';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost35 IS '標準原価３５ // #MA.MONEY // Standard cost 35';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost36 IS '標準原価３６ // #MA.MONEY // Standard cost 36';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost37 IS '標準原価３７ // #MA.MONEY // Standard cost 37';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost38 IS '標準原価３８ // #MA.MONEY // Standard cost 38';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost39 IS '標準原価３９ // #MA.MONEY // Standard cost 39';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost40 IS '標準原価４０ // #MA.MONEY // Standard cost 40';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost41 IS '標準原価４１ // #MA.MONEY // Standard cost 41';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost42 IS '標準原価４２ // #MA.MONEY // Standard cost 42';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost43 IS '標準原価４３ // #MA.MONEY // Standard cost 43';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost44 IS '標準原価４４ // #MA.MONEY // Standard cost 44';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost45 IS '標準原価４５ // #MA.MONEY // Standard cost 45';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost46 IS '標準原価４６ // #MA.MONEY // Standard cost 46';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost47 IS '標準原価４７ // #MA.MONEY // Standard cost 47';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost48 IS '標準原価４８ // #MA.MONEY // Standard cost 48';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost49 IS '標準原価４９ // #MA.MONEY // Standard cost 49';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost50 IS '標準原価５０ // #MA.MONEY // Standard cost 50';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost51 IS '標準原価５１ // #MA.MONEY // Standard cost 51';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost52 IS '標準原価５２ // #MA.MONEY // Standard cost 52';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost53 IS '標準原価５３ // #MA.MONEY // Standard cost 53';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost54 IS '標準原価５４ // #MA.MONEY // Standard cost 54';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost55 IS '標準原価５５ // #MA.MONEY // Standard cost 55';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost56 IS '標準原価５６ // #MA.MONEY // Standard cost 56';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost57 IS '標準原価５７ // #MA.MONEY // Standard cost 57';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost58 IS '標準原価５８ // #MA.MONEY // Standard cost 58';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost59 IS '標準原価５９ // #MA.MONEY // Standard cost 59';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost60 IS '標準原価６０ // #MA.MONEY // Standard cost 60';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost61 IS '標準原価６１ // #MA.MONEY // Standard cost 61';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost62 IS '標準原価６２ // #MA.MONEY // Standard cost 62';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost63 IS '標準原価６３ // #MA.MONEY // Standard cost 63';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost64 IS '標準原価６４ // #MA.MONEY // Standard cost 64';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost65 IS '標準原価６５ // #MA.MONEY // Standard cost 65';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost66 IS '標準原価６６ // #MA.MONEY // Standard cost 66';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost67 IS '標準原価６７ // #MA.MONEY // Standard cost 67';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost68 IS '標準原価６８ // #MA.MONEY // Standard cost 68';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost69 IS '標準原価６９ // #MA.MONEY // Standard cost 69';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost70 IS '標準原価７０ // #MA.MONEY // Standard cost 70';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost71 IS '標準原価７１ // #MA.MONEY // Standard cost 71';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost72 IS '標準原価７２ // #MA.MONEY // Standard cost 72';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost73 IS '標準原価７３ // #MA.MONEY // Standard cost 73';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost74 IS '標準原価７４ // #MA.MONEY // Standard cost 74';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost75 IS '標準原価７５ // #MA.MONEY // Standard cost 75';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost76 IS '標準原価７６ // #MA.MONEY // Standard cost 76';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost77 IS '標準原価７７ // #MA.MONEY // Standard cost 77';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost78 IS '標準原価７８ // #MA.MONEY // Standard cost 78';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost79 IS '標準原価７９ // #MA.MONEY // Standard cost 79';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost80 IS '標準原価８０ // #MA.MONEY // Standard cost 80';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost81 IS '標準原価８１ // #MA.MONEY // Standard cost 81';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost82 IS '標準原価８２ // #MA.MONEY // Standard cost 82';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost83 IS '標準原価８３ // #MA.MONEY // Standard cost 83';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost84 IS '標準原価８４ // #MA.MONEY // Standard cost 84';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost85 IS '標準原価８５ // #MA.MONEY // Standard cost 85';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost86 IS '標準原価８６ // #MA.MONEY // Standard cost 86';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost87 IS '標準原価８７ // #MA.MONEY // Standard cost 87';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost88 IS '標準原価８８ // #MA.MONEY // Standard cost 88';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost89 IS '標準原価８９ // #MA.MONEY // Standard cost 89';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost90 IS '標準原価９０ // #MA.MONEY // Standard cost 90';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost91 IS '標準原価９１ // #MA.MONEY // Standard cost 91';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost92 IS '標準原価９２ // #MA.MONEY // Standard cost 92';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost93 IS '標準原価９３ // #MA.MONEY // Standard cost 93';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost94 IS '標準原価９４ // #MA.MONEY // Standard cost 94';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost95 IS '標準原価９５ // #MA.MONEY // Standard cost 95';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost96 IS '標準原価９６ // #MA.MONEY // Standard cost 96';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost97 IS '標準原価９７ // #MA.MONEY // Standard cost 97';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost98 IS '標準原価９８ // #MA.MONEY // Standard cost 98';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost99 IS '標準原価９９ // #MA.MONEY // Standard cost 99';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.std_cost100 IS '標準原価１００ // #MA.MONEY // Standard cost 100';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_char30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_num1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_num2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_num3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_num4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_num5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_dt1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_dt2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_dt3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_dt4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.if_sub_dt5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_acc_oper_cost3_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

