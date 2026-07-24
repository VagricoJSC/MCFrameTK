package mcframe.serverMABC.MABCL0080;

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
import mcframe.serverMABC.MABCL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_TaxReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_TaxReg_MC extends MABCL_TaxReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Tax_UpdChk01オペレーション.<p>
	 *
	 * 税マスタの登録前のチェックを行います。<br>
	 */
	public class Tax_UpdChk01 extends MABCL_TaxReg_MC_A.Tax_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Tax_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.tax_cd())){
					msgList.add(new MCMessage(r, Tax_UpdChk01_DtlR.$tax_cd, MABCL0306, 
									getLabel(r, Tax_UpdChk01_DtlR.$tax_cd), r.tax_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				if (!MAC_TAX_TYP.isTAX_ABL(r.tax_typ())) {
					if (r.inc_tax_flg() || !r.tax_rate().isZero()) {
						MCMessage msg = new MCMessage(r, null, MABCL0081, r.tax_cd(), toDispGUIIndex(r));
						msgList.add(msg);
					}
				}
			}
			return msgList;
		}
	}

	/**
	 * Tax_Upd01オペレーション.<p>
	 *
	 * 税マスタの登録を行います。<br>
	 */
	public class Tax_Upd01 extends MABCL_TaxReg_MC_A.Tax_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * TaxLcl_UpdChk01オペレーション.<p>
	 *
	 * 税名称マスタの登録前のチェックを行います。<br>
	 */
	public class TaxLcl_UpdChk01 extends MABCL_TaxReg_MC_A.TaxLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * TaxLcl_Upd01オペレーション.<p>
	 *
	 * 税名称マスタの登録を行います。<br>
	 */
	public class TaxLcl_Upd01 extends MABCL_TaxReg_MC_A.TaxLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Tax_DelChk01オペレーション.<p>
	 *
	 * 税マスタ、税名称マスタの削除前のチェックを行います。<br>
	 */
	public class Tax_DelChk01 extends MABCL_TaxReg_MC_A.Tax_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Tax_Del01オペレーション.<p>
	 *
	 * 税マスタ、税名称マスタの削除を行います。<br>
	 */
	public class Tax_Del01 extends MABCL_TaxReg_MC_A.Tax_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 税マスタ、税名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_TaxReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 税マスタ、税名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_TaxReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 税マスタ、税名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_TaxReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}