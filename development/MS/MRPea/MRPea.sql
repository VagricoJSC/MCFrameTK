ECHO MRPea START ;

// =====  PREPARE  =====
set MRPEA_NULL_VAL = * ;
set DATE_IN_PAST   = '19000101' ;
set MRPEA_CNT_RQMT = ${P}RQMT ;
set MRPEA_CNT_ODR  = ${P}ORD ;
set MRPEA_CNT_KODR = ${P}KORD ;
set MRPEA_CNT_SLIP = ${P}SLIP ;
set IS_MULTI = 0 ;
if ("${DBUTIL_THREAD}" != "") {
	if ("${DBUTIL_THREAD}" != "1") {
		set IS_MULTI = 1 ;
	}
}
if ("${DATABASE}" == "Oracle") {
	set ITM_ORD_STS_OPN = MSC_ITM_ORD_STS_TYP.OPN ;
	set ITM_ORD_STS_SAV = MSC_ITM_ORD_STS_TYP.SAV ;
	set MRP_MRP = MSC_MRP_TYP.MRP ;
	set MRP_PRCD = MSC_MRP_TYP.PRCD ;
	set MRP_SIM = MSC_MRP_TYP.SIM ;
	set RQMT_NON = MAC_RQMT_TYP.NON ;
	set RQMT_ALLOC = MAC_RQMT_TYP.ALLOC ;
	set DATA_STK = MSC_MRP_DATA_TYP.STK ;
	set DATA_ORDZ = MSC_MRP_DATA_TYP.ORDZ ;
	set DATA_KORDZ = MSC_MRP_DATA_TYP.KORDZ ;
	set DATA_SCHDO = MSC_MRP_DATA_TYP.SCHDO ;
	set DATA_SCHDI = MSC_MRP_DATA_TYP.SCHDI ;
	set IO_GR = MSC_IO_TYP.GR ;
	set IO_GI = MSC_IO_TYP.GI ;
	set IO_SCHD_SUB = MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO ;
	set SNO_EXTND = MAC_SNO_TYP.EXTND ;
	set SNO_EXTND_NULL = MAC_SNO_TYP.EXTND_NULL ;
	set SNO_MNG_NOT_STK = MAC_SNO_MNG_TYP.MNG_NOT_STK ;
	set IN_XFR_LOC = MSC_IN_XFR_TYP.IN_LOC ;
	set QUALITY_GOOD = MAC_QUALITY_TYP.GOOD ;
	set STK_INSP_FIN = MSC_STK_INSP_TYP.FIN ;
	set STK_ID_COSTK = MSC_STK_ID_TYP.COSTK ;
}
if ("${DATABASE}" == "PostgreSQL") {
	set ITM_ORD_STS_OPN = fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','OPN') ;
	set ITM_ORD_STS_SAV = fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','SAV') ;
	set MRP_MRP = fcpa_const$get_const_val('MSC_MRP_TYP','MRP') ;
	set MRP_PRCD = fcpa_const$get_const_val('MSC_MRP_TYP','PRCD') ;
	set MRP_SIM = fcpa_const$get_const_val('MSC_MRP_TYP','SIM') ;
	set RQMT_NON = fcpa_const$get_const_val('MAC_RQMT_TYP','NON') ;
	set RQMT_ALLOC = fcpa_const$get_const_val('MAC_RQMT_TYP','ALLOC') ;
	set DATA_STK = fcpa_const$get_const_val('MSC_MRP_DATA_TYP','STK') ;
	set DATA_ORDZ = fcpa_const$get_const_val('MSC_MRP_DATA_TYP','ORDZ') ;
	set DATA_KORDZ = fcpa_const$get_const_val('MSC_MRP_DATA_TYP','KORDZ') ;
	set DATA_SCHDO = fcpa_const$get_const_val('MSC_MRP_DATA_TYP','SCHDO') ;
	set DATA_SCHDI = fcpa_const$get_const_val('MSC_MRP_DATA_TYP','SCHDI') ;
	set IO_GR = fcpa_const$get_const_val('MSC_IO_TYP','GR') ;
	set IO_GI = fcpa_const$get_const_val('MSC_IO_TYP','GI') ;
	set IO_SCHD_SUB = fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','ITM_ORD_NO') ;
	set SNO_EXTND = mac_sno_typ$extnd() ;
	set SNO_EXTND_NULL = mac_sno_typ$extnd_null() ;
	set SNO_MNG_NOT_STK = mac_sno_mng_typ$mng_not_stk() ;
	set IN_XFR_LOC = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC') ;
	set QUALITY_GOOD = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD') ;
	set STK_INSP_FIN = fcpa_const$get_const_val('MSC_STK_INSP_TYP','FIN') ;
	set STK_ID_COSTK = fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK') ;
}

// =====  PRE-PROCESS  =====
ECHO PRE-PROCESS START ;

SELECT CNTR FROM MST_MRP_CNTR
	WHERE WG_CD = '${WG_CD}'
	AND MRP_CNTR_TYP IN ('${MRPEA_CNT_RQMT}', '${MRPEA_CNT_ODR}', '${MRPEA_CNT_KODR}', '${MRPEA_CNT_SLIP}')
	FOR UPDATE ;

if ("${P}" == "") {
SELECT ITM_ORD_NO FROM MST_ITM_ORDER
	WHERE WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP IN (${ITM_ORD_STS_OPN}, ${ITM_ORD_STS_SAV})
	ORDER BY ITM_ORD_NO
	FOR UPDATE ;
}
if ("${P}" == "P") {
SELECT ITM_ORD_NO FROM MST_PRCD_ITM_ORDER
	WHERE WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	ORDER BY ITM_ORD_NO
	FOR UPDATE ;
}
if ("${P}" == "I") {
SELECT ITM_ORD_NO FROM MST_SIM_ITM_ORDER
	WHERE WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	ORDER BY ITM_ORD_NO
	FOR UPDATE ;
}

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin MSPA_MRPEA.P_MRPEA1('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_mrpea1('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in MSPA_MRPEA.P_MRPEA1 SQLCODE = "${rc}" ;
	exit 1;
}

if ("${IS_MULTI}" == "1") {
	COMMIT ;
}

ECHO DATA DELETE START ;

if ("${P}" == "") {
&DELETE FROM MST_ITM_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_OPER_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_ITM_LNK
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_MRPRQMT
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_ALLOC_PLN
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_ORD_IO_SCHD
	WHERE 0=0
	AND ORG_WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_MRP_LOG
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND MRP_TYP = ${MRP_MRP}
	;
}

