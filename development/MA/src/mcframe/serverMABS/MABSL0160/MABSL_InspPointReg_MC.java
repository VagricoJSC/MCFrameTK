package mcframe.serverMABS.MABSL0160;

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
import mcframe.serverMABS.MABSL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_InspPointReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_InspPointReg_MC extends MABSL_InspPointReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspPoint_UpdChk01オペレーション.<p>
	 *
	 * 検査項目マスタを登録する前のチェック処理を行います。<br>
	 */
	public class InspPoint_UpdChk01 extends MABSL_InspPointReg_MC_A.InspPoint_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			for (InspPoint_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.insp_point_cd())){
					msgList.add(new MCMessage(r, InspPoint_UpdChk01_DtlR.$insp_point_cd, MABCL0306, 
									getLabel(r, InspPoint_UpdChk01_DtlR.$insp_point_cd), r.insp_point_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					msgList.addAll(check(r, InspPoint_UpdChk01_DtlR.$unit_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック

				if (!MAC_INSP_QLQN_TYP.isQNTV(r.insp_qlqn_typ())) {
					if (!isNull(r.unit_cd())) {
						msgList.add(new MCMessage(r, InspPoint_UpdChk01_DtlR.$unit_cd, MABSL0002, toDispGUIIndex(r)));
					}
					if (r.auto_judg_flg()) {
						msgList.add(new MCMessage(r, InspPoint_UpdChk01_DtlR.$auto_judg_flg, MABSL0003, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * InspPoint_Upd01オペレーション.<p>
	 *
	 * 検査項目マスタの登録処理を行います。<br>
	 */
	public class InspPoint_Upd01 extends MABSL_InspPointReg_MC_A.InspPoint_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPointLcl_UpdChk01オペレーション.<p>
	 *
	 * 検査項目マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class InspPointLcl_UpdChk01 extends MABSL_InspPointReg_MC_A.InspPointLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPointLcl_Upd01オペレーション.<p>
	 *
	 * 検査項目マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class InspPointLcl_Upd01 extends MABSL_InspPointReg_MC_A.InspPointLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPoint_DelChk01オペレーション.<p>
	 *
	 * 検査項目マスタ、検査項目マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class InspPoint_DelChk01 extends MABSL_InspPointReg_MC_A.InspPoint_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPoint_Del01オペレーション.<p>
	 *
	 * 検査項目マスタ、検査項目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class InspPoint_Del01 extends MABSL_InspPointReg_MC_A.InspPoint_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査項目マスタ、検査項目マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_InspPointReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 検査項目マスタ、検査項目マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_InspPointReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査項目マスタ、検査項目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABSL_InspPointReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}