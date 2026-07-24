package mcframe.serverMAUC.MAUCL1120;

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
import mcframe.serverMA.dbc.*;
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
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_ContextUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_ContextUtil_MC extends MAUCL_ContextUtil_MC_A{
	//FMCB CUSTOM START
	private static final Class<MAUCL_ContextUtil> _clazz = MAUCL_ContextUtil.class;
	
	protected static MAUCL_ContextUtil getThis(){
		return object(_clazz);
	}
	
	/**
	 * 論理削除がオンのレコードを見られるようにします。
	 * @param tables 対象とするテーブル
	 */
	public static void enableDelFlgOn(String... tables) {
		getThis()._enableDelFlgOn(tables);
	}
	
	/**
	 *  論理削除がオンのレコードを見られるようにします。<<p>
	 * @param tables 対象とするテーブル
	 */
	protected void _enableDelFlgOn(String... tables) {
		MCList<MAW_DEL_FLG_CTL_R> list = MCList.create(MAW_DEL_FLG_CTL_R.class);
		MAW_DEL_FLG_CTL_R t = MAW_DEL_FLG_CTL_R.create();
		String sqlid = createSqlId(LOGIC_ID, t, "I01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		for (String T : tables) {
			MAW_DEL_FLG_CTL_R delFlgR = MAW_DEL_FLG_CTL_R.create();
			delFlgR.tbl_nm(T);
			list.add(delFlgR);
		}
		dbInsertEx(sqlid, list.groupBy(MAW_DEL_FLG_CTL_R.$tbl_nm), builder);
	}
	
	/**
	 * 論理削除がオンのレコードを見られないようにします。<p>
	 */	
	public static void unableDelFlgOn(String... tables) {
		getThis()._unableDelFlgOn(tables);
	}
	
	/**
	 *  論理削除がオンのレコードを見られないようにします。<<p>
	 */
	protected void _unableDelFlgOn(String... tables) {
		MCList<MAW_DEL_FLG_CTL_R> list = MCList.create(MAW_DEL_FLG_CTL_R.class);

		MAW_DEL_FLG_CTL_R t = MAW_DEL_FLG_CTL_R.create();
		String sqlid = createSqlId(LOGIC_ID, t, "D01");
		
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		for (String T : tables) {
			MAW_DEL_FLG_CTL_R delFlgR = MAW_DEL_FLG_CTL_R.create();
			delFlgR.tbl_nm(T);
			list.add(delFlgR);
		}
		dbDeleteKey(sqlid, list.groupBy(MAW_DEL_FLG_CTL_R.$tbl_nm), builder);
	}
	//FMCB CUSTOM END
}