if ("${P}" == "P") {
&DELETE FROM MST_PRCD_ITM_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_PRCD_OPER_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_PRCD_ITM_LNK
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_PRCD_MRPRQMT
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_PRCD_ALLOC_PLN
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_PRCD_IO_SCHD
	WHERE 0=0
	AND ORG_WG_CD = '${WG_CD}'
	;

&DELETE FROM MST_MRP_LOG
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND MRP_TYP = ${MRP_PRCD}
	;
}
if ("${P}" == "I") {
&DELETE FROM MST_SIM_ITM_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_SIM_OPER_ORDER
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	AND ITM_ORD_STS_TYP = ${ITM_ORD_STS_OPN}
	;

&DELETE FROM MST_SIM_ITM_LNK
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	;

&DELETE FROM MST_SIM_MRPRQMT
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	;

&DELETE FROM MST_SIM_ALLOC_PLN
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	;

&DELETE FROM MST_SIM_IO_SCHD
	WHERE 0=0
	AND ORG_WG_CD = '${WG_CD}'
	AND SIM_MRP_NO = '${SIM_MRP_NO}'
	;

&DELETE FROM MST_MRP_LOG
	WHERE 0=0
	AND WG_CD = '${WG_CD}'
	AND MRP_TYP = ${MRP_SIM}
	;
}

if ("${IS_MULTI}" == "1") {
	COMMIT_ALL ;
}

ECHO DATA DELETE END ;

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin MSPA_MRPEA.P_MRPEA2('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_mrpea2('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in MSPA_MRPEA.P_MRPEA2 SQLCODE = "${rc}" ;
	exit 1;
}

if ("${P}" == "I") {
set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin SELECT DLY_RQMT_FLG, STK_FLG, GR_FLG, GI_FLG, SHIP_FLG into :DLY_RQMT_FLG, :STK_FLG, :GR_FLG, :GI_FLG, :SHIP_FLG FROM MST_SIM_MRP WHERE SIM_MRP_NO = '${SIM_MRP_NO}' ; :rc := 0 ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_get_sim_mrp('${SIM_MRP_NO}', :DLY_RQMT_FLG, :STK_FLG, :GR_FLG, :GI_FLG, :SHIP_FLG, :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in reading MST_SIM_MRP SQLCODE = "${rc}" ;
	exit ${rc};
}
}

ECHO PRE-PROCESS END ;

// =====  READ INPUT DATA  =====
ECHO DATA IMPORT START ;

ECHO BASHO.DAT ;
unload ${DATA_DIR}/basho.dat
	SELECT
		 T1.LOC_CD
		,T1.LOC_GRP_CD
		,T1.CAL_CD
		,T1.SITE_CD
		,T1.LG_GRP_CD
		,T1.LG_CAL_CD
		,T1.SPPL_CD
		,T1.SPPL_CAL_CD
		,T1.LOC_MNG_TYP
		,T1.ALLOC_LMT_FLG
	FROM  MSVM_MRP_LOC T1
	WHERE T1.WG_CD = '${WG_CD}'
	;

ECHO ROUTE.DAT ;
unload ${DATA_DIR}/route.dat
	SELECT
		 T1.TO_LOC_CD
		,T1.FR_LOC_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.PRIO
		,T1.XFR_LOT_UNIT_QTY
		,T1.IN_LOC_FLG
	FROM  MSVM_MRP_ALLOC_CTL T1
	WHERE T1.WG_CD = '${WG_CD}'
	AND (
		T1.ITM_CD is null
		or exists (
			SELECT 'x' FROM MSW_MRP_ITM T2
			WHERE 0=0
			AND T1.ITM_CD = T2.ITM_CD
			AND T1.ITM_SUB1 = T2.ITM_SUB1
			AND T1.ITM_SUB2 = T2.ITM_SUB2
			AND T1.ITM_SUB3 = T2.ITM_SUB3
			)
		)
	;

ECHO HINMO.DAT ;
unload ${DATA_DIR}/hinmo.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.MRP_PROC_TYP
		,T1.DEC_PLACE
		,T1.UNIT_CD
		,T1.SCH_FLG
		,T1.RQMT_RSTR_QTY
		,T1.SHIP_TERM_CD
		,T1.LOT_MNG_TYP
		,T1.SUBLOT_MNG_TYP
		,T1.SNO1_MNG_TYP
		,T1.SNO2_MNG_TYP
		,T1.SNO3_MNG_TYP
		,T1.SNO4_MNG_TYP
		,T1.ORDER_STOP_DT
	FROM  MSVM_MRP_ITM T1
	WHERE (T1.WG_CD = '${WG_CD}' or T1.WG_CD is null)
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO BOM.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "3") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/bom.dat
	SELECT
		 T1.PAR_ITM_CD
		,T1.PAR_ITM_SUB1
		,T1.PAR_ITM_SUB2
		,T1.PAR_ITM_SUB3
		,T1.BOM_PTN
		,T1.WG_CD
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.CHD_ITM_CD
		,T1.CHD_ITM_SUB1
		,T1.CHD_ITM_SUB2
		,T1.CHD_ITM_SUB3
		,T1.VER_NO
		,T1.PH_FLG
		,T1.PH_BOM_PTN
		,T1.ALT_GRP_CD
		,T1.ALT_GRP_SEQ
		,T1.ALT_ITM_TYP
		,T1.ALT_ITM_RATIO
		,T1.ALT_ALLOC_PRIO
		,T1.PAR_INST_QTY
		,T1.CHD_RQMT_QTY
		,T1.FXD_CHD_RQMT_QTY
		,T1.SNO_TYP1
		,T1.MIN_SNO1
		,T1.MAX_SNO1
		,T1.SNO_TYP2
		,T1.MIN_SNO2
		,T1.MAX_SNO2
		,T1.SNO_TYP3
		,T1.MIN_SNO3
		,T1.MAX_SNO3
		,T1.SNO_TYP4
		,T1.MIN_SNO4
		,T1.MAX_SNO4
		,T1.IN_OFFST_TYP
		,T1.IN_OFFST
		,T1.INPT_CTL_TYP
		,T1.ST_DT
		,T1.END_DT
	FROM  MSVM_MRP_BOM T1
	WHERE 0=0
	AND (T1.WG_CD = '${WG_CD}' OR T1.WG_CD = '${MRPEA_NULL_VAL}')
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.PAR_ITM_CD = T2.ITM_CD
		AND T1.PAR_ITM_SUB1 = T2.ITM_SUB1
		AND T1.PAR_ITM_SUB2 = T2.ITM_SUB2
		AND T1.PAR_ITM_SUB3 = T2.ITM_SUB3
		)
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T3
		WHERE 0=0
		AND T1.CHD_ITM_CD = T3.ITM_CD
		AND T1.CHD_ITM_SUB1 = T3.ITM_SUB1
		AND T1.CHD_ITM_SUB2 = T3.ITM_SUB2
		AND T1.CHD_ITM_SUB3 = T3.ITM_SUB3
		)
	${SIM_EMPTY}
	;

