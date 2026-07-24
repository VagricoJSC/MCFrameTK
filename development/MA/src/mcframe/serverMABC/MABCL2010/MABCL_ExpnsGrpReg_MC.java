package mcframe.serverMABC.MABCL2010;

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
import mcframe.serverMABC.MABCL2010.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ExpnsGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ExpnsGrpReg_MC extends MABCL_ExpnsGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ExpnsGrp_UpdChk01オペレーション.<p>
	 *
	 * 原価費目グループマスタを登録する前のチェック処理を行います。<br>
	 */
	public class ExpnsGrp_UpdChk01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ExpnsGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.expns_grp_cd())){
					msgList.add(new MCMessage(r, ExpnsGrp_UpdChk01_DtlR.$expns_grp_cd, MABCL0306, 
									getLabel(r, ExpnsGrp_UpdChk01_DtlR.$expns_grp_cd), r.expns_grp_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * ExpnsGrp_Upd01オペレーション.<p>
	 *
	 * 原価費目グループマスタの登録処理を行います。<br>
	 */
	public class ExpnsGrp_Upd01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExpnsGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価費目グループマスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class ExpnsGrpLcl_UpdChk01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExpnsGrpLcl_Upd01オペレーション.<p>
	 *
	 * 原価費目グループマスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class ExpnsGrpLcl_Upd01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExpnsGrp_DelChk01オペレーション.<p>
	 *
	 * 原価費目グループマスタ、原価費目グループマスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class ExpnsGrp_DelChk01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExpnsGrp_Del01オペレーション.<p>
	 *
	 * 原価費目グループマスタ、原価費目グループマスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class ExpnsGrp_Del01 extends MABCL_ExpnsGrpReg_MC_A.ExpnsGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価費目グループマスタ、原価費目グループマスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ExpnsGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価費目グループマスタ、原価費目グループマスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ExpnsGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価費目グループマスタ、原価費目グループマスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_ExpnsGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}