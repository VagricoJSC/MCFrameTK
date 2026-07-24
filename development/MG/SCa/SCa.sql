echo SCa START ;

// =====  PREPARE  =====
set IS_MULTI = 0 ;
if ("${DBUTIL_THREAD}" != "") {
	if ("${DBUTIL_THREAD}" != "1") {
		set IS_MULTI = 1 ;
	}
}

// =====  PRE-PROCESS  =====
ECHO PRE-PROCESS START ;

ECHO DATA DELETE START ;

&DELETE FROM MGT_STD_TOP
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_INPT
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_OPER
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_WK
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_COST
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_SML_COST
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_STD_ALC
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

if ("${SCA_CALC_CNT}" == "${SCA_CALC_CNT_TOTAL}") {
	&DELETE FROM MGT_ACC_TOP
		WHERE 0=0
		AND CALC_NO = '${SCA_CALC_NO}'
		AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
		;
}
else {
	&DELETE FROM MGT_ACC_TOP_TMP
		WHERE 0=0
		AND CALC_NO = '${SCA_CALC_NO}'
		AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
		;
}

&DELETE FROM MGT_ACC_INPT
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_ACC_WK
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_ACC_COST
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

if ("${SCA_CALC_CNT}" == "${SCA_CALC_CNT_TOTAL}") {
	&DELETE FROM MGT_ACC_SML_COST
		WHERE 0=0
		AND CALC_NO = '${SCA_CALC_NO}'
		AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
		;
}
else {
	&DELETE FROM MGT_ACC_SML_COST_TMP
		WHERE 0=0
		AND CALC_NO = '${SCA_CALC_NO}'
		AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
		;
}

&DELETE FROM MGT_ACC_TRD
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_EXP_MFG_PURC
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_EXP_OPER
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_EXP_INPT
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_EXP_WK
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_EXP_PROV
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_ALC_CALC_RATE
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_ALC_CALC_ERR
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_ALC_CALC_DTL
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

&DELETE FROM MGT_CALC_LOG
	WHERE 0=0
	AND CALC_NO = '${SCA_CALC_NO}'
	AND CALC_GRP_CD = '${SCA_CALC_GRP_CD}'
	;

if ("${IS_MULTI}" == "1") {
	WAIT ;
}

ECHO DATA DELETE END ;

ECHO PRE-PROCESS END ;

// =====  READ INPUT DATA  =====
ECHO DATA IMPORT START ;

ECHO M_PARM.DAT ;
unload ${DATA_DIR}/m_parm.dat
	SELECT
		 T1.PARM_KEY
		,T1.PARM_VAL
	FROM  MGVM_PARM T1
	;

ECHO M_EXPNS.DAT ;
unload ${DATA_DIR}/m_expns.dat
	SELECT
		 T1.EXPNS_CD
		,T1.EXPNS_TYP
		,T1.DIRECT_TYP
		,T1.VAR_TYP
	FROM  MGVM_EXPNS T1
	;

ECHO M_CALC_PTN.DAT ;
unload ${DATA_DIR}/m_calc_ptn.dat
	SELECT
		 T1.CALC_PTN_CD
		,T1.MFG_PURC_TYP
		,T1.EVAL_TYP
		,T1.DPT_TYP
		,T1.LOT_TYP
		,T1.SUBLOT_TYP
		,T1.SNO1_TYP
		,T1.SNO2_TYP
		,T1.SNO3_TYP
		,T1.SNO4_TYP
		,T1.LOT_EXP_TYP
		,T1.SUBLOT_EXP_TYP
		,T1.SNO1_EXP_TYP
		,T1.SNO2_EXP_TYP
		,T1.SNO3_EXP_TYP
		,T1.SNO4_EXP_TYP
		,T1.STD_RND_TYP
		,T1.STD_DEC_PLACE
		,T1.AMT_RND_TYP
		,T1.AMT_DEC_PLACE
		,T1.AVE_RND_TYP
		,T1.AVE_DEC_PLACE
		,T1.ADJ_TYP
		,T1.WIP_TYP
		,T1.BD_AGG_TYP
		,T1.MRGN_EXPNS_CD
		,T1.PURC_EXPNS_CD
		,T1.OUT_EXPNS_CD
		,T1.INPT_EXPNS_CD
		,T1.SS_EXPNS_CD
		,T1.PROV_EXPNS_CD
		,T1.EXP_ALLOC_TYP
	FROM  MGVM_CALC_PTN T1
	;

ECHO M_XRATE.DAT ;
unload ${DATA_DIR}/m_xrate.dat
	SELECT
		 T1.FR_CUR_CD
		,T1.TO_CUR_CD
		,T1.XRATE
	FROM  MGVM_XRATE T1
	;

ECHO M_CUR_PARM.DAT ;
unload ${DATA_DIR}/m_cur_parm.dat
	SELECT
		 T1.CUR_CD
		,T1.AMT_RND_TYP
		,T1.AMT_DEC_PLACE
		,T1.AVE_RND_TYP
		,T1.AVE_DEC_PLACE
	FROM  MGVM_CUR_PARM T1
	;

ECHO M_WG.DAT ;
unload ${DATA_DIR}/m_wg.dat
	SELECT
		 T1.WG_CD
		,T1.WG_PRIO
	FROM  MGVM_WG T1
	;

ECHO M_LOC.DAT ;
unload ${DATA_DIR}/m_loc.dat
	SELECT
		 T1.LOC_CD
		,T1.SPPL_CD
		,T1.REPURC_OBLI_FLG -- Op.4
	FROM  MGVM_LOC T1
	;

ECHO M_ITEM.DAT ;
unload ${DATA_DIR}/m_item.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.CALC_PTN_CD
		,T1.STD_QTY
		,T1.ITM_TYP
		,T1.RND_TYP
		,T1.DEC_PLACE
	FROM  MGVM_ITM T1
	;