ECHO HINMOS.DAT ;
unload ${DATA_DIR}/hinmos.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.MFG_LOC_CD
		,T1.SPPL_CD
		,T1.SPPL_CAL_CD
		,T1.MAKER_CD
		,T1.RQST_LOC_CD
		,T1.RQST_SPPL_CD
		,T1.RQST_SITE_CD
		,T1.RQST_LG_GRP_CD
		,T1.RQST_LG_CAL_CD
		,T1.RQST_WG_CD
		,T1.BOM_PTN
		,T1.ST_DT
		,T1.END_DT
		,T1.OPER_PTN
		,T1.ORDER_RATIO
		,T1.MFG_LT
		,T1.MFG_LT_ADD_QTY
		,T1.PURC_LT
		,T1.PURC_LT_ADD_QTY
		,T1.ACCPT_INSP_LT
		,T1.BUF_LT
		,T1.SZ_DAY_WEEK_TYP
		,T1.SZ_WEEK
		,T1.LOT_SZ_PD
		,T1.MIN_LOT_QTY
		,T1.BATCH_LOT_QTY
		,T1.MAX_LOT_QTY
		,T1.YIELD_SCHD_QTY
		,T1.MFG_INST_QTY
		,T1.FXD_RQMT_QTY
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.PRIO
		,T1.MAX_ORDER
		,T1.ORD_FIX_PD
		,T1.ORDER_STOP_DT
	FROM  MSVM_MRP_ITM_DTL T1
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO HINMOK.DAT ;
unload ${DATA_DIR}/hinmok.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.OPER_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.ST_DT
		,T1.END_DT
		,T1.DISP_SEQ
		,T1.OPER_LT
		,T1.OPER_LT_ADD_QTY
		,T1.OPER_OFFST_TYP
		,T1.OPER_OFFST
		,T1.OPER_OFFST_ADD_QTY
		,T1.YIELD_OPER_FLG
		,T1.OPER_LOC_CD
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
	FROM  MSVM_MRP_ITM_OPER T1
	WHERE 0=0
	AND (T1.WG_CD = '${WG_CD}' OR T1.LOC_CD = '${MRPEA_NULL_VAL}')
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO HINMOB.DAT ;
unload ${DATA_DIR}/hinmob.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.PRIO
	FROM  MSVM_MRP_ITM_STRG T1
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO HINMOP.DAT ;
unload ${DATA_DIR}/hinmop.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.SITE_CD
		,T1.IN_PRMT_INSP_FLG
	FROM  MSVM_MRP_ITM_SITE T1
	WHERE 0=0
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO HINMOZK.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/hinmozk.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.LOC_CD
		,T1.BUF_QTY
		,T1.ST_DT
		,T1.END_DT
	FROM  MSVM_MRP_STK_RPL T1
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	${SIM_EMPTY}
	;

ECHO HINMOHK.DAT ;
unload ${DATA_DIR}/hinmohk.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.MFG_LOC_CD
		,T1.SPPL_CD
		,T1.MAKER_CD
		,T1.FROM_SITE_CD
		,T1.TO_SITE_CD
		,T1.INSP_LT
		,T1.INSP_OFFST
		,T1.ST_DT
		,T1.END_DT
	FROM  MSVM_MRP_ITM_INSP T1
	WHERE 0=0
	AND (T1.WG_CD = '${WG_CD}' or T1.WG_CD is null)
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO HINMOV.DAT ;
unload ${DATA_DIR}/hinmov.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.SITE_CD
		,T1.VER_NO
	FROM  MSVM_MRP_ITM_VER T1
	WHERE 0=0
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO IDOLT.DAT ;
unload ${DATA_DIR}/idolt.dat
	SELECT
		 T1.TO_LG_GRP_CD
		,T1.FR_LG_GRP_CD
		,T1.SHIP_TERM_CD
		,T1.XFR_LT
	FROM  MSVM_MRP_LG_CTL T1
	WHERE 0=0
	;

ECHO CHOKUSOLT.DAT ;
unload ${DATA_DIR}/chokusolt.dat
	SELECT
		 T1.SPPL_CD
		,T1.LG_GRP_CD
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.ST_DT
		,T1.END_DT
		,T1.PURC_LT
		,T1.PURC_LT_ADD_QTY
	FROM  MSVM_MRP_PURC_DDLV_LT T1
	WHERE 0=0
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;

ECHO CAL.DAT ;
unload ${DATA_DIR}/cal.dat
	SELECT
		 T1.CAL_CD
		,T1.SUN_OFF_FLG
		,T1.MON_OFF_FLG
		,T1.TUE_OFF_FLG
		,T1.WED_OFF_FLG
		,T1.THU_OFF_FLG
		,T1.FRI_OFF_FLG
		,T1.SAT_OFF_FLG
		,T1.ST_DT
		,T1.END_DT
	FROM  MSVM_MRP_CAL T1
	;

ECHO CALEX.DAT ;
unload ${DATA_DIR}/calex.dat
	SELECT
		 T1.CAL_CD
		,T1.DT
		,T1.OFF_FLG
	FROM  MSVM_MRP_CAL_EXT T1
	;

ECHO SHOYO.DAT ;
set TABLE = MSVT_MRP_RQMT ;
if ("${P}" == "P") set TABLE = MSVT_MRP_PRCD_RQMT ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${DLY_RQMT_FLG}" == "1") {
			set TABLE = MSVT_MRP_SIM_RQMT_FULL ;
		}
		else {
			set TABLE = MSVT_MRP_SIM_RQMT ;
		}
	}
	if ("${SIM_TYP}" == "2") {
		set TABLE = MSVT_MRP_SIM_RQMT ;
	}
	if ("${SIM_TYP}" == "3") {
		set TABLE = MSVT_MRP_SIM_RQMT_SD ;
	}
	if ("${SIM_TYP}" == "4") {
		set TABLE = MSVT_MRP_SIM_RQMT_PRMS ;
	}
}
set SIM_WHERE = AND 0=0 ;
if ("${P}" == "I") {
	set SIM_WHERE = AND (SIM_MRP_NO = '${SIM_MRP_NO}' OR SIM_MRP_NO IS NULL) ;
}
unload ${DATA_DIR}/shoyo.dat
	SELECT
		 T1.RQMT_NO
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.STRG_LOC_CD
		,T1.MFG_LOC_CD
		,T1.SPPL_CD
		,T1.RQST_LOC_CD
		,T1.DUE_DT
		,T1.RQMT_QTY
		,T1.SNO1
		,T1.SNO1_TYP
		,T1.SNO2
		,T1.SNO2_TYP
		,T1.SNO3
		,T1.SNO3_TYP
		,T1.SNO4
		,T1.SNO4_TYP
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND (T1.RQMT_TYP = ${RQMT_NON} OR T1.RQMT_TYP is null)
	${SIM_WHERE}
	;

