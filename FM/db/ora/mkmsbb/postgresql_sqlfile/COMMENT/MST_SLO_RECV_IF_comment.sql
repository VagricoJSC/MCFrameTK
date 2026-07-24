\encoding UTF-8

COMMENT ON VIEW mst_slo_recv_if IS '受注受信ＩＦ // Sales order import IF';


COMMENT ON COLUMN mst_slo_recv_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_slo_recv_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_slo_recv_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_slo_recv_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_slo_recv_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_slo_recv_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_slo_recv_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_slo_recv_if.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_slo_recv_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_slo_recv_if.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_slo_recv_if.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_slo_recv_if.cst_po_rev IS '得意先注文改訂番号 // #MA.SLIP_REV // Customer order rev. number';


COMMENT ON COLUMN mst_slo_recv_if.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_slo_recv_if.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_cst_cd IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_cst_nm IS 'ＩＦ得意先名 // #MA.IF_EXT_SYS_NM // IF customer name';


COMMENT ON COLUMN mst_slo_recv_if.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_cd1 IS 'ＩＦ仕向先ＣＤ１ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 1';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_nm1 IS 'ＩＦ仕向先名１ // #MA.IF_EXT_SYS_NM // IF distribution channel name 1';


COMMENT ON COLUMN mst_slo_recv_if.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_cd2 IS 'ＩＦ仕向先ＣＤ２ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 2';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_nm2 IS 'ＩＦ仕向先名２ // #MA.IF_EXT_SYS_NM // IF distribution channel name 2';


COMMENT ON COLUMN mst_slo_recv_if.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_cd3 IS 'ＩＦ仕向先ＣＤ３ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 3';


COMMENT ON COLUMN mst_slo_recv_if.if_dest_nm3 IS 'ＩＦ仕向先名３ // #MA.IF_EXT_SYS_NM // IF distribution channel name 3';


COMMENT ON COLUMN mst_slo_recv_if.po_dt IS '注文日 // #MA.DT // PO date';


COMMENT ON COLUMN mst_slo_recv_if.purc_id_typ IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN mst_slo_recv_if.sls_cststk_flg IS '預り売上ＦＬＧ // #MA.FLG // Sales keeping customer inventory flg.';


COMMENT ON COLUMN mst_slo_recv_if.slo_typ IS '受注区分 // #MS.SLO_TYP // Sales order type';


COMMENT ON COLUMN mst_slo_recv_if.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_cur_cd IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN mst_slo_recv_if.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_sls_dpt_cd IS 'ＩＦ売上部門ＣＤ // #MA.IF_EXT_SYS_CD // IF sales dept. cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_sls_dpt_nm IS 'ＩＦ売上部門名 // #MA.IF_EXT_SYS_NM // IF sales dept. name';


COMMENT ON COLUMN mst_slo_recv_if.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_sls_usr_cd IS 'ＩＦ売上担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF sales PIC cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_sls_usr_nm IS 'ＩＦ売上担当者名 // #MA.IF_EXT_SYS_NM // IF sales PIC name';


COMMENT ON COLUMN mst_slo_recv_if.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dlv_cd IS 'ＩＦ納品先ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination cd.';


COMMENT ON COLUMN mst_slo_recv_if.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_slo_recv_if.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_slo_recv_if.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_slo_recv_if.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_slo_recv_if.dlv_cntry_cd IS '納品先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dlv_cntry_cd IS 'ＩＦ納品先国ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination country cd.';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_tdlv_cd IS 'ＩＦ配送先ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point cd.';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_nm IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_cntct_dpt IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_cntct_psn IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_zip_cd IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_addr1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_addr2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_addr3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_addr4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_tel IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_fax IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_slo_recv_if.tdlv_cntry_cd IS '配送先国ＣＤ // #MA.CNTRY_CD // Receiving point country cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_tdlv_cntry_cd IS 'ＩＦ配送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point country cd.';


COMMENT ON COLUMN mst_slo_recv_if.dlv_day_week_typ IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN mst_slo_recv_if.pri_prnt_typ IS '価格印字区分 // #MA.PRI_PRNT_TYP // Print price type';


COMMENT ON COLUMN mst_slo_recv_if.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_slo_recv_if.if_wrk_no IS 'ＩＦ案件ＮＯ // #MA.IF_EXT_SYS_CD // IF project No.';


COMMENT ON COLUMN mst_slo_recv_if.if_wrk_nm IS 'ＩＦ案件名 // #MA.IF_EXT_SYS_NM // IF project name';


COMMENT ON COLUMN mst_slo_recv_if.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_cd1 IS 'ＩＦ取引条件ＣＤ１ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 1';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_nm1 IS 'ＩＦ取引条件名１ // #MA.IF_EXT_SYS_NM // IF transaction terms name 1';


COMMENT ON COLUMN mst_slo_recv_if.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_slo_recv_if.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_cd2 IS 'ＩＦ取引条件ＣＤ２ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 2';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_nm2 IS 'ＩＦ取引条件名２ // #MA.IF_EXT_SYS_NM // IF transaction terms name 2';


COMMENT ON COLUMN mst_slo_recv_if.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_slo_recv_if.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_cd3 IS 'ＩＦ取引条件ＣＤ３ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 3';


COMMENT ON COLUMN mst_slo_recv_if.if_tterm_nm3 IS 'ＩＦ取引条件名３ // #MA.IF_EXT_SYS_NM // IF transaction terms name 3';


