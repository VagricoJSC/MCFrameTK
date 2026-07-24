\encoding UTF-8

COMMENT ON TABLE mst_sls_act_io_all IS '売上実績受払 // Sales result GR/GI';


COMMENT ON COLUMN mst_sls_act_io_all.sls_act_io_no IS '売上実績受払ＮＯ // #MA.SLS_ACT_IO_NO // Sales result GR/GI No.';


COMMENT ON COLUMN mst_sls_act_io_all.sls_act_io_seq IS '売上実績受払連番 // #MA.SLIP_SEQ // Sales result GR/GI sequence number';


COMMENT ON COLUMN mst_sls_act_io_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sls_act_io_all.sls_act_d_no IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN mst_sls_act_io_all.sls_act_d_seq IS '売上実績明細連番 // #MA.SLIP_SEQ // Sales result details sequence number';


COMMENT ON COLUMN mst_sls_act_io_all.ship_act_d_no IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN mst_sls_act_io_all.iv_ship_act_d_no IS 'インボイス出荷実績明細ＮＯ // #MA.IV_SHIP_ACT_D_NO // Shipping invoice result details No.';


COMMENT ON COLUMN mst_sls_act_io_all.arr_act_no IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN mst_sls_act_io_all.purc_act_io_no IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN mst_sls_act_io_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_sls_act_io_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_sls_act_io_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_sls_act_io_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_sls_act_io_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_sls_act_io_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_sls_act_io_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_sls_act_io_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_sls_act_io_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_sls_act_io_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_sls_act_io_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_sls_act_io_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_sls_act_io_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_sls_act_io_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_sls_act_io_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_sls_act_io_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_io_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_io_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_io_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_io_all.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_sls_act_io_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_io_all.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_io_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_io_all.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mst_sls_act_io_all.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_io_all.ptax_cur_dscnt_amt IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_io_all.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mst_sls_act_io_all.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_sls_act_io_all.sub_char1 IS '予備１ // #MS.SLS_ACT_IO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_act_io_all.sub_char2 IS '予備２ // #MS.SLS_ACT_IO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_act_io_all.sub_char3 IS '予備３ // #MS.SLS_ACT_IO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_act_io_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_act_io_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_act_io_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_act_io_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_act_io_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_act_io_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_act_io_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_act_io_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_act_io_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_act_io_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