ECHO DSHOYO.DAT ;
if ("${DATABASE}" == "Oracle") set CAST_VCHAR = VARCHAR2(1 CHAR) ;
if ("${DATABASE}" == "PostgreSQL") set CAST_VCHAR = VARCHAR(1) ;
unload ${DATA_DIR}/dshoyo.dat
	SELECT
		 T1.RQMT_NO
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.STRG_LOC_CD
		,T1.MFG_LOC_CD
		,T1.SPPL_CD
		,T1.RQST_LOC_CD
		,T1.DUE_DT
		,T1.RQMT_QTY
		,T1.SNO1
		,CASE WHEN T1.SNO1_TYP = ${SNO_EXTND} AND T2.SNO1_MNG_TYP = ${SNO_MNG_NOT_STK} THEN CAST(${SNO_EXTND_NULL} AS ${CAST_VCHAR}) ELSE T1.SNO1_TYP END AS SNO1_TYP
		,T1.SNO2
		,CASE WHEN T1.SNO2_TYP = ${SNO_EXTND} AND T2.SNO2_MNG_TYP = ${SNO_MNG_NOT_STK} THEN CAST(${SNO_EXTND_NULL} AS ${CAST_VCHAR}) ELSE T1.SNO2_TYP END AS SNO2_TYP
		,T1.SNO3
		,CASE WHEN T1.SNO3_TYP = ${SNO_EXTND} AND T2.SNO3_MNG_TYP = ${SNO_MNG_NOT_STK} THEN CAST(${SNO_EXTND_NULL} AS ${CAST_VCHAR}) ELSE T1.SNO3_TYP END AS SNO3_TYP
		,T1.SNO4
		,CASE WHEN T1.SNO4_TYP = ${SNO_EXTND} AND T2.SNO4_MNG_TYP = ${SNO_MNG_NOT_STK} THEN CAST(${SNO_EXTND_NULL} AS ${CAST_VCHAR}) ELSE T1.SNO4_TYP END AS SNO4_TYP
		,NULL
	FROM  ${TABLE} T1
		, MAM_ITM T2
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND T1.RQMT_TYP = ${RQMT_ALLOC}
	AND T1.DUE_DT >= TO_DATE('${DSHOYO_DT_FR}', 'YYYYMMDD')
	AND T1.ITM_CD = T2.ITM_CD
	AND T1.ITM_SUB1 = T2.ITM_SUB1
	AND T1.ITM_SUB2 = T2.ITM_SUB2
	AND T1.ITM_SUB3 = T2.ITM_SUB3
	${SIM_WHERE}
	;

set TABLE = MSW_MRP_ORDERZ ;
ECHO ZAIKO.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${STK_FLG}" == "0") {
			set SIM_EMPTY = AND 0=1 ;
		}
	}
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/zaiko.dat
	SELECT
		 T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.VER_NO
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.LOC_CD
		,T1.QTY
		,T1.FIRST_GR_DT
		,T1.LOT_SEQ
		,T1.AVL_SCHD_DT
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.GD_CD
		,T1.LMT_DT
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.DATA_TYP = ${DATA_STK}
	AND T1.WG_CD = '${WG_CD}'
	${SIM_EMPTY}
	;

ECHO ORDERZ.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${GR_FLG}" == "0") {
			set SIM_EMPTY = AND 0=1 ;
		}
	}
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/orderz.dat
	SELECT
		 T1.ITM_ORD_NO
		,T1.ITM_ORD_TYP
		,T1.ITM_ORD_STS_TYP
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.VER_NO
		,T1.LOC_CD
		,T1.BOM_PTN
		,T1.OPER_PTN
		,T1.MFG_LOC_CD
		,T1.SPPL_CD
		,T1.MAKER_CD
		,T1.RQST_LOC_CD
		,T1.RQST_WG_CD
		,T1.QTY
		,T1.MASTER_DT
		,T1.PO_SCHD_DT
		,T1.GI_SCHD_DT
		,T1.MFG_ST_SCHD_DT
		,T1.MFG_END_SCHD_DT
		,T1.STRG_SCHD_DT
		,T1.ACCPT_SCHD_DT
		,T1.INSP_ST_SCHD_DT
		,T1.INSP_END_SCHD_DT
		,T1.AVL_SCHD_DT
		,T1.SNO1
		,T1.SNO_TYP1
		,T1.SNO2
		,T1.SNO_TYP2
		,T1.SNO3
		,T1.SNO_TYP3
		,T1.SNO4
		,T1.SNO_TYP4
		,T1.LMT_DT
		,T1.RQMT_NO
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.DATA_TYP = ${DATA_ORDZ}
	AND T1.WG_CD = '${WG_CD}'
	${SIM_EMPTY}
	;

ECHO KORDERZ.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${GR_FLG}" == "0") {
			set SIM_EMPTY = AND 0=1 ;
		}
	}
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/korderz.dat
	SELECT
		 T1.OPER_ORD_NO
		,T1.OPER_ORD_STS_TYP
		,T1.ITM_ORD_NO
		,T1.MFG_LOC_CD
		,T1.QTY
		,T1.ST_SCHD_TM
		,T1.END_SCHD_TM
		,T1.OPER_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.DISP_SEQ
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.DATA_TYP = ${DATA_KORDZ}
	AND T1.WG_CD = '${WG_CD}'
	${SIM_EMPTY}
	;