ECHO M_DPT_CONFIG.DAT ;
unload ${DATA_DIR}/m_dpt_config.dat
	SELECT
		 T1.PAR_DPT_CD
		,T1.DPT_CD
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.OPER_NULL_FLG
	FROM  MGVM_DPT_CONFIG T1
	;

ECHO M_CTG_CONFIG.DAT ;
unload ${DATA_DIR}/m_ctg_config.dat
	SELECT
		 T1.PAR_CTG_CD
		,T1.CTG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
	FROM  MGVM_CTG_CONFIG T1
	;

ECHO M_DTL.DAT ;
unload ${DATA_DIR}/m_dtl.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.SPPL_CD
		,T1.RQST_WG_CD -- Op.1
		,T1.COST_RATIO
		,T1.OPER_PTN
		,T1.BOM_PTN
		,T1.MIN_LOT_QTY
		,T1.BATCH_LOT_QTY
		,T1.FXD_LOT_QTY
		,T1.FXD_YIELD_QTY
		,T1.NMR_QTY
		,T1.DNM_QTY
		,T1.ALC_DPT_CD
		,T1.EXP_DPT_CD
		,T1.EXP_PRIO
		,T1.MAX_QTY
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
	FROM  MGVM_ITM_DTL T1
	;

ECHO M_OPER.DAT ;
unload ${DATA_DIR}/m_oper.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.OPER_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.DISP_SEQ
		,T1.NMR_QTY
		,T1.DNM_QTY
		,T1.YIELD_OPER_FLG
		,T1.OPER_STD_QTY
		,T1.OPER_CONV_QTY
		,T1.UNIT_CONV_RND_TYP
		,T1.DEC_PLACE
	FROM  MGVM_ITM_OPER T1
	;

ECHO M_BOM.DAT ;
unload ${DATA_DIR}/m_bom.dat
	SELECT
		 T1.WG_CD
		,T1.PAR_ITM_CD
		,T1.PAR_ITM_SUB1
		,T1.PAR_ITM_SUB2
		,T1.PAR_ITM_SUB3
		,T1.BOM_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.CHD_ITM_CD
		,T1.CHD_ITM_SUB1
		,T1.CHD_ITM_SUB2
		,T1.CHD_ITM_SUB3
		,T1.ALT_GRP_CD
		,T1.EXPNS_CD
		,T1.DISP_SEQ
		,T1.PAR_RQMT_QTY
		,T1.CHD_RQMT_QTY
		,T1.CHD_BASE_QTY
		,T1.FXD_CHD_RQMT_QTY
		,T1.CHD_MIN_QTY
		,T1.CHD_BATCH_QTY
		,T1.ALT_ITM_RATIO
	FROM  MGVM_BOM T1
	;

ECHO M_WK.DAT ;
unload ${DATA_DIR}/m_wk.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.OPER_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.WK_COST_CD
		,T1.BASE_QTY
		,T1.WK_COST
		,T1.FXD_WK_COST
		,T1.MIN_WK_COST
		,T1.BATCH_WK_COST
	FROM  MGVM_ITM_WK T1
	;

ECHO M_PURC.DAT ;
unload ${DATA_DIR}/m_purc.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.SPPL_CD
		,T1.BASE_QTY
		,T1.BASE_CUR_UPRI
		,T1.COST_RATIO
		,T1.CUR_CD
		,T1.UPRI
	FROM  MGVM_ITM_PURC T1
	;

ECHO M_PROC.DAT ;
unload ${DATA_DIR}/m_proc.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.SPPL_CD
		,T1.BASE_QTY
		,T1.BASE_CUR_UPRI
		,T1.COST_RATIO
		,T1.CUR_CD
		,T1.OUTSRC_UPRI_TYP -- Op.2
		,T1.UPRI
	FROM  MGVM_ITM_PROC T1
	;

ECHO M_PROV.DAT ;
unload ${DATA_DIR}/m_prov.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.PRSPPL_CD
		,T1.PROV_TYP
		,T1.BASE_QTY
		,T1.BASE_CUR_UPRI
		,T1.CUR_CD
		,T1.UPRI
	FROM  MGVM_ITM_PROV T1
	;

ECHO M_SLS.DAT ;
unload ${DATA_DIR}/m_sls.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.DPT_CD
		,T1.CST_CD
		,T1.DLV_CD
		,T1.DEST_CD1
		,T1.DEST_CD2
		,T1.DEST_CD3
		,T1.BASE_QTY
		,T1.BASE_CUR_UPRI
		,T1.PRIO
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
		,T1.CUR_CD
		,T1.UPRI
	FROM  MGVM_ITM_SLS T1
	;

ECHO M_FIX.DAT ;
unload ${DATA_DIR}/m_fix.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.EXPNS_CD
		,T1.BASE_QTY
		,T1.STD_UPRI
	FROM  MGVM_ITM_FIX T1
	;

ECHO M_ALC_RULE.DAT ;
unload ${DATA_DIR}/m_alc_rule.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.ALC_TGT_TYP
		,T1.ALC_RULE_TYP
		,T1.EXPNS_CD
		,T1.DIFF_CALC_TYP
		,T1.RND_TYP
		,T1.DEC_PLACE
		,T1.ALC_COEF_CD
		,T1.COEF_LIMIT_FLG
		,T1.ASST_TYP
		,T1.NON_MINUS_FLG
		,T1.NON_OS_FLG
		,T1.SCST_ALC_FLG
		,T1.STD_ALC_FLG
	FROM  MGVM_ALC_RULE T1
	;

ECHO M_ALC_WK.DAT ;
unload ${DATA_DIR}/m_alc_wk.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.WK_COST_CD
		,T1.TR_ALC_AC_CD
		,T1.TR_ALC_PTN_CD
		,T1.TR_EXPNS_CD -- Op.3
	FROM  MGVM_ALC_WK T1
	;

