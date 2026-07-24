CREATE OR REPLACE PACKAGE MSPA_ORD
IS
     PROCEDURE P_SET_DATE;
    /*********************************************************
    <SYNOPSIS>
        品目オーダのワークを元に品目オーダの予定日付を計算する。
    <REMARKS>   
        品目オーダ予定日計算
        
    <ARGUMENTS> 
        なし
    <HISTORY>   
    **********************************************************/ 
    
    FUNCTION F_GET_VER_NO(
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_STRC_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
    )RETURN MAPA_META.VER_NO%TYPE;
    /*********************************************************
    <SYNOPSIS>
        品目オーダ補完用版ＮＯ取得
    <REMARKS>   
    <ARGUMENTS> 
		I_ITM_CD	品目
		I_ITM_SUB1	枝番１
		I_ITM_SUB2	枝番２
		I_ITM_SUB3	枝番３
		I_STRC_LOC_CD	格納場所
		I_BASE_DT	格納完了予定日
    <HISTORY>   
    **********************************************************/ 
    
    FUNCTION F_GET_VER_NO(
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_STRC_LOC_CD	IN MAPA_META.LOC_CD%TYPE
    )RETURN MAPA_META.VER_NO%TYPE;
    /*********************************************************
    <SYNOPSIS>
        品目オーダ補完用版ＮＯ取得
    <REMARKS>   
    <ARGUMENTS> 
		I_ITM_CD	品目
		I_ITM_SUB1	枝番１
		I_ITM_SUB2	枝番２
		I_ITM_SUB3	枝番３
		I_STRC_LOC_CD	格納場所
    <HISTORY>   
    **********************************************************/ 

	FUNCTION F_GET_ALLOC_PLN_GI_SCHD_DT(
		I_IO_SCHD_PR_NO	IN MAPA_META.IO_SCHD_PR_NO%TYPE,
		I_ITM_CD		IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1		IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2		IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3		IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO		IN MAPA_META.LOT_NO%TYPE,
		I_SNO1			IN MAPA_META.SNO1%TYPE,
		I_SNO2			IN MAPA_META.SNO2%TYPE,
		I_SNO3			IN MAPA_META.SNO3%TYPE,
		I_SNO4			IN MAPA_META.SNO4%TYPE,
		I_LOC_CD		IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/**************************************************************************
	<SYNOPSIS>
			引当予定情報から最早出庫予定日を取得する
	<REMARKS>
			受払進捗管理ＮＯが指定された場合、受払進捗管理ＮＯを使用して最早出庫予定日を取得する。
			取得できなかった場合は、品目ＣＤ等の在庫情報を使用して最早出庫予定日を取得する。
	<ARGUMENTS>
	<ITEM>
	<IN>	I_IO_SCHD_PR_NO
			受払進捗管理ＮＯ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOT_NO
			ロットＮＯ
	<IN>	I_SNO1
			手配ＮＯ１
	<IN>	I_SNO2
			手配ＮＯ２
	<IN>	I_SNO3
			手配ＮＯ３
	<IN>	I_SNO4
			手配ＮＯ４
	<RETURNVALUE>
			最早出庫予定日
	<HISTORY>
	**************************************************************************/

	FUNCTION F_GET_ALLOC_PLN_GI_SCHD_DT_NE(
		I_IO_SCHD_PR_NO	IN MAPA_META.IO_SCHD_PR_NO%TYPE,
		I_ITM_CD		IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1		IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2		IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3		IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO		IN MAPA_META.LOT_NO%TYPE,
		I_SNO1			IN MAPA_META.SNO1%TYPE,
		I_SNO2			IN MAPA_META.SNO2%TYPE,
		I_SNO3			IN MAPA_META.SNO3%TYPE,
		I_SNO4			IN MAPA_META.SNO4%TYPE,
		I_LOC_CD		IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/**************************************************************************
	<SYNOPSIS>
			引当予定情報から最早出庫予定日を取得する(Not Exception版)
	<REMARKS>
			受払進捗管理ＮＯが指定された場合、受払進捗管理ＮＯを使用して最早出庫予定日を取得する。
			取得できなかった場合は、品目ＣＤ等の在庫情報を使用して最早出庫予定日を取得する。
	<ARGUMENTS>
	<ITEM>
	<IN>	I_IO_SCHD_PR_NO
			受払進捗管理ＮＯ
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOT_NO
			ロットＮＯ
	<IN>	I_SNO1
			手配ＮＯ１
	<IN>	I_SNO2
			手配ＮＯ２
	<IN>	I_SNO3
			手配ＮＯ３
	<IN>	I_SNO4
			手配ＮＯ４
	<RETURNVALUE>
			最早出庫予定日
	<HISTORY>
	**************************************************************************/

END  MSPA_ORD;
/       