ECHO SHUKKO.DAT ;
if ("${DATABASE}" == "Oracle") set IO_SCHD_IS_XFR = MSC_IO_SCHD_TYP.IS_XFR_GI_ALL(T1.IO_SCHD_TYP) ;
if ("${DATABASE}" == "PostgreSQL") set IO_SCHD_IS_XFR = msc_io_schd_typ$is_xfr_gi_all(T1.IO_SCHD_TYP) ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${GI_FLG}" == "0") {
			if ("${SHIP_FLG}" == "0") { set SIM_EMPTY = AND 0=1 ; }
		}
	}
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/shukko.dat
	SELECT
		 T1.IO_SCHD_NO
		,T1.IO_SCHD_TYP
		,T1.IO_SCHD_STS_TYP
		,T1.ITM_ORD_NO
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.VER_NO
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.LOC_CD
		,T1.QTY
		,T1.AVL_SCHD_DT
		,T1.ALT_GRP_CD
		,T1.ALT_GRP_SEQ
		,T1.OPER_ORD_NO
		,T1.OPER_INST_NO
		,T1.ALT_ITM_TYP
		,T1.ALT_ITM_RATIO
		,T1.ALT_ALLOC_PRIO
		,T1.OPER_PTN
		,T1.OPER_CD
		,T1.OPER_SEQ
		,T1.SNO1
		,T1.SNO_TYP1
		,T1.SNO2
		,T1.SNO_TYP2
		,T1.SNO3
		,T1.SNO_TYP3
		,T1.SNO4
		,T1.SNO_TYP4
		,T1.EX_SNO1
		,T1.EX_SNO2
		,T1.EX_SNO3
		,T1.EX_SNO4
		,T1.GD_CD
		,T1.INPT_CTL_TYP
		,CASE WHEN ${IO_SCHD_IS_XFR} = '1' THEN '1' ELSE '0' END AS IS_CONFINED
		,T1.ALLOC_FLG
		,NULL AS SORT_PROC
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.DATA_TYP = ${DATA_SCHDO}
	AND T1.WG_CD = '${WG_CD}'
	AND T1.AVL_SCHD_DT >= TO_DATE('${SCHD_DT_FR}', 'YYYYMMDD')
	${SIM_EMPTY}
	;

ECHO NYUKO.DAT ;
set SIM_EMPTY = AND 0=0 ;
if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${GR_FLG}" == "0") { set SIM_EMPTY = AND 0=1 ; }
	}
	if ("${SIM_TYP}" == "2") {
		set SIM_EMPTY = AND 0=1 ;
	}
}
unload ${DATA_DIR}/nyuko.dat
	SELECT
		 T1.ITM_ORD_NO
		,T1.IO_SCHD_NO
		,T1.IO_SCHD_TYP
		,T1.IO_SCHD_STS_TYP
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
		,T1.VER_NO
		,T1.LOT_NO
		,T1.SUBLOT_NO
		,T1.LOC_CD
		,T1.QTY
		,T1.AVL_SCHD_DT
		,T1.SNO1
		,T1.SNO2
		,T1.SNO3
		,T1.SNO4
		,T1.GD_CD
		,T1.LMT_DT
	FROM  ${TABLE} T1
	WHERE 0=0
	AND T1.DATA_TYP = ${DATA_SCHDI}
	AND T1.WG_CD = '${WG_CD}'
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	${SIM_EMPTY}
	;

if ("${P}" == "") {
ECHO OLINK.DAT ;
unload ${DATA_DIR}/olink.dat
	SELECT
		 T1.ITM_ORD_NO
		,T1.PAR_ITM_ORD_NO
		,T1.PAR_OPER_ORD_NO
		,T1.ITM_CD
		,T1.ITM_SUB1
		,T1.ITM_SUB2
		,T1.ITM_SUB3
	FROM  MSVT_MRP_ITM_LNK_FIX T1 
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND exists (
		SELECT 'x' FROM MSW_MRP_ITM T2
		WHERE 0=0
		AND T1.ITM_CD = T2.ITM_CD
		AND T1.ITM_SUB1 = T2.ITM_SUB1
		AND T1.ITM_SUB2 = T2.ITM_SUB2
		AND T1.ITM_SUB3 = T2.ITM_SUB3
		)
	;
}

ECHO MYLOTC.DAT ;
unload ${DATA_DIR}/mylotc.dat
	SELECT
		 T1.MRP_CNTR_TYP
		,T1.CNTR
		,T1.MAX_VAL
		,T1.MIN_VAL
	FROM  MST_MRP_CNTR T1
	WHERE 0=0
	AND T1.WG_CD = '${WG_CD}'
	AND	T1.MRP_CNTR_TYP in ('${MRPEA_CNT_RQMT}', '${MRPEA_CNT_ODR}', '${MRPEA_CNT_KODR}', '${MRPEA_CNT_SLIP}')
	;

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin
	SELECT PREFIX into :MRPEA_PFX_RQMT FROM MST_MRP_CNTR WHERE WG_CD = '${WG_CD}' AND MRP_CNTR_TYP= '${MRPEA_CNT_RQMT}' ;
	SELECT PREFIX into :MRPEA_PFX_ODR  FROM MST_MRP_CNTR WHERE WG_CD = '${WG_CD}' AND MRP_CNTR_TYP= '${MRPEA_CNT_ODR}' ;
	SELECT PREFIX into :MRPEA_PFX_KODR FROM MST_MRP_CNTR WHERE WG_CD = '${WG_CD}' AND MRP_CNTR_TYP= '${MRPEA_CNT_KODR}' ;
	SELECT PREFIX into :MRPEA_PFX_SLIP FROM MST_MRP_CNTR WHERE WG_CD = '${WG_CD}' AND MRP_CNTR_TYP= '${MRPEA_CNT_SLIP}' ;
	:rc := 0 ;
end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_get_prefix('${WG_CD}', '${MRPEA_CNT_RQMT}', :MRPEA_PFX_RQMT, :rc) ;
call mspa_mrpea$p_get_prefix('${WG_CD}', '${MRPEA_CNT_ODR}',  :MRPEA_PFX_ODR,  :rc) ;
call mspa_mrpea$p_get_prefix('${WG_CD}', '${MRPEA_CNT_KODR}', :MRPEA_PFX_KODR, :rc) ;
call mspa_mrpea$p_get_prefix('${WG_CD}', '${MRPEA_CNT_SLIP}', :MRPEA_PFX_SLIP, :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in reading MST_MRP_CNTR SQLCODE = "${rc}" ;
	exit ${rc};
}

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin SELECT MAPA_UTIL.F_GET_DEF_GD_CD INTO :MRPEA_STDGD FROM DUAL ; :rc := 0 ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_get_stdgd(:MRPEA_STDGD, :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in reading MAM_STK_GD SQLCODE = "${rc}" ;
	exit ${rc};
}

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin SELECT TO_CHAR(FCPA_DATE_UTIL.F_GET_TODAY, 'YYYYMMDD') INTO :MRPEA_BASE_DT FROM DUAL ; :rc := 0 ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_get_today(:MRPEA_BASE_DT, :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in reading TODAY SQLCODE = "${rc}" ;
	exit ${rc};
}

ECHO DATA IMPORT END ;

// =====  EXECUTE MRP  =====

set MRPEA_SKPIN  = OLINK ;
set MRPEA_SKPOUT = JUNJO ;

if ("${P}" == "") {
	set MRPEA_SKPIN  = ;
	set MRPEA_SKPOUT = ;
}

