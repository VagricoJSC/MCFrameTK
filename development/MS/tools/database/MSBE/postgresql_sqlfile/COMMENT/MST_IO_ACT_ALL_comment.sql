\encoding UTF-8

COMMENT ON TABLE mst_io_act_all IS '受払実績 // GR/GI result';


COMMENT ON COLUMN mst_io_act_all.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mst_io_act_all.slip_seq_no IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN mst_io_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_io_act_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_io_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_io_act_all.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN mst_io_act_all.slip_rev_no IS '伝票改訂番号 // #MA.SLIP_REV // Slip rev. number';


COMMENT ON COLUMN mst_io_act_all.act_no IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN mst_io_act_all.act_seq IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN mst_io_act_all.act_rev_no IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN mst_io_act_all.act_d_no IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN mst_io_act_all.act_d_seq IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN mst_io_act_all.act_io_no IS '実績受払ＮＯ // #MA.ACT_IO_NO // Result GR/GI No.';


COMMENT ON COLUMN mst_io_act_all.act_io_seq IS '実績受払連番 // #MA.SLIP_SEQ // Result GR/GI sequence number';


COMMENT ON COLUMN mst_io_act_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_io_act_all.un_fix_flg IS '金額未確定ＦＬＧ // #MA.FLG // Amount unfirm flg.';


COMMENT ON COLUMN mst_io_act_all.temp_ap_flg IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN mst_io_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_io_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_io_act_all.trn_typ IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN mst_io_act_all.io_act_typ IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN mst_io_act_all.io_typ IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN mst_io_act_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mst_io_act_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_io_act_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mst_io_act_all.gi_wg_cd IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN mst_io_act_all.gr_wg_cd IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN mst_io_act_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_io_act_all.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_io_act_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_io_act_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_io_act_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_io_act_all.gi_dpt_cd IS '出庫部門ＣＤ // #MA.DPT_CD // GI dept. cd.';


COMMENT ON COLUMN mst_io_act_all.gr_dpt_cd IS '入庫部門ＣＤ // #MA.DPT_CD // GR dept. cd.';


COMMENT ON COLUMN mst_io_act_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_io_act_all.sub_dpt_cd1 IS '予備部門ＣＤ１ // #MA.DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN mst_io_act_all.sub_dpt_cd2 IS '予備部門ＣＤ２ // #MA.DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN mst_io_act_all.sub_dpt_cd3 IS '予備部門ＣＤ３ // #MA.DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN mst_io_act_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_io_act_all.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_io_act_all.mfg_usr_cd IS '製造担当者ＣＤ // #MA.USR_CD // Mfg. PIC cd.';


COMMENT ON COLUMN mst_io_act_all.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_io_act_all.ac_itm_grp_cd IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN mst_io_act_all.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mst_io_act_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_io_act_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_io_act_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_io_act_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_io_act_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_io_act_all.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mst_io_act_all.asset_mng_typ IS '資産管理区分 // #MA.ASSET_MNG_TYP // Asset management type';


COMMENT ON COLUMN mst_io_act_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_io_act_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_io_act_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_io_act_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_io_act_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_io_act_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_io_act_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_io_act_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_io_act_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_io_act_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_io_act_all.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_io_act_all.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_io_act_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_io_act_all.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_io_act_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_io_act_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mst_io_act_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_io_act_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_io_act_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_io_act_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_io_act_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_io_act_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_io_act_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_io_act_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_io_act_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_io_act_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_io_act_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_io_act_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_io_act_all.trd_cur_proc_amt IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN mst_io_act_all.trd_cur_onr_prov_amt IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN mst_io_act_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_io_act_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_io_act_all.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_io_act_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_io_act_all.base_cur_proc_amt IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN mst_io_act_all.base_cur_onr_prov_amt IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN mst_io_act_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_proc_amt IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_onr_prov_amt IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN mst_io_act_all.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mst_io_act_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_io_act_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_io_act_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_io_act_all.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mst_io_act_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_io_act_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_io_act_all.ptax_xrate_cd IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN mst_io_act_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_io_act_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_io_act_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_io_act_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_io_act_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_io_act_all.bd_ctg_cd IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN mst_io_act_all.bd_bp_cd IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN mst_io_act_all.bd_oper_cd IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN mst_io_act_all.bd_loc_cd IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN mst_io_act_all.bd_slo_no IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN mst_io_act_all.bd_po_no IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN mst_io_act_all.bd_iv_no IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN mst_io_act_all.bd_wg_cd IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN mst_io_act_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_io_act_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_io_act_all.rcst_cd IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN mst_io_act_all.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_io_act_all.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_io_act_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_io_act_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_io_act_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_io_act_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_io_act_all.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mst_io_act_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_io_act_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_io_act_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_io_act_all.cred_cd IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN mst_io_act_all.spot_flg IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN mst_io_act_all.sttl_schd_dt IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN mst_io_act_all.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mst_io_act_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_io_act_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_io_act_all.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_io_act_all.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_io_act_all.purc_typ IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN mst_io_act_all.area_cd IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN mst_io_act_all.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mst_io_act_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_io_act_all.itm_inst_qty IS '品目指図数量 // #MA.QTY // Item order qty.';


