CREATE OR REPLACE PACKAGE MSPA_AR_UTIL
/*********************************************************
<Synopsis>
		請求、売掛ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS


	FUNCTION F_GET_LAST_BILL_MNG_NO(
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.BILL_MNG_NO%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最終請求管理ＮＯを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_CD
			案件ＣＤ
	<ReturnValue>
			請求ＩＤ
	**********************************************************/

	FUNCTION F_GET_MAX_CL_DAY(
		I_BCST_CD 		IN MAPA_META.BP_CD%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先の最大（月で最後）の締日を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<ReturnValue>
			最大の締日
	**********************************************************/

	FUNCTION F_GET_SCHD_BILL_DT(
		I_BCST_CD				IN MAPA_META.BP_CD%TYPE,
		I_BILL_BASE_DT			IN MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN MAPA_META.CRRYOVR_TIMES%TYPE,
		I_GET_NOT_BILL_DAY_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日に対応した請求予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASE_DT
			請求予定日算出の基準日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_GET_NOT_BILL_DAY_FLG
			'0':取得した請求予定日をそのまま返す
			'1':取得した請求予定日が過去日であった場合、
			未来の直近の請求予定日を再取得して返す
	<ReturnValue>
			請求予定日
	**********************************************************/

	FUNCTION F_GET_AR_NOT_APPL_BAL (
		I_ACST_CD		IN MAPA_META.BP_CD%TYPE,
		I_IV_NO			IN MAPA_META.IV_NO%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_WRK_NO		IN MAPA_META.WRK_NO%TYPE,
		I_DPT_CD		IN MAPA_META.DPT_CD%TYPE,
		I_AR_TYP		IN MAPA_META.AR_TYP%TYPE,
		I_AR_CL_YM		IN MAPA_META.YM%TYPE,
		I_MON			IN NUMBER,
		I_BEF_FLG		IN MAPA_META.FLG%TYPE
	)RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			指定した月の売掛金消込残高を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ACST_CD
			売掛先ＣＤ
	<IN>	I_IV_NO
			インボイスＮＯ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_WRK_NO
			案件ＮＯ
	<IN>	I_DPT_CD
			債権部門ＣＤ
	<IN>	I_AR_TYP
			債権区分
	<IN>	I_AR_CL_YM
			売掛締年月
	<IN>	I_MON
			締月の翌月 - 指定月の売掛金残高を求める（Oは当月）
	<IN>	I_BEF_FLG
			TRUEの場合、指定月以前の売掛金残高合計を求める
	<RETURNVALUE>
			売掛金消込残高
	**********************************************************/

	FUNCTION F_GET_BILL_CL_DAY (
		I_BILL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_TYP		IN	MAPA_META.BILL_CL_TYP%TYPE,
		I_BILL_EACH_SLS_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN MAPA_META.CL_DAY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求締日取得ファンクション
	<REMARKS>
			請求年月を加工して請求締日を取得する
	<ARGUMENTS>
		<IN>	I_BILL_YM
				請求年月
		<IN>	I_BILL_CL_TYP
				請求締区分
		<IN>	I_BILL_EACH_SLS_FLG
				都度請求フラグ
	<RETURNVALUE>
			BILL_CL_
			請求予定日
	**********************************************************/

--	FUNCTION F_GET_MAX_RCV_DAY (
--		I_BCST_CD		IN MAPA_META.BP_CD%TYPE
--	) RETURN MAPA_META.RCV_DAY%TYPE;
--	/*********************************************************
--	<SYNOPSIS>
--			請求先の最大の締日に対応した入金日を取得する
--	<REMARKS>
--	<ARGUMENTS>
--	<IN>	I_BCST_CD
--			請求先ＣＤ
--	<ReturnValue>
--			最大の締日に対応した入金日
--	**********************************************************/

	FUNCTION F_GET_LAST_BILL_REC (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MST_BILL%ROWTYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求レコードを取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_GET_LAST_BILL_AMT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.MONEY%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求額を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_GET_LAST_BILL_CL_DT (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE,
		I_BILL_DPT_CD	IN	MAPA_META.DPT_CD%TYPE,
		I_IV_NO		IN	MAPA_META.IV_NO%TYPE,
		I_CUR_CD	IN	MAPA_META.CUR_CD%TYPE,
		I_WRK_NO	IN	MAPA_META.WRK_NO%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			最後の請求書の請求締年月日を取得する
	<REMARKS>
			画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先CD
	<IN>	I_BILL_DPT_CD
			請求部門ＣＤ
	<IN>	I_IV_NO
			インボイスNO
	<IN>	I_CUR_CD
			通貨CD
	<IN>	I_WRK_NO
			案件NO
	**********************************************************/

	FUNCTION F_COMBINE_DT(
		I_BASEDATE	IN	MAPA_META.DT%TYPE,
		I_DAY		IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付算出処理
	<REMARKS>
			基準となる日付に対して入金サイトの加算や日にち指定を行い、
			入金予定日や締日を算出する
	<ARGUMENTS>
	<IN>	I_BASEDATE
			基準日付
	<IN>	I_DAY
			指定の日付('DD'、0:締日なし/99:末日)
	<RETURNVALUE>	算出した日付
	**********************************************************/

	FUNCTION F_GET_BILL_CL_FLG(
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_DT			IN	MAPA_META.DT%TYPE
	)RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_DT
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BILL_CL_FLG (
		I_BCST_CD				IN	MAPA_META.BP_CD%TYPE,
		I_BILL_BASIS_DT			IN	MAPA_META.DT%TYPE,
		I_BILL_CRRYOVR_TIMES		IN	MAPA_META.CRRYOVR_TIMES%TYPE,
		I_BILL_CL_YM			IN	MAPA_META.YM%TYPE,
		I_BILL_CL_DAY			IN	MAPA_META.CL_DAY%TYPE
	) RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求明細締フラグ取得処理
			請求明細が請求締対象かを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BILL_BASIS_DT
			請求起算日
	<IN>	I_BILL_CRRYOVR_TIMES
			請求サイト
	<IN>	I_BILL_CL_YM
			請求締年月
	<IN>	I_BILL_CL_DAY
			請求締日
	<RETURNVALUE>
			'0':締対象外 / '1':締対象
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_RCV_SCHD_DT(
		I_BILL_MNG_NO	IN MAPA_META.BILL_MNG_NO%TYPE
	) RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			入金予定日を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_MNG_NO
			請求管理ＮＯ
	<RETURNVALUE>
			入金予定日
	**********************************************************/

	FUNCTION F_GET_BCST_DPT (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD		IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを返却
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BCST_DPT_NE (
		I_BCST_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT		IN	MAPA_META.DT%TYPE,
		I_SLS_DPT_CD		IN	MAPA_META.DPT_CD%TYPE,
		I_AR_DPT_CD		IN	MAPA_META.DPT_CD%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先、基準日から請求先担当部門を取得する。
			請求先ＣＤをもとに取引先マスタの請求部門区分を取得する。
			請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却
			請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却
			請求部門区分が「3：請求部門」の場合、
			請求先ＣＤ、基準日付をもとに取引先補助マスタの請求先担当部門ＣＤを返却
			取得できない場合、Exceptionが発生した場合はNULLを返却
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_SLS_DPT_CD
			売上部門ＣＤ
	<IN>	I_AR_DPT_CD
			債権部門ＣＤ
	<RETURNVALUE>
			基準日時点での請求先担当部門
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_MAX_RCV_DAY (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.RCV_DAY%TYPE;
	/*********************************************************
		<SYNOPSIS>
			請求先の最大の締日に対応した入金予定日を取得する
			複数の入金方法が設定されている場合は、
			その中の最大の入金サイトを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<ReturnValue>
			入金予定日
	**********************************************************/

	FUNCTION F_GET_MAX_RCV_CRRYOVR_MONS (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS%TYPE;
	/*********************************************************
	<SYNOPSIS>
			請求先の最大の締日に対応した入金サイトを取得する
			複数の入金方法が設定されている場合は、
			その中の最大の入金サイトを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<RETURNVALUE>
			最大の入金サイト
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CRRYOVR_MONS_TYP (
		I_BCST_CD		IN MAPA_META.BP_CD%TYPE,
		I_CUR_CD		IN MAPA_META.CUR_CD%TYPE,
		I_AMT			IN MAPA_META.MONEY%TYPE,
		I_WG_CD			IN MAPA_META.WG_CD%TYPE
	) RETURN MAPA_META.CRRYOVR_MONS_TYP%TYPE;
	/*********************************************************
	<SYNOPSIS>
			入金予定制御マスタからサイト区分を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_CUR_CD
			通貨ＣＤ
	<IN>	I_AMT
			金額
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<RETURNVALUE>
			サイト区分
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ORG_BILL_D_NO (
		I_BILL_D_NO		IN MAPA_META.BILL_D_NO%TYPE
	) RETURN MAPA_META.BILL_D_NO%TYPE;
	/*********************************************************
	<SYNOPSIS>
			オリジナルの請求明細ＮＯを取得して返却する
			引数の請求明細ＮＯがオリジナルの場合、
			引数の請求明細ＮＯをそのまま返却する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BILL_D_NO
			請求明細ＮＯ
	<RETURNVALUE>
			オリジナルの請求明細ＮＯ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AC_YM_NE (
		I_AC_DT		IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			引数の計上日が本来属する計上年月を取得する
			計上年月が締まっていてもエラーにならない
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_AC_DT
			計上日
	<RETURNVALUE>
			計上年月
	<HISTORY>
	**********************************************************/
	
	FUNCTION F_GET_AMT_DISP_PM (
		I_TRD_PTN_TYP	IN	MAPA_META.TRD_PTN_TYP%TYPE,
		I_DSCNT_ITM_FLG	IN	MAPA_META.FLG%TYPE
	) RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目を加味した結果を取得します。
	<REMARKS>
	<IN>	I_TRD_PTN_TYP
			取引区分
	<IN>	I_DSCNT_ITM_FLG
			値引品フラグ
	<RETURNVALUE>
		1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	<HISTORY>
	**********************************************************/

END MSPA_AR_UTIL;
/