if ("${P}" == "I") {
	if ("${SIM_TYP}" == "1") {
		if ("${GI_FLG}" == "0") {
			if ("${SHIP_FLG}" == "0") { set MRPEA_SKPIN  = SHUKKO,${MRPEA_SKPIN} ; }
		}
		if ("${GR_FLG}" == "0") {
			set MRPEA_SKPIN  = ORDERZ,KORDERZ,NYUKO,${MRPEA_SKPIN} ;
		}
		if ("${STK_FLG}" == "0") {
			set MRPEA_SKPIN  = ZAIKO,${MRPEA_SKPIN} ;
		}
	}
	if ("${SIM_TYP}" == "2") {
		set MRPEA_SKPIN  = ZAIKO,ORDERZ,KORDERZ,NYUKO,SHUKKO,${MRPEA_SKPIN} ;
	}
	if ("${SIM_TYP}" == "3") {
		set MRPEA_SKPIN  = BOM,${MRPEA_SKPIN} ;
	}
}


ECHO MRP START ;

execute ${MRPEA_EXEC} MRPEA_BASE_DT=${MRPEA_BASE_DT} MRPEA_CNT_KODR=${MRPEA_CNT_KODR} MRPEA_CNT_ODR=${MRPEA_CNT_ODR} MRPEA_CNT_RQMT=${MRPEA_CNT_RQMT} MRPEA_CNT_SLIP=${MRPEA_CNT_SLIP} MRPEA_NULL_VAL=${MRPEA_NULL_VAL} MRPEA_PFX_KODR=${MRPEA_PFX_KODR} MRPEA_PFX_ODR=${MRPEA_PFX_ODR} MRPEA_PFX_RQMT=${MRPEA_PFX_RQMT} MRPEA_PFX_SLIP=${MRPEA_PFX_SLIP} MRPEA_SKPIN=${MRPEA_SKPIN} MRPEA_SKPOUT=${MRPEA_SKPOUT} MRPEA_STDGD=${MRPEA_STDGD} ;
if ("${ERRORLEVEL}" != "0") {
	ECHO ERROR in MRP ERRORLEVEL = "${ERRORLEVEL}" ;
	exit ${ERRORLEVEL};
}

ECHO MRP END ;

// =====  WRITE DATA  =====
ECHO DATA UPLOAD START ;

set SIM_INS = ;
if ("${P}" == "I") {
	set SIM_INS = SIM_MRP_NO = '${SIM_MRP_NO}', ;
}

ECHO ORDER.DAT ;
set TABLE = MST_ITM_ORDER ;
if ("${P}" == "P")	set TABLE = MST_PRCD_ITM_ORDER ;
if ("${P}" == "I")	set TABLE = MST_SIM_ITM_ORDER ;
&&load ${OUT_DIR}/order.dat ${TABLE} (
	${SIM_INS}
	WG_CD			= '${WG_CD}',
	ITM_ORD_NO		= :1,
	ITM_ORD_TYP		= :2,
	ORD_GNRT_TYP   	= '${ORD_GNRT_TYP}',
	ITM_CD			= :3,
	ITM_SUB1		= :4,
	ITM_SUB2		= :5,
	ITM_SUB3		= :6,
	VER_NO			= :7,
	STRG_LOC_CD		= :8,
	MFG_LOC_CD		= :9,
	MST_MFG_LOC_CD	= :10,
	SPPL_CD			= :11,
	MAKER_CD		= :12,
	RQST_LOC_CD		= :13,
	RQST_WG_CD		= :14,
	BOM_PTN			= :15,
	OPER_PTN		= :16,
	INST_QTY		= :17,
	NOT_INST_QTY	= :17,
	YIELD_SCHD_QTY	= :18,
	NMR_QTY			= :19,
	DNM_QTY			= :20,
	FXD_YIELD_QTY	= :21,
	ITM_ORD_STS_TYP	= :22,
	PO_SCHD_DT		= :23,
	MRP_PO_SCHD_DT	= :23, 
	MRP_PURC_LT		= :24,
	PURC_LT			= :24,
	MFG_ST_SCHD_DT	= :25,
	MRP_MFG_ST_SCHD_DT	= :25,
	MFG_END_SCHD_DT		= :26,
	MRP_MFG_END_SCHD_DT	= :26,
	MRP_MFG_LT		= :27,
	MFG_LT			= :27,
	GI_SCHD_DT		= :28,
	MRP_GI_SCHD_DT	= :28,
	STRG_SCHD_DT	= :29,
	MRP_STRG_SCHD_DT	= :29,
	XFR_LT			= :30,
	ACCPT_SCHD_DT	= :31,
	MRP_ACCPT_SCHD_DT = :31,
	ACCPT_INSP_LT	= :32,
	INSP_ST_SCHD_DT	= :33,
	MRP_INSP_ST_SCHD_DT	= :33,
	INSP_END_SCHD_DT	= :34,
	MRP_INSP_END_SCHD_DT	= :34,
	INSP_LT			= :35,
	INSP_OFFST		= :36,
	MRP_AVL_SCHD_DT	= :37,
	AVL_SCHD_DT		= :37,
	MASTER_DT		= :38,
	SNO1			= :39,
	SNO_TYP1		= :40,
	SNO2			= :41,
	SNO_TYP2		= :42,
	SNO3			= :43,
	SNO_TYP3		= :44,
	SNO4			= :45,
	SNO_TYP4		= :46,
	NOT_FIX_FLG		= :47,
	ORD_FIX_PD		= :48,
	RQMT_NO			= :49,
	IO_SCHD_PR_NO	= :1
	) ;

ECHO KORDER.DAT ;
set TABLE = MST_OPER_ORDER ;
if ("${P}" == "P") set TABLE = MST_PRCD_OPER_ORDER ;
if ("${P}" == "I") set TABLE = MST_SIM_OPER_ORDER ;
&&load ${OUT_DIR}/korder.dat ${TABLE} (
	${SIM_INS}
	WG_CD		= '${WG_CD}',
	OPER_ORD_NO		= :1,
	OPER_ORD_STS_TYP	= :2,
	ITM_ORD_STS_TYP	= '1',
	ITM_ORD_NO		= :3,
	LOC_CD			= :4,
	OPER_SCHD_QTY	= :5,
	NOT_OPER_SCHD_QTY	= :5,
	ST_SCHD_TM		= :6,
	END_SCHD_TM		= :7,
	OPER_LT			= :8,
	OPER_OFFST_TYP	= :9,
	OPER_OFFST		= :10,
	OPER_PTN		= :11,
	OPER_CD			= :12,
	OPER_SEQ		= :13,
	DISP_SEQ		= :14,
	YIELD_OPER_FLG	= :15
	) ;