COMMENT ON COLUMN mst_slo_recv_if.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_slo_recv_if.trnspt_cd IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_trnspt_cd IS 'ＩＦ輸送方法ＣＤ // #MA.IF_EXT_SYS_CD // IF transportation method cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_trnspt_nm IS 'ＩＦ輸送方法名 // #MA.IF_EXT_SYS_NM // IF transportation method name';


COMMENT ON COLUMN mst_slo_recv_if.load_port_cd IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_load_port_cd IS 'ＩＦ船積港ＣＤ // #MA.IF_EXT_SYS_CD // IF loading port cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_load_port_nm IS 'ＩＦ船積港名 // #MA.IF_EXT_SYS_NM // IF loading port name';


COMMENT ON COLUMN mst_slo_recv_if.dschrg_port_cd IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dschrg_port_cd IS 'ＩＦ船卸港ＣＤ // #MA.IF_EXT_SYS_CD // IF discharging port cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dschrg_port_nm IS 'ＩＦ船卸港名 // #MA.IF_EXT_SYS_NM // IF discharging port name';


COMMENT ON COLUMN mst_slo_recv_if.via_port_cd IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_via_port_cd IS 'ＩＦ経由地ＣＤ // #MA.IF_EXT_SYS_CD // IF stopover point cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_via_port_nm IS 'ＩＦ経由地名 // #MA.IF_EXT_SYS_NM // IF stopover point name';


COMMENT ON COLUMN mst_slo_recv_if.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_slo_recv_if.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_slo_recv_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_slo_recv_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_slo_recv_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_slo_recv_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_slo_recv_if.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_slo_recv_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_slo_recv_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_slo_recv_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_slo_recv_if.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_slo_recv_if.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_cntry_org_cd IS 'ＩＦ原産地ＣＤ // #MA.IF_EXT_SYS_CD // IF origin cd.';


COMMENT ON COLUMN mst_slo_recv_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_slo_recv_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_slo_recv_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_slo_recv_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_slo_recv_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN mst_slo_recv_if.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_trd_unit_nm IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN mst_slo_recv_if.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_slo_recv_if.inc_tax_flg IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN mst_slo_recv_if.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_slo_recv_if.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_slo_recv_if.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_recv_if.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_slo_recv_if.tax_rate IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN mst_slo_recv_if.tax_typ IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN mst_slo_recv_if.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_recv_if.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_recv_if.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dscnt_rsn_cd IS 'ＩＦ値引理由ＣＤ // #MA.IF_EXT_SYS_CD // IF discount reason cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_dscnt_rsn_nm IS 'ＩＦ値引理由名 // #MA.IF_EXT_SYS_NM // IF discount reason name';


COMMENT ON COLUMN mst_slo_recv_if.ship_wh_cd IS '出荷倉庫ＣＤ // #MA.LG_GRP_CD // Shipping warehouse cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_ship_wh_cd IS 'ＩＦ出荷倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping warehouse cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_ship_wh_nm IS 'ＩＦ出荷倉庫名 // #MA.IF_EXT_SYS_NM // IF shipping warehouse name';


COMMENT ON COLUMN mst_slo_recv_if.ship_block_flg IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN mst_slo_recv_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_slo_recv_if.set_itm_grp_no IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN mst_slo_recv_if.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_slo_recv_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_slo_recv_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_slo_recv_if.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_slo_recv_if.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_slo_recv_if.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_maker_cd IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_maker_nm IS 'ＩＦメーカ名 // #MA.IF_EXT_SYS_NM // IF maker name';


COMMENT ON COLUMN mst_slo_recv_if.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_slo_recv_if.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_slo_recv_if.cst_po_rmrks IS '得意先注文備考 // #MS.CST_PO_RMRKS // Customer order remarks';


COMMENT ON COLUMN mst_slo_recv_if.cst_po_d_rmrks IS '得意先注文明細備考 // #MS.CST_PO_D_RMRKS // Customer order details remarks';


COMMENT ON COLUMN mst_slo_recv_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_slo_recv_if.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_slo_recv_if.upri_not_chk_flg IS '単価チェック対象外ＦＬＧ // #MA.FLG // Not for unit price check flg.';


COMMENT ON COLUMN mst_slo_recv_if.amt_not_chk_flg IS '金額チェック対象外ＦＬＧ // #MA.FLG // Not for amount check flg.';


COMMENT ON COLUMN mst_slo_recv_if.tax_not_chk_flg IS '税チェック対象外ＦＬＧ // #MA.FLG // Not for tax check flg.';


COMMENT ON COLUMN mst_slo_recv_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_slo_recv_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_slo_recv_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_slo_recv_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_slo_recv_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_slo_recv_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_slo_recv_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_slo_recv_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_slo_recv_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_slo_recv_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_slo_recv_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_slo_recv_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_slo_recv_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_slo_recv_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_slo_recv_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_slo_recv_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_slo_recv_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_slo_recv_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_slo_recv_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_slo_recv_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_slo_recv_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_slo_recv_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_slo_recv_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_slo_recv_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_slo_recv_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_slo_recv_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_slo_recv_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_slo_recv_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_slo_recv_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_slo_recv_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_slo_recv_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_slo_recv_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_slo_recv_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_slo_recv_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_slo_recv_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_slo_recv_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_slo_recv_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_slo_recv_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_slo_recv_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_slo_recv_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_char1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_char2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_char3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_char4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_char5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_num1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_dt1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_char1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_char2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_char3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_char4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_char5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_num1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN mst_slo_recv_if.edi_sub_d_dt1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN mst_slo_recv_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_slo_recv_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_slo_recv_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_slo_recv_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_recv_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_recv_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_recv_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_recv_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_recv_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_recv_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_recv_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_recv_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_recv_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

