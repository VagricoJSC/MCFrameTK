// FMSQ LOGIC_MAIN
package mcframe.serverMABC.MABCL2110;

/*
 * @(#)Sql_MC.java Wed Jul 22 15:24:46 JST 2020<p>
 * SQL Resource Class<p>
 */

public class Sql_MC {

	/**
	 * <PRE>
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S01_Ora
	 * SELECT
	 * 	LEVEL HRRCHY,
	 * 	TO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,
	 * 	T1.CTG_CD,
	 * 	M2.CTG_NM,
	 * 	T1.ITM_CD,
	 * 	M1.ITM_SUB1,
	 * 	M1.ITM_SUB2,
	 * 	M1.ITM_SUB3,
	 * 	M1.ITM_NM
	 * FROM
	 * 	MAVM_CTG_CONFIG T1,
	 * 	MAM_ITM_$S M1,
	 * 	MAM_COST_CTG_$S M2
	 * WHERE 0 = 0
	 * 	AND T1.ITM_CD = M1.ITM_CD(+)
	 * 	AND T1.ITM_SUB1 = M1.ITM_SUB1(+)
	 * 	AND T1.ITM_SUB2 = M1.ITM_SUB2(+)
	 * 	AND T1.ITM_SUB3 = M1.ITM_SUB3(+)
	 * 	AND T1.CTG_CD = M2.CTG_CD(+)
	 * START WITH 0 = 0
	 *  	AND T1.PAR_CTG_CD = :CTG_CD
	 *  	AND T1.TERM = :TERM
	 * CONNECT BY NOCYCLE  
	 *  	T1.PAR_CTG_CD = PRIOR T1.CTG_CD
	 *  	AND T1.TERM = :TERM
	 * ORDER SIBLINGS BY 
	 *  	PAR_CTG_CD, 
	 *  	CTG_CD, 
	 *  	ITM_CD
	 * </PRE>
	 *
	 * @ID MABCL2110_MAM_CTG_CONFIG_Query_S01_Ora 
	 * @since 2020/06/26 10:17:11
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2110_MAM_CTG_CONFIG_Query_S01_Ora =
		"-- MABCL2110_MAM_CTG_CONFIG_Query_S01_Ora\n" +
		"SELECT\n" +
		"\tLEVEL HRRCHY,\n" +
		"\tTO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,\n" +
		"\tT1.CTG_CD,\n" +
		"\tM2.CTG_NM,\n" +
		"\tT1.ITM_CD,\n" +
		"\tM1.ITM_SUB1,\n" +
		"\tM1.ITM_SUB2,\n" +
		"\tM1.ITM_SUB3,\n" +
		"\tM1.ITM_NM\n" +
		"FROM\n" +
		"\tMAVM_CTG_CONFIG T1,\n" +
		"\tMAM_ITM_$S M1,\n" +
		"\tMAM_COST_CTG_$S M2\n" +
		"WHERE 0 = 0\n" +
		"\tAND T1.ITM_CD = M1.ITM_CD(+)\n" +
		"\tAND T1.ITM_SUB1 = M1.ITM_SUB1(+)\n" +
		"\tAND T1.ITM_SUB2 = M1.ITM_SUB2(+)\n" +
		"\tAND T1.ITM_SUB3 = M1.ITM_SUB3(+)\n" +
		"\tAND T1.CTG_CD = M2.CTG_CD(+)\n" +
		"START WITH 0 = 0\n" +
		" \tAND T1.PAR_CTG_CD = :CTG_CD\n" +
		" \tAND T1.TERM = :TERM\n" +
		"CONNECT BY NOCYCLE  \n" +
		" \tT1.PAR_CTG_CD = PRIOR T1.CTG_CD\n" +
		" \tAND T1.TERM = :TERM\n" +
		"ORDER SIBLINGS BY \n" +
		" \tPAR_CTG_CD, \n" +
		" \tCTG_CD, \n" +
		" \tITM_CD";
	/**
	 * <PRE>
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S01_Pos
	 * WITH RECURSIVE
	 * BASE AS (
	 * 	SELECT
	 * 		T1.*,
	 * 		ROW_NUMBER() OVER(ORDER BY NULL) REC_ID,
	 * 		ROW_NUMBER() OVER(ORDER BY T1.PAR_CTG_CD, T1.CTG_CD, T1.ITM_CD) SEARCH_ID
	 * 	FROM
	 * 		MAVM_CTG_CONFIG T1
	 * ),
	 * REC AS (
	 * 	SELECT
	 * 		C.REC_ID ROOT_ID,
	 * 		CAST(NULL AS NUMERIC) PAR_ID,
	 * 		C.REC_ID,
	 * 		1 HRRCHY,
	 * 		C.CTG_CD,
	 * 		ARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,
	 * 		ARRAY(SELECT C.REC_ID) REC_ID_PATH,
	 * 		'0' CYCLE_FLG
	 * 	FROM
	 * 		BASE C
	 * 	WHERE
	 * 		0 = 0
	 * 		AND C.PAR_CTG_CD = :CTG_CD
	 * 		AND C.TERM = :TERM
	 * 	UNION ALL (
	 * 		SELECT
	 * 			P.ROOT_ID,
	 * 			P.REC_ID PAR_ID,
	 * 			C.REC_ID,
	 * 			P.HRRCHY + 1 HRRCHY,
	 * 			C.CTG_CD,
	 * 			P.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,
	 * 			P.REC_ID_PATH || C.REC_ID REC_ID_PATH,
	 * 			CASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN BASE C ON (P.CTG_CD = C.PAR_CTG_CD)
	 * 		WHERE
	 * 			P.CYCLE_FLG = '0'
	 * 			AND C.TERM = :TERM
	 * 	)
	 * )
	 * SELECT
	 * 	P.HRRCHY,
	 * 	CASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,
	 * 	C.CTG_CD,
	 * 	M2.CTG_NM,
	 * 	C.ITM_CD,
	 * 	M1.ITM_SUB1,
	 * 	M1.ITM_SUB2,
	 * 	M1.ITM_SUB3,
	 * 	M1.ITM_NM
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)
	 * 	LEFT OUTER JOIN MAM_ITM_$S M1 ON (C.ITM_CD = M1.ITM_CD AND C.ITM_SUB1 = M1.ITM_SUB1 AND C.ITM_SUB2 = M1.ITM_SUB2 AND C.ITM_SUB3 = M1.ITM_SUB3)
	 * 	LEFT OUTER JOIN MAM_COST_CTG_$S M2 ON (C.CTG_CD = M2.CTG_CD)
	 * WHERE
	 * 	0 = 0
	 * 	AND P.CYCLE_FLG = '0'
	 * ORDER BY
	 * 	P.SEARCH_ID_PATH
	 * </PRE>
	 *
	 * @ID MABCL2110_MAM_CTG_CONFIG_Query_S01_Pos 
	 * @since 2020/06/26 10:17:43
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2110_MAM_CTG_CONFIG_Query_S01_Pos =
		"-- MABCL2110_MAM_CTG_CONFIG_Query_S01_Pos\n" +
		"WITH RECURSIVE\n" +
		"BASE AS (\n" +
		"\tSELECT\n" +
		"\t\tT1.*,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY NULL) REC_ID,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY T1.PAR_CTG_CD, T1.CTG_CD, T1.ITM_CD) SEARCH_ID\n" +
		"\tFROM\n" +
		"\t\tMAVM_CTG_CONFIG T1\n" +
		"),\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.REC_ID ROOT_ID,\n" +
		"\t\tCAST(NULL AS NUMERIC) PAR_ID,\n" +
		"\t\tC.REC_ID,\n" +
		"\t\t1 HRRCHY,\n" +
		"\t\tC.CTG_CD,\n" +
		"\t\tARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,\n" +
		"\t\tARRAY(SELECT C.REC_ID) REC_ID_PATH,\n" +
		"\t\t'0' CYCLE_FLG\n" +
		"\tFROM\n" +
		"\t\tBASE C\n" +
		"\tWHERE\n" +
		"\t\t0 = 0\n" +
		"\t\tAND C.PAR_CTG_CD = :CTG_CD\n" +
		"\t\tAND C.TERM = :TERM\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tP.ROOT_ID,\n" +
		"\t\t\tP.REC_ID PAR_ID,\n" +
		"\t\t\tC.REC_ID,\n" +
		"\t\t\tP.HRRCHY + 1 HRRCHY,\n" +
		"\t\t\tC.CTG_CD,\n" +
		"\t\t\tP.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,\n" +
		"\t\t\tP.REC_ID_PATH || C.REC_ID REC_ID_PATH,\n" +
		"\t\t\tCASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN BASE C ON (P.CTG_CD = C.PAR_CTG_CD)\n" +
		"\t\tWHERE\n" +
		"\t\t\tP.CYCLE_FLG = '0'\n" +
		"\t\t\tAND C.TERM = :TERM\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tP.HRRCHY,\n" +
		"\tCASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,\n" +
		"\tC.CTG_CD,\n" +
		"\tM2.CTG_NM,\n" +
		"\tC.ITM_CD,\n" +
		"\tM1.ITM_SUB1,\n" +
		"\tM1.ITM_SUB2,\n" +
		"\tM1.ITM_SUB3,\n" +
		"\tM1.ITM_NM\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)\n" +
		"\tLEFT OUTER JOIN MAM_ITM_$S M1 ON (C.ITM_CD = M1.ITM_CD AND C.ITM_SUB1 = M1.ITM_SUB1 AND C.ITM_SUB2 = M1.ITM_SUB2 AND C.ITM_SUB3 = M1.ITM_SUB3)\n" +
		"\tLEFT OUTER JOIN MAM_COST_CTG_$S M2 ON (C.CTG_CD = M2.CTG_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\tAND P.CYCLE_FLG = '0'\n" +
		"ORDER BY\n" +
		"\tP.SEARCH_ID_PATH";
	/**
	 * <PRE>
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S02_Ora
	 * SELECT
	 * 	LEVEL HRRCHY,
	 * 	TO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,
	 * 	T1.PAR_CTG_CD CTG_CD,
	 * 	T1.CTG_CD CHD_CTG_CD,
	 * 	M2.CTG_NM,
	 * 	T1.ITM_CD,
	 * 	T1.ITM_SUB1,
	 * 	T1.ITM_SUB2,
	 * 	T1.ITM_SUB3,
	 * 	M1.ITM_NM
	 * FROM
	 * 	MAVM_CTG_CONFIG T1,
	 * 	MAM_ITM_$S M1,
	 * 	MAM_COST_CTG_$S M2
	 * WHERE 0 = 0
	 * 	AND T1.ITM_CD = M1.ITM_CD(+)
	 * 	AND T1.ITM_SUB1 = M1.ITM_SUB1(+)
	 * 	AND T1.ITM_SUB2 = M1.ITM_SUB2(+)
	 * 	AND T1.ITM_SUB3 = M1.ITM_SUB3(+)
	 * 	AND T1.PAR_CTG_CD = M2.CTG_CD(+)
	 * START WITH 0 = 0
	 * 	[AND T1.CTG_CD = :CTG_CD]
	 * 	[AND T1.ITM_CD = :ITM_CD]
	 * 	[AND T1.ITM_SUB1 = :ITM_SUB1]
	 * 	[AND T1.ITM_SUB2 = :ITM_SUB2]
	 * 	[AND T1.ITM_SUB3 = :ITM_SUB3]
	 * 	AND T1.TERM = :TERM
	 * CONNECT BY NOCYCLE  
	 * 	PRIOR T1.PAR_CTG_CD =  T1.CTG_CD
	 * 	AND T1.TERM = :TERM
	 * ORDER SIBLINGS BY 
	 * 	PAR_CTG_CD, 
	 * 	CTG_CD, 
	 * 	ITM_CD
	 * </PRE>
	 *
	 * @ID MABCL2110_MAM_CTG_CONFIG_Query_S02_Ora 
	 * @since 2020/06/26 10:18:22
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2110_MAM_CTG_CONFIG_Query_S02_Ora =
		"-- MABCL2110_MAM_CTG_CONFIG_Query_S02_Ora\n" +
		"SELECT\n" +
		"\tLEVEL HRRCHY,\n" +
		"\tTO_CHAR(CONNECT_BY_ISCYCLE) LOOP_FLG,\n" +
		"\tT1.PAR_CTG_CD CTG_CD,\n" +
		"\tT1.CTG_CD CHD_CTG_CD,\n" +
		"\tM2.CTG_NM,\n" +
		"\tT1.ITM_CD,\n" +
		"\tT1.ITM_SUB1,\n" +
		"\tT1.ITM_SUB2,\n" +
		"\tT1.ITM_SUB3,\n" +
		"\tM1.ITM_NM\n" +
		"FROM\n" +
		"\tMAVM_CTG_CONFIG T1,\n" +
		"\tMAM_ITM_$S M1,\n" +
		"\tMAM_COST_CTG_$S M2\n" +
		"WHERE 0 = 0\n" +
		"\tAND T1.ITM_CD = M1.ITM_CD(+)\n" +
		"\tAND T1.ITM_SUB1 = M1.ITM_SUB1(+)\n" +
		"\tAND T1.ITM_SUB2 = M1.ITM_SUB2(+)\n" +
		"\tAND T1.ITM_SUB3 = M1.ITM_SUB3(+)\n" +
		"\tAND T1.PAR_CTG_CD = M2.CTG_CD(+)\n" +
		"START WITH 0 = 0\n" +
		"\t[AND T1.CTG_CD = :CTG_CD]\n" +
		"\t[AND T1.ITM_CD = :ITM_CD]\n" +
		"\t[AND T1.ITM_SUB1 = :ITM_SUB1]\n" +
		"\t[AND T1.ITM_SUB2 = :ITM_SUB2]\n" +
		"\t[AND T1.ITM_SUB3 = :ITM_SUB3]\n" +
		"\tAND T1.TERM = :TERM\n" +
		"CONNECT BY NOCYCLE  \n" +
		"\tPRIOR T1.PAR_CTG_CD =  T1.CTG_CD\n" +
		"\tAND T1.TERM = :TERM\n" +
		"ORDER SIBLINGS BY \n" +
		"\tPAR_CTG_CD, \n" +
		"\tCTG_CD, \n" +
		"\tITM_CD";
	/**
	 * <PRE>
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S02_Pos
	 * WITH RECURSIVE
	 * BASE AS (
	 * 	SELECT
	 * 		T1.*,
	 * 		ROW_NUMBER() OVER(ORDER BY NULL) REC_ID,
	 * 		ROW_NUMBER() OVER(ORDER BY T1.PAR_CTG_CD, T1.CTG_CD, T1.ITM_CD) SEARCH_ID
	 * 	FROM
	 * 		MAVM_CTG_CONFIG T1
	 * ),
	 * REC AS (
	 * 	SELECT
	 * 		C.REC_ID ROOT_ID,
	 * 		CAST(NULL AS NUMERIC) PAR_ID,
	 * 		C.REC_ID,
	 * 		1 HRRCHY,
	 * 		C.PAR_CTG_CD,
	 * 		ARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,
	 * 		ARRAY(SELECT C.REC_ID) REC_ID_PATH,
	 * 		'0' CYCLE_FLG
	 * 	FROM
	 * 		BASE C
	 * 	WHERE
	 * 		0 = 0
	 * 		[AND C.CTG_CD = :CTG_CD]
	 * 		[AND C.ITM_CD = :ITM_CD]
	 * 		[AND C.ITM_SUB1 = :ITM_SUB1]
	 * 		[AND C.ITM_SUB2 = :ITM_SUB2]
	 * 		[AND C.ITM_SUB3 = :ITM_SUB3]
	 * 		AND C.TERM = :TERM
	 * 	UNION ALL (
	 * 		SELECT
	 * 			P.ROOT_ID,
	 * 			P.REC_ID PAR_ID,
	 * 			C.REC_ID,
	 * 			P.HRRCHY + 1 HRRCHY,
	 * 			C.PAR_CTG_CD,
	 * 			P.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,
	 * 			P.REC_ID_PATH || C.REC_ID REC_ID_PATH,
	 * 			CASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG
	 * 		FROM
	 * 			REC P
	 * 			INNER JOIN BASE C ON (P.PAR_CTG_CD = C.CTG_CD)
	 * 		WHERE
	 * 			P.CYCLE_FLG = '0'
	 * 			AND C.TERM = :TERM
	 * 	)
	 * )
	 * SELECT
	 * 	P.HRRCHY,
	 * 	CASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,
	 * 	C.PAR_CTG_CD CTG_CD,
	 * 	C.CTG_CD CHD_CTG_CD,
	 * 	M2.CTG_NM,
	 * 	C.ITM_CD,
	 * 	C.ITM_SUB1,
	 * 	C.ITM_SUB2,
	 * 	C.ITM_SUB3,
	 * 	M1.ITM_NM
	 * FROM
	 * 	REC P
	 * 	LEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)
	 * 	LEFT OUTER JOIN MAM_ITM_$S M1 ON (C.ITM_CD = M1.ITM_CD AND C.ITM_SUB1 = M1.ITM_SUB1 AND C.ITM_SUB2 = M1.ITM_SUB2 AND C.ITM_SUB3 = M1.ITM_SUB3)
	 * 	LEFT OUTER JOIN MAM_COST_CTG_$S M2 ON (C.PAR_CTG_CD = M2.CTG_CD)
	 * WHERE
	 * 	0 = 0
	 * 	AND P.CYCLE_FLG = '0'
	 * ORDER BY
	 * 	P.SEARCH_ID_PATH
	 * </PRE>
	 *
	 * @ID MABCL2110_MAM_CTG_CONFIG_Query_S02_Pos 
	 * @since 2020/06/26 10:18:58
	 * @author B-EN-G
	 * @memo <PRE>
	 *    </PRE>
	 */
	public static final String MABCL2110_MAM_CTG_CONFIG_Query_S02_Pos =
		"-- MABCL2110_MAM_CTG_CONFIG_Query_S02_Pos\n" +
		"WITH RECURSIVE\n" +
		"BASE AS (\n" +
		"\tSELECT\n" +
		"\t\tT1.*,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY NULL) REC_ID,\n" +
		"\t\tROW_NUMBER() OVER(ORDER BY T1.PAR_CTG_CD, T1.CTG_CD, T1.ITM_CD) SEARCH_ID\n" +
		"\tFROM\n" +
		"\t\tMAVM_CTG_CONFIG T1\n" +
		"),\n" +
		"REC AS (\n" +
		"\tSELECT\n" +
		"\t\tC.REC_ID ROOT_ID,\n" +
		"\t\tCAST(NULL AS NUMERIC) PAR_ID,\n" +
		"\t\tC.REC_ID,\n" +
		"\t\t1 HRRCHY,\n" +
		"\t\tC.PAR_CTG_CD,\n" +
		"\t\tARRAY(SELECT C.SEARCH_ID) SEARCH_ID_PATH,\n" +
		"\t\tARRAY(SELECT C.REC_ID) REC_ID_PATH,\n" +
		"\t\t'0' CYCLE_FLG\n" +
		"\tFROM\n" +
		"\t\tBASE C\n" +
		"\tWHERE\n" +
		"\t\t0 = 0\n" +
		"\t\t[AND C.CTG_CD = :CTG_CD]\n" +
		"\t\t[AND C.ITM_CD = :ITM_CD]\n" +
		"\t\t[AND C.ITM_SUB1 = :ITM_SUB1]\n" +
		"\t\t[AND C.ITM_SUB2 = :ITM_SUB2]\n" +
		"\t\t[AND C.ITM_SUB3 = :ITM_SUB3]\n" +
		"\t\tAND C.TERM = :TERM\n" +
		"\tUNION ALL (\n" +
		"\t\tSELECT\n" +
		"\t\t\tP.ROOT_ID,\n" +
		"\t\t\tP.REC_ID PAR_ID,\n" +
		"\t\t\tC.REC_ID,\n" +
		"\t\t\tP.HRRCHY + 1 HRRCHY,\n" +
		"\t\t\tC.PAR_CTG_CD,\n" +
		"\t\t\tP.SEARCH_ID_PATH || C.SEARCH_ID SEARCH_ID_PATH,\n" +
		"\t\t\tP.REC_ID_PATH || C.REC_ID REC_ID_PATH,\n" +
		"\t\t\tCASE WHEN C.REC_ID = ANY(P.REC_ID_PATH) THEN '1' ELSE '0' END CYCLE_FLG\n" +
		"\t\tFROM\n" +
		"\t\t\tREC P\n" +
		"\t\t\tINNER JOIN BASE C ON (P.PAR_CTG_CD = C.CTG_CD)\n" +
		"\t\tWHERE\n" +
		"\t\t\tP.CYCLE_FLG = '0'\n" +
		"\t\t\tAND C.TERM = :TERM\n" +
		"\t)\n" +
		")\n" +
		"SELECT\n" +
		"\tP.HRRCHY,\n" +
		"\tCASE WHEN EXISTS (SELECT 'X' FROM REC V WHERE V.CYCLE_FLG = '1' AND V.ROOT_ID = P.ROOT_ID AND V.PAR_ID = P.REC_ID) THEN '1' ELSE '0' END LOOP_FLG,\n" +
		"\tC.PAR_CTG_CD CTG_CD,\n" +
		"\tC.CTG_CD CHD_CTG_CD,\n" +
		"\tM2.CTG_NM,\n" +
		"\tC.ITM_CD,\n" +
		"\tC.ITM_SUB1,\n" +
		"\tC.ITM_SUB2,\n" +
		"\tC.ITM_SUB3,\n" +
		"\tM1.ITM_NM\n" +
		"FROM\n" +
		"\tREC P\n" +
		"\tLEFT OUTER JOIN BASE C ON (P.REC_ID = C.REC_ID)\n" +
		"\tLEFT OUTER JOIN MAM_ITM_$S M1 ON (C.ITM_CD = M1.ITM_CD AND C.ITM_SUB1 = M1.ITM_SUB1 AND C.ITM_SUB2 = M1.ITM_SUB2 AND C.ITM_SUB3 = M1.ITM_SUB3)\n" +
		"\tLEFT OUTER JOIN MAM_COST_CTG_$S M2 ON (C.PAR_CTG_CD = M2.CTG_CD)\n" +
		"WHERE\n" +
		"\t0 = 0\n" +
		"\tAND P.CYCLE_FLG = '0'\n" +
		"ORDER BY\n" +
		"\tP.SEARCH_ID_PATH";

}