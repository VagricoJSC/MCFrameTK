package mcframe.serverMABG.MABGL0460;

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
import mcframe.serverMABG.MABGL0460.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RptCmpConfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RptCmpConfReg_MC extends MABGL_RptCmpConfReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RptCmpConfLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class RptCmpConfLcl_UpdChk01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConfLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptCmpConfLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class RptCmpConfLcl_Upd01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConfLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptCmpConf_DelChk01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ、原価レポート比較構成マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class RptCmpConf_DelChk01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConf_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptCmpConf_Del01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ、原価レポート比較構成マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class RptCmpConf_Del01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConf_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ、原価レポート比較構成マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABGL_RptCmpConfReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptCmpConf_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタを登録する前のチェック処理を行います。<br>
	 */
	public class RptCmpConf_UpdChk01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConf_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(){
			MCMessageList msgList = super.doServerCheckSub();
			for (RptCmpConf_UpdChk01_DtlR row :up0()) {
				if (isNotCd(row.col_cd())){
					msgList.add(new MCMessage(row, RptCmpConf_UpdChk01_DtlR.$col_cd, MABCL0306, 
									getLabel(row, RptCmpConf_UpdChk01_DtlR.$col_cd), row.col_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				if(row.sml_flg()){
					if(!isNull(row.calc_grp_cd())){
						msgList.add(getMsg(row, RptCmpConf_UpdChk01_DtlR.$calc_grp_cd, MABGL0108));
					}
					if(!isNull(row.st_month())){
						msgList.add(getMsg(row, RptCmpConf_UpdChk01_DtlR.$st_month, MABGL0108));
					}
					if(!isNull(row.end_month())){
						msgList.add(getMsg(row, RptCmpConf_UpdChk01_DtlR.$end_month, MABGL0108));
					}
				}
			}
			return msgList;
		}
		
		protected MCMessage getMsg(RptCmpConf_UpdChk01_DtlR r, String col, String id){
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * RptCmpConf_Upd01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタの登録処理を行います。<br>
	 */
	public class RptCmpConf_Upd01 extends MABGL_RptCmpConfReg_MC_A.RptCmpConf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ、原価レポート比較構成マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABGL_RptCmpConfReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポート比較構成マスタ、原価レポート比較構成マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RptCmpConfReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}