ECHO M_ALC_EXPNS.DAT ;
unload ${DATA_DIR}/m_alc_expns.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.EXPNS_CD
		,T1.SELF_OPER_FLG
		,T1.INPT_ITM_TYP
		,T1.CTG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
	FROM  MGVM_ALC_EXPNS T1
	;

ECHO M_ALC_INPT.DAT ;
unload ${DATA_DIR}/m_alc_inpt.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.CTG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
	FROM  MGVM_ALC_INPT T1
	;

ECHO M_ALC_OTHER.DAT ;
unload ${DATA_DIR}/m_alc_other.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.ALC_VAL_TYP
		,T1.MINUS_FLG
	FROM  MGVM_ALC_OTHER T1
	;

ECHO M_ALC_GP.DAT ;
unload ${DATA_DIR}/m_alc_gp.dat
	SELECT
		 T1.ALC_PTN_CD
		,T1.GP_ALC_CD
	FROM  MGVM_ALC_GP_ALC T1
	;

ECHO M_COEF_CONFIG.DAT ;
unload ${DATA_DIR}/m_coef_config.dat
	SELECT
		 T1.ALC_COEF_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.BP_CD
		,T1.COEF_VAL
	FROM  MGVM_COEF_CONFIG T1
	;

ECHO M_ALC_RATE.DAT ;
unload ${DATA_DIR}/m_alc_rate.dat
	SELECT
		 T1.ALC_AC_CD
		,T1.WG_CD
		,T1.DPT_CD
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.BP_CD
		,T1.CTG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ALC_RATE
		,T1.ALC_PTN_CD
		,T1.EXPNS_CD -- Op.3
	FROM  MGVM_ALC_RATE T1
	;

ECHO T_ARG.DAT ;
unload ${DATA_DIR}/t_arg.dat
	SELECT
		 T1.SA_TYP
		,T1.EVAL_TYP
		,T1.ST_YM
		,T1.END_YM
		,T1.EXP_CALC_TYP
		,T1.INPT_CALC_FLG
		,T1.WK_CALC_FLG
		,T1.PROV_CALC_FLG
		,T1.XFR_CALC_FLG -- Op.1
		,T1.ALC_CALC_TYP
		,T1.COST_CALC_TYP
	FROM  MGVT_ARG T1
	;

ECHO T_ALC_AMT.DAT ;
unload ${DATA_DIR}/t_alc_amt.dat
	SELECT
		 T1.INPT_ALC_TYP
		,T1.YM
		,T1.WG_CD
		,T1.ALC_AC_CD
		,T1.DPT_CD
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.BP_CD
		,T1.CTG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.ITM_MFG_INST_NO
		,T1.IV_NO
		,T1.PO_NO
		,T1.SLO_NO
		,T1.AMT
		,T1.ALC_RATE
		,T1.ALC_PTN_CD
		,T1.EXPNS_CD -- Op.3
	FROM  MGVT_ALC_AMT T1
	;

ECHO T_RQMT.DAT ;
unload ${DATA_DIR}/t_rqmt.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.ASST_TYP
		,T1.QTY
	FROM  MGVT_RQMT T1
	;

ECHO T_INST.DAT ;
unload ${DATA_DIR}/t_inst.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.MNG_DPT_CD
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.SPPL_CD
		,T1.PO_NO
		,T1.SLO_NO
		,T1.IV_NO
		,T1.ASST_TYP
		,T1.QTY
	FROM  MGVT_ITM_MFG_INST T1
	;

ECHO T_INST_WIP.DAT ;
unload ${DATA_DIR}/t_inst_wip.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.OPER_ACT_NO
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.LOC_CD
		,T1.STR_LN_CD
		,T1.AC_RSN_CD
		,T1.WIP_QTY
		,T1.WIP_PER
	FROM  MGVT_INST_WIP T1
	;

ECHO T_PROD.DAT ;
unload ${DATA_DIR}/t_prod.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.OPER_ACT_NO
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.LOC_CD
		,T1.STR_LN_CD
		,T1.AC_SLIP_TYP
		,T1.AC_RSN_CD
		,T1.EXPNS_CD
		,T1.QTY
		,T1.AMT
		,T1.CUR_CD
		,T1.CUR_AMT
		,T1.XRATE
		,T1.MFG_PER
		,T1.MFG_COST_RATIO
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
	FROM  MGVT_MFG T1
	;

ECHO T_PURC.DAT ;
unload ${DATA_DIR}/t_purc.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.SPPL_CD
		,T1.PO_NO
		,T1.SLO_NO
		,T1.IV_NO
		,T1.ALC_DPT_CD
		,T1.AC_SLIP_TYP
		,T1.AC_RSN_CD
		,T1.ASST_TYP
		,T1.EXPNS_CD
		,T1.QTY
		,T1.AMT
		,T1.CUR_CD
		,T1.CUR_AMT
		,T1.XRATE
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
	FROM  MGVT_PURC T1
	;

ECHO T_WK.DAT ;
unload ${DATA_DIR}/t_wk.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.OPER_ACT_NO
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.LOC_CD
		,T1.STR_LN_CD
		,T1.WK_COST_CD
		,T1.WK_RSN_CD
		,T1.WK_COST
	FROM  MGVT_WK T1
	;

ECHO T_OTHER_WK.DAT ;
unload ${DATA_DIR}/t_other_wk.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.DPT_CD
		,T1.CTG_CD
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.WK_COST_CD
		,T1.WK_RSN_CD
		,T1.WK_COST
		,T1.ALC_PTN_CD
	FROM  MGVT_OTHER_WK T1
	;

