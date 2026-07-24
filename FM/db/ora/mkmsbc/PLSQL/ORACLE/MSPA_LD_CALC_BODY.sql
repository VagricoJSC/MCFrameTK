CREATE OR REPLACE PACKAGE BODY MSPA_LD_CALC
/*****************************
負荷計算用のパッケージ本体
******************************/
IS

    FUNCTION F_GET_ST_DT_NE (
        I_ST_DT   IN MAPA_META.DT%TYPE,
        I_END_DT  IN MAPA_META.DT%TYPE,
        I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
        I_AC_CL_DAY IN MAPA_META.CL_DAY%TYPE
    )
    RETURN MAPA_META.DT%TYPE
    /**************************************************************************
    <SYNOPSIS>
        負荷計算における集計期間開始日
    <REMARKS>
        1つの集計期間に属する場合は、集計期間の開始日
        複数の集計期間に属する場合は、引数の開始日
    <ARGUMENTS>
    <ITEM>
        I_ST_DT       :開始日
        I_END_DT      :終了日
        I_PERIOD_TYP  :集計期間区分
        I_AC_CL_DAY   :会計締日
    <HISTORY>
    **************************************************************************/
    IS
        L_ST_DT MAPA_META.DT%TYPE;
        L_END_DT MAPA_META.DT%TYPE;
    BEGIN
        L_ST_DT  := MAPA_DT.F_GET_PERIOD_ST_DT_NE(I_ST_DT ,I_PERIOD_TYP,I_AC_CL_DAY);
        L_END_DT := MAPA_DT.F_GET_PERIOD_ST_DT_NE(I_END_DT,I_PERIOD_TYP,I_AC_CL_DAY);
        IF L_ST_DT = L_END_DT THEN
            RETURN L_ST_DT;
        ELSE
            RETURN I_ST_DT;
        END IF;
        
    END F_GET_ST_DT_NE;


    FUNCTION F_GET_END_DT_NE (
        I_ST_DT   IN MAPA_META.DT%TYPE,
        I_END_DT  IN MAPA_META.DT%TYPE,
        I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
        I_AC_CL_DAY IN MAPA_META.CL_DAY%TYPE
    )
    RETURN MAPA_META.DT%TYPE
    /**************************************************************************
    <SYNOPSIS>
        負荷計算における集計期間終了日
    <REMARKS>
        1つの集計期間に属する場合は、集計期間の終了日
        複数の集計期間に属する場合は、引数の終了日
    <ARGUMENTS>
    <ITEM>
        I_ST_DT       :開始日
        I_END_DT      :終了日
        I_PERIOD_TYP  :集計期間区分
        I_AC_CL_DAY   :会計締日
    <HISTORY>
    **************************************************************************/
    IS
        L_ST_DT MAPA_META.DT%TYPE;
        L_END_DT MAPA_META.DT%TYPE;
    BEGIN
        L_ST_DT  := MAPA_DT.F_GET_PERIOD_ST_DT_NE(I_ST_DT ,I_PERIOD_TYP,I_AC_CL_DAY);
        L_END_DT := MAPA_DT.F_GET_PERIOD_ST_DT_NE(I_END_DT,I_PERIOD_TYP,I_AC_CL_DAY);
        IF L_ST_DT = L_END_DT THEN
            RETURN MAPA_DT.F_GET_PERIOD_END_DT_NE(I_END_DT,I_PERIOD_TYP,I_AC_CL_DAY);
        ELSE
            RETURN I_END_DT;
        END IF;
        
    END F_GET_END_DT_NE;


    FUNCTION F_GET_GRP_BY_KEY_NE (
        I_KEY IN VARCHAR2,
        I_ST_DT   IN MAPA_META.DT%TYPE,
        I_END_DT  IN MAPA_META.DT%TYPE,
        I_CAL_FR  IN MAPA_META.DT%TYPE,
        I_CAL_TO  IN MAPA_META.DT%TYPE
    )
    RETURN MAPA_META.ITM_ORD_NO%TYPE
    /**************************************************************************
    <SYNOPSIS>
        負荷計算における集計キー
    <REMARKS>
        複数の集計期間に属する場合、かつ、稼働日案分が必要な場合、KEY
        それ以外はNULL
    <ARGUMENTS>
    <ITEM>
        KEY           :レコードを識別するＮＯ
        I_ST_DT       :開始日
        I_END_DT      :終了日
        I_ST_DT       :集計期間の開始日
        I_END_DT      :集計期間の終了日
    <HISTORY>
    **************************************************************************/
    IS
    BEGIN
        IF (I_ST_DT = I_END_DT) THEN
            RETURN NULL;
        END IF;
        IF (I_ST_DT >= I_CAL_FR AND I_END_DT <= I_CAL_TO) THEN
            RETURN NULL;
        END IF;
        RETURN I_KEY;
        
    END F_GET_GRP_BY_KEY_NE;

END MSPA_LD_CALC;
/
