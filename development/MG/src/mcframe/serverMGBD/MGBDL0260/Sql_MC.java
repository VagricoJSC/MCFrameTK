// FMSQ LOGIC_MAIN
package mcframe.serverMGBD.MGBDL0260;

/*
 * @(#)Sql_MC.java Mon Nov 09 19:19:07 JST 2020<p>
 * SQL Resource Class<p>
 */

public class Sql_MC {

	/**
	 * <PRE>
	 * -- MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Ora
	 * SELECT
	 * 	(LEVEL-1) HRRCHY,
	 * 	TO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,
	 * 	T.YM,
	 * 	T.INPT_ALC_TYP,
	 * 	T.WG_CD,
	 * 	DAC.WG_NM,
	 * 	T.ALC_AC_CD,
	 * 	ALC_AC.ALC_AC_NM,
	 * 	T.DPT_CD,
	 * 	DPT.DPT_NM,
	 * 	T.LOC_CD,
	 * 	LOC.LOC_NM,
	 * 	T.OPER_CD,
	 * 	OPER.OPER_NM,
	 * 	T.BP_CD,
	 * 	BP.BP_NM,
	 * 	T.CTG_CD,
	 * 	CTG.CTG_NM,
	 * 	T.ITM_CD,
	 * 	T.ITM_SUB1,
	 * 	T.ITM_SUB2,
	 * 	T.ITM_SUB3,
	 * 	NVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM) ITM_NM,
	 * 	ITM.ITM_TYP,
	 * 	ITM.ITM_TYP_D_CD,
	 * 	ITM_TYP_D.ITM_TYP_D_NM,
	 * 	T.LOT_NO,
	 * 	T.SUBLOT_NO,
	 * 	T.SNO1,
	 * 	T.SNO2,
	 * 	T.SNO3,
	 * 	T.SNO4,
	 * 	T.ITM_MFG_INST_NO,
	 * 	T.IV_NO,
	 * 	T.PO_NO,
	 * 	T.SLO_NO,
	 * 	T.AMT,
	 * 	T.PRE_ALC_RATE,
	 * 	T.PRE_ALC_TOTAL,
	 * 	T.PRE_ALC_CALC_RATE,
	 * 	T.PRE_ALC_RATE_CD,
	 * 	PRE_ALC_RATE.PRE_ALC_RATE_NM,
	 * 	T.SRC_WG_CD,
	 * 	SRC_DAC.WG_NM SRC_WG_NM,
	 * 	T.PRE_ALC_SEQ,
	 * 	T.SRC_PRE_ALC_SEQ,
	 * 	T.TOP_PRE_ALC_SEQ
	 * FROM
	 * 	MGT_PRE_ALC_PATH_$S T,
	 * 	MAVM_RD_WG DAC,
	 * 	MAM_ALC_AC_$S ALC_AC,
	 * 	MAM_ALC_AC_GRP_$S ALC_AC_GRP1,
	 * 	MAM_ALC_AC_GRP_$S ALC_AC_GRP2,
	 * 	MAM_ALC_AC_GRP_$S ALC_AC_GRP3,
	 * 	MAM_TERM_$S TERM,
	 * 	MAM_COST_DPT_$S DPT,
	 * 	MAM_LOC_$S LOC,
	 * 	MAM_OPER_$S OPER,
	 * 	MAM_BP_$S BP,
	 * 	MAM_COST_CTG_$S CTG,
	 * 	MAM_ITM_$S ITM,
	 * 	MAM_SUNDRY_ITM_$S SUNDRY_ITM,
	 * 	MAM_ITM_TYP_D_$S ITM_TYP_D,
	 * 	MAM_PRE_ALC_RATE_$S PRE_ALC_RATE,
	 * 	MAVM_RD_WG SRC_DAC
	 * WHERE
	 * 	0=0
	 * 	AND T.WG_CD = DAC.WG_CD
	 * 	AND T.SRC_WG_CD = SRC_DAC.WG_CD
	 * 	AND T.ALC_AC_CD = ALC_AC.ALC_AC_CD(+)
	 * 	AND MAC_ALC_AC_GRP_TYP.GRP1 = ALC_AC_GRP1.ALC_AC_GRP_TYP(+)
	 * 	AND ALC_AC.ALC_AC_GRP_CD1 = ALC_AC_GRP1.ALC_AC_GRP_CD(+)
	 * 	AND MAC_ALC_AC_GRP_TYP.GRP2 = ALC_AC_GRP2.ALC_AC_GRP_TYP(+)
	 * 	AND ALC_AC.ALC_AC_GRP_CD2 = ALC_AC_GRP2.ALC_AC_GRP_CD(+)
	 * 	AND MAC_ALC_AC_GRP_TYP.GRP3 = ALC_AC_GRP3.ALC_AC_GRP_TYP(+)
	 * 	AND ALC_AC.ALC_AC_GRP_CD3 = ALC_AC_GRP3.ALC_AC_GRP_CD(+)
	 * 	AND T.YM &gt;= TERM.TERM
	 * 	AND T.YM &lt; TERM.TERM_END_YM
	 * 	AND T.DPT_CD = DPT.DPT_CD(+)
	 * 	AND TERM.TERM = DPT.TERM(+)
	 * 	AND T.LOC_CD = LOC.LOC_CD(+)
	 * 	AND T.OPER_CD = OPER.OPER_CD(+)
	 * 	AND T.BP_CD = BP.BP_CD(+)
	 * 	AND T.CTG_CD = CTG.CTG_CD(+)
	 * 	AND T.ITM_CD = ITM.ITM_CD(+)
	 * 	AND T.ITM_SUB1 = ITM.ITM_SUB1(+)
	 * 	AND T.ITM_SUB2 = ITM.ITM_SUB2(+)
	 * 	AND T.ITM_SUB3 = ITM.ITM_SUB3(+)
	 * 	AND T.ITM_CD = SUNDRY_ITM.ITM_CD(+)
	 * 	AND T.ITM_SUB1 = SUNDRY_ITM.ITM_SUB1(+)
	 * 	AND T.ITM_SUB2 = SUNDRY_ITM.ITM_SUB2(+)
	 * 	AND T.ITM_SUB3 = SUNDRY_ITM.ITM_SUB3(+)
	 * 	AND T.SNO1 = SUNDRY_ITM.SNO1(+)
	 * 	AND T.SNO2 = SUNDRY_ITM.SNO2(+)
	 * 	AND T.SNO3 = SUNDRY_ITM.SNO3(+)
	 * 	AND T.SNO4 = SUNDRY_ITM.SNO4(+)
	 * 	AND ITM.ITM_TYP = ITM_TYP_D.ITM_TYP(+)
	 * 	AND ITM.ITM_TYP_D_CD = ITM_TYP_D.ITM_TYP_D_CD(+)
	 * 	AND T.PRE_ALC_RATE_CD = PRE_ALC_RATE.PRE_ALC_RATE_CD(+)
	 * START WITH
	 * 	0=0
	 * 	AND T.CALC_NO = :CALC_NO
	 * 	AND T.CALC_GRP_CD = :CALC_GRP_CD
	 * 	AND T.PRE_ALC_LVL = 0
	 * [	AND T.WG_CD LIKE :WG_CD]
	 * [	AND DAC.WG_NM LIKE :WG_NM]
	 * [	AND T.YM &gt;= :YM_FR]
	 * [	AND T.YM &lt;= :YM_TO]
	 * [	AND T.INPT_ALC_TYP LIKE :INPT_ALC_TYP]
	 * [	AND T.ALC_AC_CD LIKE :ALC_AC_CD]
	 * [	AND ALC_AC.ALC_AC_NM LIKE :ALC_AC_NM]
	 * [	AND T.PRE_ALC_SEQ = :PRE_ALC_SEQ]
	 * [	AND ALC_AC.ALC_AC_GRP_CD1 LIKE :ALC_AC_GRP_CD1]
	 * [	AND ALC_AC_GRP1.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM1]
	 * [	AND ALC_AC.ALC_AC_GRP_CD2 LIKE :ALC_AC_GRP_CD2]
	 * [	AND ALC_AC_GRP2.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM2]
	 * [	AND ALC_AC.ALC_AC_GRP_CD3 LIKE :ALC_AC_GRP_CD3]
	 * [	AND ALC_AC_GRP3.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM3]
	 * [	AND T.DPT_CD LIKE :DPT_CD]
	 * [	AND DPT.DPT_NM LIKE :DPT_NM]
	 * [	AND T.LOC_CD LIKE :LOC_CD]
	 * [	AND LOC.LOC_NM LIKE :LOC_NM]
	 * [	AND T.OPER_CD LIKE :OPER_CD]
	 * [	AND OPER.OPER_NM LIKE :OPER_NM]
	 * [	AND T.BP_CD LIKE :BP_CD]
	 * [	AND BP.BP_NM LIKE :BP_NM]
	 * [	AND T.CTG_CD LIKE :CTG_CD]
	 * [	AND CTG.CTG_NM LIKE :CTG_NM]
	 * [	AND ITM.ITM_TYP LIKE :ITM_TYP]
	 * [	AND ITM.ITM_TYP_D_CD LIKE :ITM_TYP_D_CD]
	 * [	AND ITM_TYP_D.ITM_TYP_D_NM LIKE :ITM_TYP_D_NM]
	 * [	AND T.ITM_CD LIKE :ITM_CD]
	 * [	AND T.ITM_SUB1 LIKE :ITM_SUB1]
	 * [	AND T.ITM_SUB2 LIKE :ITM_SUB2]
	 * [	AND T.ITM_SUB3 LIKE :ITM_SUB3]
	 * [	AND NVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM) LIKE :ITM_NM]
	 * [	AND T.LOT_NO LIKE :LOT_NO]
	 * [	AND T.SUBLOT_NO LIKE :SUBLOT_NO]
	 * [	AND T.SNO1 LIKE :SNO1]
	 * [	AND T.SNO2 LIKE :SNO2]
	 * [	AND T.SNO3 LIKE :SNO3]
	 * [	AND T.SNO4 LIKE :SNO4]
	 * [	AND T.ITM_MFG_INST_NO LIKE :ITM_MFG_INST_NO]
	 * [	AND T.IV_NO LIKE :IV_NO]
	 * [	AND T.PO_NO LIKE :PO_NO]
	 * [	AND T.SLO_NO LIKE :SLO_NO]
	 * CONNECT BY NOCYCLE 0=0
	 * 	AND T.CALC_NO = PRIOR T.CALC_NO
	 * 	AND T.CALC_GRP_CD = PRIOR T.CALC_GRP_CD
	 * 	AND T.SRC_PRE_ALC_SEQ = PRIOR T.PRE_ALC_SEQ
	 * [	AND :LVL0_FLG_STR = 0]
	 * ORDER SIBLINGS BY
	 * 	T.YM,
	 * 	T.INPT_ALC_TYP,
	 * 	T.WG_CD,
	 * 	T.ALC_AC_CD,
	 * 	T.DPT_CD,
	 * 	T.TOP_PRE_ALC_SEQ
	 * </PRE>
	 *
	 * @ID MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Ora 
	 * @since 2020/11/09 19:19:07
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Ora =
		"-- MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Ora\n" +
		"SELECT\n" +
		"\t(LEVEL-1) HRRCHY,\n" +
		"\tTO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,\n" +
		"\tT.YM,\n" +
		"\tT.INPT_ALC_TYP,\n" +
		"\tT.WG_CD,\n" +
		"\tDAC.WG_NM,\n" +
		"\tT.ALC_AC_CD,\n" +
		"\tALC_AC.ALC_AC_NM,\n" +
		"\tT.DPT_CD,\n" +
		"\tDPT.DPT_NM,\n" +
		"\tT.LOC_CD,\n" +
		"\tLOC.LOC_NM,\n" +
		"\tT.OPER_CD,\n" +
		"\tOPER.OPER_NM,\n" +
		"\tT.BP_CD,\n" +
		"\tBP.BP_NM,\n" +
		"\tT.CTG_CD,\n" +
		"\tCTG.CTG_NM,\n" +
		"\tT.ITM_CD,\n" +
		"\tT.ITM_SUB1,\n" +
		"\tT.ITM_SUB2,\n" +
		"\tT.ITM_SUB3,\n" +
		"\tNVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM) ITM_NM,\n" +
		"\tITM.ITM_TYP,\n" +
		"\tITM.ITM_TYP_D_CD,\n" +
		"\tITM_TYP_D.ITM_TYP_D_NM,\n" +
		"\tT.LOT_NO,\n" +
		"\tT.SUBLOT_NO,\n" +
		"\tT.SNO1,\n" +
		"\tT.SNO2,\n" +
		"\tT.SNO3,\n" +
		"\tT.SNO4,\n" +
		"\tT.ITM_MFG_INST_NO,\n" +
		"\tT.IV_NO,\n" +
		"\tT.PO_NO,\n" +
		"\tT.SLO_NO,\n" +
		"\tT.AMT,\n" +
		"\tT.PRE_ALC_RATE,\n" +
		"\tT.PRE_ALC_TOTAL,\n" +
		"\tT.PRE_ALC_CALC_RATE,\n" +
		"\tT.PRE_ALC_RATE_CD,\n" +
		"\tPRE_ALC_RATE.PRE_ALC_RATE_NM,\n" +
		"\tT.SRC_WG_CD,\n" +
		"\tSRC_DAC.WG_NM SRC_WG_NM,\n" +
		"\tT.PRE_ALC_SEQ,\n" +
		"\tT.SRC_PRE_ALC_SEQ,\n" +
		"\tT.TOP_PRE_ALC_SEQ\n" +
		"FROM\n" +
		"\tMGT_PRE_ALC_PATH_$S T,\n" +
		"\tMAVM_RD_WG DAC,\n" +
		"\tMAM_ALC_AC_$S ALC_AC,\n" +
		"\tMAM_ALC_AC_GRP_$S ALC_AC_GRP1,\n" +
		"\tMAM_ALC_AC_GRP_$S ALC_AC_GRP2,\n" +
		"\tMAM_ALC_AC_GRP_$S ALC_AC_GRP3,\n" +
		"\tMAM_TERM_$S TERM,\n" +
		"\tMAM_COST_DPT_$S DPT,\n" +
		"\tMAM_LOC_$S LOC,\n" +
		"\tMAM_OPER_$S OPER,\n" +
		"\tMAM_BP_$S BP,\n" +
		"\tMAM_COST_CTG_$S CTG,\n" +
		"\tMAM_ITM_$S ITM,\n" +
		"\tMAM_SUNDRY_ITM_$S SUNDRY_ITM,\n" +
		"\tMAM_ITM_TYP_D_$S ITM_TYP_D,\n" +
		"\tMAM_PRE_ALC_RATE_$S PRE_ALC_RATE,\n" +
		"\tMAVM_RD_WG SRC_DAC\n" +
		"WHERE\n" +
		"\t0=0\n" +
		"\tAND T.WG_CD = DAC.WG_CD\n" +
		"\tAND T.SRC_WG_CD = SRC_DAC.WG_CD\n" +
		"\tAND T.ALC_AC_CD = ALC_AC.ALC_AC_CD(+)\n" +
		"\tAND MAC_ALC_AC_GRP_TYP.GRP1 = ALC_AC_GRP1.ALC_AC_GRP_TYP(+)\n" +
		"\tAND ALC_AC.ALC_AC_GRP_CD1 = ALC_AC_GRP1.ALC_AC_GRP_CD(+)\n" +
		"\tAND MAC_ALC_AC_GRP_TYP.GRP2 = ALC_AC_GRP2.ALC_AC_GRP_TYP(+)\n" +
		"\tAND ALC_AC.ALC_AC_GRP_CD2 = ALC_AC_GRP2.ALC_AC_GRP_CD(+)\n" +
		"\tAND MAC_ALC_AC_GRP_TYP.GRP3 = ALC_AC_GRP3.ALC_AC_GRP_TYP(+)\n" +
		"\tAND ALC_AC.ALC_AC_GRP_CD3 = ALC_AC_GRP3.ALC_AC_GRP_CD(+)\n" +
		"\tAND T.YM >= TERM.TERM\n" +
		"\tAND T.YM < TERM.TERM_END_YM\n" +
		"\tAND T.DPT_CD = DPT.DPT_CD(+)\n" +
		"\tAND TERM.TERM = DPT.TERM(+)\n" +
		"\tAND T.LOC_CD = LOC.LOC_CD(+)\n" +
		"\tAND T.OPER_CD = OPER.OPER_CD(+)\n" +
		"\tAND T.BP_CD = BP.BP_CD(+)\n" +
		"\tAND T.CTG_CD = CTG.CTG_CD(+)\n" +
		"\tAND T.ITM_CD = ITM.ITM_CD(+)\n" +
		"\tAND T.ITM_SUB1 = ITM.ITM_SUB1(+)\n" +
		"\tAND T.ITM_SUB2 = ITM.ITM_SUB2(+)\n" +
		"\tAND T.ITM_SUB3 = ITM.ITM_SUB3(+)\n" +
		"\tAND T.ITM_CD = SUNDRY_ITM.ITM_CD(+)\n" +
		"\tAND T.ITM_SUB1 = SUNDRY_ITM.ITM_SUB1(+)\n" +
		"\tAND T.ITM_SUB2 = SUNDRY_ITM.ITM_SUB2(+)\n" +
		"\tAND T.ITM_SUB3 = SUNDRY_ITM.ITM_SUB3(+)\n" +
		"\tAND T.SNO1 = SUNDRY_ITM.SNO1(+)\n" +
		"\tAND T.SNO2 = SUNDRY_ITM.SNO2(+)\n" +
		"\tAND T.SNO3 = SUNDRY_ITM.SNO3(+)\n" +
		"\tAND T.SNO4 = SUNDRY_ITM.SNO4(+)\n" +
		"\tAND ITM.ITM_TYP = ITM_TYP_D.ITM_TYP(+)\n" +
		"\tAND ITM.ITM_TYP_D_CD = ITM_TYP_D.ITM_TYP_D_CD(+)\n" +
		"\tAND T.PRE_ALC_RATE_CD = PRE_ALC_RATE.PRE_ALC_RATE_CD(+)\n" +
		"START WITH\n" +
		"\t0=0\n" +
		"\tAND T.CALC_NO = :CALC_NO\n" +
		"\tAND T.CALC_GRP_CD = :CALC_GRP_CD\n" +
		"\tAND T.PRE_ALC_LVL = 0\n" +
		"[\tAND T.WG_CD LIKE :WG_CD]\n" +
		"[\tAND DAC.WG_NM LIKE :WG_NM]\n" +
		"[\tAND T.YM >= :YM_FR]\n" +
		"[\tAND T.YM <= :YM_TO]\n" +
		"[\tAND T.INPT_ALC_TYP LIKE :INPT_ALC_TYP]\n" +
		"[\tAND T.ALC_AC_CD LIKE :ALC_AC_CD]\n" +
		"[\tAND ALC_AC.ALC_AC_NM LIKE :ALC_AC_NM]\n" +
		"[\tAND T.PRE_ALC_SEQ = :PRE_ALC_SEQ]\n" +
		"[\tAND ALC_AC.ALC_AC_GRP_CD1 LIKE :ALC_AC_GRP_CD1]\n" +
		"[\tAND ALC_AC_GRP1.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM1]\n" +
		"[\tAND ALC_AC.ALC_AC_GRP_CD2 LIKE :ALC_AC_GRP_CD2]\n" +
		"[\tAND ALC_AC_GRP2.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM2]\n" +
		"[\tAND ALC_AC.ALC_AC_GRP_CD3 LIKE :ALC_AC_GRP_CD3]\n" +
		"[\tAND ALC_AC_GRP3.ALC_AC_GRP_NM LIKE :ALC_AC_GRP_NM3]\n" +
		"[\tAND T.DPT_CD LIKE :DPT_CD]\n" +
		"[\tAND DPT.DPT_NM LIKE :DPT_NM]\n" +
		"[\tAND T.LOC_CD LIKE :LOC_CD]\n" +
		"[\tAND LOC.LOC_NM LIKE :LOC_NM]\n" +
		"[\tAND T.OPER_CD LIKE :OPER_CD]\n" +
		"[\tAND OPER.OPER_NM LIKE :OPER_NM]\n" +
		"[\tAND T.BP_CD LIKE :BP_CD]\n" +
		"[\tAND BP.BP_NM LIKE :BP_NM]\n" +
		"[\tAND T.CTG_CD LIKE :CTG_CD]\n" +
		"[\tAND CTG.CTG_NM LIKE :CTG_NM]\n" +
		"[\tAND ITM.ITM_TYP LIKE :ITM_TYP]\n" +
		"[\tAND ITM.ITM_TYP_D_CD LIKE :ITM_TYP_D_CD]\n" +
		"[\tAND ITM_TYP_D.ITM_TYP_D_NM LIKE :ITM_TYP_D_NM]\n" +
		"[\tAND T.ITM_CD LIKE :ITM_CD]\n" +
		"[\tAND T.ITM_SUB1 LIKE :ITM_SUB1]\n" +
		"[\tAND T.ITM_SUB2 LIKE :ITM_SUB2]\n" +
		"[\tAND T.ITM_SUB3 LIKE :ITM_SUB3]\n" +
		"[\tAND NVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM) LIKE :ITM_NM]\n" +
		"[\tAND T.LOT_NO LIKE :LOT_NO]\n" +
		"[\tAND T.SUBLOT_NO LIKE :SUBLOT_NO]\n" +
		"[\tAND T.SNO1 LIKE :SNO1]\n" +
		"[\tAND T.SNO2 LIKE :SNO2]\n" +
		"[\tAND T.SNO3 LIKE :SNO3]\n" +
		"[\tAND T.SNO4 LIKE :SNO4]\n" +
		"[\tAND T.ITM_MFG_INST_NO LIKE :ITM_MFG_INST_NO]\n" +
		"[\tAND T.IV_NO LIKE :IV_NO]\n" +
		"[\tAND T.PO_NO LIKE :PO_NO]\n" +
		"[\tAND T.SLO_NO LIKE :SLO_NO]\n" +
		"CONNECT BY NOCYCLE 0=0\n" +
		"\tAND T.CALC_NO = PRIOR T.CALC_NO\n" +
		"\tAND T.CALC_GRP_CD = PRIOR T.CALC_GRP_CD\n" +
		"\tAND T.SRC_PRE_ALC_SEQ = PRIOR T.PRE_ALC_SEQ\n" +
		"[\tAND :LVL0_FLG_STR = 0]\n" +
		"ORDER SIBLINGS BY\n" +
		"\tT.YM,\n" +
		"\tT.INPT_ALC_TYP,\n" +
		"\tT.WG_CD,\n" +
		"\tT.ALC_AC_CD,\n" +
		"\tT.DPT_CD,\n" +
		"\tT.TOP_PRE_ALC_SEQ";
	/**
	 * <PRE>
	 * -- MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Pos
	 * WITH RECURSIVE
	 * BASE AS (
	 * 	SELECT
	 * 		T.*,
	 * 		DAC.WG_NM,
	 * 		ALC_AC.ALC_AC_NM,
	 * 		ALC_AC.ALC_AC_GRP_CD1,
	 * 		ALC_AC_GRP1.ALC_AC_GRP_NM ALC_AC_GRP_NM1,
	 * 		ALC_AC.ALC_AC_GRP_CD2,
	 * 		ALC_AC_GRP2.ALC_AC_GRP_NM ALC_AC_GRP_NM2,
	 * 		ALC_AC.ALC_AC_GRP_CD3,
	 * 		ALC_AC_GRP3.ALC_AC_GRP_NM ALC_AC_GRP_NM3,
	 * 		DPT.DPT_NM,
	 * 		LOC.LOC_NM,
	 * 		OPER.OPER_NM,
	 * 		BP.BP_NM,
	 * 		CTG.CTG_NM,
	 * 		ITM.ITM_TYP,
	 * 		ITM.ITM_TYP_D_CD,
	 * 		ITM_TYP_D.ITM_TYP_D_NM,
	 * 		SUNDRY_ITM.ITM_NM SUNDRY_ITM_NM,
	 * 		ITM.ITM_NM,
	 * 		SRC_DAC.WG_NM SRC_WG_NM,
	 * 		ROW_NUMBER() OVER(ORDER BY NULL) REC_ID,
	 * 		ROW_NUMBER() OVER(ORDER BY T.YM, T.INPT_ALC_TYP, T.WG_CD, T.ALC_AC_CD, T.DPT_CD, T.TOP_PRE_ALC_SEQ) SEARCH_ID
	 * 	FROM
	 * 		MGT_PRE_ALC_PATH_$S T
	 * 		INNER JOIN MAVM_RD_WG DAC ON (T.WG_CD = DAC.WG_CD)
	 * 		INNER JOIN MAVM_RD_WG SRC_DAC ON (T.SRC_WG_CD = SRC_DAC.WG_CD)
	 * 		LEFT OUTER JOIN MAM_ALC_AC_$S ALC_AC ON (T.ALC_AC_CD = ALC_AC.ALC_AC_CD)
	 * 		LEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP1 ON ('1' = ALC_AC_GRP1.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD1 = ALC_AC_GRP1.ALC_AC_GRP_CD)
	 * 		LEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP2 ON ('2' = ALC_AC_GRP2.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD2 = ALC_AC_GRP2.ALC_AC_GRP_CD)
	 * 		LEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP3 ON ('3' = ALC_AC_GRP3.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD3 = ALC_AC_GRP3.ALC_AC_GRP_CD)
	 * 		INNER JOIN MAM_TERM_$S TERM ON (T.YM &gt;= TERM.TERM AND T.YM &lt; TERM.TERM_END_YM)
	 * 		LEFT OUTER JOIN MAM_COST_DPT_$S DPT ON (T.DPT_CD = DPT.DPT_CD AND TERM.TERM = DPT.TERM)
	 * 		LEFT OUTER JOIN MAM_LOC_$S LOC ON (T.LOC_CD = LOC.LOC_CD)
	 * 		LEFT OUTER JOIN MAM_OPER_$S OPER ON (T.OPER_CD = OPER.OPER_CD)
	 * 		LEFT OUTER JOIN MAM_BP_$S BP ON (T.BP_CD = BP.BP_CD)
	 * 		LEFT OUTER JOIN MAM_COST_CTG_$S CTG ON (T.CTG_CD = CTG.CTG_CD)
	 * 		LEFT OUTER JOIN MAM_ITM_$S ITM ON (T.ITM_CD = ITM.ITM_CD AND T.ITM_SUB1 = ITM.ITM_SUB1 AND T.ITM_SUB2 = ITM.ITM_SUB2 AND T.ITM_SUB3 = ITM.ITM_SUB3)
	 * 		LEFT OUTER JOIN MAM_SUNDRY_ITM_$S SUNDRY_ITM ON (T.ITM_CD = SUNDRY_ITM.ITM_CD AND T.ITM_SUB1 = SUNDRY_ITM.ITM_SUB1 AND T.ITM_SUB2 = SUNDRY_ITM.ITM_SUB2 AND T.ITM_SUB3 = SUNDRY_ITM.ITM_SUB3 AND T.SNO1 = SUNDRY_ITM.SNO1 AND T.SNO2 = SUNDRY_ITM.SNO2 AND T.SNO3 = SUNDRY_ITM.SNO3 AND T.SNO4 = SUNDRY_ITM.SNO4)
	 * 		LEFT OUTER JOIN MAM_ITM_TYP_D_$S ITM_TYP_D ON (ITM.ITM_TYP = ITM_TYP_D.ITM_TYP AND ITM.ITM_TYP_D_CD = ITM_TYP_D.ITM_TYP_D_CD)
	 * ),
	 * REC AS (
	 * 	SELECT
	 * 		C.REC_ID ROOT_ID,
	 * 		CAST(NULL AS NUMERIC) PAR_ID,
	 * 		C.REC_ID,
	 * 		1 HRRCHY,
	 * 		C.CALC_NO,
	 * 		C.CALC_GRP_CD,
	 * 		C.PRE_ALC_SEQ,
	 * 		ARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,
	 * 		ARRAY(SELECT C.REC_ID) REC_ID_PATH,
	 * 		'0' CYCLE_FLG
	 * 	FROM
	 * 		BASE C
	 * 	WHERE
	 * 		0 = 0
	 * 		AND C.CALC_NO = :CALC_NO
	 * 		AND C.CALC_GRP_CD = :CALC_GRP_CD
	 * 		AND C.PRE_ALC_LVL = 0
	 * 		[AND C.WG_CD LIKE :WG_CD]
	 * 		[AND C.WG_NM LIKE :WG_NM]
	 * 		[AND C.YM &gt;= :YM_FR]
	 * 		[AND C.YM &lt;= :YM_TO]
	 * 		[AND C.INPT_ALC_TYP LIKE :INPT_ALC_TYP]
	 * 		[AND C.ALC_AC_CD LIKE :ALC_AC_CD]
	 * 		[AND C.ALC_AC_NM LIKE :ALC_AC_NM]
	 * 		[AND C.PRE_ALC_SEQ = :PRE_ALC_SEQ]
	 * 		[AND C.ALC_AC_GRP_CD1 LIKE :ALC_AC_GRP_CD1]
	 * 		[AND C.ALC_AC_GRP_NM1 LIKE :ALC_AC_GRP_NM1]
	 * 		[AND C.ALC_AC_GRP_CD2 LIKE :ALC_AC_GRP_CD2]
	 * 		[AND C.ALC_AC_GRP_NM2 LIKE :ALC_AC_GRP_NM2]
	 * 		[AND C.ALC_AC_GRP_CD3 LIKE :ALC_AC_GRP_CD3]
	 * 		[AND C.ALC_AC_GRP_NM3 LIKE :ALC_AC_GRP_NM3]
	 * 		[AND C.DPT_CD LIKE :DPT_CD]
	 * 		[AND C.DPT_NM LIKE :DPT_NM]
	 * 		[AND C.LOC_CD LIKE :LOC_CD]
	 * 		[AND C.LOC_NM LIKE :LOC_NM]
	 * 		[AND C.OPER_CD LIKE :OPER_CD]
	 * 		[AND C.OPER_NM LIKE :OPER_NM]
	 * 		[AND C.BP_CD LIKE :BP_CD]
	 * 		[AND C.BP_NM LIKE :BP_NM]
	 * 		[AND C.CTG_CD LIKE :CTG_CD]
	 * 		[AND C.CTG_NM LIKE :CTG_NM]
	 * 		[AND C.ITM_TYP LIKE :ITM_TYP]
	 * 		[AND C.ITM_TYP_D_CD LIKE :ITM_TYP_D_CD]
	 * 		[AND C.ITM_TYP_D_NM LIKE :ITM_TYP_D_NM]
	 * 		[AND C.ITM_CD LIKE :ITM_CD]
	 * 		[AND C.ITM_SUB1 LIKE :ITM_SUB1]
	 * 		[AND C.ITM_SUB2 LIKE :ITM_SUB2]
	 * 		[AND C.ITM_SUB3 LIKE :ITM_SUB3]
	 * 		[AND COALESCE(C.SUNDRY_ITM_NM, C.ITM_NM) LIKE :ITM_NM]
	 * 		[AND C.LOT_NO LIKE :LOT_NO]
	 * 		[AND C.SUBLOT_NO LIKE :SUBLOT_NO]
	 * 		[AND C.SNO1 LIKE :SNO1]
	 * 		[AND C.SNO2 LIKE :SNO2]
	 * 		[AND C.SNO3 LIKE :SNO3]
	 * 		[AND C.SNO4 LIKE :SNO4]
	 * 		[AND C.ITM_MFG_INST_NO LIKE :ITM_MFG_INST_NO]
	 * 		[AND C.IV_NO LIKE :IV_NO]
	 * 		[AND C.PO_NO LIKE :PO_NO]
	 * 		[AND C.SLO_NO LIKE :SLO_NO]
	 * 	UNION ALL (
	 * 		SELECT
	 * 			P.ROOT_ID,
	 * 			P.REC_ID PAR_ID,
	 * 			C.REC_ID,
	 * 			P.HRRCHY + 1 HRRCHY,
	 * 			C.CALC_NO,
	 * 			C.CALC_GRP_CD,
	 * 			C.PRE_ALC_SEQ,
	 * 			P.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,
	 * 			P.REC_ID_PATH || C.REC_ID REC_ID_PATH,
	 * 			CASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN BASE C ON (P.CALC_NO = C.CALC_NO AND P.CALC_GRP_CD = C.CALC_GRP_CD AND P.PRE_ALC_SEQ = C.SRC_PRE_ALC_SEQ)
	 * 		WHERE
	 * 			0 = 0
	 * 			AND P.CYCLE_FLG = '0'
	 * 			[AND :LVL0_FLG_STR = '0']
	 * 	)
	 * )
	 * SELECT
	 * 	P.HRRCHY - 1 HRRCHY,
	 * 	CASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,
	 * 	C.YM,
	 * 	C.INPT_ALC_TYP,
	 * 	C.WG_CD,
	 * 	C.WG_NM,
	 * 	C.ALC_AC_CD,
	 * 	C.ALC_AC_NM,
	 * 	C.DPT_CD,
	 * 	C.DPT_NM,
	 * 	C.LOC_CD,
	 * 	C.LOC_NM,
	 * 	C.OPER_CD,
	 * 	C.OPER_NM,
	 * 	C.BP_CD,
	 * 	C.BP_NM,
	 * 	C.CTG_CD,
	 * 	C.CTG_NM,
	 * 	C.ITM_CD,
	 * 	C.ITM_SUB1,
	 * 	C.ITM_SUB2,
	 * 	C.ITM_SUB3,
	 * 	COALESCE(C.SUNDRY_ITM_NM, C.ITM_NM) ITM_NM,
	 * 	C.ITM_TYP,
	 * 	C.ITM_TYP_D_CD,
	 * 	C.ITM_TYP_D_NM,
	 * 	C.LOT_NO,
	 * 	C.SUBLOT_NO,
	 * 	C.SNO1,
	 * 	C.SNO2,
	 * 	C.SNO3,
	 * 	C.SNO4,
	 * 	C.ITM_MFG_INST_NO,
	 * 	C.IV_NO,
	 * 	C.PO_NO,
	 * 	C.SLO_NO,
	 * 	C.AMT,
	 * 	C.PRE_ALC_RATE,
	 * 	C.PRE_ALC_TOTAL,
	 * 	C.PRE_ALC_CALC_RATE,
	 * 	C.PRE_ALC_RATE_CD,
	 * 	PRE_ALC_RATE.PRE_ALC_RATE_NM,
	 * 	C.SRC_WG_CD,
	 * 	C.SRC_WG_NM,
	 * 	C.PRE_ALC_SEQ,
	 * 	C.SRC_PRE_ALC_SEQ,
	 * 	C.TOP_PRE_ALC_SEQ
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)
	 * 	LEFT OUTER JOIN MAM_PRE_ALC_RATE_$S PRE_ALC_RATE ON (C.PRE_ALC_RATE_CD = PRE_ALC_RATE.PRE_ALC_RATE_CD)
	 * WHERE
	 * 	0 = 0
	 * 	AND P.CYCLE_FLG = '0'
	 * ORDER BY
	 * 	P.SEARCH_ID_PATH
	 * </PRE>
	 *
	 * @ID MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Pos 
	 * @since 2020/11/09 19:15:50
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Pos =
		"-- MGBDL0260_MGT_PRE_ALC_PATH_Query_S01_Pos\n" +
		"WITH RECURSIVE\n" +
		"BASE AS (\n" +
		"\tSELECT\n" +
		"\t\tT.*,\n" +
		"\t\tDAC.WG_NM,\n" +
		"\t\tALC_AC.ALC_AC_NM,\n" +
		"\t\tALC_AC.ALC_AC_GRP_CD1,\n" +
		"\t\tALC_AC_GRP1.ALC_AC_GRP_NM ALC_AC_GRP_NM1,\n" +
		"\t\tALC_AC.ALC_AC_GRP_CD2,\n" +
		"\t\tALC_AC_GRP2.ALC_AC_GRP_NM ALC_AC_GRP_NM2,\n" +
		"\t\tALC_AC.ALC_AC_GRP_CD3,\n" +
		"\t\tALC_AC_GRP3.ALC_AC_GRP_NM ALC_AC_GRP_NM3,\n" +
		"\t\tDPT.DPT_NM,\n" +
		"\t\tLOC.LOC_NM,\n" +
		"\t\tOPER.OPER_NM,\n" +
		"\t\tBP.BP_NM,\n" +
		"\t\tCTG.CTG_NM,\n" +
		"\t\tITM.ITM_TYP,\n" +
		"\t\tITM.ITM_TYP_D_CD,\n" +
		"\t\tITM_TYP_D.ITM_TYP_D_NM,\n" +
		"\t\tSUNDRY_ITM.ITM_NM SUNDRY_ITM_NM,\n" +
		"\t\tITM.ITM_NM,\n" +
		"\t\tSRC_DAC.WG_NM SRC_WG_NM,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY NULL) REC_ID,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY T.YM, T.INPT_ALC_TYP, T.WG_CD, T.ALC_AC_CD, T.DPT_CD, T.TOP_PRE_ALC_SEQ) SEARCH_ID\n" +
		"\tFROM\n" +
		"\t\tMGT_PRE_ALC_PATH_$S T\n" +
		"\t\tINNER JOIN MAVM_RD_WG DAC ON (T.WG_CD = DAC.WG_CD)\n" +
		"\t\tINNER JOIN MAVM_RD_WG SRC_DAC ON (T.SRC_WG_CD = SRC_DAC.WG_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_ALC_AC_$S ALC_AC ON (T.ALC_AC_CD = ALC_AC.ALC_AC_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP1 ON ('1' = ALC_AC_GRP1.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD1 = ALC_AC_GRP1.ALC_AC_GRP_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP2 ON ('2' = ALC_AC_GRP2.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD2 = ALC_AC_GRP2.ALC_AC_GRP_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_ALC_AC_GRP_$S ALC_AC_GRP3 ON ('3' = ALC_AC_GRP3.ALC_AC_GRP_TYP AND ALC_AC.ALC_AC_GRP_CD3 = ALC_AC_GRP3.ALC_AC_GRP_CD)\n" +
		"\t\tINNER JOIN MAM_TERM_$S TERM ON (T.YM >= TERM.TERM AND T.YM < TERM.TERM_END_YM)\n" +
		"\t\tLEFT OUTER JOIN MAM_COST_DPT_$S DPT ON (T.DPT_CD = DPT.DPT_CD AND TERM.TERM = DPT.TERM)\n" +
		"\t\tLEFT OUTER JOIN MAM_LOC_$S LOC ON (T.LOC_CD = LOC.LOC_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_OPER_$S OPER ON (T.OPER_CD = OPER.OPER_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_BP_$S BP ON (T.BP_CD = BP.BP_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_COST_CTG_$S CTG ON (T.CTG_CD = CTG.CTG_CD)\n" +
		"\t\tLEFT OUTER JOIN MAM_ITM_$S ITM ON (T.ITM_CD = ITM.ITM_CD AND T.ITM_SUB1 = ITM.ITM_SUB1 AND T.ITM_SUB2 = ITM.ITM_SUB2 AND T.ITM_SUB3 = ITM.ITM_SUB3)\n" +
		"\t\tLEFT OUTER JOIN MAM_SUNDRY_ITM_$S SUNDRY_ITM ON (T.ITM_CD = SUNDRY_ITM.ITM_CD AND T.ITM_SUB1 = SUNDRY_ITM.ITM_SUB1 AND T.ITM_SUB2 = SUNDRY_ITM.ITM_SUB2 AND T.ITM_SUB3 = SUNDRY_ITM.ITM_SUB3 AND T.SNO1 = SUNDRY_ITM.SNO1 AND T.SNO2 = SUNDRY_ITM.SNO2 AND T.SNO3 = SUNDRY_ITM.SNO3 AND T.SNO4 = SUNDRY_ITM.SNO4)\n" +
		"\t\tLEFT OUTER JOIN MAM_ITM_TYP_D_$S ITM_TYP_D ON (ITM.ITM_TYP = ITM_TYP_D.ITM_TYP AND ITM.ITM_TYP_D_CD = ITM_TYP_D.ITM_TYP_D_CD)\n" +
		"),\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.REC_ID ROOT_ID,\n" +
		"\t\tCAST(NULL AS NUMERIC) PAR_ID,\n" +
		"\t\tC.REC_ID,\n" +
		"\t\t1 HRRCHY,\n" +
		"\t\tC.CALC_NO,\n" +
		"\t\tC.CALC_GRP_CD,\n" +
		"\t\tC.PRE_ALC_SEQ,\n" +
		"\t\tARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,\n" +
		"\t\tARRAY(SELECT C.REC_ID) REC_ID_PATH,\n" +
		"\t\t'0' CYCLE_FLG\n" +
		"\tFROM\n" +
		"\t\tBASE C\n" +
		"\tWHERE\n" +
		"\t\t0 = 0\n" +
		"\t\tAND C.CALC_NO = :CALC_NO\n" +
		"\t\tAND C.CALC_GRP_CD = :CALC_GRP_CD\n" +
		"\t\tAND C.PRE_ALC_LVL = 0\n" +
		"\t\t[AND C.WG_CD LIKE :WG_CD]\n" +
		"\t\t[AND C.WG_NM LIKE :WG_NM]\n" +
		"\t\t[AND C.YM >= :YM_FR]\n" +
		"\t\t[AND C.YM <= :YM_TO]\n" +
		"\t\t[AND C.INPT_ALC_TYP LIKE :INPT_ALC_TYP]\n" +
		"\t\t[AND C.ALC_AC_CD LIKE :ALC_AC_CD]\n" +
		"\t\t[AND C.ALC_AC_NM LIKE :ALC_AC_NM]\n" +
		"\t\t[AND C.PRE_ALC_SEQ = :PRE_ALC_SEQ]\n" +
		"\t\t[AND C.ALC_AC_GRP_CD1 LIKE :ALC_AC_GRP_CD1]\n" +
		"\t\t[AND C.ALC_AC_GRP_NM1 LIKE :ALC_AC_GRP_NM1]\n" +
		"\t\t[AND C.ALC_AC_GRP_CD2 LIKE :ALC_AC_GRP_CD2]\n" +
		"\t\t[AND C.ALC_AC_GRP_NM2 LIKE :ALC_AC_GRP_NM2]\n" +
		"\t\t[AND C.ALC_AC_GRP_CD3 LIKE :ALC_AC_GRP_CD3]\n" +
		"\t\t[AND C.ALC_AC_GRP_NM3 LIKE :ALC_AC_GRP_NM3]\n" +
		"\t\t[AND C.DPT_CD LIKE :DPT_CD]\n" +
		"\t\t[AND C.DPT_NM LIKE :DPT_NM]\n" +
		"\t\t[AND C.LOC_CD LIKE :LOC_CD]\n" +
		"\t\t[AND C.LOC_NM LIKE :LOC_NM]\n" +
		"\t\t[AND C.OPER_CD LIKE :OPER_CD]\n" +
		"\t\t[AND C.OPER_NM LIKE :OPER_NM]\n" +
		"\t\t[AND C.BP_CD LIKE :BP_CD]\n" +
		"\t\t[AND C.BP_NM LIKE :BP_NM]\n" +
		"\t\t[AND C.CTG_CD LIKE :CTG_CD]\n" +
		"\t\t[AND C.CTG_NM LIKE :CTG_NM]\n" +
		"\t\t[AND C.ITM_TYP LIKE :ITM_TYP]\n" +
		"\t\t[AND C.ITM_TYP_D_CD LIKE :ITM_TYP_D_CD]\n" +
		"\t\t[AND C.ITM_TYP_D_NM LIKE :ITM_TYP_D_NM]\n" +
		"\t\t[AND C.ITM_CD LIKE :ITM_CD]\n" +
		"\t\t[AND C.ITM_SUB1 LIKE :ITM_SUB1]\n" +
		"\t\t[AND C.ITM_SUB2 LIKE :ITM_SUB2]\n" +
		"\t\t[AND C.ITM_SUB3 LIKE :ITM_SUB3]\n" +
		"\t\t[AND COALESCE(C.SUNDRY_ITM_NM, C.ITM_NM) LIKE :ITM_NM]\n" +
		"\t\t[AND C.LOT_NO LIKE :LOT_NO]\n" +
		"\t\t[AND C.SUBLOT_NO LIKE :SUBLOT_NO]\n" +
		"\t\t[AND C.SNO1 LIKE :SNO1]\n" +
		"\t\t[AND C.SNO2 LIKE :SNO2]\n" +
		"\t\t[AND C.SNO3 LIKE :SNO3]\n" +
		"\t\t[AND C.SNO4 LIKE :SNO4]\n" +
		"\t\t[AND C.ITM_MFG_INST_NO LIKE :ITM_MFG_INST_NO]\n" +
		"\t\t[AND C.IV_NO LIKE :IV_NO]\n" +
		"\t\t[AND C.PO_NO LIKE :PO_NO]\n" +
		"\t\t[AND C.SLO_NO LIKE :SLO_NO]\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tP.ROOT_ID,\n" +
		"\t\t\tP.REC_ID PAR_ID,\n" +
		"\t\t\tC.REC_ID,\n" +
		"\t\t\tP.HRRCHY + 1 HRRCHY,\n" +
		"\t\t\tC.CALC_NO,\n" +
		"\t\t\tC.CALC_GRP_CD,\n" +
		"\t\t\tC.PRE_ALC_SEQ,\n" +
		"\t\t\tP.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,\n" +
		"\t\t\tP.REC_ID_PATH || C.REC_ID REC_ID_PATH,\n" +
		"\t\t\tCASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN BASE C ON (P.CALC_NO = C.CALC_NO AND P.CALC_GRP_CD = C.CALC_GRP_CD AND P.PRE_ALC_SEQ = C.SRC_PRE_ALC_SEQ)\n" +
		"\t\tWHERE\n" +
		"\t\t\t0 = 0\n" +
		"\t\t\tAND P.CYCLE_FLG = '0'\n" +
		"\t\t\t[AND :LVL0_FLG_STR = '0']\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tP.HRRCHY - 1 HRRCHY,\n" +
		"\tCASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,\n" +
		"\tC.YM,\n" +
		"\tC.INPT_ALC_TYP,\n" +
		"\tC.WG_CD,\n" +
		"\tC.WG_NM,\n" +
		"\tC.ALC_AC_CD,\n" +
		"\tC.ALC_AC_NM,\n" +
		"\tC.DPT_CD,\n" +
		"\tC.DPT_NM,\n" +
		"\tC.LOC_CD,\n" +
		"\tC.LOC_NM,\n" +
		"\tC.OPER_CD,\n" +
		"\tC.OPER_NM,\n" +
		"\tC.BP_CD,\n" +
		"\tC.BP_NM,\n" +
		"\tC.CTG_CD,\n" +
		"\tC.CTG_NM,\n" +
		"\tC.ITM_CD,\n" +
		"\tC.ITM_SUB1,\n" +
		"\tC.ITM_SUB2,\n" +
		"\tC.ITM_SUB3,\n" +
		"\tCOALESCE(C.SUNDRY_ITM_NM, C.ITM_NM) ITM_NM,\n" +
		"\tC.ITM_TYP,\n" +
		"\tC.ITM_TYP_D_CD,\n" +
		"\tC.ITM_TYP_D_NM,\n" +
		"\tC.LOT_NO,\n" +
		"\tC.SUBLOT_NO,\n" +
		"\tC.SNO1,\n" +
		"\tC.SNO2,\n" +
		"\tC.SNO3,\n" +
		"\tC.SNO4,\n" +
		"\tC.ITM_MFG_INST_NO,\n" +
		"\tC.IV_NO,\n" +
		"\tC.PO_NO,\n" +
		"\tC.SLO_NO,\n" +
		"\tC.AMT,\n" +
		"\tC.PRE_ALC_RATE,\n" +
		"\tC.PRE_ALC_TOTAL,\n" +
		"\tC.PRE_ALC_CALC_RATE,\n" +
		"\tC.PRE_ALC_RATE_CD,\n" +
		"\tPRE_ALC_RATE.PRE_ALC_RATE_NM,\n" +
		"\tC.SRC_WG_CD,\n" +
		"\tC.SRC_WG_NM,\n" +
		"\tC.PRE_ALC_SEQ,\n" +
		"\tC.SRC_PRE_ALC_SEQ,\n" +
		"\tC.TOP_PRE_ALC_SEQ\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)\n" +
		"\tLEFT OUTER JOIN MAM_PRE_ALC_RATE_$S PRE_ALC_RATE ON (C.PRE_ALC_RATE_CD = PRE_ALC_RATE.PRE_ALC_RATE_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\tAND P.CYCLE_FLG = '0'\n" +
		"ORDER BY\n" +
		"\tP.SEARCH_ID_PATH";

}