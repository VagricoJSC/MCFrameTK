// FMSQ LOGIC_MAIN
package mcframe.serverMABC.MABCL0850;

/*
 * @(#)Sql_MC.java Wed Jul 22 15:24:30 JST 2020<p>
 * SQL Resource Class<p>
 */

public class Sql_MC {

	/**
	 * <PRE>
	 * -- MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Ora
	 * SELECT
	 * 	T1.*
	 * FROM
	 * 	MAM_SLS_ITM_GRP_LCL_$S T1
	 * 	JOIN (
	 * 		SELECT W.SLS_ITM_GRP_CD FROM MAM_SLS_ITM_GRP_$S W
	 * 		WHERE 0=0[
	 * 		AND W.DEL_FLG = :DEL_FLG_FALSE]
	 * 		START WITH
	 * 			W.SLS_ITM_GRP_LVL = 0[
	 * 			AND W.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]
	 * 		CONNECT BY
	 * 			PRIOR W.SLS_ITM_GRP_CD = W.UP_SLS_ITM_GRP_CD
	 * 	) T2 ON (T2.SLS_ITM_GRP_CD = T1.SLS_ITM_GRP_CD)
	 * </PRE>
	 *
	 * @ID MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Ora 
	 * @since 2020/06/26 10:15:45
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Ora =
		"-- MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Ora\n" +
		"SELECT\n" +
		"\tT1.*\n" +
		"FROM\n" +
		"\tMAM_SLS_ITM_GRP_LCL_$S T1\n" +
		"\tJOIN (\n" +
		"\t\tSELECT W.SLS_ITM_GRP_CD FROM MAM_SLS_ITM_GRP_$S W\n" +
		"\t\tWHERE 0=0[\n" +
		"\t\tAND W.DEL_FLG = :DEL_FLG_FALSE]\n" +
		"\t\tSTART WITH\n" +
		"\t\t\tW.SLS_ITM_GRP_LVL = 0[\n" +
		"\t\t\tAND W.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]\n" +
		"\t\tCONNECT BY\n" +
		"\t\t\tPRIOR W.SLS_ITM_GRP_CD = W.UP_SLS_ITM_GRP_CD\n" +
		"\t) T2 ON (T2.SLS_ITM_GRP_CD = T1.SLS_ITM_GRP_CD)";
	/**
	 * <PRE>
	 * -- MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Pos
	 * WITH RECURSIVE
	 * REC AS (
	 * 	SELECT
	 * 		C.SLS_ITM_GRP_CD,
	 * 		C.DEL_FLG
	 * 	FROM
	 * 		MAM_SLS_ITM_GRP_$S C
	 * 	WHERE
	 * 		C.SLS_ITM_GRP_LVL = 0
	 * 		[AND C.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]
	 * 	UNION ALL (
	 * 		SELECT
	 * 			C.SLS_ITM_GRP_CD,
	 * 			C.DEL_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN MAM_SLS_ITM_GRP_$S C ON (P.SLS_ITM_GRP_CD = C.UP_SLS_ITM_GRP_CD)
	 * 	)
	 * )
	 * SELECT
	 * 	T1.*
	 * FROM
	 * 	MAM_SLS_ITM_GRP_LCL_$S T1
	 * 	INNER JOIN REC P ON (T1.SLS_ITM_GRP_CD = P.SLS_ITM_GRP_CD)
	 * WHERE
	 * 	0 = 0
	 * 	[AND P.DEL_FLG = :DEL_FLG_FALSE]
	 * </PRE>
	 *
	 * @ID MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Pos 
	 * @since 2020/06/26 10:08:42
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Pos =
		"-- MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Pos\n" +
		"WITH RECURSIVE\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.SLS_ITM_GRP_CD,\n" +
		"\t\tC.DEL_FLG\n" +
		"\tFROM\n" +
		"\t\tMAM_SLS_ITM_GRP_$S C\n" +
		"\tWHERE\n" +
		"\t\tC.SLS_ITM_GRP_LVL = 0\n" +
		"\t\t[AND C.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tC.SLS_ITM_GRP_CD,\n" +
		"\t\t\tC.DEL_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN MAM_SLS_ITM_GRP_$S C ON (P.SLS_ITM_GRP_CD = C.UP_SLS_ITM_GRP_CD)\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tT1.*\n" +
		"FROM\n" +
		"\tMAM_SLS_ITM_GRP_LCL_$S T1\n" +
		"\tINNER JOIN REC P ON (T1.SLS_ITM_GRP_CD = P.SLS_ITM_GRP_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\t[AND P.DEL_FLG = :DEL_FLG_FALSE]";
	/**
	 * <PRE>
	 * -- MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Ora
	 * SELECT
	 * 	T.*,
	 * 	LCL.sls_itm_grp_nm "sls_itm_grp_nm_lcl",
	 * 	LCL2.sls_itm_grp_nm "up_sls_itm_grp_nm"
	 * FROM
	 * 	MAM_SLS_ITM_GRP_$S T
	 * 	LEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL ON (T.sls_itm_grp_cd = LCL.sls_itm_grp_cd)
	 * 	LEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL2 ON (T.up_sls_itm_grp_cd = LCL2.sls_itm_grp_cd) 
	 * WHERE 0=0[
	 * 	AND T.del_flg = :del_flg_false]
	 * START WITH
	 * 	T.SLS_ITM_GRP_LVL = 0[
	 * 	AND T.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]
	 * CONNECT BY
	 * 	PRIOR T.SLS_ITM_GRP_CD = T.UP_SLS_ITM_GRP_CD
	 * </PRE>
	 *
	 * @ID MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Ora 
	 * @since 2020/06/26 10:16:15
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Ora =
		"-- MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Ora\n" +
		"SELECT\n" +
		"\tT.*,\n" +
		"\tLCL.sls_itm_grp_nm \"sls_itm_grp_nm_lcl\",\n" +
		"\tLCL2.sls_itm_grp_nm \"up_sls_itm_grp_nm\"\n" +
		"FROM\n" +
		"\tMAM_SLS_ITM_GRP_$S T\n" +
		"\tLEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL ON (T.sls_itm_grp_cd = LCL.sls_itm_grp_cd)\n" +
		"\tLEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL2 ON (T.up_sls_itm_grp_cd = LCL2.sls_itm_grp_cd) \n" +
		"WHERE 0=0[\n" +
		"\tAND T.del_flg = :del_flg_false]\n" +
		"START WITH\n" +
		"\tT.SLS_ITM_GRP_LVL = 0[\n" +
		"\tAND T.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]\n" +
		"CONNECT BY\n" +
		"\tPRIOR T.SLS_ITM_GRP_CD = T.UP_SLS_ITM_GRP_CD";
	/**
	 * <PRE>
	 * -- MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Pos
	 * WITH RECURSIVE
	 * REC AS (
	 * 	SELECT
	 * 		C.SLS_ITM_GRP_CD
	 * 	FROM
	 * 		MAM_SLS_ITM_GRP_$S C
	 * 	WHERE
	 * 		C.SLS_ITM_GRP_LVL = 0
	 * 		[AND C.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]
	 * 	UNION ALL (
	 * 		SELECT
	 * 			C.SLS_ITM_GRP_CD
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN MAM_SLS_ITM_GRP_$S C ON (P.SLS_ITM_GRP_CD = C.UP_SLS_ITM_GRP_CD)
	 * 	)
	 * )
	 * SELECT
	 * 	T.*,
	 * 	LCL.SLS_ITM_GRP_NM SLS_ITM_GRP_NM_LCL,
	 * 	LCL2.SLS_ITM_GRP_NM UP_SLS_ITM_GRP_NM
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN MAM_SLS_ITM_GRP_$S T ON (P.SLS_ITM_GRP_CD = T.SLS_ITM_GRP_CD)
	 * 	LEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL ON (T.SLS_ITM_GRP_CD = LCL.SLS_ITM_GRP_CD)
	 * 	LEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL2 ON (T.UP_SLS_ITM_GRP_CD = LCL2.SLS_ITM_GRP_CD)
	 * WHERE
	 * 	0 = 0
	 * 	[AND T.DEL_FLG = :DEL_FLG_FALSE]
	 * </PRE>
	 *
	 * @ID MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Pos 
	 * @since 2020/06/26 10:10:22
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Pos =
		"-- MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Pos\n" +
		"WITH RECURSIVE\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.SLS_ITM_GRP_CD\n" +
		"\tFROM\n" +
		"\t\tMAM_SLS_ITM_GRP_$S C\n" +
		"\tWHERE\n" +
		"\t\tC.SLS_ITM_GRP_LVL = 0\n" +
		"\t\t[AND C.SLS_ITM_GRP_CD = :SLS_ITM_GRP_CD]\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tC.SLS_ITM_GRP_CD\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN MAM_SLS_ITM_GRP_$S C ON (P.SLS_ITM_GRP_CD = C.UP_SLS_ITM_GRP_CD)\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tT.*,\n" +
		"\tLCL.SLS_ITM_GRP_NM SLS_ITM_GRP_NM_LCL,\n" +
		"\tLCL2.SLS_ITM_GRP_NM UP_SLS_ITM_GRP_NM\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN MAM_SLS_ITM_GRP_$S T ON (P.SLS_ITM_GRP_CD = T.SLS_ITM_GRP_CD)\n" +
		"\tLEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL ON (T.SLS_ITM_GRP_CD = LCL.SLS_ITM_GRP_CD)\n" +
		"\tLEFT OUTER JOIN MAM_SLS_ITM_GRP_$S LCL2 ON (T.UP_SLS_ITM_GRP_CD = LCL2.SLS_ITM_GRP_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\t[AND T.DEL_FLG = :DEL_FLG_FALSE]";

}