ECHO T_INPT.DAT ;
unload ${DATA_DIR}/t_inpt.dat
	SELECT
		 T1.ACT_INPT_ID
		,T1.ACT_INPT_ID_SUB
		,T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.PAR_ITM_CD
		,T1.PAR_ITM_SUB1
		,T1.PAR_ITM_SUB2
		,T1.PAR_ITM_SUB3
		,T1.PAR_ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.OPER_ACT_NO
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.LOC_CD
		,T1.STR_LN_CD
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.AC_SLIP_TYP
		,T1.AC_RSN_CD
		,T1.BP_CD -- Op.4
		,T1.STK_BP_CD
		,T1.ASST_TYP
		,T1.EXPNS_CD
		,T1.QTY
		,T1.AMT
		,T1.CUR_CD
		,T1.CUR_AMT
		,T1.XRATE
		,T1.REC_EVAL_TYP
		,T1.EVAL_LOOP_FLG
		,T1.ZERO_EFFECT_FLG
	FROM  MGVT_INPT T1
	ORDER BY T1.YM, T1.AC_DT, T1.ACT_INPT_ID, T1.ACT_INPT_ID_SUB
	;

ECHO T_INPT_EXPNS.DAT ;
unload ${DATA_DIR}/t_inpt_expns.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ACT_INPT_ID
		,T1.ACT_INPT_ID_SUB
		,T1.EXPNS_CD
		,T1.AMT
	FROM  MGVT_INPT_EXPNS T1
	;

ECHO T_IO.DAT ;
unload ${DATA_DIR}/t_io.dat
	SELECT
		 T1.ACT_IO_ID
		,T1.ACT_IO_ID_SUB
		,T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.COST_IO_TYP
		,T1.AC_SLIP_TYP
		,T1.AC_RSN_CD
		,T1.OTHER_WG_CD
		,T1.OTHER_DPT_CD
		,T1.BP_CD
		,T1.STK_BP_CD
		,T1.ASST_TYP
		,T1.QTY
		,T1.AMT
		,T1.CUR_CD
		,T1.CUR_AMT
		,T1.XRATE
		,T1.TRD_GRP
		,T1.TRD_RATIO
		,T1.ALC_AC_CD
		,T1.ALC_AMT_FLG
		,T1.ALC_PTN_CD
		,T1.EXPNS_CD -- Op.3
		,T1.ALC_WG_CD
		,T1.ALC_DPT_CD
		,T1.ALC_LOC_CD
		,T1.ALC_OPER_CD
		,T1.ALC_BP_CD
		,T1.ALC_CTG_CD
		,T1.ALC_ITM_CD
		,T1.ALC_ITM_SUB1
		,T1.ALC_ITM_SUB2
		,T1.ALC_ITM_SUB3
		,T1.ALC_LOT_NO
		,T1.ALC_SUBLOT_NO
		,T1.ALC_SNO1
		,T1.ALC_SNO2
		,T1.ALC_SNO3
		,T1.ALC_SNO4
		,T1.ALC_ITM_MFG_INST_NO
		,T1.REC_EVAL_TYP
		,T1.EVAL_LOOP_FLG
		,T1.ZERO_EFFECT_FLG
	FROM  MGVT_IO T1
	ORDER BY T1.YM, T1.AC_DT, T1.ACT_IO_ID, T1.ACT_IO_ID_SUB
	;

ECHO T_IO_EXPNS.DAT ;
unload ${DATA_DIR}/t_io_expns.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ACT_IO_ID
		,T1.ACT_IO_ID_SUB
		,T1.EXPNS_CD
		,T1.AMT
	FROM  MGVT_IO_EXPNS T1
	;

ECHO T_SLS.DAT ;
unload ${DATA_DIR}/t_sls.dat
	SELECT
		 T1.ACT_SLS_ID
		,T1.ACT_SLS_ID_SUB
		,T1.YM
		,T1.WG_CD
		,T1.AC_DT
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.AC_SLIP_TYP
		,T1.AC_RSN_CD
		,T1.ASST_TYP
		,T1.QTY
		,T1.AMT
		,T1.CUR_CD
		,T1.CUR_AMT
		,T1.XRATE
		,T1.CST_CD
		,T1.DLV_CD
		,T1.PO_NO
		,T1.SLO_NO
		,T1.IV_NO
		,T1.STK_BP_CD
		,T1.ALC_DPT_CD
		,T1.SLS_DPT_CD
		,T1.DEST_CD1
		,T1.DEST_CD2
		,T1.DEST_CD3
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
		,T1.REC_EVAL_TYP
		,T1.ZERO_EFFECT_FLG
	FROM  MGVT_SLS T1
	;

ECHO T_SLS_EXPNS.DAT ;
unload ${DATA_DIR}/t_sls_expns.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ACT_SLS_ID
		,T1.ACT_SLS_ID_SUB
		,T1.EXPNS_CD
		,T1.AMT
	FROM  MGVT_SLS_EXPNS T1
	;

ECHO T_ST_STK.DAT ;
unload ${DATA_DIR}/t_st_stk.dat
	SELECT
		 T1.ST_STK_KEY
		,T1.GR_DT
		,T1.WG_CD
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.BP_CD
		,T1.ASST_TYP
		,T1.QTY
		,T1.REPURC_OBLI_FLG -- Op.4
	FROM  MGVT_ST_STK T1
	;

ECHO T_ST_STK_EXPNS.DAT ;
unload ${DATA_DIR}/t_st_stk_expns.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ST_STK_KEY
		,T1.EXPNS_CD
		,T1.AMT
	FROM  MGVT_ST_STK_EXPNS T1
	;

ECHO T_ST_WIP.DAT ;
unload ${DATA_DIR}/t_st_wip.dat
	SELECT
		 T1.ST_WIP_KEY
		,T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ITM_MFG_INST_NO
		,T1.MFG_ACT_NO
		,T1.OPER_ACT_NO
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.LOC_CD
		,T1.STR_LN_CD
		,T1.WIP_QTY
		,T1.WIP_PER
	FROM  MGVT_ST_WIP T1
	;

