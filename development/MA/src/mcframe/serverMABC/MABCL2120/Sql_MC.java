// FMSQ LOGIC_MAIN
package mcframe.serverMABC.MABCL2120;

/*
 * @(#)Sql_MC.java Wed Jul 22 15:25:39 JST 2020<p>
 * SQL Resource Class<p>
 */

public class Sql_MC {

	/**
	 * <PRE>
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S01_Ora
	 * SELECT
	 * 	LEVEL HRRCHY,
	 * 	TO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,
	 * 	T1.OPER_NULL_FLG,
	 * 	T1.PAR_DPT_CD,
	 * 	T1.DPT_CD,
	 * 	M2.DPT_NM,
	 * 	T1.LOC_CD,
	 * 	M1.LOC_NM,
	 * 	T1.OPER_CD,
	 * 	M3.OPER_NM
	 * FROM
	 * 	MAVM_DPT_CONFIG T1,
	 * 	MAM_LOC_$S M1,
	 * 	MAM_COST_DPT_$S M2,
	 * 	MAM_OPER_$S M3
	 * WHERE 0 = 0
	 *   	AND T1.LOC_CD = M1.LOC_CD(+)
	 *   	AND T1.DPT_CD = M2.DPT_CD(+)
	 * 	AND T1.TERM = M2.TERM(+)
	 *   	AND T1.OPER_CD = M3.OPER_CD(+)
	 *   	AND T1.TERM = :TERM
	 *   START WITH 0 = 0
	 *   	AND T1.PAR_DPT_CD = :DPT_CD
	 *   	AND T1.TERM = :TERM
	 *   CONNECT BY NOCYCLE  
	 *   	T1.PAR_DPT_CD = PRIOR T1.DPT_CD 
	 *   	AND T1.TERM = :TERM
	 *   ORDER SIBLINGS BY 
	 *   	PAR_DPT_CD, 
	 *   	DPT_CD, LOC_CD, OPER_CD
	 * </PRE>
	 *
	 * @ID MABCL2120_MAM_DPT_CONFIG_Query_S01_Ora 
	 * @since 2020/06/26 10:27:31
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2120_MAM_DPT_CONFIG_Query_S01_Ora =
		"-- MABCL2120_MAM_DPT_CONFIG_Query_S01_Ora\n" +
		"SELECT\n" +
		"\tLEVEL HRRCHY,\n" +
		"\tTO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,\n" +
		"\tT1.OPER_NULL_FLG,\n" +
		"\tT1.PAR_DPT_CD,\n" +
		"\tT1.DPT_CD,\n" +
		"\tM2.DPT_NM,\n" +
		"\tT1.LOC_CD,\n" +
		"\tM1.LOC_NM,\n" +
		"\tT1.OPER_CD,\n" +
		"\tM3.OPER_NM\n" +
		"FROM\n" +
		"\tMAVM_DPT_CONFIG T1,\n" +
		"\tMAM_LOC_$S M1,\n" +
		"\tMAM_COST_DPT_$S M2,\n" +
		"\tMAM_OPER_$S M3\n" +
		"WHERE 0 = 0\n" +
		"  \tAND T1.LOC_CD = M1.LOC_CD(+)\n" +
		"  \tAND T1.DPT_CD = M2.DPT_CD(+)\n" +
		"\tAND T1.TERM = M2.TERM(+)\n" +
		"  \tAND T1.OPER_CD = M3.OPER_CD(+)\n" +
		"  \tAND T1.TERM = :TERM\n" +
		"  START WITH 0 = 0\n" +
		"  \tAND T1.PAR_DPT_CD = :DPT_CD\n" +
		"  \tAND T1.TERM = :TERM\n" +
		"  CONNECT BY NOCYCLE  \n" +
		"  \tT1.PAR_DPT_CD = PRIOR T1.DPT_CD \n" +
		"  \tAND T1.TERM = :TERM\n" +
		"  ORDER SIBLINGS BY \n" +
		"  \tPAR_DPT_CD, \n" +
		"  \tDPT_CD, LOC_CD, OPER_CD";
	/**
	 * <PRE>
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S01_Pos
	 * WITH RECURSIVE
	 * BASE AS (
	 * 	SELECT
	 * 		T1.*,
	 * 		ROW_NUMBER() OVER(ORDER BY NULL) REC_ID,
	 * 		ROW_NUMBER() OVER(ORDER BY T1.PAR_DPT_CD, T1.DPT_CD, T1.LOC_CD, T1.OPER_CD) SEARCH_ID
	 * 	FROM
	 * 		MAVM_DPT_CONFIG T1
	 * ),
	 * REC AS (
	 * 	SELECT
	 * 		C.REC_ID ROOT_ID,
	 * 		CAST(NULL AS NUMERIC) PAR_ID,
	 * 		C.REC_ID,
	 * 		1 HRRCHY,
	 * 		C.DPT_CD,
	 * 		ARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,
	 * 		ARRAY(SELECT C.REC_ID) REC_ID_PATH,
	 * 		'0' CYCLE_FLG
	 * 	FROM
	 * 		BASE C
	 * 	WHERE
	 * 		0 = 0
	 * 		AND C.PAR_DPT_CD = :DPT_CD
	 * 		AND C.TERM = :TERM
	 * 	UNION ALL (
	 * 		SELECT
	 * 			P.ROOT_ID,
	 * 			P.REC_ID PAR_ID,
	 * 			C.REC_ID,
	 * 			P.HRRCHY + 1 HRRCHY,
	 * 			C.DPT_CD,
	 * 			P.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,
	 * 			P.REC_ID_PATH || C.REC_ID REC_ID_PATH,
	 * 			CASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN BASE C ON (P.DPT_CD = C.PAR_DPT_CD)
	 * 		WHERE
	 * 			P.CYCLE_FLG = '0'
	 * 			AND C.TERM = :TERM
	 * 	)
	 * )
	 * SELECT
	 * 	P.HRRCHY,
	 * 	CASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,
	 * 	C.OPER_NULL_FLG,
	 * 	C.PAR_DPT_CD,
	 * 	C.DPT_CD,
	 * 	M2.DPT_NM,
	 * 	C.LOC_CD,
	 * 	M1.LOC_NM,
	 * 	C.OPER_CD,
	 * 	M3.OPER_NM
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)
	 * 	LEFT OUTER JOIN MAM_LOC_$S M1 ON (C.LOC_CD = M1.LOC_CD)
	 * 	LEFT OUTER JOIN MAM_COST_DPT_$S M2 ON (C.DPT_CD = M2.DPT_CD AND C.TERM = M2.TERM)
	 * 	LEFT OUTER JOIN MAM_OPER_$S M3 ON (C.OPER_CD = M3.OPER_CD)
	 * WHERE
	 * 	0 = 0
	 * 	AND P.CYCLE_FLG = '0'
	 * 	AND C.TERM = :TERM
	 * ORDER BY
	 * 	P.SEARCH_ID_PATH
	 * </PRE>
	 *
	 * @ID MABCL2120_MAM_DPT_CONFIG_Query_S01_Pos 
	 * @since 2020/06/26 10:28:06
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2120_MAM_DPT_CONFIG_Query_S01_Pos =
		"-- MABCL2120_MAM_DPT_CONFIG_Query_S01_Pos\n" +
		"WITH RECURSIVE\n" +
		"BASE AS (\n" +
		"\tSELECT\n" +
		"\t\tT1.*,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY NULL) REC_ID,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY T1.PAR_DPT_CD, T1.DPT_CD, T1.LOC_CD, T1.OPER_CD) SEARCH_ID\n" +
		"\tFROM\n" +
		"\t\tMAVM_DPT_CONFIG T1\n" +
		"),\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.REC_ID ROOT_ID,\n" +
		"\t\tCAST(NULL AS NUMERIC) PAR_ID,\n" +
		"\t\tC.REC_ID,\n" +
		"\t\t1 HRRCHY,\n" +
		"\t\tC.DPT_CD,\n" +
		"\t\tARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,\n" +
		"\t\tARRAY(SELECT C.REC_ID) REC_ID_PATH,\n" +
		"\t\t'0' CYCLE_FLG\n" +
		"\tFROM\n" +
		"\t\tBASE C\n" +
		"\tWHERE\n" +
		"\t\t0 = 0\n" +
		"\t\tAND C.PAR_DPT_CD = :DPT_CD\n" +
		"\t\tAND C.TERM = :TERM\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tP.ROOT_ID,\n" +
		"\t\t\tP.REC_ID PAR_ID,\n" +
		"\t\t\tC.REC_ID,\n" +
		"\t\t\tP.HRRCHY + 1 HRRCHY,\n" +
		"\t\t\tC.DPT_CD,\n" +
		"\t\t\tP.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,\n" +
		"\t\t\tP.REC_ID_PATH || C.REC_ID REC_ID_PATH,\n" +
		"\t\t\tCASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN BASE C ON (P.DPT_CD = C.PAR_DPT_CD)\n" +
		"\t\tWHERE\n" +
		"\t\t\tP.CYCLE_FLG = '0'\n" +
		"\t\t\tAND C.TERM = :TERM\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tP.HRRCHY,\n" +
		"\tCASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,\n" +
		"\tC.OPER_NULL_FLG,\n" +
		"\tC.PAR_DPT_CD,\n" +
		"\tC.DPT_CD,\n" +
		"\tM2.DPT_NM,\n" +
		"\tC.LOC_CD,\n" +
		"\tM1.LOC_NM,\n" +
		"\tC.OPER_CD,\n" +
		"\tM3.OPER_NM\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)\n" +
		"\tLEFT OUTER JOIN MAM_LOC_$S M1 ON (C.LOC_CD = M1.LOC_CD)\n" +
		"\tLEFT OUTER JOIN MAM_COST_DPT_$S M2 ON (C.DPT_CD = M2.DPT_CD AND C.TERM = M2.TERM)\n" +
		"\tLEFT OUTER JOIN MAM_OPER_$S M3 ON (C.OPER_CD = M3.OPER_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\tAND P.CYCLE_FLG = '0'\n" +
		"\tAND C.TERM = :TERM\n" +
		"ORDER BY\n" +
		"\tP.SEARCH_ID_PATH";
	/**
	 * <PRE>
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S02_Ora
	 * SELECT
	 * 	  	LEVEL HRRCHY,
	 * 	  	TO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,
	 * 	  	T1.PAR_DPT_CD DPT_CD,
	 * 	  	T1.DPT_CD CHD_DPT_CD,
	 * 		T1.TERM CHD_TERM,
	 * 	  	M2.DPT_NM,
	 * 	  	T1.LOC_CD,
	 * 	  	M1.LOC_NM,
	 * 	  	T1.OPER_CD,
	 * 	  	M3.OPER_NM,
	 * 	  	T1.OPER_NULL_FLG
	 * FROM
	 * 	  	MAVM_DPT_CONFIG T1,
	 * 	  	MAM_LOC_$S M1,
	 * 	  	MAM_COST_DPT_$S M2,
	 * 	  	MAM_OPER_$S M3
	 * WHERE 0 = 0
	 * 	  	AND T1.LOC_CD = M1.LOC_CD(+)
	 * 	  	AND T1.PAR_DPT_CD = M2.DPT_CD(+)
	 * 		AND T1.TERM = M2.TERM(+)
	 * 	  	AND T1.OPER_CD = M3.OPER_CD(+)
	 * 	  	AND T1.TERM = :TERM
	 * START WITH 0 = 0
	 * 	  	[AND T1.DPT_CD = :DPT_CD]
	 * 	  	[AND T1.LOC_CD = :LOC_CD]
	 * 	  	[AND T1.OPER_CD = :OPER_CD]
	 * 	  	AND T1.TERM = :TERM
	 * CONNECT BY NOCYCLE PRIOR 
	 * 	  	T1.PAR_DPT_CD = T1.DPT_CD
	 * 	  	AND T1.TERM = :TERM
	 * ORDER SIBLINGS BY 
	 * 	  	PAR_DPT_CD, 
	 * 	  	DPT_CD, 
	 * 	  	LOC_CD,
	 * 	  	OPER_CD
	 * </PRE>
	 *
	 * @ID MABCL2120_MAM_DPT_CONFIG_Query_S02_Ora 
	 * @since 2020/06/26 10:28:42
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2120_MAM_DPT_CONFIG_Query_S02_Ora =
		"-- MABCL2120_MAM_DPT_CONFIG_Query_S02_Ora\n" +
		"SELECT\n" +
		"\t  \tLEVEL HRRCHY,\n" +
		"\t  \tTO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,\n" +
		"\t  \tT1.PAR_DPT_CD DPT_CD,\n" +
		"\t  \tT1.DPT_CD CHD_DPT_CD,\n" +
		"\t\tT1.TERM CHD_TERM,\n" +
		"\t  \tM2.DPT_NM,\n" +
		"\t  \tT1.LOC_CD,\n" +
		"\t  \tM1.LOC_NM,\n" +
		"\t  \tT1.OPER_CD,\n" +
		"\t  \tM3.OPER_NM,\n" +
		"\t  \tT1.OPER_NULL_FLG\n" +
		"FROM\n" +
		"\t  \tMAVM_DPT_CONFIG T1,\n" +
		"\t  \tMAM_LOC_$S M1,\n" +
		"\t  \tMAM_COST_DPT_$S M2,\n" +
		"\t  \tMAM_OPER_$S M3\n" +
		"WHERE 0 = 0\n" +
		"\t  \tAND T1.LOC_CD = M1.LOC_CD(+)\n" +
		"\t  \tAND T1.PAR_DPT_CD = M2.DPT_CD(+)\n" +
		"\t\tAND T1.TERM = M2.TERM(+)\n" +
		"\t  \tAND T1.OPER_CD = M3.OPER_CD(+)\n" +
		"\t  \tAND T1.TERM = :TERM\n" +
		"START WITH 0 = 0\n" +
		"\t  \t[AND T1.DPT_CD = :DPT_CD]\n" +
		"\t  \t[AND T1.LOC_CD = :LOC_CD]\n" +
		"\t  \t[AND T1.OPER_CD = :OPER_CD]\n" +
		"\t  \tAND T1.TERM = :TERM\n" +
		"CONNECT BY NOCYCLE PRIOR \n" +
		"\t  \tT1.PAR_DPT_CD = T1.DPT_CD\n" +
		"\t  \tAND T1.TERM = :TERM\n" +
		"ORDER SIBLINGS BY \n" +
		"\t  \tPAR_DPT_CD, \n" +
		"\t  \tDPT_CD, \n" +
		"\t  \tLOC_CD,\n" +
		"\t  \tOPER_CD";
	/**
	 * <PRE>
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S02_Pos
	 * WITH RECURSIVE
	 * BASE AS (
	 * 	SELECT
	 * 		T1.*,
	 * 		ROW_NUMBER() OVER(ORDER BY NULL) REC_ID,
	 * 		ROW_NUMBER() OVER(ORDER BY T1.PAR_DPT_CD, T1.DPT_CD, T1.LOC_CD, T1.OPER_CD) SEARCH_ID
	 * 	FROM
	 * 		MAVM_DPT_CONFIG T1
	 * ),
	 * REC AS (
	 * 	SELECT
	 * 		C.REC_ID ROOT_ID,
	 * 		CAST(NULL AS NUMERIC) PAR_ID,
	 * 		C.REC_ID,
	 * 		1 HRRCHY,
	 * 		C.PAR_DPT_CD,
	 * 		ARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,
	 * 		ARRAY(SELECT C.REC_ID) REC_ID_PATH,
	 * 		'0' CYCLE_FLG
	 * 	FROM
	 * 		BASE C
	 * 	WHERE
	 * 		0 = 0
	 * 		[AND C.DPT_CD = :DPT_CD]
	 * 		[AND C.LOC_CD = :LOC_CD]
	 * 		[AND C.OPER_CD = :OPER_CD]
	 * 		AND C.TERM = :TERM
	 * 	UNION ALL (
	 * 		SELECT
	 * 			P.ROOT_ID,
	 * 			P.REC_ID PAR_ID,
	 * 			C.REC_ID,
	 * 			P.HRRCHY + 1 HRRCHY,
	 * 			C.PAR_DPT_CD,
	 * 			P.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,
	 * 			P.REC_ID_PATH || C.REC_ID REC_ID_PATH,
	 * 			CASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN BASE C ON (P.PAR_DPT_CD = C.DPT_CD)
	 * 		WHERE
	 * 			P.CYCLE_FLG = '0'
	 * 			AND C.TERM = :TERM
	 * 	)
	 * )
	 * SELECT
	 * 	P.HRRCHY,
	 * 	CASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,
	 * 	C.PAR_DPT_CD DPT_CD,
	 * 	C.DPT_CD CHD_DPT_CD,
	 * 	C.TERM CHD_TERM,
	 * 	M2.DPT_NM,
	 * 	C.LOC_CD,
	 * 	M1.LOC_NM,
	 * 	C.OPER_CD,
	 * 	M3.OPER_NM,
	 * 	C.OPER_NULL_FLG
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)
	 * 	LEFT OUTER JOIN MAM_LOC_$S M1 ON (C.LOC_CD = M1.LOC_CD)
	 * 	LEFT OUTER JOIN MAM_COST_DPT_$S M2 ON (C.PAR_DPT_CD = M2.DPT_CD AND C.TERM = M2.TERM)
	 * 	LEFT OUTER JOIN MAM_OPER_$S M3 ON (C.OPER_CD = M3.OPER_CD)
	 * WHERE
	 * 	0 = 0
	 * 	AND P.CYCLE_FLG = '0'
	 * 	AND C.TERM = :TERM
	 * ORDER BY
	 * 	P.SEARCH_ID_PATH
	 * </PRE>
	 *
	 * @ID MABCL2120_MAM_DPT_CONFIG_Query_S02_Pos 
	 * @since 2020/06/26 10:29:09
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2120_MAM_DPT_CONFIG_Query_S02_Pos =
		"-- MABCL2120_MAM_DPT_CONFIG_Query_S02_Pos\n" +
		"WITH RECURSIVE\n" +
		"BASE AS (\n" +
		"\tSELECT\n" +
		"\t\tT1.*,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY NULL) REC_ID,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY T1.PAR_DPT_CD, T1.DPT_CD, T1.LOC_CD, T1.OPER_CD) SEARCH_ID\n" +
		"\tFROM\n" +
		"\t\tMAVM_DPT_CONFIG T1\n" +
		"),\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.REC_ID ROOT_ID,\n" +
		"\t\tCAST(NULL AS NUMERIC) PAR_ID,\n" +
		"\t\tC.REC_ID,\n" +
		"\t\t1 HRRCHY,\n" +
		"\t\tC.PAR_DPT_CD,\n" +
		"\t\tARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,\n" +
		"\t\tARRAY(SELECT C.REC_ID) REC_ID_PATH,\n" +
		"\t\t'0' CYCLE_FLG\n" +
		"\tFROM\n" +
		"\t\tBASE C\n" +
		"\tWHERE\n" +
		"\t\t0 = 0\n" +
		"\t\t[AND C.DPT_CD = :DPT_CD]\n" +
		"\t\t[AND C.LOC_CD = :LOC_CD]\n" +
		"\t\t[AND C.OPER_CD = :OPER_CD]\n" +
		"\t\tAND C.TERM = :TERM\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tP.ROOT_ID,\n" +
		"\t\t\tP.REC_ID PAR_ID,\n" +
		"\t\t\tC.REC_ID,\n" +
		"\t\t\tP.HRRCHY + 1 HRRCHY,\n" +
		"\t\t\tC.PAR_DPT_CD,\n" +
		"\t\t\tP.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,\n" +
		"\t\t\tP.REC_ID_PATH || C.REC_ID REC_ID_PATH,\n" +
		"\t\t\tCASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN BASE C ON (P.PAR_DPT_CD = C.DPT_CD)\n" +
		"\t\tWHERE\n" +
		"\t\t\tP.CYCLE_FLG = '0'\n" +
		"\t\t\tAND C.TERM = :TERM\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tP.HRRCHY,\n" +
		"\tCASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,\n" +
		"\tC.PAR_DPT_CD DPT_CD,\n" +
		"\tC.DPT_CD CHD_DPT_CD,\n" +
		"\tC.TERM CHD_TERM,\n" +
		"\tM2.DPT_NM,\n" +
		"\tC.LOC_CD,\n" +
		"\tM1.LOC_NM,\n" +
		"\tC.OPER_CD,\n" +
		"\tM3.OPER_NM,\n" +
		"\tC.OPER_NULL_FLG\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)\n" +
		"\tLEFT OUTER JOIN MAM_LOC_$S M1 ON (C.LOC_CD = M1.LOC_CD)\n" +
		"\tLEFT OUTER JOIN MAM_COST_DPT_$S M2 ON (C.PAR_DPT_CD = M2.DPT_CD AND C.TERM = M2.TERM)\n" +
		"\tLEFT OUTER JOIN MAM_OPER_$S M3 ON (C.OPER_CD = M3.OPER_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\tAND P.CYCLE_FLG = '0'\n" +
		"\tAND C.TERM = :TERM\n" +
		"ORDER BY\n" +
		"\tP.SEARCH_ID_PATH";

}