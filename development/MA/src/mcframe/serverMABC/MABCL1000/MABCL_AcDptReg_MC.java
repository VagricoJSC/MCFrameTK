package mcframe.serverMABC.MABCL1000;

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
import mcframe.serverMABC.MABCL1000.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AcDptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AcDptReg_MC extends MABCL_AcDptReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcDpt_UpdChk01オペレーション.<p>
	 *
	 * 会計部門マスタの登録前のチェックを行います。<br>
	 */
	public class AcDpt_UpdChk01 extends MABCL_AcDptReg_MC_A.AcDpt_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcDpt_Upd01オペレーション.<p>
	 *
	 * 会計部門マスタの登録を行います。<br>
	 */
	public class AcDpt_Upd01 extends MABCL_AcDptReg_MC_A.AcDpt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcDptLcl_UpdChk01オペレーション.<p>
	 *
	 * 会計部門名称マスタの登録前のチェックを行います。<br>
	 */
	public class AcDptLcl_UpdChk01 extends MABCL_AcDptReg_MC_A.AcDptLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcDptLcl_Upd01オペレーション.<p>
	 *
	 * 会計部門名称マスタの登録を行います。<br>
	 */
	public class AcDptLcl_Upd01 extends MABCL_AcDptReg_MC_A.AcDptLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcDpt_DelChk01オペレーション.<p>
	 *
	 * 会計部門マスタ、会計部門名称マスタの削除前のチェックを行います。<br>
	 */
	public class AcDpt_DelChk01 extends MABCL_AcDptReg_MC_A.AcDpt_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcDpt_Del01オペレーション.<p>
	 *
	 * 会計部門マスタ、会計部門名称マスタの削除を行います。<br>
	 */
	public class AcDpt_Del01 extends MABCL_AcDptReg_MC_A.AcDpt_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会計部門マスタ、会計部門名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AcDptReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_AC_DPT_R t = MAM_AC_DPT_R.create(builder.getBaseDbcAlias());
			
			/*適用日及び適用最終日をwhere句に追加しています。*/
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会計部門マスタ、会計部門名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_AcDptReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 会計部門マスタ、会計部門名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AcDptReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}