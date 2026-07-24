\encoding UTF-8

COMMENT ON TABLE mst_accpt_send_if_all IS '検収送信ＩＦ // Acceptance export IF';


COMMENT ON COLUMN mst_accpt_send_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_accpt_send_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_accpt_send_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_accpt_send_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_accpt_send_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_accpt_send_if_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_accpt_send_if_all.bp_dlv_slip_no IS '業者納品書ＮＯ // #MA.DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN mst_accpt_send_if_all.bp_dlv_slip_lno IS '業者納品書行ＮＯ // #MA.DLV_SLIP_D_NO // Vendor delivery note row No.';


COMMENT ON COLUMN mst_accpt_send_if_all.iv_flg IS 'インボイスＦＬＧ // #MA.FLG // Invoice flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_cntry_cd IS 'ＩＦ国ＣＤ // #MA.IF_EXT_SYS_CD // IF country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_purc_dpt_cd IS 'ＩＦ購買部門ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing dept. cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_dpt_nm IS '購買部門名 // #MA.DPT_NM // Purchasing dept. name';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_purc_usr_cd IS 'ＩＦ購買担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing PIC cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_usr_nm IS '購買担当者名 // #MA.USR_NM // Purchasing PIC name';


COMMENT ON COLUMN mst_accpt_send_if_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_sppl_cd IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.sppl_nm IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN mst_accpt_send_if_all.sppl_cntry_cd IS '発注先国ＣＤ // #MA.CNTRY_CD // Supplier country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_sppl_cntry_cd IS 'ＩＦ発注先国ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_accpt_send_if_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_dt IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN mst_accpt_send_if_all.red_slip_ac_dt IS '赤伝計上日 // #MA.DT // Credit voucher recording date';


COMMENT ON COLUMN mst_accpt_send_if_all.red_slip_ac_ym IS '赤伝計上年月 // #MA.YM // Credit voucher recording month';


COMMENT ON COLUMN mst_accpt_send_if_all.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_id_typ IS '納入先識別区分 // #MS.SHIP_TO_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_id_cd IS '納入先識別ＣＤ // #MS.SHIP_TO_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_in_to_id_cd IS 'ＩＦ納入先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination identification cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_nm IS '納入先名 // #MS.SHIP_TO_ID_NM // Delivery destination name';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_zip_cd IS '納入先郵便番号 // #MA.ZIP_CD // Delivery destination zip code';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_addr1 IS '納入先住所１ // #MA.ADDR // Delivery destination address1';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_addr2 IS '納入先住所２ // #MA.ADDR // Delivery destination address2';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_addr3 IS '納入先住所３ // #MA.ADDR // Delivery destination address3';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_addr4 IS '納入先住所４ // #MA.ADDR // Delivery destination address4';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_cntct_dpt IS '納入先担当部署 // #MA.BP_CNTCT_DPT // Delivery destination dept. in charge';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_cntct_psn IS '納入先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_tel IS '納入先ＴＥＬ // #MA.TEL // Delivery destination TEL';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_fax IS '納入先ＦＡＸ // #MA.TEL // Delivery destination FAX';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_sundry_flg IS '納入先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.in_to_cntry_cd IS '納入先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_in_to_cntry_cd IS 'ＩＦ納入先国ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tdlv_cd IS 'ＩＦ配送先ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_cntct_dpt IS '配送先担当部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_sundry_flg IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.tdlv_cntry_cd IS '配送先国ＣＤ // #MA.CNTRY_CD // Receiving point country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tdlv_cntry_cd IS 'ＩＦ配送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_site_cd IS 'ＩＦ工場・物流倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mst_accpt_send_if_all.drct_dlv_flg IS '直送ＦＬＧ // #MA.FLG // Direct-delivery flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.drct_dlv_bp_cd IS '直送先会社ＣＤ // #MA.BP_CD // Direct-delivery destination company cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_drct_dlv_bp_cd IS 'ＩＦ直送先会社ＣＤ // #MA.IF_EXT_SYS_CD // IF direct-delivery destination company cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.drct_dlv_bp_nm IS '直送先会社名 // #MA.BP_NM // Direct-delivery destination company name';


COMMENT ON COLUMN mst_accpt_send_if_all.drct_dlv_cntry_cd IS '直送先国ＣＤ // #MA.CNTRY_CD // Direct-delivery destination country cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_drct_dlv_cntry_cd IS 'ＩＦ直送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF direct-delivery destination country';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_trd_cur_cd IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tterm_cd1 IS 'ＩＦ取引条件ＣＤ１ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 1';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_nm1 IS '取引条件名１ // #MA.TTERM_NM // Transaction terms name 1';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tterm_cd2 IS 'ＩＦ取引条件ＣＤ２ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 2';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_nm2 IS '取引条件名２ // #MA.TTERM_NM // Transaction terms name 2';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tterm_cd3 IS 'ＩＦ取引条件ＣＤ３ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 3';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_nm3 IS '取引条件名３ // #MA.TTERM_NM // Transaction terms name 3';


COMMENT ON COLUMN mst_accpt_send_if_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_accpt_send_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_accpt_send_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_accpt_send_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_accpt_send_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_accpt_send_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_accpt_send_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_accpt_send_if_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_accpt_send_if_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_accpt_send_if_all.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_accpt_send_if_all.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_unit_nm IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_accpt_send_if_all.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_dscnt_rsn_cd IS 'ＩＦ値引理由ＣＤ // #MA.IF_EXT_SYS_CD // IF discount reason cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.dscnt_rsn_nm IS '値引理由名 // #MA.BIZ_RSN_NM // Discount reason name';


COMMENT ON COLUMN mst_accpt_send_if_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.tax_typ IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN mst_accpt_send_if_all.inc_tax_flg IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_tax_cd IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.tax_nm IS '税名 // #MA.TAX_NM // Tax name';


COMMENT ON COLUMN mst_accpt_send_if_all.tax_rate IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN mst_accpt_send_if_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_accpt_send_if_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_accpt_send_if_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_accpt_send_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_accpt_send_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_accpt_send_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_accpt_send_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_accpt_send_if_all.accpt_dfct_flg IS '検収不良ＦＬＧ // #MA.FLG // Acceptance defective flg.';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_act_rev IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN mst_accpt_send_if_all.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_accpt_send_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_accpt_send_if_all.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_accpt_send_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_accpt_send_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_accpt_send_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_accpt_send_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_accpt_send_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_accpt_send_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_accpt_send_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_accpt_send_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_accpt_send_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

