\encoding UTF-8

COMMENT ON TABLE mst_po_d_p_all IS '発注明細（改訂履歴） // PO details (Rev. history)';


COMMENT ON COLUMN mst_po_d_p_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_po_d_p_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_po_d_p_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_po_d_p_all.po_rev IS '発注改訂番号 // #MA.SLIP_REV // PO rev. number';


COMMENT ON COLUMN mst_po_d_p_all.po_schd_no IS '発注予定ＮＯ // #MA.PO_SCHD_NO // PO schedule No.';


COMMENT ON COLUMN mst_po_d_p_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_po_d_p_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_po_d_p_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_po_d_p_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_po_d_p_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_po_d_p_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_po_d_p_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_po_d_p_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_po_d_p_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_po_d_p_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_po_d_p_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_po_d_p_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_po_d_p_all.purc_rsn_cd IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN mst_po_d_p_all.purc_id_typ IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN mst_po_d_p_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_po_d_p_all.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_po_d_p_all.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_po_d_p_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_po_d_p_all.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_po_d_p_all.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_po_d_p_all.in_to_loc_cd IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN mst_po_d_p_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_po_d_p_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_po_d_p_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_po_d_p_all.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_po_d_p_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_po_d_p_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_po_d_p_all.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_po_d_p_all.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_po_d_p_all.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_po_d_p_all.purc_lt IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN mst_po_d_p_all.rqst_dlv_rqst_tm IS '依頼元納入希望日時 // #MA.TM // Request source desired delivery date and time';


COMMENT ON COLUMN mst_po_d_p_all.rqst_avl_rqst_dt IS '依頼元使用可能希望日 // #MA.DT // Request source desired available date';


COMMENT ON COLUMN mst_po_d_p_all.purc_schd_dt IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN mst_po_d_p_all.purc_basis_typ IS '仕入計上区分 // #MA.PURC_BASIS_TYP // Purchase recording type';


COMMENT ON COLUMN mst_po_d_p_all.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_po_d_p_all.purc_upri_req_typ IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN mst_po_d_p_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_po_d_p_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_po_d_p_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_po_d_p_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_po_d_p_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_po_d_p_all.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_proc_upri IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_onr_prov_upri IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_proc_amt IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_onr_prov_amt IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_po_d_p_all.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_po_d_p_all.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_po_d_p_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_po_d_p_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_po_d_p_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_po_d_p_all.drct_dlv_typ IS '直納区分 // #MS.DRCT_DLV_TYP // Direct-delivery type';


COMMENT ON COLUMN mst_po_d_p_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_po_d_p_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_po_d_p_all.bndl_flg IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN mst_po_d_p_all.rqst_slo_flg IS '依頼元受注ＦＬＧ // #MA.FLG // Request source orders flg.';


COMMENT ON COLUMN mst_po_d_p_all.outsrc_itm_ord_no IS '外注品目オーダＮＯ // #MA.ITM_ORD_NO // Subcontracting item order No.';


COMMENT ON COLUMN mst_po_d_p_all.outsrc_flg IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN mst_po_d_p_all.uplnd_flg IS '計画外ＦＬＧ // #MA.FLG // Unplanned flg.';


COMMENT ON COLUMN mst_po_d_p_all.schd_chg_flg IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN mst_po_d_p_all.po_conf_rcpt_flg IS '請書受領ＦＬＧ // #MA.FLG // Confirmation received flg.';


COMMENT ON COLUMN mst_po_d_p_all.po_conf_rcpt_dt IS '請書受領日 // #MA.DT // Confirmation received date';


COMMENT ON COLUMN mst_po_d_p_all.pri_print_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_po_d_p_all.dlv_slip_invalid_flg IS '納品書対象外ＦＬＧ // #MA.FLG // Not for elivery note flg.';


COMMENT ON COLUMN mst_po_d_p_all.pay_crryovr_times IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN mst_po_d_p_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_po_d_p_all.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_po_d_p_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_itm_cd IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_itm_sub1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN mst_po_d_p_all.bd_itm_sub2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN mst_po_d_p_all.bd_itm_sub3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN mst_po_d_p_all.bd_sno1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN mst_po_d_p_all.bd_sno2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN mst_po_d_p_all.bd_sno3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN mst_po_d_p_all.bd_sno4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN mst_po_d_p_all.bd_loc_cd IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_lot_no IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_sublot_no IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_wg_cd IS '負担ＷＧ ＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_ctg_cd IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_oper_cd IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN mst_po_d_p_all.bd_slo_no IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_iv_no IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_po_no IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN mst_po_d_p_all.bd_bp_cd IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN mst_po_d_p_all.ext_po_d_no IS '外部発注明細ＮＯ // #MA.EXT_PO_D_NO // External PO details No.';


COMMENT ON COLUMN mst_po_d_p_all.intr_rmrks IS '内部明細備考 // #MS.PO_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_po_d_p_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_po_d_p_all.po_print_d_rmrks IS '注文書明細備考 // #MS.PO_PRINT_D_RMRKS // PO sheet details remarks';


COMMENT ON COLUMN mst_po_d_p_all.dlv_slip_d_rmrks IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN mst_po_d_p_all.sub_char1 IS '予備１ // #MS.PO_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_po_d_p_all.sub_char2 IS '予備２ // #MS.PO_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_po_d_p_all.sub_char3 IS '予備３ // #MS.PO_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_po_d_p_all.rqst_can_flg IS '紐切れＦＬＧ // #MA.FLG // Unpegged flg.';


COMMENT ON COLUMN mst_po_d_p_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_char1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_char2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_char3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_char4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_char5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_num1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN mst_po_d_p_all.edi_sub_d_dt1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN mst_po_d_p_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_po_d_p_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_po_d_p_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_po_d_p_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_po_d_p_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_po_d_p_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_po_d_p_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_po_d_p_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_po_d_p_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_po_d_p_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