ECHO T_ST_WIP_EXPNS.DAT ;
unload ${DATA_DIR}/t_st_wip_expns.dat
	SELECT
		 T1.WG_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.ST_WIP_KEY
		,T1.EXPNS_CD
		,T1.WIP_AMT
		,T1.INPT_AMT
	FROM  MGVT_ST_WIP_EXPNS T1
	;

ECHO T_GP_ALC.DAT ;
unload ${DATA_DIR}/t_gp_alc.dat
	SELECT
		 T1.YM
		,T1.WG_CD
		,T1.MNG_DPT_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ITM_EXT
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.LOC_CD
		,T1.OPER_CD
		,T1.BP_CD
		,T1.ALC_DPT_CD
		,T1.ITM_MFG_INST_NO
		,T1.IV_NO
		,T1.PO_NO
		,T1.SLO_NO
		,T1.ASST_TYP
		,T1.GP_ALC_CD
		,T1.QTY
		,T1.AMT
		,T1.ALC_VAL1
		,T1.ALC_VAL2
		,T1.ALC_VAL3
		,T1.ALC_VAL4
		,T1.ALC_VAL5
	FROM  MGVT_GP_ALC T1
	;

if ("${IS_MULTI}" == "1") {
	COMMIT_ALL ;
}

ECHO DATA IMPORT END ;

// =====  EXECUTE SCA  =====

ECHO SCA START ;

execute ${SCA_EXEC} ;

if ("${ERRORLEVEL}" != "0") {
	exit ${ERRORLEVEL} ;
}

ECHO SCA END ;

// =====  WRITE DATA  =====
ECHO DATA UPLOAD START ;