ECHO MRPSHOYO.DAT ;
set TABLE = MST_MRPRQMT ;
if ("${P}" == "P")	set TABLE = MST_PRCD_MRPRQMT ;
if ("${P}" == "I")	set TABLE = MST_SIM_MRPRQMT ;
&&load ${OUT_DIR}/mrpshoyo.dat ${TABLE} (
	${SIM_INS}
	WG_CD		= '${WG_CD}',
	RQMT_NO			= :1,
	MRP_RQMT_TYP	= :2,
	ITM_ORD_NO		= :3,
	OPER_ORD_NO		= :4,
	IO_SCHD_NO		= :6,
	IO_SCHD_TYP		= :7,
	IO_SCHD_STS_TYP	= :8,
	ITM_CD			= :9,
	ITM_SUB1		= :10,
	ITM_SUB2		= :11,
	ITM_SUB3		= :12,
	VER_NO			= :13,
	LOC_CD			= :14,
	DUE_DT			= dbuToDate(:15),
	NET_RQMT_QTY	= :16,
	ALT_GRP_CD		= :18,
	ALT_GRP_SEQ		= :19,
	ALT_ITM_TYP		= :20,
	ALT_ITM_RATIO	= :21,
	ALT_ALLOC_PRIO	= :22,
	OPER_PTN		= :23,
	OPER_CD			= :24,
	OPER_SEQ		= :25,
	SNO1			= :26,
	SNO_TYP1		= :27,
	SNO2			= :28,
	SNO_TYP2		= :29,
	SNO3			= :30,
	SNO_TYP3		= :31,
	SNO4			= :32,
	SNO_TYP4		= :33,
	INPT_CTL_TYP	= :34,
	MRP_PROC_TYP	= :35,
	LOC_LMT_FLG		= :36
	) ;

ECHO HIKIATEY.DAT ;
set TABLE = MST_ALLOC_PLN ;
if ("${P}" == "P")	set TABLE = MST_PRCD_ALLOC_PLN ;
if ("${P}" == "I")	set TABLE = MST_SIM_ALLOC_PLN ;
&&load ${OUT_DIR}/hikiatey.dat ${TABLE} (
	${SIM_INS}
	WG_CD		= '${WG_CD}',
	RQMT_NO 		= :1,
	ITM_CD			= :2,
	ITM_SUB1		= :3,
	ITM_SUB2		= :4,
	ITM_SUB3		= :5,
	VER_NO			= :6,
	LOT_NO			= :7,
	SUBLOT_NO		= :8,
	LOC_CD			= :9,
	IO_SCHD_PR_NO	= :10,
	SCHD_ALLOC_QTY	= :11,
	GI_SCHD_DT		= dbuToDate(:12),
	SNO1			= :13,
	SNO2			= :14,
	SNO3			= :15,
	SNO4			= :16,
	ALLOC_AVL_DT	= dbuToDate(:17),
	AVL_QTY			= :18,
	LMT_DT			= :19
	) ;

//ECHO JUNJO.DAT ;
//set TABLE = MST_ITM_LNK ;
//if ("${P}" == "P") set TABLE = MST_PRCD_ITM_LNK ;
//if ("${P}" == "I") set TABLE = MST_SIM_ITM_LNK ;
//&&load ${OUT_DIR}/junjo.dat ${TABLE} (
//	${SIM_INS}
//	WG_CD			= '${WG_CD}',
//	ITM_ORD_NO		= :1,
//	PAR_ITM_ORD_NO	= :2,
//	PAR_OPER_ORD_NO	= :3,
//	OPER_PTN		= :4,
//	OPER_CD			= :5,
//	OPER_SEQ		= :6
//	) ;

if ("${P}" == "") {
ECHO JUNJO.DAT ;
&&load ${OUT_DIR}/junjo.dat MST_ITM_LNK (
	${SIM_INS}
	WG_CD			= '${WG_CD}',
	ITM_ORD_NO		= :1,
	PAR_ITM_ORD_NO	= :2,
	PAR_OPER_ORD_NO	= :3,
	OPER_PTN		= dbuNvl(:4, '${MRPEA_NULL_VAL}'),
	OPER_CD			= :5,
	OPER_SEQ		= :6
	) ;
}

ECHO NYUKOY.DAT ;
set TABLE = MST_ORD_IO_SCHD ;
if ("${P}" == "P") set TABLE = MST_PRCD_IO_SCHD ;
if ("${P}" == "I") set TABLE = MST_SIM_IO_SCHD ;
&&load ${OUT_DIR}/nyukoy.dat ${TABLE} (
	${SIM_INS}
	WG_CD			= '${WG_CD}',
	ORG_WG_CD		= '${WG_CD}',
	SLIP_SCHD_NO	= :1,
	IO_SCHD_TYP		= :2,
	IO_TYP			= @{${IO_GR} },
	IO_SCHD_STS_TYP	= :3,
	IO_SCHD_NO		= :4,
	IO_SCHD_SEQ		= null,
	IO_SCHD_SUB_TYP1	= @{${IO_SCHD_SUB} },
	IO_SCHD_SUB_NO1	= :5,
	IO_SCHD_SUB_SEQ1	= null,
	IO_SCHD_SUB_TYP2	= null,
	IO_SCHD_SUB_NO2		= null,
	IO_SCHD_SUB_SEQ2	= null,
	IO_SCHD_SUB_TYP3	= null,
	IO_SCHD_SUB_NO3		= null,
	IO_SCHD_SUB_SEQ3	= null,
	IO_SCHD_SUB_TYP4	= null,
	IO_SCHD_SUB_NO4		= null,
	IO_SCHD_SUB_SEQ4	= null,
	IO_SCHD_PR_NO	= :6,
	SCHD_DT			= dbuToDate(:7),
	ACCPT_SCHD_DT	= dbuToDate(:8),
	AVL_SCHD_DT		= dbuToDate(:9),
	ITM_CD			= :10,
	ITM_SUB1		= :11,
	ITM_SUB2		= :12,
	ITM_SUB3		= :13,
	VER_NO			= :14,
	ALT_GRP_CD		= null,
	ALT_GRP_SEQ		= null,
	OPER_INST_NO	= null,
	OPER_ORD_NO		= null,
	ALT_QTY			= null,
	ALT_ITM_TYP		= null,
	ALT_ITM_RATIO	= null,
	ALT_ALLOC_PRIO	= null,
	LOC_CD			= :15,
	STR_LN_CD		= '${MRPEA_NULL_VAL}',
	STK_ARRV_BP_CD	= :16,
	SPPL_CD			= :17,
	LOT_NO			= :18,
	SUBLOT_NO		= :19,
	SNO1			= :20,
	SNO1_NULL_FLG	= '0',
	SNO2			= :21,
	SNO2_NULL_FLG	= '0',
	SNO3			= :22,
	SNO3_NULL_FLG	= '0',
	SNO4			= :23,
	SNO4_NULL_FLG	= '0',
	PACK_UNIT_CD	= :25,
	PACK_UNIT_QTY	= :26,
	BASE_UNIT_CD	= :25,
	BASE_UNIT_QTY	= :26,
	GD_CD			= dbuNvl(:24, '${MRPEA_STDGD}'),
	IN_XFR_TYP		= @{${IN_XFR_LOC} },
	QUALITY_TYP		= @{${QUALITY_GOOD} },
	ASST_TYP		= :27,
	STK_INSP_TYP	= @{${STK_INSP_FIN} },
	STK_ID_TYP		= @{${STK_ID_COSTK} },
	STK_BP_CD		= '${MRPEA_NULL_VAL}',
	ALLOC_TGT_FLG	= '0',
	ALLOC_FLG		= '0',
	VLD_DT_FR		= null,
	VLD_DT_TO		= null,
	INPT_CTL_TYP	= null,
	GI_LOC_CD		= :28,
	GR_LOC_CD		= :15
	) ;

