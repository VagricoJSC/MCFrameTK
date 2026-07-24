package mcframe.serverMSBA.MSBAL0040;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBA.MSBAL0040.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_DmndRecStsSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_DmndRecStsSrch_MC extends MSBAL_DmndRecStsSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 消込先と消込元の需要情報を検索する<br>
	 */
	public class Srch01 extends MSBAL_DmndRecStsSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setGrpInfo();
			MCQueryPlan dmndSql = MSBAL0040_MST_DMND_S01();
			executeQuery(down0(), dmndSql, up0());
		}
		
		/**
		 * 得意先・納品先分類情報設定
		 */
		protected void setGrpInfo() {
			// 得意先分類
			// FLG
			up0().addBooleanColumn("fr_cst_grp_flg1", up0().cst_grp_flg1());
			up0().addBooleanColumn("fr_cst_grp_flg2", up0().cst_grp_flg2());
			up0().addBooleanColumn("fr_cst_grp_flg3", up0().cst_grp_flg3());
			up0().addBooleanColumn("fr_cst_grp_flg4", up0().cst_grp_flg4());
			up0().addBooleanColumn("fr_cst_grp_flg5", up0().cst_grp_flg5());
			up0().addBooleanColumn("fr_cst_grp_flg6", up0().cst_grp_flg6());
			up0().addBooleanColumn("fr_cst_grp_flg7", up0().cst_grp_flg7());
			up0().addBooleanColumn("fr_cst_grp_flg8", up0().cst_grp_flg8());
			up0().addBooleanColumn("fr_cst_grp_flg9", up0().cst_grp_flg9());
			up0().addBooleanColumn("fr_cst_grp_flg10", up0().cst_grp_flg10());
			
			// 納品先分類
			// FLG
			up0().addBooleanColumn("fr_dlv_grp_flg1", up0().dlv_grp_flg1());
			up0().addBooleanColumn("fr_dlv_grp_flg2", up0().dlv_grp_flg2());
			up0().addBooleanColumn("fr_dlv_grp_flg3", up0().dlv_grp_flg3());
			up0().addBooleanColumn("fr_dlv_grp_flg4", up0().dlv_grp_flg4());
			up0().addBooleanColumn("fr_dlv_grp_flg5", up0().dlv_grp_flg5());
			up0().addBooleanColumn("fr_dlv_grp_flg6", up0().dlv_grp_flg6());
			up0().addBooleanColumn("fr_dlv_grp_flg7", up0().dlv_grp_flg7());
			up0().addBooleanColumn("fr_dlv_grp_flg8", up0().dlv_grp_flg8());
			up0().addBooleanColumn("fr_dlv_grp_flg9", up0().dlv_grp_flg9());
			up0().addBooleanColumn("fr_dlv_grp_flg10", up0().dlv_grp_flg10());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			getDown1();
		}
		
		protected void getDown1() {
			MCList<MST_DMND_R> dmndL = MCList.create(MST_DMND_R.class);
			
			for(Srch01_Rslt1R r : down0()) {
				MST_DMND_R dmndR = MST_DMND_R.create();
				dmndR.dmnd_no(r.dmnd_no());
				dmndL.add(dmndR);
			}
			if(!dmndL.isEmpty()) {
				dbWkInsert("MSBAL0040_MSW_DMND_I01", dmndL, MCQueryApiBuilder.create(MST_DMND_R.create("T")).getBaseDbc());
			}

			MCQueryPlan dmndRecMapSql = MSBAL0040_MST_DMND_REC_MAP_S01();
			executeQuery(down1(), dmndRecMapSql);
			
			// 機能名の設定
			for(Srch01_Rslt2R r : down1()) {
				putFuncName(r, Srch01_Rslt2R.$fr_ins_func_id, Srch01_Rslt2R.$fr_ins_func_nm);
				putFuncName(r, Srch01_Rslt2R.$fr_upd_func_id, Srch01_Rslt2R.$fr_upd_func_nm);
			}
		}		
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 消込状況を一覧表示するために検索する<br>
	 */
	public class Srch02 extends MSBAL_DmndRecStsSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setGrpInfo();
			MCQueryPlan dmndSql = MSBAL0040_MST_DMND_S02();
			searchForDL(dmndSql, up0(), down0());
		}
		
		/**
		 * 得意先・納品先分類情報設定
		 */
		protected void setGrpInfo() {
			// 消込先用
			// 得意先分類
			// FLG
			up0().addBooleanColumn("to_cst_grp_flg1", up0().cst_grp_flg1());
			up0().addBooleanColumn("to_cst_grp_flg2", up0().cst_grp_flg2());
			up0().addBooleanColumn("to_cst_grp_flg3", up0().cst_grp_flg3());
			up0().addBooleanColumn("to_cst_grp_flg4", up0().cst_grp_flg4());
			up0().addBooleanColumn("to_cst_grp_flg5", up0().cst_grp_flg5());
			up0().addBooleanColumn("to_cst_grp_flg6", up0().cst_grp_flg6());
			up0().addBooleanColumn("to_cst_grp_flg7", up0().cst_grp_flg7());
			up0().addBooleanColumn("to_cst_grp_flg8", up0().cst_grp_flg8());
			up0().addBooleanColumn("to_cst_grp_flg9", up0().cst_grp_flg9());
			up0().addBooleanColumn("to_cst_grp_flg10", up0().cst_grp_flg10());
			
			// CD
			up0().addStringColumn("to_cst_grp_cd1", up0().cst_grp_cd1());
			up0().addStringColumn("to_cst_grp_cd2", up0().cst_grp_cd2());
			up0().addStringColumn("to_cst_grp_cd3", up0().cst_grp_cd3());
			up0().addStringColumn("to_cst_grp_cd4", up0().cst_grp_cd4());
			up0().addStringColumn("to_cst_grp_cd5", up0().cst_grp_cd5());
			up0().addStringColumn("to_cst_grp_cd6", up0().cst_grp_cd6());
			up0().addStringColumn("to_cst_grp_cd7", up0().cst_grp_cd7());
			up0().addStringColumn("to_cst_grp_cd8", up0().cst_grp_cd8());
			up0().addStringColumn("to_cst_grp_cd9", up0().cst_grp_cd9());
			up0().addStringColumn("to_cst_grp_cd10", up0().cst_grp_cd10());

			// NM
			up0().addStringColumn("to_cst_grp_nm1", up0().cst_grp_nm1());
			up0().addStringColumn("to_cst_grp_nm2", up0().cst_grp_nm2());
			up0().addStringColumn("to_cst_grp_nm3", up0().cst_grp_nm3());
			up0().addStringColumn("to_cst_grp_nm4", up0().cst_grp_nm4());
			up0().addStringColumn("to_cst_grp_nm5", up0().cst_grp_nm5());
			up0().addStringColumn("to_cst_grp_nm6", up0().cst_grp_nm6());
			up0().addStringColumn("to_cst_grp_nm7", up0().cst_grp_nm7());
			up0().addStringColumn("to_cst_grp_nm8", up0().cst_grp_nm8());
			up0().addStringColumn("to_cst_grp_nm9", up0().cst_grp_nm9());
			up0().addStringColumn("to_cst_grp_nm10", up0().cst_grp_nm10());
			
			// 納品先分類
			// FLG
			up0().addBooleanColumn("to_dlv_grp_flg1", up0().dlv_grp_flg1());
			up0().addBooleanColumn("to_dlv_grp_flg2", up0().dlv_grp_flg2());
			up0().addBooleanColumn("to_dlv_grp_flg3", up0().dlv_grp_flg3());
			up0().addBooleanColumn("to_dlv_grp_flg4", up0().dlv_grp_flg4());
			up0().addBooleanColumn("to_dlv_grp_flg5", up0().dlv_grp_flg5());
			up0().addBooleanColumn("to_dlv_grp_flg6", up0().dlv_grp_flg6());
			up0().addBooleanColumn("to_dlv_grp_flg7", up0().dlv_grp_flg7());
			up0().addBooleanColumn("to_dlv_grp_flg8", up0().dlv_grp_flg8());
			up0().addBooleanColumn("to_dlv_grp_flg9", up0().dlv_grp_flg9());
			up0().addBooleanColumn("to_dlv_grp_flg10", up0().dlv_grp_flg10());
			
			// CD
			up0().addStringColumn("to_dlv_grp_cd1", up0().dlv_grp_cd1());
			up0().addStringColumn("to_dlv_grp_cd2", up0().dlv_grp_cd2());
			up0().addStringColumn("to_dlv_grp_cd3", up0().dlv_grp_cd3());
			up0().addStringColumn("to_dlv_grp_cd4", up0().dlv_grp_cd4());
			up0().addStringColumn("to_dlv_grp_cd5", up0().dlv_grp_cd5());
			up0().addStringColumn("to_dlv_grp_cd6", up0().dlv_grp_cd6());
			up0().addStringColumn("to_dlv_grp_cd7", up0().dlv_grp_cd7());
			up0().addStringColumn("to_dlv_grp_cd8", up0().dlv_grp_cd8());
			up0().addStringColumn("to_dlv_grp_cd9", up0().dlv_grp_cd9());
			up0().addStringColumn("to_dlv_grp_cd10", up0().dlv_grp_cd10());
			
			// NM
			up0().addStringColumn("to_dlv_grp_nm1", up0().dlv_grp_nm1());
			up0().addStringColumn("to_dlv_grp_nm2", up0().dlv_grp_nm2());
			up0().addStringColumn("to_dlv_grp_nm3", up0().dlv_grp_nm3());
			up0().addStringColumn("to_dlv_grp_nm4", up0().dlv_grp_nm4());
			up0().addStringColumn("to_dlv_grp_nm5", up0().dlv_grp_nm5());
			up0().addStringColumn("to_dlv_grp_nm6", up0().dlv_grp_nm6());
			up0().addStringColumn("to_dlv_grp_nm7", up0().dlv_grp_nm7());
			up0().addStringColumn("to_dlv_grp_nm8", up0().dlv_grp_nm8());
			up0().addStringColumn("to_dlv_grp_nm9", up0().dlv_grp_nm9());
			up0().addStringColumn("to_dlv_grp_nm10", up0().dlv_grp_nm10());
			
			// 消込元用
			// 得意先分類
			// FLG
			up0().addBooleanColumn("fr_cst_grp_flg1", up0().cst_grp_flg1());
			up0().addBooleanColumn("fr_cst_grp_flg2", up0().cst_grp_flg2());
			up0().addBooleanColumn("fr_cst_grp_flg3", up0().cst_grp_flg3());
			up0().addBooleanColumn("fr_cst_grp_flg4", up0().cst_grp_flg4());
			up0().addBooleanColumn("fr_cst_grp_flg5", up0().cst_grp_flg5());
			up0().addBooleanColumn("fr_cst_grp_flg6", up0().cst_grp_flg6());
			up0().addBooleanColumn("fr_cst_grp_flg7", up0().cst_grp_flg7());
			up0().addBooleanColumn("fr_cst_grp_flg8", up0().cst_grp_flg8());
			up0().addBooleanColumn("fr_cst_grp_flg9", up0().cst_grp_flg9());
			up0().addBooleanColumn("fr_cst_grp_flg10", up0().cst_grp_flg10());
			
			// 納品先分類
			// FLG
			up0().addBooleanColumn("fr_dlv_grp_flg1", up0().dlv_grp_flg1());
			up0().addBooleanColumn("fr_dlv_grp_flg2", up0().dlv_grp_flg2());
			up0().addBooleanColumn("fr_dlv_grp_flg3", up0().dlv_grp_flg3());
			up0().addBooleanColumn("fr_dlv_grp_flg4", up0().dlv_grp_flg4());
			up0().addBooleanColumn("fr_dlv_grp_flg5", up0().dlv_grp_flg5());
			up0().addBooleanColumn("fr_dlv_grp_flg6", up0().dlv_grp_flg6());
			up0().addBooleanColumn("fr_dlv_grp_flg7", up0().dlv_grp_flg7());
			up0().addBooleanColumn("fr_dlv_grp_flg8", up0().dlv_grp_flg8());
			up0().addBooleanColumn("fr_dlv_grp_flg9", up0().dlv_grp_flg9());
			up0().addBooleanColumn("fr_dlv_grp_flg10", up0().dlv_grp_flg10());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			// 機能名の設定
			for(Srch02_RsltR r : down0()) {
				putFuncName(r, Srch02_RsltR.$to_ins_func_id, Srch02_RsltR.$to_ins_func_nm);
				putFuncName(r, Srch02_RsltR.$to_upd_func_id, Srch02_RsltR.$to_upd_func_nm);
				putFuncName(r, Srch02_RsltR.$fr_ins_func_id, Srch02_RsltR.$fr_ins_func_nm);
				putFuncName(r, Srch02_RsltR.$fr_upd_func_id, Srch02_RsltR.$fr_upd_func_nm);
			}
		}
	}

	//FMCB CUSTOM END
}