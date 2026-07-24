package mcframe.serverMABG.MABGL0700;

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
import mcframe.serverMABG.MABGL0700.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostSlipJnlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostSlipJnlReg_MC extends MABGL_CostSlipJnlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostSlipJnl_UpdChk01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの登録前のチェックを行います。<br>
	 */
	public class CostSlipJnl_UpdChk01 extends MABGL_CostSlipJnlReg_MC_A.CostSlipJnl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			if (isSame(col, CostSlipJnl_UpdChk01_DtlR.$ac_slip_typ)) {
				ArrayList<MAC_AC_SLIP_TYP> list = new ArrayList<MAC_AC_SLIP_TYP>();
				for (MAC_AC_SLIP_TYP typ : MAC_AC_SLIP_TYP.array()) {
					if (typ.is_cost_typ()) {
						list.add(typ);
					}
				}
				return new FXUCL_ConstValidater(list.toArray(new MCAppConst[0]));
			}
			return super.getConstExistValidater(col, constArr);
		}
	}
	/**
	 * CostSlipJnl_Upd01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの登録を行います。<br>
	 */
	public class CostSlipJnl_Upd01 extends MABGL_CostSlipJnlReg_MC_A.CostSlipJnl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostSlipJnl_DelChk01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの削除前のチェックを行います。<br>
	 */
	public class CostSlipJnl_DelChk01 extends MABGL_CostSlipJnlReg_MC_A.CostSlipJnl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostSlipJnl_Del01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの削除を行います。<br>
	 */
	public class CostSlipJnl_Del01 extends MABGL_CostSlipJnlReg_MC_A.CostSlipJnl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostSlipJnlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CostSlipJnlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価会計伝票区分仕訳マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostSlipJnlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}