COMMENT ON COLUMN mst_io_act_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_io_act_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_io_act_all.mfg_st_qty IS '製造着手数量 // #MA.QTY // Mfg. start qty.';


COMMENT ON COLUMN mst_io_act_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mst_io_act_all.yield_rate IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN mst_io_act_all.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mst_io_act_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_io_act_all.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN mst_io_act_all.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN mst_io_act_all.outsrc_mfg_loc_cd IS '外注製造場所ＣＤ // #MA.LOC_CD // Subcontracting mfg. location cd.';


COMMENT ON COLUMN mst_io_act_all.outsrc_mfg_loc_dpt_cd IS '外注製造場所部門ＣＤ // #MA.DPT_CD // Subcontracting mfg. location dept. cd.';


COMMENT ON COLUMN mst_io_act_all.outsrc_mfg_loc_wg_cd IS '外注製造場所ワーキンググループＣＤ // #MA.WG_CD // Subcontracting mfg. location WG cd.';


COMMENT ON COLUMN mst_io_act_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_io_act_all.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_io_act_all.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_io_act_all.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mst_io_act_all.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_io_act_all.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_io_act_all.stktk_base_dt IS '棚卸基準日 // #MA.DT // Base date of inventory count';


COMMENT ON COLUMN mst_io_act_all.par_ac_itm_grp_cd IS '親会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Parent accounting item classification cd.';


COMMENT ON COLUMN mst_io_act_all.par_itm_jnl_cd IS '親品目仕訳ＣＤ // #MA.ITM_JNL_CD // Parent item journal cd.';


COMMENT ON COLUMN mst_io_act_all.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mst_io_act_all.par_itm_sub1 IS '親品目枝番１ // #MA.ITM_SUB1 // Parent item branch No. 1';


COMMENT ON COLUMN mst_io_act_all.par_itm_sub2 IS '親品目枝番２ // #MA.ITM_SUB2 // Parent item branch No. 2';


COMMENT ON COLUMN mst_io_act_all.par_itm_sub3 IS '親品目枝番３ // #MA.ITM_SUB3 // Parent item branch No. 3';


COMMENT ON COLUMN mst_io_act_all.par_itm_nm IS '親品名 // #MA.ITM_NM // Parent item name';


COMMENT ON COLUMN mst_io_act_all.par_lot_no IS '親ロットＮＯ // #MA.LOT_NO // Parent lot No.';


COMMENT ON COLUMN mst_io_act_all.par_sublot_no IS '親サブロットＮＯ // #MA.SUBLOT_NO // Parent sublot No.';


COMMENT ON COLUMN mst_io_act_all.par_sno1 IS '親手配ＮＯ１ // #MA.SNO1 // Parent SEIBAN No. 1';


COMMENT ON COLUMN mst_io_act_all.par_sno2 IS '親手配ＮＯ２ // #MA.SNO2 // Parent SEIBAN No. 2';


COMMENT ON COLUMN mst_io_act_all.par_sno3 IS '親手配ＮＯ３ // #MA.SNO3 // Parent SEIBAN No. 3';


COMMENT ON COLUMN mst_io_act_all.par_sno4 IS '親手配ＮＯ４ // #MA.SNO4 // Parent SEIBAN No. 4';


COMMENT ON COLUMN mst_io_act_all.accrual_flg IS '在庫発生基準ＦＬＧ // #MA.FLG // Inventory accrual base flg.';


COMMENT ON COLUMN mst_io_act_all.accpt_flg IS '資産発生基準ＦＬＧ // #MA.FLG // Asset accrual base flg.';


COMMENT ON COLUMN mst_io_act_all.avl_flg IS '使用可能日基準ＦＬＧ // #MA.FLG // Available date basis flg.';


COMMENT ON COLUMN mst_io_act_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_io_act_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_io_act_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_io_act_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_io_act_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_io_act_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_io_act_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_io_act_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_io_act_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_io_act_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_io_act_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_io_act_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_io_act_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_io_act_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_io_act_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_io_act_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_io_act_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_io_act_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_io_act_all.par_slip_no IS '親伝票ＮＯ // #MA.SLIP_NO // Parent slip No.';


COMMENT ON COLUMN mst_io_act_all.par_slip_seq_no IS '親伝票連番 // #MA.SLIP_SEQ // Parent slip sequence number';


COMMENT ON COLUMN mst_io_act_all.slip_cmpl_flg IS '補完ＦＬＧ // #MA.FLG // Complement flg.';


COMMENT ON COLUMN mst_io_act_all.send_flg IS '送信対象ＦＬＧ // #MA.FLG // To be exported flg.';


COMMENT ON COLUMN mst_io_act_all.c_imp_flg IS '原価取込済ＦＬＧ // #MA.FLG // Cost imported flg.';


COMMENT ON COLUMN mst_io_act_all.a_imp_flg IS '会計ＩＦ取込済ＦＬＧ // #MA.FLG // Accounting IF imported flg.';


COMMENT ON COLUMN mst_io_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_io_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_io_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_io_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_io_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_io_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_io_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_io_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_io_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_io_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

