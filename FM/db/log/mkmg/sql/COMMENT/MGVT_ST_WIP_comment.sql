
COMMENT ON TABLE MGVT_ST_WIP IS '原価計算月初仕掛数ビュー // Cost calculation beginning WIP qty. view';


COMMENT ON COLUMN MGVT_ST_WIP.ST_WIP_KEY IS '月初仕掛キー // #MG.ROW_NO // Beginning WIP key';


COMMENT ON COLUMN MGVT_ST_WIP.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGVT_ST_WIP.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_ST_WIP.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGVT_ST_WIP.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGVT_ST_WIP.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGVT_ST_WIP.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGVT_ST_WIP.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGVT_ST_WIP.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGVT_ST_WIP.WIP_QTY IS '仕掛数量 // #MA.QTY // WIP qty.';


COMMENT ON COLUMN MGVT_ST_WIP.WIP_PER IS '仕掛進捗度 // #MA.RATE // WIP progress';

