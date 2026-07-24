package mcframe.serverMAUC.MAUCL1060;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.object;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_TrdUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_TrdUtil_MC extends MAUCL_TrdUtil_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MAUCL_TrdUtil> CLAZZ = MAUCL_TrdUtil.class;
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * デフォルト取引ＣＤを取得します。<br>
	 */
	public class Srch01 extends MAUCL_TrdUtil_MC_A.Srch01 {
		@Override
		protected void call() {
			// オペレーションの実装
			down0().trd_cd(getDefaultTrdCd(up0().trd_ptn_typ()));
		}
	}
	
	/** 取引ＣＤ取得キャッシュ */
	protected FXUCL_MCFuncCache<String> _c_trd_cd;
	
	/**
	 * 指定された取引パタン区分で自動時採用ＦＬＧがオンのものをデフォルト取引ＣＤとして取得します。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @return デフォルト取引ＣＤ
	 */
	public static String getDefaultTrdCd(String trd_ptn_typ) {

		return object(CLAZZ)._getDefaultTrdCd(trd_ptn_typ);
	}
	
	/**
	 * 指定された取引パタン区分で自動時採用ＦＬＧがオンのものをデフォルト取引ＣＤとして取得します。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @return デフォルト取引ＣＤ
	 */
	protected String _getDefaultTrdCd(String trd_ptn_typ) {

		if (_c_trd_cd == null) {
			_c_trd_cd =  new FXUCL_MCFuncCache<>(in -> {
				return MAPA_UTIL$F_GET_DEF_TRD_CD(
						value((String) in[0]));
			});
		}
		return _c_trd_cd.get(trd_ptn_typ);
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 取引情報を取得します。<br>
	 */
	public class Srch02 extends MAUCL_TrdUtil_MC_A.Srch02 {
		@Override
		protected void call() {
			// オペレーションの実装
			MCRow.copyall(down0().trd(), getTrd(up0().trd_cd()));
		}
	}
	
	/** 取引マスタレコードキャッシュ */
	protected FXUCL_MCDbcCache<MAM_TRD_R> _c_trd;
	
	/**
	 * 指定された取引ＣＤに応じた取引情報を取得します。
	 * 
	 * @param trd_Cd 取引ＣＤ
	 * @return 取引情報
	 */
	public static MAM_TRD_R getTrd(String trd_cd) {

		return object(CLAZZ)._getTrd(trd_cd);
	}
	
	/**
	 * 指定された取引ＣＤに応じた取引情報を取得します。
	 * 
	 * @param trd_Cd 取引ＣＤ
	 * @return 取引情報
	 */
	protected MAM_TRD_R _getTrd(String trd_cd) {
		
		if (_c_trd == null) {
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			_c_trd = new FXUCL_MCDbcCache<MAM_TRD_R>(dbc_bldr);
		}
		return _c_trd.get(trd_cd);
	}

	/**
	 * 画面で単価を表示する際に、この値と掛算した結果を表示します。
	 * MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目を加味した結果を取得します。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @param dscnt_itm_flg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	 */
	public static MCNumber getUpriDispPm(String trd_ptn_typ, boolean dscnt_itm_flg) {

		return object(CLAZZ)._getUpriDispPm(trd_ptn_typ, dscnt_itm_flg);
	}
	
	/**
	 * 画面で単価を表示する際に、この値と掛算した結果を表示します。
	 * MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目を加味した結果を取得します。
	 * 
	 * @param trd_ptn_typ 取引パタン区分
	 * @param dscnt_itm_flg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	 */
	protected MCNumber _getUpriDispPm(String trd_ptn_typ, boolean dscnt_itm_flg) {
		
		MCNumber pm = MAC_TRD_PTN_TYP.upri_disp_pm(trd_ptn_typ);
		
		if (isDscntItmUpriSignRvrsTrd(trd_ptn_typ) && dscnt_itm_flg) {
			return pm.multiply(-1);
		}
		else {
			return pm;
		}
	}
	
	/**
	 * MAC_TRD_PTN_TYP.upri_disp_pmに加えて、値引品目に対する符号を反転する取引かを判定します。
	 * 
	 * @param trd_ptn_typ
	 * @return
	 */
	protected boolean isDscntItmUpriSignRvrsTrd (String trd_ptn_typ) {
		
		// 値引系取引は含めない。値引取引かつ値引品目はマイナスで表示するため。
		if (MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isSLS_CNSGN(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isSLS_RTN(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPURC(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPURC_VMI(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPURC_XPNS(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPURC_RTN(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isSHIP_RTN(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isARR(trd_ptn_typ) 
		 || MAC_TRD_PTN_TYP.isARR_RTN(trd_ptn_typ)
		 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 画面で金額を表示する際に、この値と掛算した結果を表示します。
	 * MAC_TRD_PTN_TYP.amt_disp_pmに加えて、値引品目を加味した結果を取得します。
	 * 
	 * @param trd_ptn_typ 取引パタン区分
	 * @param dscnt_itm_flg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	 */
	public static MCNumber getAmtDispPm(String trd_ptn_typ, boolean dscnt_itm_flg) {

		return object(CLAZZ)._getAmtDispPm(trd_ptn_typ, dscnt_itm_flg);
	}
	
	/**
	 * 画面で金額を表示する際に、この値と掛算した結果を表示します。
	 * MAC_TRD_PTN_TYP.amt_disp_pmに加えて、値引品目を加味した結果を取得します。
	 * 
	 * @param trd_ptn_typ 取引パタン区分
	 * @param dscnt_itm_flg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）、NULL（単価が関係ない取引の場合）
	 */
	protected MCNumber _getAmtDispPm(String trd_ptn_typ, boolean dscnt_itm_flg) {
		
		MCNumber pm = MAC_TRD_PTN_TYP.amt_disp_pm(trd_ptn_typ);
		
		if (isDscntItmAmtSignRvrsTrd(trd_ptn_typ) && dscnt_itm_flg) {
			return pm.multiply(-1);
		}
		else {
			return pm;
		}
	}
	
	/**
	 * MAC_TRD_PTN_TYP.amt_disp_pmに加えて、値引品目に対する符号を反転する取引かを判定します。
	 * 
	 * @param trd_ptn_typ
	 * @return
	 */
	protected boolean isDscntItmAmtSignRvrsTrd (String trd_ptn_typ) {
		
		// 値引系取引は含めない。値引取引かつ値引品目はマイナスで表示するため。
		if (MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isSLS_CNSGN(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isSLS_RTN(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPURC(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPURC_VMI(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPURC_XPNS(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPURC_RTN(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isSHIP_RTN(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isARR(trd_ptn_typ) 
				 || MAC_TRD_PTN_TYP.isARR_RTN(trd_ptn_typ)
		 ) {
			return true;
		}
		else {
			return false;
		}
	}

	//FMCB CUSTOM END
}