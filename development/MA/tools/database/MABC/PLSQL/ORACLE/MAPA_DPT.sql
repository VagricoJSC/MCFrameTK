CREATE OR REPLACE PACKAGE MAPA_DPT
/*********************************************************
<Synopsis>
		部門関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_DPT_CD_NE (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		日付に対して有効な部門ＣＤを返す(Not Exception版)
		※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
	<REMARKS>
		無効な部門ＣＤの場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_DPT_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		日付に対して有効な部門ＣＤを返す
		※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
	<REMARKS>
		無効な部門ＣＤの場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_CHECK_DPT_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		日付に対して入力された部門が有効かどうか確認する
		有効な場合は入力された部門を返す
		無効な場合はＮＵＬＬを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/

END MAPA_DPT ;
/