ECHO SHUKKOY.DAT ;
set TABLE = MST_ORD_IO_SCHD ;
if ("${P}" == "P") set TABLE = MST_PRCD_IO_SCHD ;
if ("${P}" == "I") set TABLE = MST_SIM_IO_SCHD ;
&&load ${OUT_DIR}/shukkoy.dat ${TABLE} (
	${SIM_INS}
	WG_CD			= dbuNvl(:39, '${WG_CD}'),
	ORG_WG_CD		= '${WG_CD}',
	SLIP_SCHD_NO	= :1,
	IO_SCHD_TYP		= :2,
	IO_TYP			= @{${IO_GI} },
	IO_SCHD_STS_TYP	= :3,
	IO_SCHD_NO		= :4,
	IO_SCHD_SEQ		= null,
	IO_SCHD_SUB_TYP1	= @{${IO_SCHD_SUB} },
	IO_SCHD_SUB_NO1	= :5,
	IO_SCHD_SUB_SEQ1	= null,
	IO_SCHD_SUB_TYP2	= dbuNvl2(:6,'02',NULL),
	IO_SCHD_SUB_NO2	= :6,
	IO_SCHD_SUB_SEQ2	= null,
	IO_SCHD_SUB_TYP3	= null,
	IO_SCHD_SUB_NO3		= null,
	IO_SCHD_SUB_SEQ3	= null,
	IO_SCHD_SUB_TYP4	= null,
	IO_SCHD_SUB_NO4		= null,
	IO_SCHD_SUB_SEQ4	= null,
	IO_SCHD_PR_NO	= :7,
	SCHD_DT			= dbuToDate(:8),
	ACCPT_SCHD_DT	= null,
	AVL_SCHD_DT		= null,
	ITM_CD			= :9,
	ITM_SUB1		= :10,
	ITM_SUB2		= :11,
	ITM_SUB3		= :12,
	VER_NO			= :13,
	ALT_GRP_CD		= :14,
	ALT_GRP_SEQ		= :15,
	OPER_ORD_NO		= :16,
	OPER_INST_NO	= :17,
	ALT_QTY			= :18,
	ALT_ITM_TYP		= :19,
	ALT_ITM_RATIO	= :20,
	ALT_ALLOC_PRIO	= :21,
	LOC_CD			= :22,
	STR_LN_CD		= '${MRPEA_NULL_VAL}',
	STK_ARRV_BP_CD	= '${MRPEA_NULL_VAL}',
	SPPL_CD			= null,
	LOT_NO			= :23,
	SUBLOT_NO		= :24,
	SNO1			= :25,
	SNO1_NULL_FLG	= :26,
	SNO2			= :27,
	SNO2_NULL_FLG	= :28,
	SNO3			= :29,
	SNO3_NULL_FLG	= :30,
	SNO4			= :31,
	SNO4_NULL_FLG	= :32,
	EX_SNO1			= :33,
	EX_SNO2			= :34,
	EX_SNO3			= :35,
	EX_SNO4			= :36,
	PACK_UNIT_CD	= :37,
	PACK_UNIT_QTY	= :38,
	BASE_UNIT_CD	= :37,
	BASE_UNIT_QTY	= :38,
	GD_CD			= '${MRPEA_STDGD}',
	IN_XFR_TYP		= @{${IN_XFR_LOC} },
	QUALITY_TYP		= @{${QUALITY_GOOD} },
	ASST_TYP		= :40,
	STK_INSP_TYP	= @{${STK_INSP_FIN} },
	STK_ID_TYP		= @{${STK_ID_COSTK} },
	STK_BP_CD		= '${MRPEA_NULL_VAL}',
	ALLOC_TGT_FLG	= '0',
	ALLOC_FLG		= '0',
	VLD_DT_FR		= null,
	VLD_DT_TO		= null,
	INPT_CTL_TYP	= :41,
	GI_LOC_CD		= :22,
	GR_LOC_CD		= :42
	) ;

ECHO MRPLOG.DAT ;
&&load ${OUT_DIR}/mrplog.dat (4:1000) MST_MRP_LOG (
	WG_CD		= '${WG_CD}',
	MRP_TYP		= '${PROC_TYP}',
	MRP_CALC_NO	= '${PROC_CNT}',
	SEQ_NO		= :1,
	LOG_TIME	= :2,
	MSG_ID		= :3,
	MSG			= :4,
	GP_BATCH_GRP_CD	= '${BATCH_GRP_CD}'
	) ;

ECHO MYLOTC.DAT ;
&&load ${OUT_DIR}/mylotc.dat
	UPDATE MST_MRP_CNTR
	SET	CNTR		= TO_NUMBER(:2,'9999999999999')
	WHERE	WG_CD	= '${WG_CD}'
	AND	MRP_CNTR_TYP	= :1
	;

if ("${IS_MULTI}" == "1") {
	COMMIT_ALL ;
}

ECHO DATA UPLOAD END ;

// =====  POST-PROCESS  =====
ECHO POST-PROCESS START ;

set rc = 1 ;
if ("${DATABASE}" == "Oracle") {
begin MSPA_MRPEA.P_MRPEA3('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ; end ;
}
if ("${DATABASE}" == "PostgreSQL") {
call mspa_mrpea$p_mrpea3('${WG_CD}', '${PROC_TYP}', '${PROC_CNT}', '${SIM_MRP_NO}', '${SIM_TYP}', :rc) ;
}
if ("${rc}" != "0") {
	ECHO ERROR in MSPA_MRPEA.P_MRPEA3 SQLCODE = "${rc}" ;
	exit 1;
}

ECHO POST-PROCESS END ;

COMMIT ;

ECHO MRPea COMPLETE ;