if ("${SCA_CALC_CNT}" == "${SCA_CALC_CNT_TOTAL}") {
	ECHO T_STD_TOP.DAT ;
	&&load ${OUT_DIR}/t_std_top.dat MGT_STD_TOP (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		WG_CD			= :2,
		ITM_CD			= :3,
		ITM_SUB1		= :4,
		ITM_SUB2		= :5,
		ITM_SUB3		= :6,
		MFG_PURC_TYP	= :7,
		LOC_CD			= :8,
		SPPL_CD			= :9,
		DPT_CD			= :10,
		CST_CD			= :11,
		DLV_CD			= :12,
		DEST_CD1		= :13,
		DEST_CD2		= :14,
		DEST_CD3		= :15,
		QTY				= :16,
		AMT				= :17,
		SLS_AMT			= :18,
		CUR_CD			= :19,
		CUR_AMT			= :20,
		SLS_FLG			= :21
		) ;

	ECHO T_STD_INPT.DAT ;
	&&load ${OUT_DIR}/t_std_inpt.dat MGT_STD_INPT (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_REC_NO		= :1,
		TOP_REC_NO		= :2,
		LVL				= :3,
		WG_CD			= :4,
		ITM_CD			= :5,
		ITM_SUB1		= :6,
		ITM_SUB2		= :7,
		ITM_SUB3		= :8,
		MFG_PURC_TYP	= :9,
		OPER_CD			= :10,
		OPER_SEQ		= :11,
		DISP_SEQ		= :12,
		LOC_CD			= :13,
		SPPL_CD			= :14,
		PROV_TYP		= :15,
		STD_QTY			= :16,
		THE_QTY			= :17,
		REQ_QTY			= :18,
		BOTTOM_FLG		= :19
		) ;

	ECHO T_STD_OPER.DAT ;
	&&load ${OUT_DIR}/t_std_oper.dat MGT_STD_OPER (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		OPER_REC_NO		= :1,
		TOP_REC_NO		= :2,
		INPT_REC_NO		= :3,
		WG_CD			= :4,
		LOC_CD			= :5,
		ITM_CD			= :6,
		ITM_SUB1		= :7,
		ITM_SUB2		= :8,
		ITM_SUB3		= :9,
		OPER_PTN		= :10,
		OPER_CD			= :11,
		OPER_SEQ		= :12,
		DISP_SEQ		= :13,
		STD_QTY			= :14,
		THE_QTY			= :15
		) ;

	ECHO T_STD_WK.DAT ;
	&&load ${OUT_DIR}/t_std_wk.dat MGT_STD_WK (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		WK_REC_NO		= :1,
		OPER_REC_NO		= :2,
		WK_COST_CD		= :3,
		STD_WK_COST		= :4,
		THE_WK_COST		= :5
		) ;

	ECHO T_COST.DAT ;
	&&load ${OUT_DIR}/t_cost.dat MGT_STD_COST (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_REC_NO		= :1,
		OPER_REC_NO		= :2,
		WK_REC_NO		= :3,
		EXPNS_CD		= :4,
		STD_COST		= :5,
		THE_COST		= :6,
		SML_INPT_REC_NO	= :7,
		SML_OPER_REC_NO	= :8,
		OPER_COST_FLG	= :9,
		EXPNS_TYP		= :10
		) ;

	ECHO T_SML_COST.DAT ;
	&&load ${OUT_DIR}/t_sml_cost.dat MGT_STD_SML_COST (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		EXPNS_CD		= :2,
		STD_COST		= :3,
		THE_COST		= :4,
		EXPNS_TYP		= :5
		) ;

	ECHO T_STD_ALC.DAT ;
	&&load ${OUT_DIR}/t_std_alc.dat MGT_STD_ALC (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		WG_CD			= :2,
		ALC_AC_CD		= :3,
		DPT_CD			= :4,
		LOC_CD			= :5,
		OPER_CD			= :6,
		BP_CD			= :7,
		CTG_CD			= :8,
		ITM_CD			= :9,
		ITM_SUB1		= :10,
		ITM_SUB2		= :11,
		ITM_SUB3		= :12,
		ALC_TGT_VAL		= :13,
		ALC_RATE		= :14,
		ALC_AMT			= :15,
		COEF_VAL		= :16,
		ALC_ORG_TGT_VAL	= :17,
		EXPNS_CD		= :18,
		ALC_PTN_CD		= :19
		) ;

	ECHO T_ACC_TOP.DAT ;
	&&load ${OUT_DIR}/t_acc_top.dat MGT_ACC_TOP (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		CALC_REC_TYP	= :2,
		YM				= dbuToDate(:3),
		AC_DT			= dbuToDate(:4),
		WG_CD			= :5,
		MNG_DPT_CD		= :6,
		ITM_CD			= :7,
		ITM_SUB1		= :8,
		ITM_SUB2		= :9,
		ITM_SUB3		= :10,
		MFG_PURC_TYP	= :11,
		LOT_NO			= :12,
		SUBLOT_NO		= :13,
		SNO1			= :14,
		SNO2			= :15,
		SNO3			= :16,
		SNO4			= :17,
		COST_IO_TYP		= :18,
		AC_SLIP_TYP		= :19,
		AC_RSN_CD		= :20,
		ITM_MFG_INST_NO	= :21,
		MFG_ACT_NO		= :22,
		LOC_CD			= :23,
		STR_LN_CD		= :24,
		OPER_ACT_NO		= :25,
		OPER_CD			= :26,
		OPER_SEQ		= :27,
		BP_CD			= :28,
		STK_BP_CD		= :29,
		PO_NO			= :30,
		SLO_NO			= :31,
		IV_NO			= :32,
		ACT_ID			= :33,
		ACT_ID_SUB		= :34,
		ALC_DPT_CD		= :35,
		OTHER_DPT_CD	= :36,
		ASST_TYP		= :37,
		QTY				= :38,
		AMT				= :39,
		STD_QTY			= :40,
		STD_AMT			= :41,
		CUR_CD			= :42,
		CUR_AMT			= :43,
		CUR_STD_AMT		= :44,
		XRATE			= :45,
		STD_XRATE		= :46,
		UPRI_DIFF		= :47,
		RATE_DIFF		= :48,
		TRD_GRP			= :49,
		ACT_UPRI		= :50,
		STD_UPRI		= :51,
		SO_ACT_AMT		= :52,
		SO_STD_AMT		= :53,
		PER				= :54,
		MFG_COST_RATIO	= :55,
		ALC_AC_CD		= :56,
		REC_EVAL_TYP	= :57,
		PAR_ITM_CD		= :58,
		PAR_ITM_SUB1	= :59,
		PAR_ITM_SUB2	= :60,
		PAR_ITM_SUB3	= :61,
		GP_ALC_CD		= :62,
		REPURC_OBLI_FLG	= :63 -- Op.4
		) ;

	ECHO T_ACC_INPT.DAT ;
	&&load ${OUT_DIR}/t_acc_inpt.dat MGT_ACC_INPT (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_REC_NO		= :1,
		TOP_REC_NO		= :2,
		LVL				= :3,
		WG_CD			= :4,
		YM				= dbuToDate(:5),
		AC_DT			= dbuToDate(:6),
		MNG_DPT_CD		= :7,
		ITM_CD			= :8,
		ITM_SUB1		= :9,
		ITM_SUB2		= :10,
		ITM_SUB3		= :11,
		MFG_PURC_TYP	= :12,
		LOT_NO			= :13,
		SUBLOT_NO		= :14,
		SNO1			= :15,
		SNO2			= :16,
		SNO3			= :17,
		SNO4			= :18,
		LOC_CD			= :19,
		STR_LN_CD		= :20,
		OPER_ACT_NO		= :21,
		OPER_CD			= :22,
		OPER_SEQ		= :23,
		AC_SLIP_TYP		= :24,
		AC_RSN_CD		= :25,
		ASST_TYP		= :26,
		ACT_QTY			= :27,
		STD_QTY			= :28,
		ACT_UPRI		= :29,
		STD_UPRI		= :30,
		REPURC_OBLI_FLG	= :31 -- Op.4
		) ;

	ECHO T_ACC_WK.DAT ;
	&&load ${OUT_DIR}/t_acc_wk.dat MGT_ACC_WK (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		WK_REC_NO		= :1,
		INPT_REC_NO		= :2,
		LOC_CD			= :3,
		STR_LN_CD		= :4,
		OPER_ACT_NO		= :5,
		OPER_CD			= :6,
		OPER_SEQ		= :7,
		WK_COST_CD		= :8,
		WK_RSN_CD		= :9,
		ACT_WK_COST		= :10,
		STD_WK_COST		= :11
		) ;

	ECHO T_ACC_COST.DAT ;
	&&load ${OUT_DIR}/t_acc_cost.dat MGT_ACC_COST (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_REC_NO		= :1,
		WK_REC_NO		= :2,
		OPER_ACT_NO		= :3,
		OPER_CD			= :4,
		OPER_SEQ		= :5,
		EXPNS_CD		= :6,
		ACT_COST		= :7,
		STD_COST		= :8,
		SML_INPT_REC_NO	= :9,
		TOP_REC_NO		= :10,
		LOC_CD			= :11,
		STR_LN_CD		= :12,
		OPER_COST_FLG	= :13,
		EXPNS_TYP		= :14,
		DIFF_QTY		= :15,
		DIFF_WK			= :16,
		DIFF_UP			= :17,
		DIFF_RT			= :18,
		DIFF_STD		= :19,
		DIFF_A			= :20,
		DIFF_B			= :21,
		DIFF_C			= :22,
		DIFF_D			= :23,
		DIFF_E			= :24
		) ;

	ECHO T_ACC_SML_COST.DAT ;
	&&load ${OUT_DIR}/t_acc_sml_cost.dat MGT_ACC_SML_COST (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		EXPNS_CD		= :2,
		ACT_COST		= :3,
		STD_COST		= :4,
		EXPNS_TYP		= :5,
		DIFF_QTY		= :6,
		DIFF_WK			= :7,
		DIFF_UP			= :8,
		DIFF_RT			= :9,
		DIFF_STD		= :10,
		DIFF_A			= :11,
		DIFF_B			= :12,
		DIFF_C			= :13,
		DIFF_D			= :14,
		DIFF_E			= :15
		) ;

	ECHO T_ACC_TRD.DAT ;
	&&load ${OUT_DIR}/t_acc_trd.dat MGT_ACC_TRD (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TRD_GRP			= :1,
		YM				= dbuToDate(:2),
		EXPNS_CD		= :3,
		AMT				= :4
		) ;

	ECHO T_EXP_PROD_PURC.DAT ;
	&&load ${OUT_DIR}/t_exp_prod_purc.dat MGT_EXP_MFG_PURC (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		YM				= dbuToDate(:1),
		WG_CD			= :2,
		MNG_DPT_CD		= :3,
		ITM_CD			= :4,
		ITM_SUB1		= :5,
		ITM_SUB2		= :6,
		ITM_SUB3		= :7,
		LOT_NO			= :8,
		SUBLOT_NO		= :9,
		SNO1			= :10,
		SNO2			= :11,
		SNO3			= :12,
		SNO4			= :13,
		LOC_CD			= :14,
		SPPL_CD			= :15,
		ALC_DPT_CD		= :16,
		ASST_TYP		= :17,
		QTY				= :18,
		AMT				= :19,
		CUR_CD			= :20,
		CUR_AMT			= :21
		) ;

	ECHO T_EXP_OPER.DAT ;
	&&load ${OUT_DIR}/t_exp_oper.dat MGT_EXP_OPER (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		YM				= dbuToDate(:1),
		WG_CD			= :2,
		MNG_DPT_CD		= :3,
		ITM_CD			= :4,
		ITM_SUB1		= :5,
		ITM_SUB2		= :6,
		ITM_SUB3		= :7,
		ITM_MFG_INST_NO	= :8,
		MFG_ACT_NO		= :9,
		LOT_NO			= :10,
		SUBLOT_NO		= :11,
		SNO1			= :12,
		SNO2			= :13,
		SNO3			= :14,
		SNO4			= :15,
		LOC_CD			= :16,
		STR_LN_CD		= :17,
		ASST_TYP		= :18,
		OPER_PTN		= :19,
		OPER_CD			= :20,
		OPER_SEQ		= :21,
		DISP_SEQ		= :22,
		QTY				= :23
		) ;

	ECHO T_EXP_INPT.DAT ;
	&&load ${OUT_DIR}/t_exp_inpt.dat MGT_EXP_INPT (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		YM				= dbuToDate(:1),
		WG_CD			= :2,
		MNG_DPT_CD		= :3,
		PAR_ITM_CD		= :4,
		PAR_ITM_SUB1	= :5,
		PAR_ITM_SUB2	= :6,
		PAR_ITM_SUB3	= :7,
		ITM_MFG_INST_NO	= :8,
		MFG_ACT_NO		= :9,
		PAR_LOT_NO		= :10,
		PAR_SUBLOT_NO	= :11,
		PAR_SNO1		= :12,
		PAR_SNO2		= :13,
		PAR_SNO3		= :14,
		PAR_SNO4		= :15,
		LOC_CD			= :16,
		STR_LN_CD		= :17,
		ASST_TYP		= :18,
		OPER_PTN		= :19,
		OPER_CD			= :20,
		OPER_SEQ		= :21,
		DISP_SEQ		= :22,
		ITM_CD			= :23,
		ITM_SUB1		= :24,
		ITM_SUB2		= :25,
		ITM_SUB3		= :26,
		LOT_NO			= :27,
		SUBLOT_NO		= :28,
		SNO1			= :29,
		SNO2			= :30,
		SNO3			= :31,
		SNO4			= :32,
		PROV_TYP		= :33,
		EXPNS_CD		= :34,
		QTY				= :35,
		AMT				= :36,
		CUR_CD			= :37,
		CUR_AMT			= :38
		) ;

	ECHO T_EXP_WK.DAT ;
	&&load ${OUT_DIR}/t_exp_wk.dat MGT_EXP_WK (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		YM				= dbuToDate(:1),
		WG_CD			= :2,
		MNG_DPT_CD		= :3,
		ITM_CD			= :4,
		ITM_SUB1		= :5,
		ITM_SUB2		= :6,
		ITM_SUB3		= :7,
		ITM_MFG_INST_NO	= :8,
		MFG_ACT_NO		= :9,
		LOT_NO			= :10,
		SUBLOT_NO		= :11,
		SNO1			= :12,
		SNO2			= :13,
		SNO3			= :14,
		SNO4			= :15,
		LOC_CD			= :16,
		STR_LN_CD		= :17,
		ASST_TYP		= :18,
		OPER_PTN		= :19,
		OPER_CD			= :20,
		OPER_SEQ		= :21,
		DISP_SEQ		= :22,
		WK_COST_CD		= :23,
		WK_COST			= :24
		) ;

	ECHO T_EXP_PROV.DAT ;
	&&load ${OUT_DIR}/t_exp_prov.dat MGT_EXP_PROV (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		YM				= dbuToDate(:1),
		WG_CD			= :2,
		MNG_DPT_CD		= :3,
		ITM_CD			= :4,
		ITM_SUB1		= :5,
		ITM_SUB2		= :6,
		ITM_SUB3		= :7,
		LOT_NO			= :8,
		SUBLOT_NO		= :9,
		SNO1			= :10,
		SNO2			= :11,
		SNO3			= :12,
		SNO4			= :13,
		PRSPPL_CD		= :14,
		PROV_TYP		= :15,
		QTY				= :16,
		AMT				= :17,
		CUR_CD			= :18,
		CUR_AMT			= :19
		) ;

	ECHO T_ALC_CALC_RATE.DAT ;
	&&load ${OUT_DIR}/t_alc_calc_rate.dat MGT_ALC_CALC_RATE (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_ALC_TYP	= :1,
		YM				= dbuToDate(:2),
		WG_CD			= :3,
		ALC_AC_CD		= :4,
		DPT_CD			= :5,
		LOC_CD			= :6,
		OPER_CD			= :7,
		BP_CD			= :8,
		CTG_CD			= :9,
		ITM_CD			= :10,
		ITM_SUB1		= :11,
		ITM_SUB2		= :12,
		ITM_SUB3		= :13,
		LOT_NO			= :14,
		SUBLOT_NO		= :15,
		SNO1			= :16,
		SNO2			= :17,
		SNO3			= :18,
		SNO4			= :19,
		ITM_MFG_INST_NO	= :20,
		IV_NO			= :21,
		PO_NO			= :22,
		SLO_NO			= :23,
		AMT				= :24,
		ALC_TGT_VAL		= :25,
		ALC_RATE		= :26,
		ALC_AMT			= :27,
		TRD_ALC_TGT_VAL	= :28,
		TRD_ALC_AMT		= :29,
		STD_ALC_RATE	= :30,
		STD_ALC_AMT		= :31,
		STD_ALC_TGT_VAL	= :32,
		EXPNS_CD		= :33,
		ALC_PTN_CD		= :34,
		DIFF_CALC_TYP	= :35,
		ALC_GRP_ID		= :36
		) ;

	ECHO T_ALC_CALC_ERR.DAT ;
	&&load ${OUT_DIR}/t_alc_calc_err.dat MGT_ALC_CALC_ERR (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		INPT_ALC_TYP	= :1,
		YM				= dbuToDate(:2),
		WG_CD			= :3,
		ALC_AC_CD		= :4,
		DPT_CD			= :5,
		LOC_CD			= :6,
		OPER_CD			= :7,
		BP_CD			= :8,
		CTG_CD			= :9,
		ITM_CD			= :10,
		ITM_SUB1		= :11,
		ITM_SUB2		= :12,
		ITM_SUB3		= :13,
		LOT_NO			= :14,
		SUBLOT_NO		= :15,
		SNO1			= :16,
		SNO2			= :17,
		SNO3			= :18,
		SNO4			= :19,
		ITM_MFG_INST_NO	= :20,
		IV_NO			= :21,
		PO_NO			= :22,
		SLO_NO			= :23,
		AMT				= :24,
		EXPNS_CD		= :25,
		ALC_PTN_CD		= :26
		) ;

	ECHO T_ALC_CALC_DTL.DAT ;
	&&load ${OUT_DIR}/t_alc_calc_dtl.dat MGT_ALC_CALC_DTL (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		ALC_GRP_ID		= :1,
		YM				= dbuToDate(:2),
		WG_CD			= :3,
		MNG_DPT_CD		= :4,
		ITM_CD			= :5,
		ITM_SUB1		= :6,
		ITM_SUB2		= :7,
		ITM_SUB3		= :8,
		ITM_MFG_INST_NO	= :9,
		MFG_ACT_NO		= :10,
		LOT_NO			= :11,
		SUBLOT_NO		= :12,
		SNO1			= :13,
		SNO2			= :14,
		SNO3			= :15,
		SNO4			= :16,
		AC_SLIP_TYP		= :17,
		AC_RSN_CD		= :18,
		LOC_CD			= :19,
		STR_LN_CD		= :20,
		OPER_ACT_NO		= :21,
		OPER_CD			= :22,
		WK_COST_CD		= :23,
		WK_RSN_CD		= :24,
		BP_CD			= :25,
		IV_NO			= :26,
		PO_NO			= :27,
		SLO_NO			= :28,
		ALC_DPT_CD		= :29,
		ACT_SLS_ID		= :30,
		ACT_SLS_ID_SUB	= :31,
		ASST_TYP		= :32,
		GP_ALC_CD		= :33,
		ALC_TGT_VAL		= :34,
		ALC_AMT			= :35,
		ADJ_AMT			= :36,
		STD_ALC_AMT		= :37,
		COEF_VAL		= :38,
		ALC_ORG_TGT_VAL	= :39,
		STD_ALC_TGT_VAL	= :40
		) ;

	ECHO T_CALC_LOG.DAT ;
	&&load ${OUT_DIR}/t_calc_log.dat (4:1000) MGT_CALC_LOG (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		SEQ_NO			= :1,
		LOG_TIME		= :2,
		MSG_ID			= :3,
		MSG				= :4
		) ;
}
else {
	ECHO T_ACC_TOP.DAT ;
	&&load ${OUT_DIR}/t_acc_top.dat MGT_ACC_TOP_TMP (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		CALC_REC_TYP	= :2,
		COST_IO_TYP		= :18,
		ACT_ID			= :33,
		ACT_ID_SUB		= :34
		) ;

	ECHO T_ACC_SML_COST.DAT ;
	&&load ${OUT_DIR}/t_acc_sml_cost.dat MGT_ACC_SML_COST_TMP (
		CALC_NO			= '${SCA_CALC_NO}',
		CALC_GRP_CD		= '${SCA_CALC_GRP_CD}',
		TOP_REC_NO		= :1,
		EXPNS_CD		= :2,
		ACT_COST		= :3,
		STD_COST		= :4
		) ;
}

if ("${IS_MULTI}" == "1") {
	COMMIT_ALL ;
}

ECHO DATA UPLOAD END ;

// =====  POST-PROCESS  =====
ECHO POST-PROCESS START ;

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin MGPA_SCA.P_SCA2('${SCA_CALC_GRP_CD}', '${SCA_CALC_NO}', :rc) ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mgpa_sca$p_sca2('${SCA_CALC_GRP_CD}', '${SCA_CALC_NO}', :rc);
}
if ("${rc}" != "0") {
	ECHO ERROR in MGPA_SCA.P_SCA2 SQLCODE = "${rc}" ;
	exit 1 ;
}

ECHO POST-PROCESS END ;

COMMIT ;

ECHO SCa COMPLETE ;
